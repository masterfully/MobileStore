package DAO;

import DTO.KhachHang_DTO;
import config.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHang_DAO implements DAOInterface<KhachHang_DTO> {

    public static KhachHang_DAO getInstance() {
        return new KhachHang_DAO();
    }

    private KhachHang_DAO() {
    }


    @Override
    public int insert(KhachHang_DTO khachHangDto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO KhachHang (IDKhachHang, tenKhachHang, diaChi, sdt, isDelete) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, khachHangDto.getIDKhachHang());
            pst.setString(2, khachHangDto.getTenKhachHang());
            pst.setString(3, khachHangDto.getDiaChi());
            pst.setString(4, khachHangDto.getSdt());
            pst.setInt(5, khachHangDto.getIsDelete());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int update(KhachHang_DTO khachHangDto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE KhachHang SET tenKhachHang = ?, diaChi = ?, sdt = ?, isDelete = ? WHERE IDKhachHang = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, khachHangDto.getTenKhachHang());
            pst.setString(2, khachHangDto.getDiaChi());
            pst.setString(3, khachHangDto.getSdt());
            pst.setInt(4, khachHangDto.getIsDelete());
            pst.setString(5, khachHangDto.getIDKhachHang());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }


    @Override
    public int delete(String idKhachHang) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE KhachHang SET isDelete = 1 WHERE IDKhachHang = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idKhachHang);
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }


    @Override
    public ArrayList<KhachHang_DTO> selectAll() {
        ArrayList<KhachHang_DTO> khachHangList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhachHang WHERE isDelete=0";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                KhachHang_DTO khachHang = new KhachHang_DTO(
                        rs.getString("IDKhachHang"),
                        rs.getString("tenKhachHang"),
                        rs.getString("diaChi"),
                        rs.getString("sdt"),
                        rs.getInt("isDelete")
                );
                khachHangList.add(khachHang);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return khachHangList;
    }


    @Override
    public ArrayList<KhachHang_DTO> selectByCondition(String condition) {
        ArrayList<KhachHang_DTO> khachHangList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhachHang WHERE " + condition;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                KhachHang_DTO khachHang = new KhachHang_DTO(
                        rs.getString("IDKhachHang"),
                        rs.getString("tenKhachHang"),
                        rs.getString("diaChi"),
                        rs.getString("sdt"),
                        rs.getInt("isDelete")
                );
                khachHangList.add(khachHang);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return khachHangList;
    }


    @Override
    public KhachHang_DTO selectById(int idKhachHang) {
        KhachHang_DTO khachHang = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhachHang WHERE IDKhachHang = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idKhachHang);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                khachHang = new KhachHang_DTO(
                        rs.getString("IDKhachHang"),
                        rs.getString("tenKhachHang"),
                        rs.getString("diaChi"),
                        rs.getString("sdt"),
                        rs.getInt("isDelete")
                );
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHang_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return khachHang;
    }

}
