package test;

import java.sql.Connection;

import config.JDBCUtil;

public class testJDBCUtil {

	public static void main(String[] args) {
		Connection connection = JDBCUtil.getConnection();
		System.out.println(connection);
	}

}
