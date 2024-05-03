package DTO;

import java.util.Date;

public class NhanVienDTO {
	private int idNV;
	private String hoTen;
	private String gioiTinh;
	private Date ngaySinh;
	private int sdt;
	private int isDelete;

	public NhanVienDTO(int idNV, String hoTen, String gioiTinh, Date ngaySinh, int sdt, int isDelete) {
		idNV = idNV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.isDelete = isDelete;
	}

	public NhanVienDTO(String t) {
		this.idNV = t;
	}


    public int getidNV() {
		return idNV;
	}

	public void setidNV(int idNV) {
		idNV = idNV;
	}

	public String gethoTen() {
		return hoTen;
	}

	public void sethoTen(String hoTen) {
		this.hoTen = hoTen;
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

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
}
