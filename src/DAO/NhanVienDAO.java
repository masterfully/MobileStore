package DAO;

import DTO.NhanVienDTO;
import config.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienDAO implements DAOInterface<NhanVienDTO> {
    public static NhanVienDAO getInstance() {
        return new NhanVienDAO();
    }
    @Override
    public int insert(NhanVienDTO nhanVienDto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO NhanVien (IDNhanVien, tenNhanVien, gioiTinh, ngaySinh, sdt, isDelete) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, nhanVienDto.getidNV());
            pst.setString(2, nhanVienDto.gethoTen());
            pst.setString(3, nhanVienDto.getGioiTinh());
            pst.setDate(4, nhanVienDto.getNgaySinh());
            pst.setInt(5, nhanVienDto.getSdt());
            pst.setInt(6, nhanVienDto.getIsDelete());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int update(NhanVienDTO nhanVienDto) {
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
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public ArrayList<NhanVienDTO> selectAll() {
        ArrayList<NhanVienDTO> nhanViens = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE isDelete=0";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                NhanVienDTO nhanVien = new NhanVienDTO(
                        rs.getInt("idNV"),
                        rs.getString("hoTen"),
                        rs.getString("gioiTinh"),
                        rs.getDate("ngaySinh"),
                        rs.getInt("sdt"),
                        rs.getInt("isDelete")
                );
                nhanViens.add(nhanVien);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhanViens;
    }

    @Override
    public ArrayList<NhanVienDTO> selectByCondition(String condition) {
        ArrayList<NhanVienDTO> nhanViens = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE " + condition;
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                NhanVienDTO nhanVien = new NhanVienDTO(
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
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhanViens;
    }

    @Override
    public NhanVienDTO selectById(int idNhanVien) {
        NhanVienDTO nhanVien = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE idNV = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idNhanVien);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nhanVien = new NhanVienDTO(
                        rs.getInt("idNV"),
                        rs.getString("hoTen"),
                        rs.getString("gioiTinh"),
                        rs.getDate("ngaySinh"),
                        rs.getInt("sdt"),
                        rs.getInt("isDelete")
                );
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhanVien;
    }
    
    public int getTotalEmployees() {
        int totalEmployees = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT COUNT(*) AS totalEmployees FROM NhanVien WHERE isDelete=0";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                totalEmployees = rs.getInt("totalEmployees");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return totalEmployees;
    }

}


