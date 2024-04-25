package DAO;

import DTO.NhaCungCap_DTO;
import config.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhaCungCap_DAO implements DAOInterface<NhaCungCap_DTO> {

    public static NhaCungCap_DAO getInstance() {
        return new NhaCungCap_DAO();
    }

    private NhaCungCap_DAO() {
    }


    @Override
    public int insert(NhaCungCap_DTO nhaCungCapDto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO NhaCungCap (maNCC, tenNCC, diaChi, sdt) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nhaCungCapDto.getMaNCC());
            pst.setString(2, nhaCungCapDto.getTenNCC());
            pst.setString(3, nhaCungCapDto.getDiaChi());
            pst.setString(4, nhaCungCapDto.getSdt());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhaCungCap_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }

    @Override
    public int update(NhaCungCap_DTO nhaCungCapDto) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE NhaCungCap SET tenNCC = ?, diaChi = ?, sdt = ? WHERE maNCC = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nhaCungCapDto.getTenNCC());
            pst.setString(2, nhaCungCapDto.getDiaChi());
            pst.setString(3, nhaCungCapDto.getSdt());
            pst.setString(4, nhaCungCapDto.getMaNCC());
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhaCungCap_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }


    @Override
    public int delete(String maNCC) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM NhaCungCap WHERE maNCC = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maNCC);
            ketQua = pst.executeUpdate();
            System.out.println("Đã thực thi: " + sql);
            System.out.println("Đã thay đổi " + ketQua + " dòng");
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhaCungCap_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ketQua;
    }


    @Override
    public ArrayList<NhaCungCap_DTO> selectAll() {
        ArrayList<NhaCungCap_DTO> nhaCungCapList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhaCungCap";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                NhaCungCap_DTO nhaCungCap = new NhaCungCap_DTO(
                        rs.getString("maNCC"),
                        rs.getString("tenNCC"),
                        rs.getString("diaChi"),
                        rs.getString("sdt")
                );
                nhaCungCapList.add(nhaCungCap);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhaCungCap_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhaCungCapList;
    }


    @Override
    public NhaCungCap_DTO selectById(String maNCC) {
        NhaCungCap_DTO nhaCungCap = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhaCungCap WHERE maNCC = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maNCC);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                nhaCungCap = new NhaCungCap_DTO(
                        rs.getString("maNCC"),
                        rs.getString("tenNCC"),
                        rs.getString("diaChi"),
                        rs.getString("sdt")
                );
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhaCungCap_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhaCungCap;
    }

    @Override
    public ArrayList<NhaCungCap_DTO> selectByCondition(String condition) {
        ArrayList<NhaCungCap_DTO> nhaCungCapList = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhaCungCap WHERE " + condition;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                NhaCungCap_DTO nhaCungCap = new NhaCungCap_DTO(
                        rs.getString("maNCC"),
                        rs.getString("tenNCC"),
                        rs.getString("diaChi"),
                        rs.getString("sdt")
                );
                nhaCungCapList.add(nhaCungCap);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            Logger.getLogger(NhaCungCap_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return nhaCungCapList;
    }

}
