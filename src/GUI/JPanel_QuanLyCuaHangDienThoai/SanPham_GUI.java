package GUI.JPanel_QuanLyCuaHangDienThoai;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SanPham_GUI extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public SanPham_GUI() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 386, 69);
		add(panel);
		panel.setLayout(new GridLayout(1, 3, 10, 10));
		
		JButton btn_them = new JButton("Thêm");
		btn_them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_them.setForeground(new Color(0, 0, 0));
		btn_them.setBackground(new Color(255, 255, 255));
		panel.add(btn_them);
		btn_them.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham_GUI.class.getResource("icon_them.png"))));

		
		JButton btn_sua = new JButton("Sửa");
		panel.add(btn_sua);
		btn_sua.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham_GUI.class.getResource("icon_sua.png"))));

		
		JButton btn_xoa = new JButton("Xóa");
		panel.add(btn_xoa);
		btn_xoa.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham_GUI.class.getResource("icon_xoa.png"))));


	}
}
