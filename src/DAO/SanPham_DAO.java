package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.SanPham_DTO;
import config.JDBCUtil;

public class SanPham_DAO implements DAOInterface<SanPham_DTO> {

	public static SanPham_DAO getInstance() {
		return new SanPham_DAO();
	}

	@Override
	public int insert(SanPham_DTO t) {
		try {
			// B1: tạo kết nối với DB
			Connection con = JDBCUtil.getConnection();

			// B2: tạo ra đối tượng Statement

			Statement st = con.createStatement();
			
			String sql = "INSERT INTO SanPham ("
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int update(SanPham_DTO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<SanPham_DTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SanPham_DTO> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SanPham_DTO selectById(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAutoIncrement() {
		// TODO Auto-generated method stub
		return 0;
	}

}
