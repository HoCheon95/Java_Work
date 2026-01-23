package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.GuestBookDAOImpl;
import net.daum.dto.GuestBookDTO;

/* 방명록 입력폼과 저장 */
public class GuestBook_Writer {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        GuestBookDAOImpl gdao = new GuestBookDAOImpl(); // DAO 객체 생성

        System.out.println("###### 방명록 입력 ######");    // 방명록에 저장할 내용을 scan로 입력 받는다.
        System.out.println("-------------------------");
        System.out.print("글쓴이 입력 : ");
        String name = scan.nextLine();
        System.out.print("글제목 입력 : ");
        String title = scan.nextLine();
        System.out.print("글내용 입력 : ");
        String cont = scan.nextLine();
        
        GuestBookDTO g = new GuestBookDTO();    // DTO객체 생성후 람복을 통해서 생성된 setter()메서드에 위에서 적은 내용을 보낸다.
        g.setGname(name);
        g.setGtitle(title);
        g.setGcont(cont);

        int re = gdao.insertGuest(g); //방명록 저장

        if(re == 1){
            System.out.println("방명록 저장에 성공했습니다.");
        }

    }
}
