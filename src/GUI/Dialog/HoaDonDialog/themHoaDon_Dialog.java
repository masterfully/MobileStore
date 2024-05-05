package GUI.Dialog.HoaDonDialog;

import javax.swing.JDialog;
import com.toedter.calendar.demo.DateChooserPanel;

import DAO.HoaDonDAO;
import DAO.ctHoaDonDAO;
import DAO.IMEIDAO;
import DAO.KhachHangDAO;
import DAO.KhuyenMaiDAO;
import DAO.PhieuBaoHanhDAO;
import DAO.SanPhamDAO;
import DAO.ctSanPhamDAO;
import DTO.HoaDonDTO;
import DTO.IMEIDTO;
import DTO.KhuyenMaiDTO;
import DTO.PhieuBaoHanhDTO;
import DTO.SanPhamDTO;
import DTO.ctHoaDonDTO;
import DTO.ctSanPhamDTO;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import com.toedter.calendar.JDayChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class themHoaDon_Dialog extends JDialog{
	private JTextField txt_timkiem;
	private JTable table;
	DefaultTableModel tblModel;
	private JTextField txt_maSP;
	private JTextField txt_tenSP;
	private JTextField txt_rom;
	private JTextField txt_mauSac;
	private JTextField txt_maHD;
	private JTextField txt_idNV_admin;
	private JTextField txt_idKH;
	private JTextField txt_tongtien;
    public SanPhamDAO spDAO = new SanPhamDAO();
    private JTextField txt_soluong;
    private JTextField txt_donGia;
	
	public void loadDataTalbe() {
        ArrayList<SanPhamDTO> result = spDAO.selectAll();
        tblModel.setRowCount(0); 
        for (SanPhamDTO sp : result) {
            tblModel.addRow(new Object[]{sp.getIdSP(), sp.getTenSP()});
        }
    }
	
	public void setSelectedCustomerId(int selectedCustomerId) {
	    txt_idKH.setText(String.valueOf(selectedCustomerId));
	}

	
	public themHoaDon_Dialog() {
		String[] columnNames = {"Mã sản phẩm", "Tên sản phẩm"};
		tblModel = new DefaultTableModel(columnNames, 0);
		getContentPane().setLayout(null);
		loadDataTalbe();
		
		
		
		txt_timkiem = new JTextField();
		txt_timkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = txt_timkiem.getText();
                ArrayList<SanPhamDTO> result = spDAO.selectByCondition("tenSP LIKE '%" + t + "%'");
                tblModel.setRowCount(0); 
                for (SanPhamDTO sp : result) {
                    tblModel.addRow(new Object[]{sp.getIdSP(), sp.getTenSP()});
                }
			}
		});
		txt_timkiem.setBounds(112, 73, 188, 27);
		getContentPane().add(txt_timkiem);
		txt_timkiem.setColumns(10);
		
		JButton btn_reloadSP = new JButton("");
		btn_reloadSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadDataTalbe();
				txt_timkiem.setText("");
			}
		});
		btn_reloadSP.setIcon(new ImageIcon(themHoaDon_Dialog.class.getResource("/GUI/JPanel_QuanLyCuaHangDienThoai/Button-Reload-icon.png")));
		btn_reloadSP.setBounds(323, 73, 28, 27);
		getContentPane().add(btn_reloadSP);
		
		table = new JTable(tblModel);
		table.setRowSelectionInterval(0, 0);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(48, 136, 372, 250);
		getContentPane().add(scrollPane);
		
		
		
		int selectedRow = table.getSelectedRow();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
        int idSP = (int) model.getValueAt(selectedRow, 0);
		
		
		
		JLabel lbl_maSP = new JLabel("Mã sản phẩm");
		lbl_maSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_maSP.setBounds(498, 77, 94, 14);
		getContentPane().add(lbl_maSP);
		
		txt_maSP = new JTextField(String.valueOf(idSP));
		txt_maSP.setEditable(false);
		txt_maSP.setBounds(498, 102, 94, 27);
		getContentPane().add(txt_maSP);
		txt_maSP.setColumns(10);

		SanPhamDTO sp = SanPhamDAO.getInstance().selectById(Integer.parseInt(txt_maSP.getText()));
		ctSanPhamDTO ctsp = ctSanPhamDAO.getInstance().selectById(Integer.parseInt(txt_maSP.getText()));
		
		JLabel lbl_tenSP = new JLabel("Tên sản phẩm");
		lbl_tenSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_tenSP.setBounds(666, 79, 94, 14);
		getContentPane().add(lbl_tenSP);
		
		txt_tenSP = new JTextField(sp.getTenSP());
		txt_tenSP.setEditable(false);
		txt_tenSP.setColumns(10);
		txt_tenSP.setBounds(666, 105, 158, 27);
		getContentPane().add(txt_tenSP);
		
		JLabel lbl_rom = new JLabel("Bộ nhớ ");
		lbl_rom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_rom.setBounds(498, 165, 94, 14);
		getContentPane().add(lbl_rom);
		
		txt_rom = new JTextField(ctsp.getRom());
		txt_rom.setEditable(false);
		txt_rom.setColumns(10);
		txt_rom.setBounds(498, 190, 94, 27);
		getContentPane().add(txt_rom);
		
		JLabel lbl_mauSac = new JLabel("Màu sắc");
		lbl_mauSac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_mauSac.setBounds(666, 165, 94, 14);
		getContentPane().add(lbl_mauSac);
		
		txt_mauSac = new JTextField(sp.getMauSac());
		txt_mauSac.setEditable(false);
		txt_mauSac.setColumns(10);
		txt_mauSac.setBounds(666, 190, 158, 27);
		getContentPane().add(txt_mauSac);
		
