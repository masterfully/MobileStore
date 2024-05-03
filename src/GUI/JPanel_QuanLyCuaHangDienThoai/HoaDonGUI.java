package GUI.JPanel_QuanLyCuaHangDienThoai;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import BUS.SanPham_BUS;
import DAO.HoaDonDAO;
import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import DTO.HoaDonDTO;
import GUI.Dialog.HoaDonDialog.themHoaDon_Dialog;
import GUI.Dialog.SanPhamDialog.suaSanPham_Dialog;
import GUI.Dialog.SanPhamDialog.themSanPham_Dialog;
import GUI.Dialog.SanPhamDialog.xemDanhSachImeiSanPham_Dialog;
import GUI.Dialog.SanPhamDialog.xemthongtinSanPham_Dialog;
import GUI.Dialog.SanPhamDialog.xoaSanPham_Dialog;

import java.text.Normalizer;
import javax.swing.JTextField;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;

public class HoaDonGUI extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable table_HD;
    DefaultTableModel tblModel;
    public HoaDonDAO hdDAO = new HoaDonDAO();
    public themSanPham_Dialog hdDialog = new themSanPham_Dialog();
    private JTextField txt_tuTien;
    private JTextField txt_denTien;


    public static String removeDiacriticsAndhdaces(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        str = str.replaceAll("\\s+", ""); // Loại bỏ các khoảng trắng
        return str;
    }

    public void loadDataTalbe() {
        ArrayList<HoaDonDTO> result = hdDAO.selectAll();
        System.out.println("Number of records retrieved: " + result.size());
        tblModel.setRowCount(0); // Clear existing data
        for (HoaDonDTO hd : result) {
        	String tenNV = NhanVienDAO.getInstance().selectById(hd.getNHANVIEN_idNV()).gethoTen();
        	String tenKH = KhachHangDAO.getInstance().selectById(hd.getKHACHHANG_idKH()).gettenKH();
            tblModel.addRow(new Object[]{hd.getIdHoaDon(), hd.getThoiGian(), hd.getTongTien(), tenNV, tenKH});
        }
    }

    

    public HoaDonGUI() {
        String[] columnNames = {"Mã hóa đơn", "Thời gian lập", "Tổng tiền", "Tên nhân viên", "Tên Khách hàng"};
        tblModel = new DefaultTableModel(columnNames, 0);
        loadDataTalbe();
        setLayout(null);
        JPanel panel_HoaDon = new JPanel();
        panel_HoaDon.setBounds(10, 11, 1027, 587);
        add(panel_HoaDon, BorderLayout.NORTH);
        panel_HoaDon.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        add(panel_HoaDon);
        GridBagLayout gbl_panel_HoaDon = new GridBagLayout();
        gbl_panel_HoaDon.columnWidths = new int[]{104, 123, 129, 126, 129, 116, 189, 0};
        gbl_panel_HoaDon.rowHeights = new int[]{68, 456, 0};
        gbl_panel_HoaDon.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
        gbl_panel_HoaDon.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        panel_HoaDon.setLayout(gbl_panel_HoaDon);

        JButton btn_them = new JButton("Thêm");
        btn_them.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                int selectedRow = table_HD.getSelectedRow();
//                if (selectedRow != -1) {
//                    DefaultTableModel model = (DefaultTableModel) table_HD.getModel();
//                    int idhd = (int) model.getValueAt(selectedRow, 0);
//                    themSanPham_Dialog hddialog = new themSanPham_Dialog(idhd);
//                    hddialog.setSize(1000, 500);
//                    hddialog.setVisible(true);
//                } else {
                    themHoaDon_Dialog hddialog = new themHoaDon_Dialog();
                    hddialog.setSize(1200, 600);
                    hddialog.setVisible(true);
//                }

            }
        });
        btn_them.setForeground(new Color(0, 0, 0));
        btn_them.setBackground(new Color(255, 255, 255));
        GridBagConstraints gbc_btn_them = new GridBagConstraints();
        gbc_btn_them.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_them.insets = new Insets(0, 0, 5, 5);
        gbc_btn_them.gridx = 0;
        gbc_btn_them.gridy = 0;
        panel_HoaDon.add(btn_them, gbc_btn_them);
        btn_them.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(HoaDonGUI.class.getResource("icon_them.png"))));


        JButton btn_sua = new JButton("Sửa");
        btn_sua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table_HD.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) table_HD.getModel();
                    int idhd = (int) model.getValueAt(selectedRow, 0);
                    suaSanPham_Dialog hddialog = new suaSanPham_Dialog(idhd);
                    hddialog.setSize(650, 500);
                    hddialog.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần sửa!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        GridBagConstraints gbc_btn_sua = new GridBagConstraints();
        gbc_btn_sua.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_sua.insets = new Insets(0, 0, 5, 5);
        gbc_btn_sua.gridx = 1;
        gbc_btn_sua.gridy = 0;
        panel_HoaDon.add(btn_sua, gbc_btn_sua);
        btn_sua.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(HoaDonGUI.class.getResource("icon_sua.png"))));


        JButton btn_xoa = new JButton("Xóa");
        btn_xoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table_HD.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) table_HD.getModel();
                    int idhd = (int) model.getValueAt(selectedRow, 0);
                    xoaSanPham_Dialog hddialog = new xoaSanPham_Dialog(idhd);
                    hddialog.setSize(500, 300);
                    hddialog.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần xóa!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        GridBagConstraints gbc_btn_xoa = new GridBagConstraints();
        gbc_btn_xoa.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_xoa.insets = new Insets(0, 0, 5, 5);
        gbc_btn_xoa.gridx = 2;
        gbc_btn_xoa.gridy = 0;
        panel_HoaDon.add(btn_xoa, gbc_btn_xoa);
        btn_xoa.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(HoaDonGUI.class.getResource("icon_xoa.png"))));

        JButton btn_chitiet = new JButton("Chi tiết");
        btn_chitiet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table_HD.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) table_HD.getModel();
                    int idhd = (int) model.getValueAt(selectedRow, 0);
                    xemthongtinSanPham_Dialog hddialog = new xemthongtinSanPham_Dialog(idhd);
                    hddialog.setSize(650, 500);
                    hddialog.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần xem!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        btn_chitiet.setIcon(new ImageIcon(HoaDonGUI.class.getResource("/GUI/JPanel_QuanLyCuaHangDienThoai/icon_info.png")));
        GridBagConstraints gbc_btn_chitiet = new GridBagConstraints();
        gbc_btn_chitiet.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_chitiet.insets = new Insets(0, 0, 5, 5);
        gbc_btn_chitiet.gridx = 3;
        gbc_btn_chitiet.gridy = 0;
        panel_HoaDon.add(btn_chitiet, gbc_btn_chitiet);

        table_HD = new JTable(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"M\u00E3 h\u00F3a \u0111\u01A1n", "Th\u1EDDi gian l\u1EADp", "T\u1ED5ng ti\u1EC1n", "T\u00EAn nh\u00E2n vi\u00EAn", "T\u00EAn kh\u00E1ch h\u00E0ng"
        	}
        ));
        table_HD = new JTable(tblModel);
        JScrollPane scrollPane = new JScrollPane(table_HD); // Tạo JScrollPane và đặt table_hd vào đó
        table_HD.getTableHeader().setBackground(Color.LIGHT_GRAY); // Đặt màu nền cho thanh tiêu đề

        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridwidth = 7;
        gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 0;
        gbc_scrollPane.gridy = 1;
        panel_HoaDon.add(scrollPane, gbc_scrollPane); // Thêm JScrollPane chứa table_hd vào panel_SanPham

        JButton btn_tailai = new JButton("Tải lại");
        btn_tailai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                refreshTable();
            }
        });
        scrollPane.setRowHeaderView(btn_tailai);
        
        JLabel lbl_hk = new JLabel("Khách hàng");
        lbl_hk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl_hk.setBounds(1062, 34, 101, 32);
        add(lbl_hk);
        
        JComboBox cbb_kh = new JComboBox();
        cbb_kh.setBounds(1062, 71, 109, 22);
        add(cbb_kh);
        
        JLabel lbl_nv = new JLabel("Nhân viên");
        lbl_nv.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl_nv.setBounds(1062, 109, 101, 32);
        add(lbl_nv);
        
        JComboBox cbb_nv = new JComboBox();
        cbb_nv.setBounds(1062, 145, 109, 22);
        add(cbb_nv);
        
        JLabel lbl_ngaybatdau = new JLabel("Từ ngày");
        lbl_ngaybatdau.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl_ngaybatdau.setBounds(1062, 186, 101, 32);
        add(lbl_ngaybatdau);
        
        JDateChooser dateChooser_ngaybatdau = new JDateChooser();
        dateChooser_ngaybatdau.setBounds(1062, 229, 109, 22);
        add(dateChooser_ngaybatdau);
        
        JLabel lbl_ngayketthuc = new JLabel("Đến ngày");
        lbl_ngayketthuc.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl_ngayketthuc.setBounds(1062, 272, 101, 32);
        add(lbl_ngayketthuc);
        
        JDateChooser dateChooser_ngayketthuc = new JDateChooser();
        dateChooser_ngayketthuc.setBounds(1062, 315, 109, 22);
        add(dateChooser_ngayketthuc);
        
        JLabel lbl_tuTien = new JLabel("Từ số tiền (VNĐ)");
        lbl_tuTien.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl_tuTien.setBounds(1062, 367, 123, 32);
        add(lbl_tuTien);
        
        txt_tuTien = new JTextField();
        txt_tuTien.setBounds(1062, 410, 104, 32);
        add(txt_tuTien);
        txt_tuTien.setColumns(10);
        
        JLabel lbl_denTien = new JLabel("Đến số tiền (VNĐ)");
        lbl_denTien.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl_denTien.setBounds(1062, 463, 123, 32);
        add(lbl_denTien);
        
        txt_denTien = new JTextField();
        txt_denTien.setColumns(10);
        txt_denTien.setBounds(1062, 506, 104, 32);
        add(txt_denTien);


    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinhdection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
//        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }

    public void refreshTable() {
        loadDataTalbe();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test SanPham_GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 600);

        // Tạo một instance của SanPham_GUI
        HoaDonGUI HoaDonGUI = new HoaDonGUI();

        // Thêm SanPham_GUI vào JFrame
        frame.getContentPane().add(HoaDonGUI);

        // Hiển thị JFrame
        frame.setVisible(true);
        //240x300
    }
}
