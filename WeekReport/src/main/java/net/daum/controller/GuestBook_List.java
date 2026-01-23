package net.daum.controller;

import java.util.List;

import net.daum.dao.GuestBookDAOImpl;
import net.daum.dto.GuestBookDTO;

/* 방명록 목록보기 */
public class GuestBook_List {
    public static void main(String[] args) {
        GuestBookDAOImpl gdao = new GuestBookDAOImpl();

        List<GuestBookDTO> glist = gdao.getGuestBookList(); // 게시판 목록을 가져옴

        System.out.println("###### 방명록 목록 ######");
        System.out.println("번호 \t 작성자 \t 글제목 \t 글내용 \t 등록날짜");
        System.out.println("--------------------------------------------");

        if(glist != null && glist.size() > 0){
            for(GuestBookDTO g : glist){
                System.out.printf("%d\t%s\t%s\t%s\t%s\n", g.getGno(), g.getGname(), g.getGtitle(), g.getGcont(), g.getGdate());
            }
        }else{
            System.out.println("방명록 목록이 없습니다.");
        }//if ~ else
    }//main   
}//class
