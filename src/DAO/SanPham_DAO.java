package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import DTO.SanPham_DTO;
import config.JDBCUtil;

public class SanPham_DAO implements DAOInterface<SanPham_DTO> {

    public static SanPham_DAO getInstance() {
        return new SanPham_DAO();
    }

    @Override
    public int insert(SanPham_DTO t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO SanPham (idSP, tenSP, giaNhap, giaBan, soLuong, hinhAnh, mauSac, isDelete) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getIdSP());
            pst.setString(2, t.getTenSP());
            pst.setFloat(3, t.getGiaNhap());
            pst.setFloat(4, t.getGiaBan());
            pst.setInt(5, t.getSoLuong());
            pst.setString(6, t.getHinhAnh());
            pst.setString(7, t.getMauSac());
            pst.setInt(8, t.getIsDelete());
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
    public int update(SanPham_DTO t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE SanPham " +
                    "SET tenSP = ?, " +
                    "giaNhap = ?, " +
                    "giaBan = ?, " +
                    "soLuong = ?, " +
                    "hinhAnh = ?, " +
                    "mauSac = ?, " +
                    "isDelete = ? " +
                    "WHERE idSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenSP());
            pst.setFloat(2, t.getGiaBan());
            pst.setFloat(3, t.getGiaNhap());
            pst.setInt(4, t.getSoLuong());
            pst.setString(5, t.getHinhAnh());
            pst.setString(6, t.getMauSac());
            pst.setInt(7, t.getIsDelete());
            pst.setInt(8, t.getIdSP());
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
    public int delete(String idSanPham) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE SanPham " +
                    "SET isDelete = 1 " +
                    "WHERE idSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idSanPham);
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
    public ArrayList<SanPham_DTO> selectAll() {
        ArrayList<SanPham_DTO> sanPhamList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM SanPham WHERE isDelete=0";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                SanPham_DTO sanPham = new SanPham_DTO();
                sanPham.setIdSP(rs.getInt("idSP"));
                sanPham.setTenSP(rs.getString("tenSP"));
                sanPham.setGiaBan(rs.getInt("giaNhap"));
                sanPham.setGiaNhap(rs.getInt("giaBan"));
                sanPham.setSoLuong(rs.getInt("soLuong"));
                sanPham.setHinhAnh(rs.getString("hinhAnh"));
                sanPham.setMauSac(rs.getString("mauSac"));
                sanPham.setIsDelete(rs.getInt("isDelete"));
                sanPhamList.add(sanPham);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return sanPhamList;
    }


    @Override
    public ArrayList<SanPham_DTO> selectByCondition(String condition) {
        ArrayList<SanPham_DTO> sanPhamList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM SanPham WHERE " + condition;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                SanPham_DTO sanPham = new SanPham_DTO();
                sanPham.setIdSP(rs.getInt("idSP"));
                sanPham.setTenSP(rs.getString("tenSP"));
                sanPham.setGiaBan(rs.getInt("giaNhap"));
                sanPham.setGiaNhap(rs.getInt("giaBan"));
                sanPham.setSoLuong(rs.getInt("soLuong"));
                sanPham.setHinhAnh(rs.getString("hinhAnh"));
                sanPham.setMauSac(rs.getString("mauSac"));
                sanPham.setIsDelete(rs.getInt("isDelete"));
                sanPhamList.add(sanPham);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return sanPhamList;
    }


    @Override
    public SanPham_DTO selectById(int id) {
        SanPham_DTO sanPham = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM SanPham WHERE idSP = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                sanPham = new SanPham_DTO();
                sanPham.setIdSP(rs.getInt("idSP"));
                sanPham.setTenSP(rs.getString("tenSP"));
                sanPham.setGiaBan(rs.getInt("giaNhap"));
                sanPham.setGiaNhap(rs.getInt("giaBan"));
                sanPham.setSoLuong(rs.getInt("soLuong"));
                sanPham.setHinhAnh(rs.getString("hinhAnh"));
                sanPham.setMauSac(rs.getString("mauSac"));
                sanPham.setIsDelete(rs.getInt("isDelete"));
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return sanPham;
    }


    public int updateSoLuongTon(int masp, int soluong) {
        int quantity_current = this.selectById(masp).getSoLuong();
        int ketQua = 0;
        int quantity_change = quantity_current + soluong;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE SanPham SET soLuong = ? WHERE IDSanPham = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, quantity_change);
            pst.setInt(2, masp);
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }


}
