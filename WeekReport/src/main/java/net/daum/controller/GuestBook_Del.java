package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.GuestBookDAOImpl;
import net.daum.dto.GuestBookDTO;

/* 방명록 삭제 */
public class GuestBook_Del {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuestBookDAOImpl gdao = new GuestBookDAOImpl();

        System.out.println("###### 게시판 삭제 #######");
        System.out.print("기준이 되는 방명록 번호 입력 : ");
        int gno = Integer.parseInt(scan.nextLine());

        int re = gdao.delGuest(gno);
        

    }
    
}
