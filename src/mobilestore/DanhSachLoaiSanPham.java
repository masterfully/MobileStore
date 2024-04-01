package mobilestore;
import java.util.ArrayList;
import java.util.List;

public class DanhSachLoaiSanPham {
    private List<LoaiSanPham> danhSachLoaiSanPham;

    public DanhSachLoaiSanPham() {
        danhSachLoaiSanPham = new ArrayList<>();
    }

    public void themLoaiSanPham(LoaiSanPham loaiSanPham) {
        danhSachLoaiSanPham.add(loaiSanPham);
    }

    public void xoaLoaiSanPham(LoaiSanPham loaiSanPham) {
        danhSachLoaiSanPham.remove(loaiSanPham);
    }

    public List<LoaiSanPham> layDanhSachLoaiSanPham() {
        return danhSachLoaiSanPham;
    }

    public void hienThiDanhSachLoaiSanPham() {
        for (LoaiSanPham loaiSanPham : danhSachLoaiSanPham) {
            System.out.println(loaiSanPham);
        }
    }
}
