package GUI.JPanel_QuanLyCuaHangDienThoai;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import GUI.Dialog.KhachHang_Dialog.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KhachHangGUI extends JPanel {

    private JTable table_KH;
    private DefaultTableModel tblModel;
    private KhachHangDAO khachHangDAO = new KhachHangDAO();
    private JTextField txtTimKiem;

    public KhachHangGUI() {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        txtTimKiem = new JTextField(20);
        panel.add(txtTimKiem);

        JButton btn_timKH = new JButton("Tìm kiếm");
        btn_timKH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timKiemKhachHang();
            }
        });
        panel.add(btn_timKH);

        JButton btn_themKH = new JButton("Thêm");
        btn_themKH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Tạo một JDialog để chứa ThemKhachHang_Dialog

                ThemKhachHang themKhachHang = new ThemKhachHang();
                themKhachHang.setVisible(true);
            }
        });
        panel.add(btn_themKH);

        JButton btn_suaKH = new JButton("Sửa");
        btn_suaKH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table_KH.getSelectedRow();
                if (selectedRow != -1) {
                    // Lấy thông tin của khách hàng được chọn
                    DefaultTableModel model = (DefaultTableModel) table_KH.getModel();
                    int idKH = (int) model.getValueAt(selectedRow, 0);

                    // Tạo dialog sửa và truyền thông tin của khách hàng vào
//                    KhachHangDTO khachHang_moi = new KhachHangDTO();
//                    khachHang_moi.setIdKhachHang(idKhachHang);
//                    khachHang_moi.setTenKhachHang(tenKhachHang);
//                    khachHang_moi.setDiaChiKhachHang(diaChi);
//                    khachHang_moi.setSdtKhachHang(sdtKhachHang);

                    // Tạo một JDialog để chứa SuaKhachHang_Dialog


                    // Thêm panel SuaKhachHang_Dialog vào dialog
                    SuaKhachHang suaKhachHang = new SuaKhachHang(idKH);
                    // Hiển thị JDialog
                    suaKhachHang.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng cần sửa!");
                }
            }
        });

        panel.add(btn_suaKH);

        JButton btn_xoaKH = new JButton("Xóa");
        btn_xoaKH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table_KH.getSelectedRow();
                if (selectedRow != -1) {
                    int idKhachHang = (int) tblModel.getValueAt(selectedRow, 0);
                    int confirm = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa khách hàng có ID: " + idKhachHang + "?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        khachHangDAO.delete(idKhachHang);
                        loadDataTalbe();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng cần xóa!");
                }
            }
        });
        panel.add(btn_xoaKH);

        JButton btnRefresh = new JButton("Tải lại");
        btnRefresh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadDataTalbe();
            }
        });
        panel.add(btnRefresh);

        add(panel, BorderLayout.NORTH);

        String[] columnNames = {"ID", "Tên khách hàng", "Địa chỉ", "Số điện thoại"};
        tblModel = new DefaultTableModel(columnNames, 0);

        // Load data from database
        loadDataTalbe();

        table_KH = new JTable(tblModel);
        // Đặt kích thước cố định cho cột
        table_KH.getColumnModel().getColumn(0).setPreferredWidth(100); // ID
        table_KH.getColumnModel().getColumn(1).setPreferredWidth(150); // Tên khách hàng
        table_KH.getColumnModel().getColumn(2).setPreferredWidth(200); // Địa chỉ
        table_KH.getColumnModel().getColumn(3).setPreferredWidth(100); // Số điện thoại

        // Đặt kích thước font cho ô trong bảng
        Font font = table_KH.getFont().deriveFont(Font.PLAIN, 14);
        table_KH.setFont(font);

        JScrollPane scrollPane = new JScrollPane(table_KH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void loadDataTalbe() {
        ArrayList<KhachHangDTO> khachHangList = khachHangDAO.selectAllActive();
        tblModel.setRowCount(0);
        for (KhachHangDTO khachHang : khachHangList) {
            tblModel.addRow(new Object[]{
                    khachHang.getIdKhachHang(), khachHang.getTenKhachHang(), khachHang.getDiaChiKhachHang(), khachHang.getSdtKhachHang()});
        }
    }

    public void timKiemKhachHang() {
        String keyword = txtTimKiem.getText().trim();
        if (keyword.isEmpty()) {
            loadDataTalbe(); // hiển thị tất cả khách hàng nếu không có từ khóa tìm kiếm
        } else {
            ArrayList<KhachHangDTO> khachHangList = khachHangDAO.search(keyword);
            tblModel.setRowCount(0);
            for (KhachHangDTO khachHang : khachHangList) {
                tblModel.addRow(new Object[]{khachHang.getIdKhachHang(), khachHang.getTenKhachHang(), khachHang.getDiaChiKhachHang(), khachHang.getSdtKhachHang()});
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Quản lý khách hàng");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            KhachHangGUI khachHangGUI = new KhachHangGUI();

            frame.getContentPane().add(khachHangGUI);
            frame.setVisible(true);
        });
    }
}
