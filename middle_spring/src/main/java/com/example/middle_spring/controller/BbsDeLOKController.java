package com.example.middle_spring.controller;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // 추가 필수!
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.middle_spring.dto.BbsDTO;
import com.example.middle_spring.dto.FileDTO;
import com.example.middle_spring.mappers.bbsMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class BbsDeLOKController {

    @Autowired
    private bbsMapper bbsMapper;

    @RequestMapping("/bbs_del_ok.do")
    public String bbsDelOk(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // 1. 파일 삭제 경로 설정
        String delFolder = request.getSession().getServletContext().getRealPath("upload");

        // 2. 파라미터 수신
        int bbs_no = Integer.parseInt(request.getParameter("bbs_no"));
        int page = 1;
        if(request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page"));         
        }
        String bbs_pwd = request.getParameter("del_pwd");

        // 3. 비번 검증 및 삭제 로직
        BbsDTO db_pwd = bbsMapper.getBbsCont2(bbs_no);

        if(!db_pwd.getBbs_pwd().equals(bbs_pwd)) {
            out.println("<script>");
            out.println("alert('비번이 다릅니다!');");
            out.println("history.back();");
            out.println("</script>");
            return null; 
        } else {
            // 기존 첨부파일 삭제 처리
            if (db_pwd.getBbs_attached_file() == 7) {
                List<FileDTO> fileList = bbsMapper.getFileInfo(db_pwd.getBbs_no());

                if(fileList != null) {
                    for (FileDTO file : fileList) {
                        File delFile = new File(delFolder + "/" + file.getBbs_stored_name());
                        if (delFile.exists()) {
                            delFile.delete();
                        }
                    }
                }
                bbsMapper.delFileList(bbs_no); 
            }

            bbsMapper.bbsDelete(bbs_no); 

            // 4. 리다이렉트 처리
            return "redirect:/admin_bbs_list.do?page=" + page;
        }
    }
}