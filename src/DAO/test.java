package DAO;

import DTO.*;
import com.mysql.cj.log.NullLogger;

public class test {
    public static void main(String[] args) {
//        ctSanPham_DTO sp1 = new ctSanPham_DTO(113114032,null, null, null, null, null, null, null, null, 1001);
        ctSanPham_DTO sp1 = new ctSanPham_DTO();
        System.out.println(ctSanPham_DAO.getInstance().selectById(113114031));
    }
}
