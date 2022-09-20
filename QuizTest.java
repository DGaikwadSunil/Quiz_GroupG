package com.velocity.MyQiuz;

import java.sql.SQLException;
import java.util.Scanner;

public class QuizTest {

		public static void main(String[] args) throws SQLException {
			Scanner sc = new Scanner(System.in);
			for(int i =0;i<=10;i++) {
				System.out.println(" Enter the Question");
				String Question = sc.next();
				System.out.println("Option1");
				String Option1 = sc.next();
				System.out.println("Option2");
				String Option2 = sc.next();
				System.out.println("Option3");
				String Option3 = sc.next();
				System.out.println("Option4");
				String Option4 = sc.next();
				System.out.println("Answer");
				String  Answer = sc.next();
				
				
				
				AddQuestion AddQ = new AddQuestion();
				AddQ.insertvalue(Question, Option1, Option2, Option3,Option4, Answer);
				
			}
			sc.close();


	}


}
