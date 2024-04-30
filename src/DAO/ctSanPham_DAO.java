package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import DTO.ctSanPham_DTO;
import config.JDBCUtil;

public class ctSanPham_DAO implements DAOInterface<ctSanPham_DTO> {
    public static ctSanPham_DAO getInstance() {
        return new ctSanPham_DAO();
    }
    @Override
    public int insert(ctSanPham_DTO t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO ctSanPham (maIMEI, chip, pin, manHinh, phienBanHDH, cameraSau, cameraTruoc, ram, rom, SANPHAM_idSP) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getMaIMEI());
            pst.setString(2, t.getChip());
            pst.setString(3, t.getPin());
            pst.setString(4, t.getManHinh());
            pst.setString(5, t.getPhienBanHDH());
            pst.setString(6, t.getCameraSau());
            pst.setString(7, t.getCameraTruoc());
            pst.setString(8, t.getRam());
            pst.setString(9, t.getRom());
            pst.setInt(10, t.getSANPHAM_idSP());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(ctSanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int update(ctSanPham_DTO t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE ctSanPham " +
                    "SET chip = ?, " +
                    "pin = ?, " +
                    "manHinh = ?, " +
                    "phienBanHDH = ?, " +
                    "cameraSau = ?, " +
                    "cameraTruoc = ?, " +
                    "ram = ?, " +
                    "rom = ?, " +
                    "SANPHAM_idSP = ? " +
                    "WHERE maIMEI = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getChip());
            pst.setString(2, t.getPin());
            pst.setString(3, t.getManHinh());
            pst.setString(4, t.getPhienBanHDH());
            pst.setString(5, t.getCameraSau());
            pst.setString(6, t.getCameraTruoc());
            pst.setString(7, t.getRam());
            pst.setString(8, t.getRom());
            pst.setInt(9, t.getSANPHAM_idSP());
            pst.setInt(10, t.getMaIMEI());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(ctSanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int delete(String maIMEI) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM ctSanPham WHERE maIMEI = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maIMEI);
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(ctSanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public ArrayList<ctSanPham_DTO> selectAll() {
        ArrayList<ctSanPham_DTO> ctSanPhamList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ctSanPham";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ctSanPham_DTO ctSanPham = new ctSanPham_DTO();
                ctSanPham.setMaIMEI(rs.getInt("maIMEI"));
                ctSanPham.setChip(rs.getString("chip"));
                ctSanPham.setPin(rs.getString("pin"));
                ctSanPham.setManHinh(rs.getString("manHinh"));
                ctSanPham.setPhienBanHDH(rs.getString("phienBanHDH"));
                ctSanPham.setCameraSau(rs.getString("cameraSau"));
                ctSanPham.setCameraTruoc(rs.getString("cameraTruoc"));
                ctSanPham.setRam(rs.getString("ram"));
                ctSanPham.setRom(rs.getString("rom"));
                ctSanPham.setSANPHAM_idSP(rs.getInt("SANPHAM_idSP"));
                ctSanPhamList.add(ctSanPham);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(ctSanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ctSanPhamList;
    }

    @Override
    public ArrayList<ctSanPham_DTO> selectByCondition(String condition) {
        ArrayList<ctSanPham_DTO> ctSanPhamList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ctSanPham WHERE " + condition;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ctSanPham_DTO ctSanPham = new ctSanPham_DTO();
                ctSanPham.setMaIMEI(rs.getInt("maIMEI"));
                ctSanPham.setChip(rs.getString("chip"));
                ctSanPham.setPin(rs.getString("pin"));
                ctSanPham.setManHinh(rs.getString("manHinh"));
                ctSanPham.setPhienBanHDH(rs.getString("phienBanHDH"));
                ctSanPham.setCameraSau(rs.getString("cameraSau"));
                ctSanPham.setCameraTruoc(rs.getString("cameraTruoc"));
                ctSanPham.setRam(rs.getString("ram"));
                ctSanPham.setRom(rs.getString("rom"));
                ctSanPham.setSANPHAM_idSP(rs.getInt("idSP"));
                ctSanPhamList.add(ctSanPham);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(ctSanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ctSanPhamList;
    }

    @Override
    public ctSanPham_DTO selectById(int maIMEI) {
        ctSanPham_DTO ctSanPham = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM ctSanPham WHERE maIMEI = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, maIMEI);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ctSanPham = new ctSanPham_DTO();
                ctSanPham.setMaIMEI(rs.getInt("maIMEI"));
                ctSanPham.setChip(rs.getString("chip"));
                ctSanPham.setPin(rs.getString("pin"));
                ctSanPham.setManHinh(rs.getString("manHinh"));
                ctSanPham.setPhienBanHDH(rs.getString("phienBanHDH"));
                ctSanPham.setCameraSau(rs.getString("cameraSau"));
                ctSanPham.setCameraTruoc(rs.getString("cameraTruoc"));
                ctSanPham.setRam(rs.getString("ram"));
                ctSanPham.setRom(rs.getString("rom"));
                ctSanPham.setSANPHAM_idSP(rs.getInt("SANPHAM_idSP")); }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(ctSanPham_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ctSanPham;
    }

}
