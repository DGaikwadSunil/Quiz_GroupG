import java.sql.Connection;
public class Student_Info {


		PreparedStatement prs = null;
		Connection con = null;
	public void insertStudent(String User_Name, int Score) {
			
			try {
				ConnectionTest connectiontest = new ConnectionTest();
				 con = connectiontest.getConnection();
				prs = con.prepareStatement("insert into Student_Info(User_Name,Score) values(?,?)");
				prs.setString(1,User_Name);
				prs.setInt(2,Score);
				int i = prs.executeUpdate();
				System.out.println(" Student Information  is updated" );
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	public void insert_score( String User_Name, int Score) {
		
		try {
			ConnectionTest connectiontest = new ConnectionTest();
			 con = connectiontest.getConnection();
			prs = con.prepareStatement("Update Student_Info set Score = ? where User_Name = ? ");
			prs.setInt(1,Score);
			prs.setString(2,User_Name);
			int i = prs.executeUpdate();
			System.out.println(" Score is updated ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	}

	}

}
