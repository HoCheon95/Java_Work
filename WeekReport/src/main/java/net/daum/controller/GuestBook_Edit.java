package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.GuestBookDAOImpl;
import net.daum.dto.GuestBookDTO;

/* 방명록 수정 */
public class GuestBook_Edit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        GuestBookDAOImpl gdao = new GuestBookDAOImpl();

        System.out.println("###### 게시판 수정 #######");
        System.out.println("---------------------------");
        System.out.print("기준이 되는 방명록 번호 입력 : ");
        int gno = Integer.parseInt(scan.nextLine());

        GuestBookDTO find_no = gdao.getFindNo(gno);

        if(find_no == null){
            System.out.println("방명록 번호값이 없어서 수정을 못합니다.!");
        }else{// 방명록 수정
            System.out.print("수정할 글쓴이 입력 : ");
            String edit_name = scan.nextLine();
            System.out.print("수정할 글제목 입력 : ");
            String edit_title = scan.nextLine();
            System.out.print("수정할 글내용 입력 : ");
            String edit_cont = scan.nextLine();

            GuestBookDTO gb = new GuestBookDTO();   // 수정할 값들을 DTO객체 생성 후 담는다.
            
            gb.setGno(gno);
            gb.setGname(edit_name);
            gb.setGtitle(edit_title);
            gb.setGcont(edit_cont);

            gdao.editGuestBook(gb);// 번호를 기준으로 글쓴이, 글제목, 글내용 수정

        }//if ~ else
    }//main   
}//class
