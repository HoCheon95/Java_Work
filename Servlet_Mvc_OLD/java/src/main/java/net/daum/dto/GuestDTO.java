// package net.daum.dto;
package 

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GuestDTO {
	
	private int gno;		//방명록 번호
	private String gname;	//글쓴이
	private String gtitle;	//글제목
	private String gcontent;//글내용
	private String gdate;	//등록날짜
}
