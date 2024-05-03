package GUI.Dialog.SanPhamDialog;

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

import DAO.SanPhamDAO;
import DAO.ctSanPhamDAO;
import DTO.SanPhamDTO;
import GUI.JPanel_QuanLyCuaHangDienThoai.SanPhamGUI;

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

public class xoaSanPham_Dialog extends JDialog{
	private String imagePath;
	private int idSP;
	
	public xoaSanPham_Dialog(int idSP) {
		SanPhamDTO spdto = SanPhamDAO.getInstance().selectById(idSP);
		getContentPane().setLayout(null);
		JLabel lbl_suasp = new JLabel("XÓA SẢN PHẨM" + String.valueOf(idSP));
		lbl_suasp.setBounds(0, 0, 478, 17);
		lbl_suasp.setBackground(new Color(128, 255, 255));
		lbl_suasp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_suasp.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lbl_suasp);
		
		JButton btn_xoa = new JButton("Xóa");
		btn_xoa.setBounds(80, 135, 129, 23);
		getContentPane().add(btn_xoa);
		btn_xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SanPhamDAO.getInstance().delete(Integer.toString(idSP));
			}
		});
		
		JButton btn_huybo = new JButton("Hủy bỏ");
		btn_huybo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btn_huybo.setBounds(260, 135, 129, 23);
		getContentPane().add(btn_huybo);
		
		JLabel lbl_thongbao = new JLabel("Bạn có muốn xóa sản phẩm " + Integer.toString(idSP) + "?");
		lbl_thongbao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_thongbao.setBounds(120, 68, 240, 14);
		getContentPane().add(lbl_thongbao);
	}
	
	

}

