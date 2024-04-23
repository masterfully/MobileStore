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
            String sql = "INSERT INTO SanPham (IDSanPham, tenSanPham, giaBan, giaNhap, soLuong, hinhAnh, mauSac, chip, pin, manHinh, phienBanHDH, cameraSau, cameraTruoc, ram, rom, isDelete) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getIDSanPham());
            pst.setString(2, t.getTenSanPham());
            pst.setInt(3, t.getGiaBan());
            pst.setInt(4, t.getGiaNhap());
            pst.setInt(5, t.getSoLuong());
            pst.setString(6, t.getHinhAnh());
            pst.setString(7, t.getMauSac());
            pst.setString(8, t.getChip());
            pst.setString(9, t.getPin());
            pst.setString(10, t.getManHinh());
            pst.setString(11, t.getPhienBanHDH());
            pst.setString(12, t.getCameraSau());
            pst.setString(13, t.getCameraTruoc());
            pst.setString(14, t.getRam());
            pst.setString(15, t.getRom());
            pst.setInt(16, t.getIsDelete());
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
                    "SET tenSanPham = ?, " +
                    "giaBan = ?, " +
                    "giaNhap = ?, " +
                    "soLuong = ?, " +
                    "hinhAnh = ?, " +
                    "mauSac = ?, " +
                    "chip = ?, " +
                    "pin = ?, " +
                    "manHinh = ?, " +
                    "phienBanHDH = ?, " +
                    "cameraSau = ?, " +
                    "cameraTruoc = ?, " +
                    "ram = ?, " +
                    "rom = ?, " +
                    "isDelete = ? " +
                    "WHERE IDSanPham = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenSanPham());
            pst.setInt(2, t.getGiaBan());
            pst.setInt(3, t.getGiaNhap());
            pst.setInt(4, t.getSoLuong());
            pst.setString(5, t.getHinhAnh());
            pst.setString(6, t.getMauSac());
            pst.setString(7, t.getChip());
            pst.setString(8, t.getPin());
            pst.setString(9, t.getManHinh());
            pst.setString(10, t.getPhienBanHDH());
            pst.setString(11, t.getCameraSau());
            pst.setString(12, t.getCameraTruoc());
            pst.setString(13, t.getRam());
            pst.setString(14, t.getRom());
            pst.setInt(15, t.getIsDelete());
            pst.setString(16, t.getIDSanPham()); // Assuming IDSanPham is the primary key
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
                    "WHERE IDSanPham = ?";
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
                sanPham.setIDSanPham(rs.getString("IDSanPham"));
                sanPham.setTenSanPham(rs.getString("tenSanPham"));
                sanPham.setGiaBan(rs.getInt("giaBan"));
                sanPham.setGiaNhap(rs.getInt("giaNhap"));
                sanPham.setSoLuong(rs.getInt("soLuong"));
                sanPham.setHinhAnh(rs.getString("hinhAnh"));
                sanPham.setMauSac(rs.getString("mauSac"));
                sanPham.setChip(rs.getString("chip"));
                sanPham.setPin(rs.getString("pin"));
                sanPham.setManHinh(rs.getString("manHinh"));
                sanPham.setPhienBanHDH(rs.getString("phienBanHDH"));
                sanPham.setCameraSau(rs.getString("cameraSau"));
                sanPham.setCameraTruoc(rs.getString("cameraTruoc"));
                sanPham.setRam(rs.getString("ram"));
                sanPham.setRom(rs.getString("rom"));
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
                sanPham.setIDSanPham(rs.getString("IDSanPham"));
                sanPham.setTenSanPham(rs.getString("tenSanPham"));
                sanPham.setGiaBan(rs.getInt("giaBan"));
                sanPham.setGiaNhap(rs.getInt("giaNhap"));
                sanPham.setSoLuong(rs.getInt("soLuong"));
                sanPham.setHinhAnh(rs.getString("hinhAnh"));
                sanPham.setMauSac(rs.getString("mauSac"));
                sanPham.setChip(rs.getString("chip"));
                sanPham.setPin(rs.getString("pin"));
                sanPham.setManHinh(rs.getString("manHinh"));
                sanPham.setPhienBanHDH(rs.getString("phienBanHDH"));
                sanPham.setCameraSau(rs.getString("cameraSau"));
                sanPham.setCameraTruoc(rs.getString("cameraTruoc"));
                sanPham.setRam(rs.getString("ram"));
                sanPham.setRom(rs.getString("rom"));
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
    public SanPham_DTO selectById(String id) {
        SanPham_DTO sanPham = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM SanPham WHERE IDSanPham = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                sanPham = new SanPham_DTO();
                sanPham.setIDSanPham(rs.getString("IDSanPham"));
                sanPham.setTenSanPham(rs.getString("tenSanPham"));
                sanPham.setGiaBan(rs.getInt("giaBan"));
                sanPham.setGiaNhap(rs.getInt("giaNhap"));
                sanPham.setSoLuong(rs.getInt("soLuong"));
                sanPham.setHinhAnh(rs.getString("hinhAnh"));
                sanPham.setMauSac(rs.getString("mauSac"));
                sanPham.setChip(rs.getString("chip"));
                sanPham.setPin(rs.getString("pin"));
                sanPham.setManHinh(rs.getString("manHinh"));
                sanPham.setPhienBanHDH(rs.getString("phienBanHDH"));
                sanPham.setCameraSau(rs.getString("cameraSau"));
                sanPham.setCameraTruoc(rs.getString("cameraTruoc"));
                sanPham.setRam(rs.getString("ram"));
                sanPham.setRom(rs.getString("rom"));
                sanPham.setIsDelete(rs.getInt("isDelete"));
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return sanPham;
    }


    public int updateSoLuongTon(String masp, int soluong) {
        int quantity_current = this.selectById(masp).getSoLuong();
        int ketQua = 0;
        int quantity_change = quantity_current + soluong;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE SanPham SET soLuong = ? WHERE IDSanPham = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, quantity_change);
            pst.setString(2, masp);
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
