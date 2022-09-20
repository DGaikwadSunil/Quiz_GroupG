   

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.Scanner;

	public class Loggin {
		PreparedStatement prs = null;
		Connection con = null;
	public void Check_Loggin() {
			
			try {
				ConnectionTest connectiontest = new ConnectionTest();
				 con = connectiontest.getConnection();
				 Scanner sc2 = new Scanner(System.in);
				 System.out.println(" Enter User Name : ");
				 String User_Name = sc2.next();
				 Statement state =  con.createStatement();
				 String sql = "Select User_Name from student_info ";
				 ResultSet RS = state.executeQuery(sql);
				 int ch =  0;
				 while(RS.next()) {
					 
					 
				 
				 if(User_Name.equals(RS.getString(1))) {
					 
					 UserInput user1 = new UserInput();
						int Score = user1.display_question();
						Student_Info stud2 = new Student_Info();
						 stud2.insert_score(User_Name, Score);
						 ch = 1;
						 
	             }
				 
				 }
				 
				 if(ch==0) {
					System.out.println(" Invalid User Name");
				 }else {
					 System.out.println(" Test successfully submitted ");
				 }
				 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}


	}


