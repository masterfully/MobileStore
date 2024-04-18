package DTO;

import java.util.Date;

public class NhanVien_DTO {
	private String IDNhanVien;
    private String tenNhanVien;
    private String gioiTinh;
    private Date ngaySinh;
    private String sdt;
	public NhanVien_DTO(String iDNhanVien, String tenNhanVien, String gioiTinh, Date ngaySinh, String sdt) {
		IDNhanVien = iDNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
	}
	public String getIDNhanVien() {
		return IDNhanVien;
	}
	public void setIDNhanVien(String iDNhanVien) {
		IDNhanVien = iDNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
    
}
