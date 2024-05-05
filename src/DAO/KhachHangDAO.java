package DAO;

import DTO.KhachHangDTO;
import config.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDAO implements DAOInterface<KhachHangDTO> {

    public static KhachHangDAO getInstance() {
        return new KhachHangDAO();
    }

    private KhachHangDAO() {
    }


    @Override
    public int insert(KhachHangDTO khachHangDto) {
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
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int update(KhachHangDTO khachHangDto) {
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
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }


    @Override
    public ArrayList<KhachHangDTO> selectAll() {
        ArrayList<KhachHangDTO> khachHangList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhachHang";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                KhachHangDTO khachHang = new KhachHangDTO(
                        rs.getInt("idKH"),
                        rs.getString("tenKH"),
                        rs.getString("diaChi"),
                        rs.getInt("sdt")
                );
                khachHangList.add(khachHang);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return khachHangList;
    }


    @Override
    public ArrayList<KhachHangDTO> selectByCondition(String condition) {
        ArrayList<KhachHangDTO> khachHangList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhachHang WHERE " + condition;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                KhachHangDTO khachHang = new KhachHangDTO(
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
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return khachHangList;
    }


    @Override
    public KhachHangDTO selectById(int idKhachHang) {
        KhachHangDTO khachHang = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhachHang WHERE idKH = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idKhachHang);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                khachHang = new KhachHangDTO(
                        rs.getInt("idKH"),
                        rs.getString("tenKH"),
                        rs.getString("diaChi"),
                        rs.getInt("sdt")
                );
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return khachHang;
    }
    
    public int getTotalCustomers() {
        int totalCustomers = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT COUNT(*) AS totalCustomers FROM KhachHang";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                totalCustomers = rs.getInt("totalCustomers");
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return totalCustomers;
    }


}
