package com.diworksdev.ecsite.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";//JDBC のドライバーの名前を変数に代入。
	private static String url = "jdbc:mysql://localhost/ecsite";//データベースのURL
	private static String user = "root";
	private static String password = "0114Yuya";

	public Connection getConnection() {
		Connection con = null;//状態を初期化

		try {
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e ){//クラスが見つからない時の例外
			e.printStackTrace();
		} catch(SQLException e) {//データベース所に関する処理の例外
			e.printStackTrace();
		}
		return con;
	}
}
