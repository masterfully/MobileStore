package GUI.Dialog;

import javax.swing.JDialog;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import DAO.NhanVienDAO;
import DAO.TaiKhoanDAO;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class DangKy_Dialog extends JDialog{
	private JTextField txt_maNV;
	private JTextField txt_username;
	private JPasswordField passwordField;
	private JPasswordField rePasswordField;
	public DangKy_Dialog() {
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("ĐĂNG KÝ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lbl_maNV = new JLabel("    Mã nhân viên");
		lbl_maNV.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lbl_maNV);
		
		txt_maNV = new JTextField();
		txt_maNV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idNV = Integer.parseInt(txt_maNV.getText());
				ArrayList<NhanVienDTO> nvList = NhanVienDAO.getInstance().selectAll();
				ArrayList<TaiKhoanDTO> tkList = TaiKhoanDAO.getInstance().selectAll();
				boolean flagNV = false; //NV ko tồn tại trong cửa hàng
				boolean flagTK = true; //tài khoản chưa có trong bảng Tài khoản
				for (NhanVienDTO nv : nvList) {
					if(nv.getIdNV() == idNV) {
						flagNV = true; //có NV trong bảng NV (NV này là của cửa hàng)
						break;
					}
				}
				for(TaiKhoanDTO tk : tkList) {
					if(idNV==tk.getIdNV()) { //Nhân viên này đã có tài khoản
						flagTK =false;
						break;
					}
				}
				if(!flagTK) {
					JOptionPane.showMessageDialog(null, "Nhân viên này đã có tài khoản!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
					txt_maNV.requestFocus();
				}
				
				else if(!flagNV) {
					JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại trong cửa hàng!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
					txt_maNV.requestFocus();
				}
				
				else if(flagTK && flagNV) {
					txt_username.setEnabled(true);
					txt_username.setEditable(true);
				}
			}
		});
		getContentPane().add(txt_maNV);
		txt_maNV.setColumns(10);
		
		JLabel lbl_username = new JLabel("    Username");
		lbl_username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lbl_username);
		
		txt_username = new JTextField();
		txt_username.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txt_username.getText();
				ArrayList<TaiKhoanDTO> tkList= TaiKhoanDAO.getInstance().selectAll();
				boolean flag = true;
				for (TaiKhoanDTO tk : tkList) {
					if(tk.getUsername().equals(user)) {
						flag = false;
						break;
					}
				}
				if(!flag) {
					JOptionPane.showMessageDialog(null, "Username đã tồn tại!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
					txt_maNV.requestFocus();
				}
				else {
				passwordField.setEnabled(true);
				passwordField.setEditable(true);
				rePasswordField.setEnabled(true);
				rePasswordField.setEditable(true);
				}
				}
		});
		txt_username.setEnabled(false);
		txt_username.setEditable(false);
		getContentPane().add(txt_username);
		txt_username.setColumns(10);
		
		JLabel lbl_password = new JLabel("    Mật khẩu");
		lbl_password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lbl_password);
		
		passwordField = new JPasswordField();
		passwordField.setEnabled(false);
		passwordField.setEditable(false);
		getContentPane().add(passwordField);
		
		JLabel lbl_rePassword = new JLabel("    Nhập lại mật khẩu");
		lbl_rePassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lbl_rePassword);
		
		rePasswordField = new JPasswordField();
		
		rePasswordField.setEnabled(false);
		rePasswordField.setEditable(false);
		getContentPane().add(rePasswordField);
		
		JButton btn_dangKy = new JButton("Đăng ký");
		btn_dangKy.setEnabled(false);
		btn_dangKy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txt_username.getText();
				String password = passwordField.getText();
				String trangThai = "Hoạt động";
				String chucVu = "Nhân viên quản lí";
				int idNV = Integer.parseInt(txt_maNV.getText());
				TaiKhoanDTO tk = new TaiKhoanDTO(userName, password, trangThai, chucVu, idNV);
				TaiKhoanDAO.getInstance().insert(tk);
			}
		});
		btn_dangKy.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(btn_dangKy);
		
		rePasswordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rePasswordField.getText().equals(passwordField.getText())) {
					btn_dangKy.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Mật khẩu không trùng khớp!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
	}
	
}