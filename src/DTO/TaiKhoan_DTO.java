package DTO;

public class TaiKhoan_DTO {
    private String username;
    private String password;
    private String trangThai;
    private String chucVu;
    private NhanVien_DTO nhanVien;

    public TaiKhoan_DTO(String username, String password, String trangThai, String chucVu, NhanVien_DTO nhanVien) {
        this.username = username;
        this.password = password;
        this.trangThai = trangThai;
        this.chucVu = chucVu;
        this.nhanVien = nhanVien;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public NhanVien_DTO getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien_DTO nhanVien) {
        this.nhanVien = nhanVien;
    }
}
