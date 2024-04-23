package DTO;

public class KhachHang_DTO {
	    private String IDKhachHang;
	    private String tenKhachHang;
	    private String diaChi;
	    private String sdt;

		private int isDelete;
		public KhachHang_DTO(String iDKhachHang, String tenKhachHang, String diaChi, String sdt, int isDelete) {
			IDKhachHang = iDKhachHang;
			this.tenKhachHang = tenKhachHang;
			this.diaChi = diaChi;
			this.sdt = sdt;
			this.isDelete = isDelete;
		}

	public KhachHang_DTO(String t) {
			this.IDKhachHang = t;
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

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
}
