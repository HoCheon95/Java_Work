package net.daum.dao;

import net.daum.dto.MemberDTO;

public interface MemberDAO {
    MemberDTO idCheck(String id);
}
