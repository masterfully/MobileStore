package DAO;

import DTO.KhachHang_DTO;
import DTO.NhanVien_DTO;
import DTO.SanPham_DTO;
public class test {
    public static void main(String[] args) {
        KhachHang_DTO sp1 = new KhachHang_DTO("KH020");
        System.out.println(KhachHang_DAO.getInstance().update(sp1));
    }
}
