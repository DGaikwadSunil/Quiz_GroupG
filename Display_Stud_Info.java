
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class Display_Stud_Info {
		PreparedStatement prs = null;
		Connection con = null;
		public void  display_student() {
			try {
				
				ConnectionTest connectiontest = new ConnectionTest();
				 con = connectiontest.getConnection();
				 Statement state =  con.createStatement();
				 String sql = "Select * from  student_info  Order by ID";
				 ResultSet RS = state.executeQuery(sql);
				 System.out.println("Student ID\tStudent name\tScore");
				 while(RS.next()) {
					 
					 System.out.println("  "+RS.getInt(1)+"   \t\t"+RS.getString(2)+"\t\t"+RS.getInt(3));
				
				 }
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
			
			public void  display_Student_BY_ID(int ID) {
				try {
					
					ConnectionTest connectiontest = new ConnectionTest();
					 con = connectiontest.getConnection();
					  prs =  con.prepareStatement("Select * from  student_info where ID = ?");
					  prs.setInt(1, ID);
					 ResultSet RS = prs.executeQuery();
					 System.out.println("Student ID\tStudent name\tScore");
					 while(RS.next()) {
						 System.out.println("  "+RS.getInt(1)+"   \t\t"+RS.getString(2)+"\t\t"+RS.getInt(3));
					 }
				}catch (Exception e) {
					e.printStackTrace();
				}
		}
		
	}


}
