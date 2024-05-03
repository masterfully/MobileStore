package DAO;

import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import config.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaiKhoanDAO implements DAOInterface<TaiKhoanDTO>{
    public static TaiKhoanDAO getInstance(){return new TaiKhoanDAO();}
    @Override
    public int insert(TaiKhoanDTO taiKhoan_dto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO TaiKhoan (username, password, maNhomQuyen, trangThai, idNV) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, taiKhoan_dto.getUsername());
            pst.setString(2, taiKhoan_dto.getPassword());
            pst.setString(3, taiKhoan_dto.getTrangThai());
            pst.setString(4, taiKhoan_dto.getChucVu());
            pst.setInt(5, taiKhoan_dto.getIdNV());
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
    public int update(TaiKhoanDTO taiKhoanDto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE NhanVien SET IDNhanVien = ?, username = ?, password = ?, maNhomQuyen = ?, trangThai = ? WHERE IDNhanVien = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, taiKhoanDto.getUsername());
            pst.setString(3, taiKhoanDto.getPassword());
            pst.setString(4, taiKhoanDto.getTrangThai());
            pst.setString(4, taiKhoanDto.getChucVu());
            pst.setInt(5, taiKhoanDto.getIdNV());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int delete(String idNhanVien) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE TaiKhoan " +
                    "SET trangThai = -1 " +
                    "WHERE NHANVIEN_idNV = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idNhanVien);
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public ArrayList<TaiKhoanDTO> selectAll() {
        ArrayList<TaiKhoanDTO> taikhoans = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE isDelete=0";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                TaiKhoanDTO taikhoan = new TaiKhoanDTO(
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("trangThai"),
                        rs.getString("chucVu"),
                        rs.getInt("idNV")
                );
                taikhoans.add(taikhoan);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return taikhoans;
    }

    @Override
    public ArrayList<TaiKhoanDTO> selectByCondition(String condition) {
        ArrayList<TaiKhoanDTO> taikhoans = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE " + condition;
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                TaiKhoanDTO taikhoan = new TaiKhoanDTO(
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("trangThai"),
                        rs.getString("chucVu"),
                        rs.getInt("idNV")
                );
                taikhoans.add(taikhoan);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return taikhoans;
    }

    @Override
    public TaiKhoanDTO selectById(int idNhanVien) {
        TaiKhoanDTO taikhoan = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE IDNhanVien = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idNhanVien);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                taikhoan = new TaiKhoanDTO(
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("trangThai"),
                        rs.getString("chucVu"),
                        rs.getInt("idNV")
                );
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return taikhoan;
    }
}
