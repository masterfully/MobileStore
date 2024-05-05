package GUI.JPanel_QuanLyCuaHangDienThoai;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ThongKeGUI extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ThongKeGUI() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		add(panel);
		
		JPanel panel_top = new JPanel();
		
		JPanel panel_bottom = new JPanel();
		panel_bottom.setLayout(null);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(panel_top, GroupLayout.PREFERRED_SIZE, 946, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_bottom, GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(panel_top, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_bottom, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
					.addGap(6))
		);
		
		JLabel lbl_DoanhThu = new JLabel("Tổng doanh thu");
		lbl_DoanhThu.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_DoanhThu.setFont(new Font("Tahoma", Font.BOLD, 40));
		lbl_DoanhThu.setBounds(0, 11, 946, 86);
		panel_bottom.add(lbl_DoanhThu);
		
		JLabel lbl_tien = new JLabel("100.000.000");
		lbl_tien.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tien.setFont(new Font("Tahoma", Font.BOLD, 40));
		lbl_tien.setBounds(0, 112, 946, 86);
		panel_bottom.add(lbl_tien);
		panel_top.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_SP = new JPanel();
		panel_top.add(panel_SP);
		panel_SP.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl_SP_icon = new JLabel("");
		lbl_SP_icon.setIcon(new ImageIcon(ThongKeGUI.class.getResource("/GUI/JPanel_QuanLyCuaHangDienThoai/phone_icon.png")));
		panel_SP.add(lbl_SP_icon, BorderLayout.WEST);
		
		JLabel lbl_SP_text = new JLabel("Sản phẩm hiện có");
		lbl_SP_text.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SP_text.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_SP.add(lbl_SP_text, BorderLayout.NORTH);
		
		JLabel lbl_SP_num = new JLabel("100");
		lbl_SP_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SP_num.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_SP.add(lbl_SP_num, BorderLayout.CENTER);
		
		JPanel panel_KH = new JPanel();
		panel_KH.setBackground(new Color(192, 192, 192));
		panel_top.add(panel_KH);
		panel_KH.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl_KH_text = new JLabel("Số lượng khách hàng");
		lbl_KH_text.setBackground(new Color(64, 128, 128));
		lbl_KH_text.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_KH_text.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_KH.add(lbl_KH_text, BorderLayout.NORTH);
		
		JLabel lbl_KH_icon = new JLabel("");
		lbl_KH_icon.setIcon(new ImageIcon(ThongKeGUI.class.getResource("/GUI/JPanel_QuanLyCuaHangDienThoai/KH-icon.png")));
		panel_KH.add(lbl_KH_icon, BorderLayout.WEST);
		
		JLabel lbl_KH_num = new JLabel("100");
		lbl_KH_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_KH_num.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_KH.add(lbl_KH_num, BorderLayout.CENTER);
		
		JPanel panel_NV = new JPanel();
		panel_top.add(panel_NV);
		panel_NV.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl_NV_text = new JLabel("Nhân viên đang hoạt động");
		lbl_NV_text.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_NV_text.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_NV.add(lbl_NV_text, BorderLayout.NORTH);
		
		JLabel lbl_NV_icon = new JLabel("");
		lbl_NV_icon.setIcon(new ImageIcon(ThongKeGUI.class.getResource("/GUI/JPanel_QuanLyCuaHangDienThoai/NV-icon.png")));
		panel_NV.add(lbl_NV_icon, BorderLayout.WEST);
		
		JLabel lbl_NV_num = new JLabel("100");
		lbl_NV_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_NV_num.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_NV.add(lbl_NV_num, BorderLayout.CENTER);
		panel.setLayout(gl_panel);
		
	}
}
