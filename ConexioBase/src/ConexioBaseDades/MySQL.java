package ConexioBaseDades;

import java.sql.*;
import java.sql.DriverManager;

public class MySQL {
	
	private static final String url = "jdbc:mysql://127.0.0.1/";
	private static final String user = "root";
	private static final String pass = "";
	
	public static Connection Connectar(String db){
		Connection link = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			link = DriverManager.getConnection(url+db, user, pass);
		}catch(Exception e){
			System.out.println(e);
		}
		return link;
	}
}