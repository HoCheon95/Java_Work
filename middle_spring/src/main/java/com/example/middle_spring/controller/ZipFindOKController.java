package com.example.middle_spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.middle_spring.service.MemberService;
import com.example.middle_spring.dto.ZipcodeDTO;
import com.example.middle_spring.dto.Zipcode2DTO;

@Controller
public class ZipFindOKController {


    
    @Autowired
    private MemberService memberService; // 서비스 주입

    @RequestMapping("/zip_find_ok.do")
    public String zip_find_ok(@RequestParam("dong") String dong, Model model) {
        // 1. 입력받은 동 이름 가공 및 검색
        String searchDong = dong.trim();
        List<ZipcodeDTO> zlist = memberService.zipFind(searchDong);
        
        // 2. 검색 결과 가공 (ZipcodeDTO -> Zipcode2DTO)
        List<Zipcode2DTO> zlist2 = new ArrayList<>();
        for (ZipcodeDTO z : zlist) {
            Zipcode2DTO z2 = new Zipcode2DTO();
            z2.setZipcode(z.getZipcode()); // 우편번호 저장
            
            // 시도 구군 동을 합쳐서 주소 저장
            String addr = z.getSido() + " " + z.getGugun() + " " + z.getDong();
            z2.setAddr(addr);
            
            zlist2.add(z2);
        }

        // 3. 뷰(JSP)로 데이터 전달 (request.setAttribute와 동일)
        model.addAttribute("zipcodelist", zlist2);
        model.addAttribute("dong", dong);

        // 4. 포워드 방식 이동 (prefix/suffix에 의해 WEB-INF/views/member/zip_find.jsp 호출)
        return "member/zip_find";
    }
}