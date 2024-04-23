package DTO;

import java.util.Date;

public class NhanVien_DTO {
	private String IDNhanVien;
	private String tenNhanVien;
	private String gioiTinh;
	private Date ngaySinh;
	private String sdt;

	private int isDelete;

	public NhanVien_DTO(String iDNhanVien, String tenNhanVien, String gioiTinh, Date ngaySinh, String sdt, int isDelete) {
		IDNhanVien = iDNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.isDelete = isDelete;
	}

	public NhanVien_DTO(String t) {
		this.IDNhanVien = t;
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

	public java.sql.Date getNgaySinh() {
		return (java.sql.Date) ngaySinh;
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

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
}