//		JLabel lbl_imei = new JLabel("Mã IMEI");
//		lbl_imei.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		lbl_imei.setBounds(498, 250, 94, 14);
//		getContentPane().add(lbl_imei);
//		
//		ArrayList<IMEIDTO> imeiList = IMEIDAO.getInstance().selectByCondition("SANPHAM_idSP="+txt_maSP.getText());
//		JComboBox<String> cbb_IMEI = new JComboBox<>();
//		DefaultComboBoxModel<String> cbbmodel = new DefaultComboBoxModel<>();
//		for (IMEIDTO imei : imeiList) {
//		    cbbmodel.addElement(String.valueOf(imei.getMaIMEI()));
//		}
//		cbb_IMEI.setModel(cbbmodel);
//		cbb_IMEI.setBounds(498, 282, 94, 22);
//		getContentPane().add(cbb_IMEI);
		
		JLabel lbl_maHD = new JLabel("Mã hóa đơn");
		lbl_maHD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_maHD.setBounds(907, 77, 94, 14);
		getContentPane().add(lbl_maHD);
		
		int maHD = HoaDonDAO.getInstance().selectAll().get(HoaDonDAO.getInstance().selectAll().size()-1).getIdHoaDon() +1;
		txt_maHD = new JTextField(String.valueOf(maHD));
		txt_maHD.setColumns(10);
		txt_maHD.setBounds(907, 103, 94, 27);
		getContentPane().add(txt_maHD);
		
		
		
		JLabel lbl_NV = new JLabel("Nhân viên");
		lbl_NV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_NV.setBounds(907, 165, 94, 14);
		getContentPane().add(lbl_NV);
		
		//tên của người đang đăng nhập
		txt_idNV_admin = new JTextField("33005");
		txt_idNV_admin.setColumns(10);
		txt_idNV_admin.setBounds(907, 188, 132, 27);
		getContentPane().add(txt_idNV_admin);
		
		JLabel lbl_KH = new JLabel("Khách hàng");
		lbl_KH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_KH.setBounds(907, 250, 94, 14);
		getContentPane().add(lbl_KH);
		
		txt_idKH = new JTextField();
		txt_idKH.setColumns(10);
		txt_idKH.setBounds(907, 280, 132, 27);
		getContentPane().add(txt_idKH);
		
		JLabel lbl_tongtien = new JLabel("Tổng tiền");
		lbl_tongtien.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_tongtien.setBounds(905, 348, 107, 27);
		getContentPane().add(lbl_tongtien);
		

		txt_tongtien = new JTextField("0");
		txt_tongtien.setEditable(false);
		txt_tongtien.setEnabled(false);
		txt_tongtien.setBounds(907, 386, 158, 27);
		getContentPane().add(txt_tongtien);
		txt_tongtien.setColumns(10);
		
		txt_soluong = new JTextField(String.valueOf(sp.getSoLuong()));
		
		
		
		
		
		JButton btn_thoat = new JButton("Thoát");
		btn_thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_thoat.setIcon(new ImageIcon(themHoaDon_Dialog.class.getResource("/GUI/JFrame_QuanLyCuaHangDienThoai/icon_dangxuat.png")));
		btn_thoat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_thoat.setBounds(598, 426, 141, 57);
		getContentPane().add(btn_thoat);
		
		JButton btn_xemThemNV = new JButton("...");
		btn_xemThemNV.setBounds(1041, 187, 28, 29);
		getContentPane().add(btn_xemThemNV);
		
		JButton btn_xemThemKH = new JButton("...");
		btn_xemThemKH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xemDSKH_Dialog dskhdialog = new xemDSKH_Dialog();
                dskhdialog.setSize(1000, 500);
                dskhdialog.setVisible(true);
                
                int selectedCustomerId = dskhdialog.getSelectedCustomerId();
                System.out.println(selectedCustomerId);
                if (selectedCustomerId != 0) {
                    int idKH = KhachHangDAO.getInstance().selectById(selectedCustomerId).getidKH();
                    txt_idKH.setText(String.valueOf(idKH));
                }
			}
		});
		btn_xemThemKH.setBounds(1041, 279, 28, 29);
		getContentPane().add(btn_xemThemKH);
		
		JLabel lbl_themHD = new JLabel("THÊM HÓA ĐƠN");
		lbl_themHD.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_themHD.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_themHD.setBounds(10, 0, 1121, 41);
		getContentPane().add(lbl_themHD);
		
		JLabel lbl_soluong = new JLabel("Số lượng");
		lbl_soluong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_soluong.setBounds(498, 252, 94, 14);
		getContentPane().add(lbl_soluong);
		
		
		txt_soluong.setColumns(10);
		txt_soluong.setBounds(498, 280, 94, 27);
		getContentPane().add(txt_soluong);
		table.getColumnModel().getColumn(0).setPreferredWidth(95);
		
		
		JButton btn_tao = new JButton("Tạo");
		
		btn_tao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_tao.setIcon(new ImageIcon(themHoaDon_Dialog.class.getResource("/GUI/JPanel_QuanLyCuaHangDienThoai/icon_them.png")));
		btn_tao.setBounds(404, 426, 150, 57);
		getContentPane().add(btn_tao);
		
		JLabel lbl_baohanh = new JLabel("Bảo hành");
		lbl_baohanh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_baohanh.setBounds(666, 327, 94, 14);
		getContentPane().add(lbl_baohanh);
		
		
		
		JComboBox cbb_baohanh = new JComboBox();
		DefaultComboBoxModel<String> cbbmodel = new DefaultComboBoxModel<>();
		PhieuBaoHanhDAO phieuBaoHanhDAO = PhieuBaoHanhDAO.getInstance();
		ArrayList<PhieuBaoHanhDTO> dsPhieuBH = phieuBaoHanhDAO.selectAll();
		for (PhieuBaoHanhDTO phieuBH : dsPhieuBH) {
		    cbbmodel.addElement(phieuBH.getThoiGian());
		}
		cbb_baohanh.setModel(cbbmodel);
		cbb_baohanh.setBounds(666, 352, 94, 22);
		getContentPane().add(cbb_baohanh);
		
		JLabel lbl_khuyenmai = new JLabel("Khuyến mãi (%)");
		lbl_khuyenmai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_khuyenmai.setBounds(666, 252, 119, 14);
		getContentPane().add(lbl_khuyenmai);
		
		JComboBox cbb_khuyenmai = new JComboBox();
		
		DefaultComboBoxModel<Integer> cbbmodelkm = new DefaultComboBoxModel<>();
		KhuyenMaiDAO kmDAO = KhuyenMaiDAO.getInstance();
		ArrayList<KhuyenMaiDTO> dskm = kmDAO.selectAll();
		for (KhuyenMaiDTO km : dskm) {
			cbbmodelkm.addElement((int) km.getPhanTram());
		}
		cbb_khuyenmai.setModel(cbbmodelkm);
		cbb_khuyenmai.setBounds(666, 282, 158, 22);
		getContentPane().add(cbb_khuyenmai);
		
		JLabel lbl_donGia = new JLabel("Đơn giá");
		lbl_donGia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_donGia.setBounds(498, 329, 94, 14);
		getContentPane().add(lbl_donGia);
		
		txt_donGia = new JTextField();
		txt_donGia.setEditable(false);
		txt_donGia.setBounds(498, 353, 96, 20);
		getContentPane().add(txt_donGia);
		txt_donGia.setColumns(10);
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		        int selectedRow = table.getSelectedRow(); // Lấy chỉ số hàng đã chọn
		        if (selectedRow != -1) { // Kiểm tra xem có hàng nào được chọn không
		            DefaultTableModel model = (DefaultTableModel) table.getModel();
		            int idSP = (int) model.getValueAt(selectedRow, 0);
		            txt_soluong.setText("0");// Lấy idSP của hàng đã chọn
		            // Tại đây, bạn có thể sử dụng idSP để cập nhật thông tin sản phẩm khác
		            // Ví dụ:
					DecimalFormat df = new DecimalFormat("#.##");
		            SanPhamDTO sp = SanPhamDAO.getInstance().selectById(idSP);
		            ctSanPhamDTO ctsp = ctSanPhamDAO.getInstance().selectById(idSP);
		            txt_maSP.setText(String.valueOf(sp.getIdSP()));
		            txt_tenSP.setText(sp.getTenSP());
		            txt_rom.setText(ctsp.getRom());
		            txt_mauSac.setText(sp.getMauSac());
		            txt_donGia.setText(String.valueOf(df.format(sp.getGiaBan())));
		            int soluong = Integer.parseInt(txt_soluong.getText());
					int soluongton = sp.getSoLuong();
					txt_soluong.setText(String.valueOf(soluongton));
					if (soluong > soluongton) {
						JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
			            txt_soluong.setText("0"); // Clear the invalid input
			            txt_soluong.requestFocusInWindow();
					}
					Object selectedItem = cbb_khuyenmai.getSelectedItem();
					int km = Integer.parseInt(selectedItem.toString());
					float gia = Integer.parseInt(txt_donGia.getText());
					int sl = Integer.parseInt(txt_soluong.getText());
					double tongTien = gia * sl - gia * sl * km / 100;
					txt_tongtien.setText(df.format(tongTien));
		        }
		    }
		});
		
		txt_soluong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int soluong = Integer.parseInt(txt_soluong.getText());
				int maSanPhamDangHien = SanPhamDAO.getInstance().selectById(Integer.parseInt(txt_maSP.getText())).getIdSP();
				int soluongton = SanPhamDAO.getInstance().selectById(maSanPhamDangHien).getSoLuong();
				if (soluong > soluongton) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
		            txt_soluong.setText("0"); // Clear the invalid input
		            txt_soluong.requestFocusInWindow();
				}
				Object selectedItem = cbb_khuyenmai.getSelectedItem();
				int km = Integer.parseInt(selectedItem.toString());
				float gia =  Integer.parseInt(txt_donGia.getText());
				int sl = Integer.parseInt(txt_soluong.getText());
				double tongTien = gia * sl - gia * sl * km / 100;
				DecimalFormat df = new DecimalFormat("#.##");
				txt_tongtien.setText(df.format(tongTien));
			}
		});
		btn_tao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idHD = Integer.parseInt(txt_maHD.getText());
				String thoiGian = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				double tongTien = Double.parseDouble(txt_tongtien.getText());
				int idNV = Integer.parseInt(txt_idNV_admin.getText());
				int idKH = 77001;
				HoaDonDTO hd = new HoaDonDTO(idHD, java.sql.Date.valueOf(thoiGian), tongTien, idNV, idKH);
				HoaDonDAO.getInstance().insert(hd);
				
				int sl = Integer.parseInt(txt_soluong.getText());
				float donGia = sp.getGiaBan();
				double thanhTien = donGia*sl;
				Object selectedItem = cbb_khuyenmai.getSelectedItem();
				int km = Integer.parseInt(selectedItem.toString());
				int idkm = KhuyenMaiDAO.getInstance().selectById(km).getIdKM();
				
				Object selected = cbb_baohanh.getSelectedItem();
				int thangbh = Integer.parseInt(selected.toString());
				int idbh = PhieuBaoHanhDAO.getInstance().selectById(thangbh).getIdBaoHanh();
				int idSanPham = Integer.parseInt(txt_maSP.getText());
				int idHoaDon = Integer.parseInt(txt_maHD.getText());
				int soluong = Integer.parseInt(txt_soluong.getText());
						
				ctHoaDonDTO cthd = new ctHoaDonDTO(soluong, donGia, thanhTien, idkm, idbh, idSanPham, idHoaDon);
				ctHoaDonDAO.getInstance().insert(cthd);
				int slTon = SanPhamDAO.getInstance().selectById(idSanPham).getSoLuong();
				SanPhamDAO.getInstance().updateSoLuongTon(idSanPham, slTon - soluong);
			}
		});
	}
	
}
