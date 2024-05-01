package DAO;

import DTO.*;
import com.mysql.cj.log.NullLogger;

public class test {
    public static void main(String[] args) {
        SanPham_DTO sp1 = new SanPham_DTO(1034);
        System.out.println(SanPham_DAO.getInstance().update(sp1));
    }
}
