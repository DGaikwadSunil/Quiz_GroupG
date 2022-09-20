package com.velocity.MyQiuz;

	
	import java.sql.Connection;
	import java.sql.DriverManager;

	public class ConnectionTest {
		
		Connection connection =null;
		
		public Connection getConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager.getConnection("jdbc:mysql://localhost : 3306/qset" ,"root", "RuPu@321");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return connection;
			
		}

}
