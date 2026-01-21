package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.BoardDaoImpl;
import net.daum.dto.BoardDTO;

/*
게시판 입력폼과 저장)
    스캐너로 게시판 글쓴이, 글제목, 글내용을 입력받아서 BoardDTO 빈클래스에 저장한 다음 BoardDAOImpl로 전달해서
    tbl_board 테이블에 저장되게 한다. 저장후 반환값은 1을 리턴받아서 if조건문으로 1일때 "게시판 저장에 성공 했습니다!"
    라는 메시지가 출력되게 한다.
 */
public class Board_Insert {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BoardDaoImpl bdao = new BoardDaoImpl();

        System.out.println("###### 게시판 입력 ######");
        System.out.println("---------------------------");
        System.out.print("글쓴이 입력 : ");
        String name = scan.nextLine(); //문자열로 입력받는다.
        System.out.print("글제목 입력 : ");
        String title = scan.nextLine();
        System.out.print("글내용 입력 : ");
        String cont = scan.nextLine();

        BoardDTO b = new BoardDTO();
        b.setBname(name);
        b.setBtitle(title);
        b.setBcont(cont);

        int re = bdao.insertBoard(b); //게시판 저장

        if (re == 1) {
            System.out.println("게시판 저장에 성공했습니다.");
        }

    }

}
