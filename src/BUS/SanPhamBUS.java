package BUS;

import DAO.SanPhamDAO;
import DTO.SanPhamDTO;

import java.util.ArrayList;

public class SanPhamBUS {

    private final SanPhamDAO sanPhamDAO;

    public SanPhamBUS() {
        this.sanPhamDAO = new SanPhamDAO();
    }

    public int themSanPham(SanPhamDTO sanPham) {
        return sanPhamDAO.insert(sanPham);
    }

    public int capNhatSanPham(SanPhamDTO sanPham) {
        return sanPhamDAO.update(sanPham);
    }

    public int xoaSanPham(String idSanPham) {
        return sanPhamDAO.delete(idSanPham);
    }

    public ArrayList<SanPhamDTO> layDanhSachSanPham() {
        return sanPhamDAO.selectAll();
    }

    public ArrayList<SanPhamDTO> layDanhSachTatCaSanPham() {
        return sanPhamDAO.selectAllAll();
    }

    public ArrayList<SanPhamDTO> timKiemSanPhamTheoDieuKien(String dieuKien) {
        return sanPhamDAO.selectByCondition(dieuKien);
    }

    public SanPhamDTO laySanPhamTheoId(int id) {
        return sanPhamDAO.selectById(id);
    }

    public int capNhatSoLuongTon(int maSanPham, int soLuong) {
        return sanPhamDAO.updateSoLuongTon(maSanPham, soLuong);
    }

    public int tinhTongSoLuong() {
        return sanPhamDAO.getTotalQuantity();
    }
}
