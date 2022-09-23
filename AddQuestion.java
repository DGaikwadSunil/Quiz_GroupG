package com.velocity.MyQiuz;


import java.sql.Connection;
import java.sql.PreparedStatement;



public class AddQuestion {
	PreparedStatement prs = null;
	Connection con = null;
	
	public void insertvalue(String Question, String Option1, String Option2, String Option3, String Option4, String Answer) {
		
		try {
			ConnectionTest connectiontest = new ConnectionTest();
			 con = connectiontest.getConnection();
			prs = con.prepareStatement("insert into test(Question, Option1, Option2, Option3, Option4, Answer) values(?,?,?,?,?,?)");
			prs.setString(1,Question);
			prs.setString(2,Option1);
			prs.setString(3,Option2);
			prs.setString(4,Option3);
			prs.setString(5,Option4);
			prs.setString(6,Answer);
			int i = prs.executeUpdate();
			System.out.println(" Insertion is updated" +i);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		
public int display_question() {
			int Count = 0;
			int QCount = 1;
			try {
				
				ConnectionTest connectiontest = new ConnectionTest();
				 con = connectiontest.getConnection();
				 Statement state =  (Statement) con.createStatement();
				 String sql = "Select Question, Option1, Option2,Option3,Option4,Answer from test ORDER BY RAND() Limit 10";
				 ResultSet RS = ((java.sql.Statement) state).executeQuery(sql);
				 while(RS.next()) {
					 System.out.println("\n\nQuestion number:"+QCount);
					 System.out.println("\n\nQuestion : "+RS.getString(1));
					 System.out.print("\nOption 1 is : "+RS.getString(2));
					 System.out.print("\t\t Option 2 is : "+RS.getString(3));
					 System.out.print("\n\nOption 3 is : "+RS.getString(4));
					 System.out.print("\t\t Option 4 is : "+RS.getString(5));
					 System.out.print("\n\nEnter your choice :- ");
					 Scanner sc = new Scanner(System.in);
					 String Ans = sc.next();
		             if(Ans.equals(RS.getString(6))) {
		            	 Count++;
		             }
		             QCount++;

					 
				 }
				 System.out.println(" \n Your Score is :" +Count);
				 if(Count>=8 && Count<=10) {
					 System.out.println("\n Class A");
				 }
				 else if(Count>=6 && Count<=8) {
					 System.out.println("\n Class B");
				 }
				 else if(Count==5) {
					 System.out.println("\n Class C");
				 }
				 else {
					 System.out.println("\n Fail");
				 }
				
				
				 
		}catch(Exception e) {
			e.printStackTrace();
		}
			 return Count;
			
		}

}
