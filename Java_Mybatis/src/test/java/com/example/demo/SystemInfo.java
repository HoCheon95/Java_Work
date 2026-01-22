package com.example.demo;

import java.util.Scanner;

public class SystemInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("한글 이름을 입력하세요 : ");
        String name = scan.nextLine();
        System.out.println("입력된 이름 : " + name);
    }

}
