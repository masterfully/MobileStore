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

import DAO.SanPham_DAO;
import DAO.ctSanPham_DAO;
import DTO.SanPham_DTO;
import DTO.ctSanPham_DTO;
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

public class themSanPham_Dialog extends JDialog{
	private JTextField txt_tensp;
	private JTextField txt_gianhap;
	private JTextField txt_giaban;
	private JTextField txt_soluong;
	private JTextField txt_chip;
	private JTextField txt_pin;
	private JTextField txt_hdh;
	private JTextField txt_camerasau;
	private JTextField txt_cameratruoc;
	private String imagePath;
	private int idSP;
	
	public themSanPham_Dialog() {
		getContentPane().setLayout(null);
		JLabel lbl_hinhAnh = new JLabel("");
		lbl_hinhAnh.setIcon(new ImageIcon(themSanPham_Dialog.class.getResource("/GUI/JFrame_QuanLyCuaHangDienThoai/icon_taolo.png")));
		lbl_hinhAnh.setBounds(60, 89, 148, 231);
		getContentPane().add(lbl_hinhAnh);
		JLabel lbl_themsp = new JLabel("THÊM SẢN PHẨM MỚI");
		lbl_themsp.setBounds(0, 0, 963, 17);
		lbl_themsp.setBackground(new Color(128, 255, 255));
		lbl_themsp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_themsp.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lbl_themsp);
		
