package BUS;

import DAO.SanPham_DAO;
import DTO.SanPham_DTO;
import java.util.ArrayList;

public class SanPham_BUS {

    public final SanPham_DAO spDAO = new SanPham_DAO();
    private ArrayList<SanPham_DTO> listSP = new ArrayList<>();

    public SanPham_BUS() {
        listSP = spDAO.selectAll();
    }

    public ArrayList<SanPham_DTO> getAll() {
        return this.listSP;
    }

    public SanPham_DTO getByIndex(int index) {
        return this.listSP.get(index);
    }

    public SanPham_DTO getByMaSP(int masp) {
        int vitri = -1;
        int i = 0;
        while (i <= this.listSP.size() && vitri == -1) {
            if (this.listSP.get(i).getIdSP() == masp) {
                vitri = i;
            } else {
                i++;
            }
        }
        return this.listSP.get(vitri);
    }

    public int getIndexByMaSP(int masanpham) {
        int i = 0;
        int vitri = -1;
        while (i < this.listSP.size() && vitri == -1) {
            if (listSP.get(i).getIdSP() == masanpham) {
                vitri = i;
            } else {
                i++;
            }
        }
        return vitri;
    }


    public Boolean delete(SanPham_DTO lh) {
        boolean check = spDAO.delete(Integer.toString(lh.getIdSP())) != 0;
        if (check) {
            this.listSP.remove(lh);
        }
        return check;
    }

    public Boolean update(SanPham_DTO lh) {
        boolean check = spDAO.update(lh) != 0;
        if (check) {
            this.listSP.set(getIndexByMaSP(lh.getIdSP()), lh);
        }
        return check;
    }

    public ArrayList<SanPham_DTO> search(String text) {
        text = text.toLowerCase();
        ArrayList<SanPham_DTO> result = new ArrayList<>();
        for (SanPham_DTO i : this.listSP) {
            if (Integer.toString(i.getIdSP()).toLowerCase().contains(text) || i.getTenSP().toLowerCase().contains(text)) {
                result.add(i);
            }
        }
        return result;
    }



    public int getQuantity() {
        ArrayList<SanPham_DTO> result = new ArrayList<>();
        int n = 0;
        for(SanPham_DTO i : this.listSP) {
            if (i.getSoLuong() != 0) {
                n += i.getSoLuong();
            }
        }
        return n;
    }
}
