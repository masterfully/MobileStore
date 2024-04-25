package GUI.JPanel_QuanLyKho;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import GUI.JFrame_QuanLyKho.QuanLyKho;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SanPham extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public SanPham() {
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
		btn_them.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham.class.getResource("icon_them.png"))));

		
		JButton btn_sua = new JButton("Sửa");
		panel.add(btn_sua);
		btn_sua.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham.class.getResource("icon_sua.png"))));

		
		JButton btn_xoa = new JButton("Xóa");
		panel.add(btn_xoa);
		btn_xoa.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham.class.getResource("icon_xoa.png"))));


	}
}
