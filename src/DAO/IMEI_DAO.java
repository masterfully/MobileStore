package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import DTO.IMEI_DTO;
import config.JDBCUtil;

public class IMEI_DAO implements DAOInterface<IMEI_DTO> {

    public static IMEI_DAO getInstance() {
        return new IMEI_DAO();
    }

    @Override
    public int insert(IMEI_DTO t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO IMEI (maIMEI, SANPHAM_idSP, idPhieuNhap, idPhieuXuat, trangThai) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getMaIMEI());
            pst.setInt(2, t.getSANPHAM_idSP());
            pst.setInt(3, 5501);
            pst.setInt(4, 11101);
            pst.setInt(5, t.getTrangThai());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(IMEI_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }


    @Override
    public int update(IMEI_DTO t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE IMEI " +
                    "SET SANPHAM_idSP = ?, " +
                    "idPhieuNhap = ?, " +
                    "idPhieuXuat = ?, " +
                    "trangThai = ?, " +
                    "WHERE maIMEI = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getMaIMEI());
            pst.setInt(2, t.getSANPHAM_idSP());
            pst.setInt(3, t.getIdPhieuNhap());
            pst.setInt(4, t.getIdPhieuXuat());
            pst.setInt(5, t.getTrangThai());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(IMEI_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }


    @Override
    public int delete(String maIMEI) {
        int rowsAffected = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM IMEI " +
                    "WHERE maIMEI = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maIMEI);
            rowsAffected = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã xóa " + rowsAffected + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(IMEI_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return rowsAffected;
    }



    @Override
    public ArrayList<IMEI_DTO> selectAll() {
        ArrayList<IMEI_DTO> ctsanPhamList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM IMEI";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                IMEI_DTO sanPham = new IMEI_DTO();
                sanPham.setMaIMEI(rs.getInt("maIMEI"));
                sanPham.setSANPHAM_idSP(rs.getInt("SANPHAM_idSP"));
                sanPham.setIdPhieuNhap(rs.getInt("idPhieuNhap"));
                sanPham.setIdPhieuXuat(rs.getInt("idPhieuXuat"));
                sanPham.setTrangThai(rs.getInt("trangThai"));
                ctsanPhamList.add(sanPham);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(IMEI_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ctsanPhamList;
    }


    @Override
    public ArrayList<IMEI_DTO> selectByCondition(String condition) {
        ArrayList<IMEI_DTO> ctsanPhamList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM IMEI WHERE " + condition;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
            	IMEI_DTO sanPham = new IMEI_DTO();
                sanPham.setMaIMEI(rs.getInt("maIMEI"));
                sanPham.setSANPHAM_idSP(rs.getInt("SANPHAM_idSP"));
                sanPham.setIdPhieuNhap(rs.getInt("idPhieuNhap"));
                sanPham.setIdPhieuXuat(rs.getInt("idPhieuXuat"));
                sanPham.setTrangThai(rs.getInt("trangThai"));
                ctsanPhamList.add(sanPham);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(IMEI_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ctsanPhamList;
    }


    @Override
    public IMEI_DTO selectById(int id) {
        IMEI_DTO sanPham = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM IMEI WHERE maIMEI = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
            	sanPham = new IMEI_DTO();
                sanPham.setMaIMEI(rs.getInt("maIMEI"));
                sanPham.setSANPHAM_idSP(rs.getInt("SANPHAM_idSP"));
                sanPham.setIdPhieuNhap(rs.getInt("idPhieuNhap"));
                sanPham.setIdPhieuXuat(rs.getInt("idPhieuXuat"));
                sanPham.setTrangThai(rs.getInt("trangThai"));
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(IMEI_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return sanPham;
    }


   


}
