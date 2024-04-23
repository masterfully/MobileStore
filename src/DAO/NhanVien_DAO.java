package DAO;

import DTO.NhanVien_DTO;
import config.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVien_DAO implements DAOInterface<NhanVien_DTO> {
    public static NhanVien_DAO getInstance() {
        return new NhanVien_DAO();
    }
    @Override
    public int insert(NhanVien_DTO nhanVienDto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO NhanVien (IDNhanVien, tenNhanVien, gioiTinh, ngaySinh, sdt, isDelete) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nhanVienDto.getIDNhanVien());
            pst.setString(2, nhanVienDto.getTenNhanVien());
            pst.setString(3, nhanVienDto.getGioiTinh());
            pst.setDate(4, nhanVienDto.getNgaySinh());
            pst.setString(5, nhanVienDto.getSdt());
            pst.setInt(6, nhanVienDto.getIsDelete());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int update(NhanVien_DTO nhanVienDto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE NhanVien SET tenNhanVien = ?, gioiTinh = ?, ngaySinh = ?, sdt = ?, isDelete = ? WHERE IDNhanVien = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nhanVienDto.getTenNhanVien());
            pst.setString(2, nhanVienDto.getGioiTinh());
            pst.setDate(3, nhanVienDto.getNgaySinh());
            pst.setString(4, nhanVienDto.getSdt());
            pst.setInt(5, nhanVienDto.getIsDelete());
            pst.setString(6, nhanVienDto.getIDNhanVien());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int delete(String idNhanVien) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE NhanVien " +
                    "SET isDelete = 1 " +
                    "WHERE IDNhanVien = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idNhanVien);
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public ArrayList<NhanVien_DTO> selectAll() {
        ArrayList<NhanVien_DTO> nhanViens = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE isDelete=0";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                NhanVien_DTO nhanVien = new NhanVien_DTO(
                        rs.getString("IDNhanVien"),
                        rs.getString("tenNhanVien"),
                        rs.getString("gioiTinh"),
                        rs.getDate("ngaySinh"),
                        rs.getString("sdt"),
                        rs.getInt("isDelete")
                );
                nhanViens.add(nhanVien);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhanViens;
    }

    @Override
    public ArrayList<NhanVien_DTO> selectByCondition(String condition) {
        ArrayList<NhanVien_DTO> nhanViens = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE " + condition;
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                NhanVien_DTO nhanVien = new NhanVien_DTO(
                        rs.getString("IDNhanVien"),
                        rs.getString("tenNhanVien"),
                        rs.getString("gioiTinh"),
                        rs.getDate("ngaySinh"),
                        rs.getString("sdt"),
                        rs.getInt("isDelete")
                );
                nhanViens.add(nhanVien);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhanViens;
    }

    @Override
    public NhanVien_DTO selectById(String idNhanVien) {
        NhanVien_DTO nhanVien = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE IDNhanVien = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idNhanVien);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nhanVien = new NhanVien_DTO(
                        rs.getString("IDNhanVien"),
                        rs.getString("tenNhanVien"),
                        rs.getString("gioiTinh"),
                        rs.getDate("ngaySinh"),
                        rs.getString("sdt"),
                        rs.getInt("isDelete")
                );
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhanVien;
    }
}


