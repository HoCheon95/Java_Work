package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.BoardDaoImpl;
import net.daum.dto.BoardDTO;

/*
    글번호를 기준으로 게시판 삭제)
        스캐너로 게시판 번호를 입력받은 다음 해당 테이블로 부터 검색해서 번호값이 있다면 삭제되게 하고 
        없다면 유효성 검증 경고메시지를 띄운다.
*/
public class Board_Del {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BoardDaoImpl bdao = new BoardDaoImpl();

        System.out.println("###### 게시판 삭제 ######");
        System.out.print("기준이 되는 게시판 번호 입력 : ");
        int bno = Integer.parseInt(scan.nextLine());

        BoardDTO db_Bno = bdao.getFindBno(bno); //오라클로 부터 번호 검색

        if (db_Bno == null) {
            System.out.println("해당 게시판 번호가 없어서 삭제못합니다!");
        } else {
            bdao.delBoard(bno);
            /*
                문제) 리턴타입이 없는 delBoard(bno) 메서드를 작성해 본다. 번호를 기준으로 게시물이
                삭제되면 된다.
            */
        } //if~else

    }
}
