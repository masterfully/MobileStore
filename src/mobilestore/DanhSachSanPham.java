package mobilestore;
import java.util.ArrayList;
import java.util.List;

public class DanhSachSanPham {
    private List<SanPham> danhSachSanPham;

    public DanhSachSanPham() {
        danhSachSanPham = new ArrayList<>();
    }

    public void themSanPham(SanPham sanPham) {
        danhSachSanPham.add(sanPham);
    }

    public void xoaSanPham(SanPham sanPham) {
        danhSachSanPham.remove(sanPham);
    }

    public List<SanPham> layDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void hienThiDanhSachSanPham() {
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println(sanPham);
        }
    }
}
