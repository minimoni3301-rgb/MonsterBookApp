package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MonsterLabApp {

	
	// 메인함수가 필요 없는 이유는
	// 직접 실행하기 위한 프로그램이 아니라, 데이터 베이스 연결 객체가 필요할때 
	// 불러다 쓰기위한 유틸리티(부품) 역할을 하기때문 
	
	// 주소등록
	private static final String DB_URL = 
			  "jdbc:mysql://localhost:3306/monster_lab"
	   + "?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
	
	
	private static final String DB_USER  = "root";
	private static final String DB_PASSWORD = "wldn10201@";
	
	
	            // Connection - DB연결객체 
	public static Connection getconnection() throws SQLException {
	
	 return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
	
	}}


