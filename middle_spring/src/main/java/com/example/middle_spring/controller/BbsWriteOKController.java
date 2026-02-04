package com.example.middle_spring.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
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

/* 한개 첨부파일 또는 한개 이상 다중 첨부파일을 업로드 저장하는 컨트롤러 -> 사용자 자료실 */
@Controller
public class BbsWriteOKController {
    @Autowired
    private bbsMapper bbsMapper;

    @RequestMapping("/bbs_write_ok.do")
    public String bbsWriteOk(BbsDTO bbs, @RequestParam("bbs_file") List < MultipartFile > files, HttpServletResponse response, HttpServletRequest request) throws IOException{

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 1. 업로드 경로 지정
        String uploadPath = request.getServletContext().getRealPath("/upload");
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdirs();

        // 1-2. 실행 시 폴더가 없으면 생성 (이 코드가 있으면 에러 안 납니다!)
        if (!uploadDir.exists()) {
            uploadDir.mkdirs(); // mkdirs()는 상위 폴더까지 한꺼번에 만들어줍니다.
            System.out.println("폴더가 없어서 새로 생성했습니다: " + uploadPath);
        }

        // 2. 기본 게시글 정보 저장
        int seq_result = bbsMapper.seqNumberNext(); // 다음 시퀀스 번호
        bbs.setBbs_no(seq_result);  //자료실 번호 저장
        bbs.setBbs_ref(seq_result); //글 그룹번호 저장

        bbsMapper.bbsInsert(bbs); // 자료실 저장 -> 한개 또는 다중 첨부된 파일정보는 빼고 저장

        // 3. 다중 파일 처리
        for (MultipartFile file: files) {
            if (!file.isEmpty()) {
                // 첨부파일 존재 시 상태값 변경 (한 번만 실행되도록 로직 보완 가능)
                bbsMapper.updateAttached_file(7, seq_result);

                String originalName = file.getOriginalFilename();
                String storedName = System.currentTimeMillis() + "_" + originalName;
                Path filePath = Paths.get(uploadPath, storedName);

                // 실제 파일 저장 (transferTo 사용 시 간결함)
                file.transferTo(filePath.toFile());

                // FileDTO 세팅 및 DB 저장
                FileDTO fileDto = new FileDTO();
                fileDto.setBbs_original_name(originalName);
                fileDto.setBbs_stored_name(storedName);
                fileDto.setBbs_file_path(filePath.toString());
                fileDto.setBbs_file_size(file.getSize());
                fileDto.setBbs_no(seq_result);

                bbsMapper.insertFile(fileDto); // 파일 정보 DB 저장

                System.out.println("원본 파일명 : " + originalName);
                System.out.println("첨부된 파일 경로 : " + filePath);
            }
        }

        out.println("<script>alert('파일 업로드 및 DB 저장 완료');location.href='bbs_list.do';</script>");
        return null;
    }


}
