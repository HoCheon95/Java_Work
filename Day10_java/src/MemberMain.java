/*
 * net.daum.dto 패키지의 데이터 저장빈 클래스 MemberDTO.java를 임포트 해서 사용
 */

import net.daum.dto.GuestBookDTO;
import net.daum.dto.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {

		MemberDTO member = new MemberDTO();

		member.setMem_id("kkkkk");// 아이디 저장
		member.setMem_phone("010-9999-9999"); // 폰번호 저장
		member.setMem_name("홍길동"); // 회원이름 저장
		member.setMem_email("kkkkk@daum.net"); // 멜주소 저장
		member.setMem_addr("대전시"); // 주소 저장

		System.out.printf("아이디 : %s \n", member.getMem_id()); // %s 는 문자열 출력형태 지시자
		System.out.printf("회원이름 : %s \n", member.getMem_name());
		System.out.println("이메일 : " + member.getMem_email());
		System.out.printf("포번호 : %s \n", member.getMem_phone());
		System.out.printf("집주소 : %s \n", member.getMem_addr());
				
	}

}
