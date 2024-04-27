package DTO;

public class ctSanPham_DTO {
    private int maIMEI;
    private String chip;
    private String pin;
    private String manHinh;
    private String phienBanHDH;
    private String cameraSau;
    private String cameraTruoc;
    private String ram;
    private String rom;
    private SanPham_DTO sanpham;

    public ctSanPham_DTO(int maIMEI, String chip, String pin, String manHinh, String phienBanHDH, String cameraSau, String cameraTruoc, String ram, String rom, SanPham_DTO sanpham) {
        this.maIMEI = maIMEI;
        this.chip = chip;
        this.pin = pin;
        this.manHinh = manHinh;
        this.phienBanHDH = phienBanHDH;
        this.cameraSau = cameraSau;
        this.cameraTruoc = cameraTruoc;
        this.ram = ram;
        this.rom = rom;
        this.sanpham = sanpham;
    }

    public int getMaIMEI() {
        return maIMEI;
    }

    public void setMaIMEI(int maIMEI) {
        this.maIMEI = maIMEI;
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

    public SanPham_DTO getSanpham() {
        return sanpham;
    }

    public void setSanpham(SanPham_DTO sanpham) {
        this.sanpham = sanpham;
    }
}
