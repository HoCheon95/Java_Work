package com.example.middle_spring.service;

import java.util.List;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.dto.ZipcodeDTO;

public interface MemberService {
    MemberDTO idCheck(String id);

    List<ZipcodeDTO> zipFind(String dong);

}
