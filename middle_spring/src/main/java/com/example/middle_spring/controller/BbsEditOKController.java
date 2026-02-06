package com.example.middle_spring.controller;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.middle_spring.dto.BbsDTO;
import com.example.middle_spring.dto.FileDTO;
import com.example.middle_spring.mappers.bbsMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
비번이 같은 경우만 사용자 자료실 한개파일/다중파일 업로드 수정실습 컨트롤러, 첨부파일 빼고 글쓴이, 글제목, 글내용만 수정하는 컨트롤러
*/
@Controller
public class BbsEditOKController {

    @Autowired
    private bbsMapper bbsMapper;

    @RequestMapping("/bbs_edit_ok.do")
    public String bbsEditOk(
        BbsDTO bbsdata, // 사용자가 수정한 글 내용이 담길 DTO
        @RequestParam(value = "page", defaultValue = "1") int page, // 원래 보던 페이지 번호
        @RequestParam("bbs_file") List < MultipartFile > files, //새로 올린 파일들
        HttpServletRequest request,
        HttpServletResponse response) throws Exception {

        // 1. 브라우저에 경고창(alert)을 띄우기 위해 출력 도구
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 2. 파일이 저장될 실제 컴퓨터 경로 (/upload 폴더)
        String uploadPath = request.getServletContext().getRealPath("/upload");
        
        // 3. [비밀번호 검사] DB에 저장된 이 글의 진짜 정보를 가져와서 비번을 대조
        BbsDTO db_bbs = this.bbsMapper.getBbsCont(bbsdata.getBbs_no());

        if (!db_bbs.getBbs_pwd().equals(bbsdata.getBbs_pwd())) {
            // 비번이 다르면 경고창을 띄우고 이전 화면으로 돌려보냄
            out.println("<script>");
            out.println("alert('비밀번호가 다릅니다!');");
            out.println("history.go(-1);");
            out.println("</script>");
            return null;
        }

        // 4. [글 내용 수정] 비번이 맞다면 제목, 내용 등을 먼저 새 내용으로 덮어쓴다
        bbsMapper.editBbs(bbsdata);


        boolean hasNewFile = files.stream().anyMatch(f -> !f.isEmpty());

        if (hasNewFile && db_bbs.getBbs_attached_file() == 7) {
            // (A) 기존에 올렸던 실제 파일들을 서버 폴더에서 삭제
            List<FileDTO> oldFileList = this.bbsMapper.getFileInfo(bbsdata.getBbs_no());
            for (FileDTO oldFile : oldFileList) {
                File delFile = new File(uploadPath + "/" + oldFile.getBbs_stored_name());
                if (delFile.exists()) delFile.delete(); 
            }
            // (B) DB에서 옛날 파일 정보도 싹 삭제 (운동장 비우기 끝!)
            bbsMapper.delFileList(bbsdata.getBbs_no()); 
        }

        // 5. [새 파일 저장 로직] 이제 비워진 자리에 새 파일들을 하나씩 저장합니다.
        for (MultipartFile file : files) {
            if (!file.isEmpty()) { 
                // 새 파일 저장
                String originalName = file.getOriginalFilename();
                String storedName = System.currentTimeMillis() + "_" + originalName;
                file.transferTo(new File(uploadPath + "/" + storedName));

                // DB에 파일 상태 업데이트 및 정보 저장
                this.bbsMapper.updateAttached_file(7, bbsdata.getBbs_no());
                
                FileDTO newFileDto = new FileDTO();
                newFileDto.setBbs_original_name(originalName);
                newFileDto.setBbs_stored_name(storedName);
                newFileDto.setBbs_file_path(uploadPath);
                newFileDto.setBbs_file_size(file.getSize());
                newFileDto.setBbs_no(bbsdata.getBbs_no());

                this.bbsMapper.insertFile(newFileDto); // 하나씩 차례대로 저장됩니다!
            }
        }
        // 6. [마무리] 수정한 글의 상세 페이지로 다시 보내준다
        return "redirect:bbs_cont.do?bbs_no=" + bbsdata.getBbs_no() + "&page=" + page + "&state=cont";
    }
}
