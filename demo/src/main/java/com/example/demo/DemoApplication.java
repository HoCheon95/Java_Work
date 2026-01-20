package com.example.demo;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource; // application.properties 설정을 불러옵니다.

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try (Connection connection = dataSource.getConnection()) {
			System.out.println("✅ DB 연결 성공!  ");
			System.out.println("연결된 DB 이름: " + connection.getMetaData().getDatabaseProductName());
		} catch (Exception e) {
			System.out.println("❌ DB 연결 실패: " + e.getMessage());
		}
	}
}