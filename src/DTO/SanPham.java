package DTO;

public class SanPham_DTO {
	private String IDSanPham;
	private String tenSanPham;
	private int giaBan;
	private int giaNhap;
	private int soLuong;
	private String hinhAnh;
	private String mauSac;
	private String chip;
	private String pin;
	private String manHinh;
	private String phienBanHDH;
	private String cameraSau;
	private String cameraTruoc;
	private String ram;
	private String rom;
	private int isDelete;

	public SanPham_DTO(String iDSanPham, String tenSanPham, int giaBan, int giaNhap, int soLuong, String hinhAnh,
			String mauSac, String chip, String pin, String manHinh, String phienBanHDH, String cameraSau,
			String cameraTruoc, String ram, String rom, int isDelete) {
		IDSanPham = iDSanPham;
		this.tenSanPham = tenSanPham;
		this.giaBan = giaBan;
		this.giaNhap = giaNhap;
		this.soLuong = soLuong;
		this.hinhAnh = hinhAnh;
		this.mauSac = mauSac;
		this.chip = chip;
		this.pin = pin;
		this.manHinh = manHinh;
		this.phienBanHDH = phienBanHDH;
		this.cameraSau = cameraSau;
		this.cameraTruoc = cameraTruoc;
		this.ram = ram;
		this.rom = rom;
		this.isDelete = isDelete;
	}

	public String getIDSanPham() {
		return IDSanPham;
	}

	public void setIDSanPham(String iDSanPham) {
		IDSanPham = iDSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public int getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(int giaNhap) {
		this.giaNhap = giaNhap;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getManHinh() {
		return manHinh;
	}

	public void setManHinh(String manHinh) {
		this.manHinh = manHinh;
	}

	public String getPhienBanHDH() {
		return phienBanHDH;
	}

	public void setPhienBanHDH(String phienBanHDH) {
		this.phienBanHDH = phienBanHDH;
	}

	public String getCameraSau() {
		return cameraSau;
	}

	public void setCameraSau(String cameraSau) {
		this.cameraSau = cameraSau;
	}

	public String getCameraTruoc() {
		return cameraTruoc;
	}

	public void setCameraTruoc(String cameraTruoc) {
		this.cameraTruoc = cameraTruoc;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}

}
