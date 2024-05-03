package GUI.JPanel_QuanLyCuaHangDienThoai;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.io.Serial;

public class KhachHangGUI extends JPanel {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public KhachHangGUI() {
		
		JLabel lblNewLabel = new JLabel("ĐÂY LÀ KHÁCH HÀNG");
		add(lblNewLabel);

	}

}
