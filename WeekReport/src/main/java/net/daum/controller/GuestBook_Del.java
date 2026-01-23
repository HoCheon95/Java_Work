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

        GuestBookDTO db_gdao = gdao.getFindNo(gno); 
        // 방명록 번호를 getFindNo() 메서드에서 데이터베이스에 존재하는지 확인후 값을 리턴

        if(db_gdao == null){// 데이터베이스에 값이 없으면
            System.out.println("방명록 번호값이 없어서 삭제를 못합니다!");
        }else{//데이터베이스에 값이 존재하면
            int re = gdao.delGuest(gno);//방명록 번호를 전달인자로 delGuest()메서드 호출
            // 삭제가 완료되면 re = 1 리턴 받음
            if(re == 1){//삭제 성공하면 
                System.out.println("방명록 삭제에 성공했습니다.");
            }
        }//if ~ else
    }//main
}//class
