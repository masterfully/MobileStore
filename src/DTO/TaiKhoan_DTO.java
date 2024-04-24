package DTO;

public class TaiKhoan_DTO {
    private String IDNhanVien;
    private String username;
    private String password;
    private String maNhomQuyen;
    private String trangThai;

    public TaiKhoan_DTO(String IDNhanVien, String username, String password, String maNhomQuyen, String trangThai) {
        this.IDNhanVien = IDNhanVien;
        this.username = username;
        this.password = password;
        this.maNhomQuyen = maNhomQuyen;
        this.trangThai = trangThai;
    }

    public TaiKhoan_DTO() {

    }

    public TaiKhoan_DTO(String t) {
        this.IDNhanVien = t;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMaNhomQuyen() {
        return maNhomQuyen;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMaNhomQuyen(String maNhomQuyen) {
        this.maNhomQuyen = maNhomQuyen;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
