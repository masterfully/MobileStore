package DTO;

import java.sql.Date;

public class HoaDonDTO {
	private int idHoaDon;
	private Date thoiGian;
	private double tongTien;
	private int NHANVIEN_idNV;
	private int KHACHHANG_idKH;
	public HoaDonDTO(int idHoaDon, Date thoiGian, double tongTien, int nHANVIEN_idNV, int kHACHHANG_idKH) {
		super();
		this.idHoaDon = idHoaDon;
		this.thoiGian = thoiGian;
		this.tongTien = tongTien;
		NHANVIEN_idNV = nHANVIEN_idNV;
		KHACHHANG_idKH = kHACHHANG_idKH;
	}
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public Date getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public int getNHANVIEN_idNV() {
		return NHANVIEN_idNV;
	}
	public void setNHANVIEN_idNV(int nHANVIEN_idNV) {
		NHANVIEN_idNV = nHANVIEN_idNV;
	}
	public int getKHACHHANG_idKH() {
		return KHACHHANG_idKH;
	}
	public void setKHACHHANG_idKH(int kHACHHANG_idKH) {
		KHACHHANG_idKH = kHACHHANG_idKH;
	}
	
}
