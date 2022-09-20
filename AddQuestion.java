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
		

}
