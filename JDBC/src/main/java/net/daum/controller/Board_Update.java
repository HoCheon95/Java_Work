package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.BoardDaoImpl;
import net.daum.dto.BoardDTO;

/*
    게시판 수정)
        스캐너로 게시판 번호값을 입력받아서 tbl_board 테이블로 부터 검색한 다음 해당 번호가 없으면 유효성 검증 경고 메시지를 띄우고 있다면
        수정할 글쓴이, 글제목, 글내용을 입력받아서 번호를 기주능로 수정되게 해본다.
*/

public class Board_Update {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BoardDaoImpl bdao = new BoardDaoImpl();

        System.out.println("####### 게시판 수정 ######");
        System.out.println("---------------------------");
        System.out.print("기준이 되는 게시판 번호 입력:");
        int bno = Integer.parseInt(scan.nextLine());

        BoardDTO find_bno = bdao.getFindBno(bno); //번호를 기준으로 오라클로 부터 레코드 검색

        if (find_bno == null) {
            System.out.println("해당 게시판 번호가 존재하지 않아서 수정못합니다.!");
        } else {
            System.out.print("수정할 글쓴이 입력");
            String edit_name = scan.nextLine();
            System.out.print("수정할 글제목 입력:");
            String edit_title = scan.nextLine();
            System.out.print("수정할 글내용 입력:");
            String edit_cont = scan.nextLine();

            BoardDTO eb = new BoardDTO();
            eb.setBno(bno);
            eb.setBname(edit_name);
            eb.setBtitle(edit_title);
            eb.setBcont(edit_cont);

            int re = bdao.updateBoard(eb); //번호를 기준으로 글쓴이, 글제목, 글내용 수정

            if (re == 1) {
                System.out.println("게시판 수저엥 성공했습니다.");
            }
        } //if ~ else
    }

}
