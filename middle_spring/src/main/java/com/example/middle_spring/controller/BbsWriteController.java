package com.example.middle_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* 사용자 자료실 글쓰기 폼으로 이동하기 위한 컨트롤러 */
@Controller
public class BbsWriteController {

    @RequestMapping("/bbs_write.do")
    public String bbsWrite() {
        return "bbs/bbs_write";
    }
    

}
