package com.example.middle_spring.dao;

import java.util.List;

// import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.dto.ZipcodeDTO;

public interface MemberDAO {
    MemberDTO idCheck(String id);

    List<ZipcodeDTO> zipFind(String dong);

    int getMemPwd(MemberDTO dto);

}
