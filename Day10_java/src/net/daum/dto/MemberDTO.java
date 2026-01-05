package net.daum.dto; // package 예약어로 net 패키지 폴더 하위에 daum 폴더 하위에 dto 폴더가 생성된다.
// daum 폴더는 도메인명이라서 중복 폴더가 생성되는 방지할 수 있다.

public class MemberDTO {// 회원관리 데이터 저장빈 클래스
	
	private String mem_id; // 아이디
	private String mem_pwd; // 비밀번호
	private String mem_name; //회원이름
	private String mem_phone; //폰번호
	private String mem_email; //이메일
	private String mem_addr; //집주소
	
	// 매개변수가 없는 기본생성자가 생략됨.
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pwd() {
		return mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		this.mem_pwd = mem_pwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_addr() {
		return mem_addr;
	}
	public void setMem_addr(String meme_addr) {
		this.mem_addr = meme_addr;
	}
	
	

}
