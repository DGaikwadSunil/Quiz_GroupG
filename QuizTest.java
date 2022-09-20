package com.velocity.MyQiuz;

import java.sql.SQLException;
import java.util.Scanner;

public class QuizTest {

		public static void main(String[] args) throws SQLException {
			try{
				int ch = 0;	
			do {
				System.out.println(" 1 :- Apply for test ");
				System.out.println(" 2 :- Display all Student score ");
				System.out.println(" 3 :- Display score for particular student ");
				System.out.println(" 4 :- Add Questions");
				System.out.println(" 5 :- Add User ");
				System.out.println(" 6 :- Exit ");
				System.out.println(" Enter your choice :- ");
				Scanner sc5 = new Scanner(System.in);
				 ch = sc5.nextInt();
				 switch(ch) {
				 case 1: 
					 // Applying for test
					 Loggin log = new Loggin();
					 log.Check_Loggin();
					 break;
				 case 2:
					 //Display student score
					 Display_Stud_Info stud3= new Display_Stud_Info();
			         stud3.display_student();
			         break;
				 case 3: 
					 //Display score for particular student
					 Display_Stud_Info stud4= new Display_Stud_Info();
					 Scanner scan = new Scanner(System.in);
					 System.out.println(" Enter ID ");
					 int ID = scan.nextInt();
					// int X = Integer.parseInt (ID);
					 stud4.display_Student_BY_ID(ID);
					 break;
				 case 4:
					 // Add Questions
					 Scanner sc1 = new Scanner(System.in);
					 for(int i =0;i<10;i++) {
					        System.out.println(" Enter the Question");
							String Question = sc1.nextLine();
							System.out.println("Option1");
							String Option1 = sc1.nextLine();
							System.out.println("Option2");
							String Option2 = sc1.nextLine();
							System.out.println("Option3");
							String Option3 = sc1.nextLine();
							System.out.println("Option4");
							String Option4 = sc1.nextLine();
							System.out.println("Answer");
							String  Answer = sc1.nextLine();
							UserInput user = new UserInput();
							user.insertvalue(Question, Option1, Option2, Option3,Option4, Answer);
						
						}
					 break;
				 case 5: 
					 //Add student
					 Scanner sc2 = new Scanner(System.in);
						for(int i =0;i<10;i++) {
							System.out.println(" Enter User Name");
							String User_Name = sc2.next();
							int Score = 0;
							Student_Info Stud1 = new Student_Info();
							Stud1.insertStudent(User_Name, Score);
						}
						
						break;
				 case 6: 
					 //Exit
					 System.exit(0);
			     default: 
			    	 System.out.println(" Invalid Choice ");
				 }
			}while(ch!=6);
		}
			catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
