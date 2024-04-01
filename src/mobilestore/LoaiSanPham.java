package mobilestore;

public class LoaiSanPham {
    private String IDLoai;
    private String tenLoai;
    private int isDelete;

    public LoaiSanPham(String IDLoai, String tenLoai, int isDelete) {
        this.IDLoai = IDLoai;
        this.tenLoai = tenLoai;
        this.isDelete = isDelete;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    

    public String getIDLoai() {
        return IDLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setIDLoai(String IDLoai) {
        this.IDLoai = IDLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "IDLoai=" + IDLoai + ", tenLoai=" + tenLoai + ", isDelete=" + isDelete + '}';
    }

    
    
}
