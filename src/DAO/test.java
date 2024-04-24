package DAO;

import DTO.KhachHang_DTO;
import DTO.NhanVien_DTO;
import DTO.SanPham_DTO;
import DTO.TaiKhoan_DTO;

public class test {
    public static void main(String[] args) {
        TaiKhoan_DTO sp1 = new TaiKhoan_DTO("NV011", "quanlykho3", "123", "Quản lý kho", "Ngưng hoạt động");
        System.out.println(TaiKhoan_DAO.getInstance().insert(sp1));
    }
}
