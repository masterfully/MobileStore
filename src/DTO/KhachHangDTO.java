package DTO;

public class KhachHangDTO {
	    private int idKH;
	    private String tenKH;
	    private String diaChi;
	    private int sdt;
		public KhachHangDTO(int idKH, String tenKH, String diaChi, int sdt) {
			super();
			this.idKH = idKH;
			this.tenKH = tenKH;
			this.diaChi = diaChi;
			this.sdt = sdt;
		}
		public int getidKH() {
			return idKH;
		}
		public void setidKH(int idKH) {
			this.idKH = idKH;
		}
		public String gettenKH() {
			return tenKH;
		}
		public void settenKH(String tenKH) {
			this.tenKH = tenKH;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public int getSdt() {
			return sdt;
		}
		public void setSdt(int sdt) {
			this.sdt = sdt;
		}

	    
		
}
