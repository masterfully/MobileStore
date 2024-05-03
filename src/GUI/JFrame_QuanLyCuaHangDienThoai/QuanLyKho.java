package GUI.JFrame_QuanLyCuaHangDienThoai;
import GUI.JPanel_QuanLyCuaHangDienThoai.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuanLyKho extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_16;
	private TrangChuGUI trangChu;
	private SanPhamGUI sanPham;
	private HoaDonGUI thuocTinh;
	private PhieuNhapGUI phieuNhap;
	private PhieuXuatGUI phieuXuat;
	private KhachHangGUI khachHang;
	private NhanVienGUI nhanVien;
	private TaiKhoan_GUI taiKhoan;
	private ThongKeGUI thongKe;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new QuanLyKho();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLyKho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1247, 737);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 271, 773);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
		);
		panel_11.setLayout(null);
		
		JLabel jL_11 = new JLabel("Đăng Xuất");
		jL_11.setBounds(0, 0, 271, 50);
		jL_11.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_dangxuat.png"))));

		panel_11.add(jL_11);
		panel_10.setLayout(null);
		
		JLabel jL_10 = new JLabel("Thống Kê");
		jL_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				trangChu.setVisible(false);
				sanPham.setVisible(false);
				thuocTinh.setVisible(false);
				phieuNhap.setVisible(false);
				phieuXuat.setVisible(false);
				khachHang.setVisible(false);
				nhanVien.setVisible(false);
				taiKhoan.setVisible(false);
				thongKe.setVisible(true);
				panel_2.setBackground(new Color(255,255,255));
				panel_3.setBackground(new Color(255,255,255));
				panel_4.setBackground(new Color(255,255,255));
				panel_5.setBackground(new Color(255,255,255));
				panel_6.setBackground(new Color(255,255,255));
				panel_7.setBackground(new Color(255,255,255));
				panel_8.setBackground(new Color(255,255,255));
				panel_9.setBackground(new Color(255,255,255));
				panel_10.setBackground(Color.GRAY);
			}
		});
		jL_10.setBounds(0, 0, 271, 60);
		jL_10.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_thongke.png"))));

		panel_10.add(jL_10);
		panel_9.setLayout(null);
		
		JLabel jL_9 = new JLabel("Tài Khoản");
		jL_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				trangChu.setVisible(false);
				sanPham.setVisible(false);
				thuocTinh.setVisible(false);
				phieuNhap.setVisible(false);
				phieuXuat.setVisible(false);
				khachHang.setVisible(false);
				nhanVien.setVisible(false);
				taiKhoan.setVisible(true);
				thongKe.setVisible(false);
				panel_2.setBackground(new Color(255,255,255));
				panel_3.setBackground(new Color(255,255,255));
				panel_4.setBackground(new Color(255,255,255));
				panel_5.setBackground(new Color(255,255,255));
				panel_6.setBackground(new Color(255,255,255));
				panel_7.setBackground(new Color(255,255,255));
				panel_8.setBackground(new Color(255,255,255));
				panel_9.setBackground(Color.GRAY);
				panel_10.setBackground(new Color(255,255,255));
			}
		});
		jL_9.setBounds(0, 0, 271, 60);
		jL_9.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_taikhoan.png"))));

		panel_9.add(jL_9);
		panel_8.setLayout(null);
		
		JLabel jL_8 = new JLabel("Nhân Viên");
		jL_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				trangChu.setVisible(false);
				sanPham.setVisible(false);
				thuocTinh.setVisible(false);
				phieuNhap.setVisible(false);
				phieuXuat.setVisible(false);
				khachHang.setVisible(false);
				nhanVien.setVisible(true);
				taiKhoan.setVisible(false);
				thongKe.setVisible(false);
				panel_2.setBackground(new Color(255,255,255));
				panel_3.setBackground(new Color(255,255,255));
				panel_4.setBackground(new Color(255,255,255));
				panel_5.setBackground(new Color(255,255,255));
				panel_6.setBackground(new Color(255,255,255));
				panel_7.setBackground(new Color(255,255,255));
				panel_8.setBackground(Color.GRAY);
				panel_9.setBackground(new Color(255,255,255));
				panel_10.setBackground(new Color(255,255,255));
			}
		});
		jL_8.setBounds(0, 0, 271, 60);
		jL_8.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_nhanvien.png"))));

		panel_8.add(jL_8);
		panel_7.setLayout(null);
		
		JLabel jL_7 = new JLabel("Khách Hàng");
		jL_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				trangChu.setVisible(false);
				sanPham.setVisible(false);
				thuocTinh.setVisible(false);
				phieuNhap.setVisible(false);
				phieuXuat.setVisible(false);
				khachHang.setVisible(true);
				nhanVien.setVisible(false);
				taiKhoan.setVisible(false);
				thongKe.setVisible(false);
				panel_2.setBackground(new Color(255,255,255));
				panel_3.setBackground(new Color(255,255,255));
				panel_4.setBackground(new Color(255,255,255));
				panel_5.setBackground(new Color(255,255,255));
				panel_6.setBackground(new Color(255,255,255));
				panel_7.setBackground(Color.GRAY);
				panel_8.setBackground(new Color(255,255,255));
				panel_9.setBackground(new Color(255,255,255));
				panel_10.setBackground(new Color(255,255,255));
			}
		});
		jL_7.setBounds(0, 0, 271, 60);
		jL_7.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_khachhang.png"))));

		panel_7.add(jL_7);
		panel_6.setLayout(null);
		
		JLabel jL_6 = new JLabel("Phiếu Xuất");
		jL_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				trangChu.setVisible(false);
				sanPham.setVisible(false);
				thuocTinh.setVisible(false);
				phieuNhap.setVisible(false);
				phieuXuat.setVisible(true);
				khachHang.setVisible(false);
				nhanVien.setVisible(false);
				taiKhoan.setVisible(false);
				thongKe.setVisible(false);
				panel_2.setBackground(new Color(255,255,255));
				panel_3.setBackground(new Color(255,255,255));
				panel_4.setBackground(new Color(255,255,255));
				panel_5.setBackground(new Color(255,255,255));
				panel_6.setBackground(Color.GRAY);
				panel_7.setBackground(new Color(255,255,255));
				panel_8.setBackground(new Color(255,255,255));
				panel_9.setBackground(new Color(255,255,255));
				panel_10.setBackground(new Color(255,255,255));
			}
		});
		jL_6.setBackground(new Color(255, 255, 255));
		jL_6.setBounds(0, 0, 271, 60);
		jL_6.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_phieuxuat.png"))));

		panel_6.add(jL_6);
		panel_5.setLayout(null);
		
		JLabel jL_5 = new JLabel("Phiếu Nhập");
		jL_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				trangChu.setVisible(false);
				sanPham.setVisible(false);
				thuocTinh.setVisible(false);
				phieuNhap.setVisible(true);
				phieuXuat.setVisible(false);
				khachHang.setVisible(false);
				nhanVien.setVisible(false);
				taiKhoan.setVisible(false);
				thongKe.setVisible(false);
				panel_2.setBackground(new Color(255,255,255));
				panel_3.setBackground(new Color(255,255,255));
				panel_4.setBackground(new Color(255,255,255));
				panel_5.setBackground(Color.GRAY);
				panel_6.setBackground(new Color(255,255,255));
				panel_7.setBackground(new Color(255,255,255));
				panel_8.setBackground(new Color(255,255,255));
				panel_9.setBackground(new Color(255,255,255));
				panel_10.setBackground(new Color(255,255,255));
			}
		});
		jL_5.setBounds(0, 0, 271, 60);
		jL_5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_phieunhap.png"))));

		panel_5.add(jL_5);
		panel_4.setLayout(null);
		
		JLabel jL_4 = new JLabel("Thuộc Tính");
		jL_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				trangChu.setVisible(false);
				sanPham.setVisible(false);
				thuocTinh.setVisible(true);
				phieuNhap.setVisible(false);
				phieuXuat.setVisible(true);
				khachHang.setVisible(false);
				nhanVien.setVisible(false);
				taiKhoan.setVisible(false);
				thongKe.setVisible(false);
				panel_2.setBackground(new Color(255,255,255));
				panel_3.setBackground(new Color(255,255,255));
				panel_4.setBackground(Color.GRAY);
				panel_5.setBackground(new Color(255,255,255));
				panel_6.setBackground(new Color(255,255,255));
				panel_7.setBackground(new Color(255,255,255));
				panel_8.setBackground(new Color(255,255,255));
				panel_9.setBackground(new Color(255,255,255));
				panel_10.setBackground(new Color(255,255,255));
			}
		});
		jL_4.setBounds(0, 0, 271, 60);
		jL_4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_thuoctinh.png"))));

		panel_4.add(jL_4);
		panel_3.setLayout(null);
		
		JLabel jL_3 = new JLabel("Sản Phẩm");
		jL_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				trangChu.setVisible(false);
				sanPham.setVisible(true);
				thuocTinh.setVisible(false);
				phieuNhap.setVisible(false);
				phieuXuat.setVisible(true);
				khachHang.setVisible(false);
				nhanVien.setVisible(false);
				taiKhoan.setVisible(false);
				thongKe.setVisible(false);
				panel_2.setBackground(new Color(255,255,255));
				panel_3.setBackground(Color.GRAY);
				panel_4.setBackground(new Color(255,255,255));
				panel_5.setBackground(new Color(255,255,255));
				panel_6.setBackground(new Color(255,255,255));
				panel_7.setBackground(new Color(255,255,255));
				panel_8.setBackground(new Color(255,255,255));
				panel_9.setBackground(new Color(255,255,255));
				panel_10.setBackground(new Color(255,255,255));
			}
		});
		jL_3.setBounds(0, 0, 271, 60);
		jL_3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_sanpham.png"))));

		panel_3.add(jL_3);
		panel_2.setLayout(null);
		
		JLabel jL_2 = new JLabel("Trang Chủ");
		jL_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				trangChu.setVisible(true);
				sanPham.setVisible(false);
				thuocTinh.setVisible(false);
				phieuNhap.setVisible(false);
				phieuXuat.setVisible(true);
				khachHang.setVisible(false);
				nhanVien.setVisible(false);
				taiKhoan.setVisible(false);
				thongKe.setVisible(false);
				panel_2.setBackground(Color.GRAY);
				panel_3.setBackground(new Color(255,255,255));
				panel_4.setBackground(new Color(255,255,255));
				panel_5.setBackground(new Color(255,255,255));
				panel_6.setBackground(new Color(255,255,255));
				panel_7.setBackground(new Color(255,255,255));
				panel_8.setBackground(new Color(255,255,255));
				panel_9.setBackground(new Color(255,255,255));
				panel_10.setBackground(new Color(255,255,255));

			}
		});
		jL_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		jL_2.setBounds(0, 0, 271, 60);
		jL_2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_trangchu.png"))));

		panel_2.add(jL_2);
		panel_1.setLayout(null);
		
		JLabel jL_1 = new JLabel("Admin");
		jL_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		jL_1.setBounds(0, 0, 271, 60);
		jL_1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(QuanLyKho.class.getResource("icon_admin1.png"))));

		panel_1.add(jL_1);
		panel.setLayout(gl_panel);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 255));
		panel_12.setBounds(280, 0, 967, 773);
		contentPane.add(panel_12);
		panel_12.setLayout(null);
		
		trangChu = new TrangChuGUI();
        trangChu.setBounds(0, 0, 958, 763);
		panel_12.add(trangChu);
		revalidate();
        repaint();

        sanPham = new SanPhamGUI();
        sanPham.setBounds(0, 0, 1040, 684);
		panel_12.add(sanPham);
		revalidate();
        repaint();

        thuocTinh = new HoaDonGUI();
        thuocTinh.setBounds(0, 0, 958, 763);
		panel_12.add(thuocTinh);
		revalidate();
        repaint();
        
        phieuNhap = new PhieuNhapGUI();
        phieuNhap.setBounds(0, 0, 958, 705);
		panel_12.add(phieuNhap);
		revalidate();
        repaint();
        
        phieuXuat = new PhieuXuatGUI();
        phieuXuat.setBounds(0, 0, 958, 705);
		panel_12.add(phieuXuat);
		revalidate();
        repaint();
        
        khachHang = new KhachHangGUI();
        khachHang.setBounds(0, 0, 958, 705);
		panel_12.add(khachHang);
		revalidate();
        repaint();
        
        nhanVien = new NhanVienGUI();
        nhanVien.setBounds(0, 0, 958, 705);
		panel_12.add(nhanVien);
		revalidate();
        repaint();
        
        taiKhoan = new TaiKhoan_GUI();
        taiKhoan.setBounds(0, 0, 958, 705);
		panel_12.add(taiKhoan);
		revalidate();
        repaint();
        
        thongKe = new ThongKeGUI();
        thongKe.setBounds(0, 0, 958, 705);
		panel_12.add(thongKe);
		revalidate();
        repaint();
        
	}
}
