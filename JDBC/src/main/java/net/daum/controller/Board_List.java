package net.daum.controller;

import java.util.List;

import net.daum.dao.BoardDaoImpl;
import net.daum.dto.BoardDTO;

/* 게시판 목록보기 */
public class Board_List {
    public static void main(String[] args) {
        BoardDaoImpl bdao = new BoardDaoImpl();
        //List < BoardDTO > blist = new ArrayList <> ();

        List < BoardDTO > blist = bdao.getBoardList(); //게시판 목록을 가져옴

        System.out.println("###### 게시판 목록 ######");
        System.out.println("번호 \t 글제목 \t 글쓴이 \t 글내용 \t 등록날짜");
        System.out.println("--------------------------------------------");

        if (blist != null && blist.size() > 0) { //size() 메서드는 컬렉션 원소 개수를 반환
            for (BoardDTO b: blist) {
                System.out.printf("%d\t%s\t%s\t%s\t%s\n", b.getBno(), b.getBname(),
                    b.getBtitle(), b.getBcont(), b.getBdate());
            }
        } else {
            System.out.println("게시판 목록이 없습니다.");
        } //if ~ else

    }
}
