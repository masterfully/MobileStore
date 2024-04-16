package DTO;


public class SanPham_DTO {

    private String IDSanPham;
    private String tenSanPham;
    private int donGia;
    private int soLuong;
    private String hinhAnh;
    private String mauSac;
    private LoaiSanPham_DTO loaiSanPham;
    private String chip;
    private String pin;
    private String manHinh;
    private String phienBanHDH;
    private String cameraSau;
    private String cameraTruoc;
    private String baoHanh;
    private String ram;
    private String rom;
    private int isDelete;

    public SanPham_DTO(String IDSanPham, String tenSanPham, int donGia, int soLuong, String hinhAnh, String mauSac, LoaiSanPham_DTO loaiSanPham, String chip, String pin, String manHinh, String phienBanHDH, String cameraSau, String cameraTruoc, String baoHanh, String ram, String rom, int isDelete) {
        this.IDSanPham = IDSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.hinhAnh = hinhAnh;
        this.mauSac = mauSac;
        this.loaiSanPham = loaiSanPham;
        this.chip = chip;
        this.pin = pin;
        this.manHinh = manHinh;
        this.phienBanHDH = phienBanHDH;
        this.cameraSau = cameraSau;
        this.cameraTruoc = cameraTruoc;
        this.baoHanh = baoHanh;
        this.ram = ram;
        this.rom = rom;
        this.isDelete = isDelete;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
    

    public String getIDSanPham() {
        return IDSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public LoaiSanPham_DTO getLoaiSanPham() {
        return loaiSanPham;
    }

    public String getChip() {
        return chip;
    }

    public String getPin() {
        return pin;
    }

    public String getManHinh() {
        return manHinh;
    }

    public String getPhienBanHDH() {
        return phienBanHDH;
    }

    public String getCameraSau() {
        return cameraSau;
    }

    public String getCameraTruoc() {
        return cameraTruoc;
    }

    public String getBaoHanh() {
        return baoHanh;
    }

    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setLoaiSanPham(LoaiSanPham_DTO loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public void setPhienBanHDH(String phienBanHDH) {
        this.phienBanHDH = phienBanHDH;
    }

    public void setCameraSau(String cameraSau) {
        this.cameraSau = cameraSau;
    }

    public void setCameraTruoc(String cameraTruoc) {
        this.cameraTruoc = cameraTruoc;
    }

    public void setBaoHanh(String baoHanh) {
        this.baoHanh = baoHanh;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "SanPham{" + "IDSanPham=" + IDSanPham + ", tenSanPham=" + tenSanPham + ", donGia=" + donGia + ", soLuong=" + soLuong + ", hinhAnh=" + hinhAnh + ", mauSac=" + mauSac + ", loaiSanPham=" + loaiSanPham + ", chip=" + chip + ", pin=" + pin + ", manHinh=" + manHinh + ", phienBanHDH=" + phienBanHDH + ", cameraSau=" + cameraSau + ", cameraTruoc=" + cameraTruoc + ", baoHanh=" + baoHanh + ", ram=" + ram + ", rom=" + rom + ", isDelete=" + isDelete + '}';
    }

    public static void main(String[] args) {
    	System.out.print("hello");
    }
   

}