		JButton btn_hinhAnh = new JButton("Hình minh họa");
		btn_hinhAnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "png", "jpg", "jpeg");
                fileChooser.setFileFilter(filter);
                int result = fileChooser.showOpenDialog(themSanPham_Dialog.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    imagePath = fileChooser.getSelectedFile().getAbsolutePath();
                    ImageIcon imageIcon = new ImageIcon(imagePath);
                    lbl_hinhAnh.setIcon(imageIcon);
                }
			}
		});
		btn_hinhAnh.setBounds(68, 55, 129, 23);
		getContentPane().add(btn_hinhAnh);
		
		
		JLabel lbl_tensp = new JLabel("Tên sản phẩm");
		lbl_tensp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_tensp.setBounds(257, 58, 93, 14);
		getContentPane().add(lbl_tensp);
		
		txt_tensp = new JTextField();
		txt_tensp.setBounds(258, 83, 129, 30);
		getContentPane().add(txt_tensp);
		txt_tensp.setColumns(10);
		
		JLabel lbl_gianhap = new JLabel("Giá nhập");
		lbl_gianhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_gianhap.setBounds(258, 141, 93, 14);
		getContentPane().add(lbl_gianhap);
		
		txt_gianhap = new JTextField();
		txt_gianhap.setColumns(10);
		txt_gianhap.setBounds(258, 166, 129, 30);
		getContentPane().add(txt_gianhap);
		
		JLabel lbl_giaban = new JLabel("Giá bán");
		lbl_giaban.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_giaban.setBounds(258, 221, 93, 14);
		getContentPane().add(lbl_giaban);
		
		txt_giaban = new JTextField();
		txt_giaban.setColumns(10);
		txt_giaban.setBounds(258, 246, 129, 30);
		getContentPane().add(txt_giaban);
		
		JLabel lbl_soluong = new JLabel("Số lượng");
		lbl_soluong.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_soluong.setBounds(257, 306, 93, 14);
		getContentPane().add(lbl_soluong);
		
		txt_soluong = new JTextField();
		txt_soluong.setColumns(10);
		txt_soluong.setBounds(257, 331, 129, 30);
		getContentPane().add(txt_soluong);
		
		JLabel lbl_mausac = new JLabel("Màu sắc");
		lbl_mausac.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_mausac.setBounds(481, 59, 93, 14);
		getContentPane().add(lbl_mausac);
		
		JComboBox cbb_mausac = new JComboBox();
		cbb_mausac.setModel(new DefaultComboBoxModel(new String[] {"Trắng", "Đen", "Vàng", "Xanh", "Xanh lá", "Hồng", "Tím"}));
		cbb_mausac.setBounds(481, 83, 93, 30);
		getContentPane().add(cbb_mausac);
		
		JLabel lbl_chip = new JLabel("Chip xử lý");
		lbl_chip.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_chip.setBounds(481, 142, 93, 14);
		getContentPane().add(lbl_chip);
		
		txt_chip = new JTextField();
		txt_chip.setColumns(10);
		txt_chip.setBounds(481, 166, 129, 30);
		getContentPane().add(txt_chip);
		
		JLabel lbl_pin = new JLabel("Dung lượng pin");
		lbl_pin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_pin.setBounds(481, 222, 115, 14);
		getContentPane().add(lbl_pin);
		
		txt_pin = new JTextField();
		txt_pin.setColumns(10);
		txt_pin.setBounds(481, 246, 129, 30);
		getContentPane().add(txt_pin);
		
		JLabel lbl_manhinh = new JLabel("Kích thước màn hình");
		lbl_manhinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_manhinh.setBounds(481, 307, 148, 14);
		getContentPane().add(lbl_manhinh);
		
		JComboBox cbb_manhinh = new JComboBox();
		cbb_manhinh.setModel(new DefaultComboBoxModel(new String[] {"6.1 Inch", "6.7 Inch"}));
		cbb_manhinh.setBounds(481, 331, 93, 30);
		getContentPane().add(cbb_manhinh);
		
		JLabel lbl_hdh = new JLabel("Hệ điều hành");
		lbl_hdh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_hdh.setBounds(702, 59, 93, 14);
		getContentPane().add(lbl_hdh);
		
		txt_hdh = new JTextField();
		txt_hdh.setColumns(10);
		txt_hdh.setBounds(702, 83, 129, 30);
		getContentPane().add(txt_hdh);
		
		JLabel lbl_camerasau = new JLabel("Camera sau");
		lbl_camerasau.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_camerasau.setBounds(702, 142, 93, 14);
		getContentPane().add(lbl_camerasau);
		
		txt_camerasau = new JTextField();
		txt_camerasau.setColumns(10);
		txt_camerasau.setBounds(702, 166, 129, 30);
		getContentPane().add(txt_camerasau);
		
		JLabel lbl_cameratruoc = new JLabel("Camera trước");
		lbl_cameratruoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_cameratruoc.setBounds(702, 222, 93, 14);
		getContentPane().add(lbl_cameratruoc);
		
		txt_cameratruoc = new JTextField();
		txt_cameratruoc.setColumns(10);
		txt_cameratruoc.setBounds(702, 246, 129, 30);
		getContentPane().add(txt_cameratruoc);
		
		JLabel lbl_ram = new JLabel("Ram");
		lbl_ram.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_ram.setBounds(639, 307, 93, 14);
		getContentPane().add(lbl_ram);
		
		JLabel lbl_rom = new JLabel("Rom");
		lbl_rom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_rom.setBounds(790, 307, 93, 14);
		getContentPane().add(lbl_rom);
		
		JComboBox cbb_rom = new JComboBox();
		cbb_rom.setModel(new DefaultComboBoxModel(new String[] {"64GB", "128GB", "512GB", "1TB"}));
		cbb_rom.setBounds(790, 331, 93, 30);
		getContentPane().add(cbb_rom);
		
		JComboBox cbb_ram = new JComboBox();
		cbb_ram.setModel(new DefaultComboBoxModel(new String[] {"2GB", "3GB", "4GB", "6GB"}));
		cbb_ram.setBounds(639, 331, 93, 30);
		getContentPane().add(cbb_ram);
		
		JButton btn_them = new JButton("Thêm");
		btn_them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SanPham_DAO spdao = new SanPham_DAO();
				int idsp = spdao.getInstance().selectAll().get(spdao.getInstance().selectAll().size()-1).getIdSP() +1;
				String tensp = txt_tensp.getText();
				int giaNhap = Integer.parseInt(txt_gianhap.getText());
				int giaBan = Integer.parseInt(txt_giaban.getText());
				int soLuong = Integer.parseInt(txt_soluong.getText());
				String hinhAnh =  imagePath;
				String mauSac = (String) cbb_mausac.getSelectedItem();
				SanPham_DTO spdto = new SanPham_DTO(idsp, tensp, giaNhap, giaBan, soLuong, hinhAnh, mauSac, 0);
				SanPham_DAO.getInstance().insert(spdto);
				
				
				ctSanPham_DAO ctspdao = new ctSanPham_DAO();
				int maIMEI = ctspdao.getInstance().selectAll().get(ctspdao.getInstance().selectAll().size()-1).getMaIMEI() +1;
				String chip = txt_chip.getText();
				String pin = txt_pin.getText();
				String manHinh = (String) cbb_manhinh.getSelectedItem();
				String hdh = txt_hdh.getText();
				String cameraSau = txt_camerasau.getText();
				String cameraTruoc = txt_cameratruoc.getText();
				String ram = (String) cbb_ram.getSelectedItem();
				String rom = (String) cbb_rom.getSelectedItem();
				int SANPHAM_idSP = idsp;
				ctSanPham_DTO ctspdto = new ctSanPham_DTO(maIMEI, chip, pin, manHinh, hdh, cameraSau, cameraTruoc, ram, rom, SANPHAM_idSP);
				ctSanPham_DAO.getInstance().insert(ctspdto);
			}
		});
		btn_them.setBounds(374, 402, 129, 23);
		getContentPane().add(btn_them);
		
		JButton btn_huybo = new JButton("Hủy bỏ");
		btn_huybo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btn_huybo.setBounds(542, 402, 129, 23);
		getContentPane().add(btn_huybo);
	}
	
	
	public themSanPham_Dialog(int idSP) {
		SanPham_DTO spdto = SanPham_DAO.getInstance().selectById(idSP);
		getContentPane().setLayout(null);
		JLabel lbl_hinhAnh = new JLabel("");
		lbl_hinhAnh.setIcon(new ImageIcon(themSanPham_Dialog.class.getResource("/GUI/JFrame_QuanLyCuaHangDienThoai/icon_taolo.png")));
		lbl_hinhAnh.setBounds(60, 89, 148, 231);
		getContentPane().add(lbl_hinhAnh);
		JLabel lbl_themsp = new JLabel("THÊM IMEI MỚI VÀO SẢN PHẨM " + String.valueOf(idSP));
		lbl_themsp.setBounds(0, 0, 963, 17);
		lbl_themsp.setBackground(new Color(128, 255, 255));
		lbl_themsp.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_themsp.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lbl_themsp);
		
		JButton btn_hinhAnh = new JButton("Hình minh họa");
		btn_hinhAnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "png", "jpg", "jpeg");
                fileChooser.setFileFilter(filter);
                int result = fileChooser.showOpenDialog(themSanPham_Dialog.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    imagePath = fileChooser.getSelectedFile().getAbsolutePath();
                    ImageIcon imageIcon = new ImageIcon(imagePath);
                    lbl_hinhAnh.setIcon(imageIcon);
                }
			}
		});
		btn_hinhAnh.setBounds(68, 55, 129, 23);
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
		
		JLabel lbl_chip = new JLabel("Chip xử lý");
		lbl_chip.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_chip.setBounds(481, 142, 93, 14);
		getContentPane().add(lbl_chip);
		
		txt_chip = new JTextField();
		txt_chip.setColumns(10);
		txt_chip.setBounds(481, 166, 129, 30);
		getContentPane().add(txt_chip);
		
		JLabel lbl_pin = new JLabel("Dung lượng pin");
		lbl_pin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_pin.setBounds(481, 222, 115, 14);
		getContentPane().add(lbl_pin);
		
		txt_pin = new JTextField();
		txt_pin.setColumns(10);
		txt_pin.setBounds(481, 246, 129, 30);
		getContentPane().add(txt_pin);
		
		JLabel lbl_manhinh = new JLabel("Kích thước màn hình");
		lbl_manhinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_manhinh.setBounds(481, 307, 148, 14);
		getContentPane().add(lbl_manhinh);
		
		JComboBox cbb_manhinh = new JComboBox();
		cbb_manhinh.setModel(new DefaultComboBoxModel(new String[] {"6.1 Inch", "6.7 Inch"}));
		cbb_manhinh.setBounds(481, 331, 93, 30);
		getContentPane().add(cbb_manhinh);
		
		JLabel lbl_hdh = new JLabel("Hệ điều hành");
		lbl_hdh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_hdh.setBounds(702, 59, 93, 14);
		getContentPane().add(lbl_hdh);
		
		txt_hdh = new JTextField();
		txt_hdh.setColumns(10);
		txt_hdh.setBounds(702, 83, 129, 30);
		getContentPane().add(txt_hdh);
		
		JLabel lbl_camerasau = new JLabel("Camera sau");
		lbl_camerasau.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_camerasau.setBounds(702, 142, 93, 14);
		getContentPane().add(lbl_camerasau);
		
		txt_camerasau = new JTextField();
		txt_camerasau.setColumns(10);
		txt_camerasau.setBounds(702, 166, 129, 30);
		getContentPane().add(txt_camerasau);
		
		JLabel lbl_cameratruoc = new JLabel("Camera trước");
		lbl_cameratruoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_cameratruoc.setBounds(702, 222, 93, 14);
		getContentPane().add(lbl_cameratruoc);
		
		txt_cameratruoc = new JTextField();
		txt_cameratruoc.setColumns(10);
		txt_cameratruoc.setBounds(702, 246, 129, 30);
		getContentPane().add(txt_cameratruoc);
		
		JLabel lbl_ram = new JLabel("Ram");
		lbl_ram.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_ram.setBounds(639, 307, 93, 14);
		getContentPane().add(lbl_ram);
		
		JLabel lbl_rom = new JLabel("Rom");
		lbl_rom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_rom.setBounds(790, 307, 93, 14);
		getContentPane().add(lbl_rom);
		
		JComboBox cbb_rom = new JComboBox();
		cbb_rom.setModel(new DefaultComboBoxModel(new String[] {"64GB", "128GB", "512GB", "1TB"}));
		cbb_rom.setBounds(790, 331, 93, 30);
		getContentPane().add(cbb_rom);
		
		JComboBox cbb_ram = new JComboBox();
		cbb_ram.setModel(new DefaultComboBoxModel(new String[] {"2GB", "3GB", "4GB", "6GB"}));
		cbb_ram.setBounds(639, 331, 93, 30);
		getContentPane().add(cbb_ram);
		
		JButton btn_them = new JButton("Thêm");
		btn_them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idsp = idSP;
				ctSanPham_DAO ctspdao = new ctSanPham_DAO();
				int maIMEI = ctspdao.getInstance().selectAll().get(ctspdao.getInstance().selectAll().size()-1).getMaIMEI() +1;
				String chip = txt_chip.getText();
				String pin = txt_pin.getText();
				String manHinh = (String) cbb_manhinh.getSelectedItem();
				String hdh = txt_hdh.getText();
				String cameraSau = txt_camerasau.getText();
				String cameraTruoc = txt_cameratruoc.getText();
				String ram = (String) cbb_ram.getSelectedItem();
				String rom = (String) cbb_rom.getSelectedItem();
				int SANPHAM_idSP = idsp;
				ctSanPham_DTO ctspdto = new ctSanPham_DTO(maIMEI, chip, pin, manHinh, hdh, cameraSau, cameraTruoc, ram, rom, SANPHAM_idSP);
				ctSanPham_DAO.getInstance().insert(ctspdto);
			}
		});
		btn_them.setBounds(374, 402, 129, 23);
		getContentPane().add(btn_them);
		
		JButton btn_huybo = new JButton("Hủy bỏ");
		btn_huybo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btn_huybo.setBounds(542, 402, 129, 23);
		getContentPane().add(btn_huybo);
	}
	
	public static void main(String[] args) {
        // Tạo một JFrame để chứa JDialog
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Hiển thị JDialog
        themSanPham_Dialog dialog = new themSanPham_Dialog();
        dialog.setSize(1000, 500);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
    }
}

