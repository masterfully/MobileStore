package GUI.JPanel_QuanLyCuaHangDienThoai;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import DAO.TaiKhoanDAO;
import DTO.TaiKhoanDTO;
import GUI.Dialog.DangKy_Dialog;
import GUI.JFrame_QuanLyCuaHangDienThoai.QuanLyKho;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;

public class Login_GUI extends JPanel{
	private JTextField txt_username;
	private JPasswordField passwordField;
	public Login_GUI() {
		setBorder(new LineBorder(new Color(0, 255, 255), 14, true));
		setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, "name_178241133235500");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 255, 255), 12, true));
		panel_1.setBounds(29, 41, 394, 322);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lbl_top = new JLabel("ĐĂNG NHẬP VÀO HỆ THỐNG");
		lbl_top.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_top.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lbl_top);
		
		JLabel lbl_username = new JLabel("   Tên đăng nhập");
		lbl_username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lbl_username);
		
		txt_username = new JTextField();
		panel_1.add(txt_username);
		txt_username.setColumns(10);
		
		JLabel lbl_password = new JLabel("   Mật khẩu");
		lbl_password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lbl_password);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<TaiKhoanDTO> tkList = TaiKhoanDAO.getInstance().selectAll();
				boolean flag = false;
				String password = "";
				int idNVHienTai = -1;
				for(TaiKhoanDTO tk : tkList) {
					if(tk.getUsername().equals(txt_username.getText())) {
						flag = true;
						password = tk.getPassword();
						idNVHienTai = tk.getIdNV();
						break;
					}
				}
				if(!flag) {
					JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
					txt_username.requestFocus();
				}
				else {
					if(!passwordField.getText().equals(password)) {
						JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
						txt_username.requestFocus();
					}
				}
				JFrame frame = new QuanLyKho(idNVHienTai);
				frame.setVisible(true);
			}
		});
		panel_1.add(passwordField);
		
		JCheckBox chckbx_showPassword = new JCheckBox("Hiện mật khẩu");
		panel_1.add(chckbx_showPassword);
		
		JLabel space = new JLabel("");
		panel_1.add(space);
		
		JButton btn_login = new JButton("Đăng nhập");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<TaiKhoanDTO> tkList = TaiKhoanDAO.getInstance().selectAll();
				boolean flag = false;
				String password = "";
				int idNVHienTai = -1;
				for(TaiKhoanDTO tk : tkList) {
					if(tk.getUsername().equals(txt_username.getText())) {
						flag = true;
						password = tk.getPassword();
						idNVHienTai = tk.getIdNV();
						break;
					}
				}
				if(!flag) {
					JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
					txt_username.requestFocus();
				}
				else {
					if(!passwordField.getText().equals(password)) {
						JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
						txt_username.requestFocus();
					}
					//đăng nhập thành công
					JFrame frame = new QuanLyKho(idNVHienTai);
					frame.setVisible(true);
				}
			}
		});
		panel_1.add(btn_login);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Chưa có tài khoản?");
		panel_2.add(lblNewLabel_1);
		
		JButton btn_signup = new JButton("Đăng ký");
		btn_signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dangKy = new DangKy_Dialog();
				dangKy.setVisible(true);
				dangKy.setSize(400, 500); 
			}
		});
		panel_2.add(btn_signup);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Smile\\eclipse-workspace\\MobileStore\\src\\GUI\\JPanel_QuanLyCuaHangDienThoai\\login_img.png"));
		lblNewLabel.setBounds(0, 0, 871, 421);
		panel.add(lblNewLabel);
	}
	
	public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 460); 
        frame.getContentPane().add(new Login_GUI());
        frame.setVisible(true);
    }
}
