package DTO;

public class KhachHang_DTO {
	    private String IDKhachHang;
	    private String tenKhachHang;
	    private String diaChi;
	    private String sdt;
		public KhachHang_DTO(String iDKhachHang, String tenKhachHang, String diaChi, String sdt) {
			IDKhachHang = iDKhachHang;
			this.tenKhachHang = tenKhachHang;
			this.diaChi = diaChi;
			this.sdt = sdt;
		}
		public String getIDKhachHang() {
			return IDKhachHang;
		}
		public void setIDKhachHang(String iDKhachHang) {
			IDKhachHang = iDKhachHang;
		}
		public String getTenKhachHang() {
			return tenKhachHang;
		}
		public void setTenKhachHang(String tenKhachHang) {
			this.tenKhachHang = tenKhachHang;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String getSdt() {
			return sdt;
		}
		public void setSdt(String sdt) {
			this.sdt = sdt;
		}
	    

}
