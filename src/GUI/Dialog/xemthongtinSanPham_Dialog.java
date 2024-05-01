package GUI.Dialog;

import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import DAO.SanPham_DAO;
import DAO.ctSanPham_DAO;
import DTO.SanPham_DTO;
import GUI.JPanel_QuanLyCuaHangDienThoai.SanPham_GUI;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class xemthongtinSanPham_Dialog extends JDialog{
	private JTextField txt_tensp;
	private JTextField txt_gianhap;
	private JTextField txt_giaban;
	private JTextField txt_soluong;
	private String imagePath;
	private int idSP;
	
	public xemthongtinSanPham_Dialog(int idSP) {
		SanPham_DTO spdto = SanPham_DAO.getInstance().selectById(idSP);
		getContentPane().setLayout(null);
		JLabel lbl_hinhAnh = new JLabel("");
		lbl_hinhAnh.setIcon(new ImageIcon(xemthongtinSanPham_Dialog.class.getResource("/GUI/JFrame_QuanLyCuaHangDienThoai/icon_taolo.png")));
		lbl_hinhAnh.setBounds(55, 141, 148, 231);
		getContentPane().add(lbl_hinhAnh);
		JLabel lbl_suasp = new JLabel("THÔNG TIN SẢN PHẨM " + String.valueOf(idSP));
		lbl_suasp.setBounds(0, 0, 647, 17);
		lbl_suasp.setBackground(new Color(128, 255, 255));
		lbl_suasp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_suasp.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lbl_suasp);
		
		JButton btn_hinhAnh = new JButton("Hình minh họa");
		btn_hinhAnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "png", "jpg", "jpeg");
                fileChooser.setFileFilter(filter);
                int result = fileChooser.showOpenDialog(xemthongtinSanPham_Dialog.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    imagePath = fileChooser.getSelectedFile().getAbsolutePath();
                    ImageIcon imageIcon = new ImageIcon(imagePath);
                    lbl_hinhAnh.setIcon(imageIcon);
                }
			}
		});
		btn_hinhAnh.setBounds(67, 87, 129, 23);
		getContentPane().add(btn_hinhAnh);
		
		
		JLabel lbl_tensp = new JLabel("Tên sản phẩm");
		lbl_tensp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_tensp.setBounds(257, 58, 93, 14);
		getContentPane().add(lbl_tensp);
		
		txt_tensp = new JTextField(spdto.getTenSP());
		txt_tensp.setBounds(258, 83, 129, 30);
		getContentPane().add(txt_tensp);
		txt_tensp.setColumns(10);
		
		JLabel lbl_gianhap = new JLabel("Giá nhập");
		lbl_gianhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_gianhap.setBounds(258, 141, 93, 14);
		getContentPane().add(lbl_gianhap);
		
		txt_gianhap = new JTextField(String.format("%.0f", spdto.getGiaNhap()));
		txt_gianhap.setColumns(10);
		txt_gianhap.setBounds(258, 166, 129, 30);
		getContentPane().add(txt_gianhap);
		
		JLabel lbl_giaban = new JLabel("Giá bán");
		lbl_giaban.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_giaban.setBounds(258, 221, 93, 14);
		getContentPane().add(lbl_giaban);
		
		txt_giaban = new JTextField(String.format("%.0f", spdto.getGiaBan()));
		txt_giaban.setColumns(10);
		txt_giaban.setBounds(258, 246, 129, 30);
		getContentPane().add(txt_giaban);
		
		JLabel lbl_soluong = new JLabel("Số lượng");
		lbl_soluong.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_soluong.setBounds(257, 306, 93, 14);
		getContentPane().add(lbl_soluong);
		
		txt_soluong = new JTextField(String.valueOf(spdto.getSoLuong()));
		txt_soluong.setColumns(10);
		txt_soluong.setBounds(257, 331, 129, 30);
		getContentPane().add(txt_soluong);
		
		JLabel lbl_mausac = new JLabel("Màu sắc");
		lbl_mausac.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_mausac.setBounds(481, 59, 93, 14);
		getContentPane().add(lbl_mausac);
		
		JComboBox cbb_mausac = new JComboBox();
		cbb_mausac.setModel(new DefaultComboBoxModel(new String[] {"Trắng", "Đen", "Vàng", "Xanh", "Xanh lá", "Hồng", "Tím", "Xám", "Đỏ"}));
		cbb_mausac.setBounds(481, 83, 93, 30);
		getContentPane().add(cbb_mausac);
		cbb_mausac.setSelectedItem(spdto.getMauSac());
		
		JButton btn_huybo = new JButton("Tắt");
		btn_huybo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btn_huybo.setBounds(257, 401, 129, 23);
		getContentPane().add(btn_huybo);
	}
	
	
	public static void main(String[] args) {
        // Tạo một JFrame để chứa JDialog
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Hiển thị JDialog
        xemthongtinSanPham_Dialog dialog = new xemthongtinSanPham_Dialog();
        dialog.setSize(1000, 500);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
    }
}

