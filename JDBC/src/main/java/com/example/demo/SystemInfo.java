package com.example.demo;

public class SystemInfo {
    public static void main(String[] args) {
        // 현재 자바 가상머신의 인코딩 확인
        System.out.println("Default Charset: " + java.nio.charset.Charset.defaultCharset());
    }
}
