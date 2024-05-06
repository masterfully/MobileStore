package GUI.JPanel_QuanLyCuaHangDienThoai;



import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import GUI.Dialog.NhanVienDialog.SuaNhanVien;
import GUI.Dialog.NhanVienDialog.ThemNhanVien;
//import GUI.Dialog.XoaNhanVien;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class NhanVienGUI extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable table_Nv;
    DefaultTableModel tblModel;
    public NhanVienDAO nvDAO = new NhanVienDAO();
    private JTextField txtTimKiem;


    public NhanVienGUI() {
        setLayout(null);
        String[] columnNames = {
                "ID Nhân Viên", "Họ Tên", "Giới Tính", "Ngày Sinh", "Số Điện Thoại", "Trạng Thái"
        };
        tblModel = new DefaultTableModel(columnNames,0);
        loadDataTable();
        table_Nv = new JTable(tblModel);
        JScrollPane scrollPane = new JScrollPane(table_Nv);
        scrollPane.setBounds(10, 50, 780, 640);
        add(scrollPane);

        JButton btn_them = new JButton("Thêm");
        btn_them.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ThemNhanVien themNhanVien = new ThemNhanVien();
                themNhanVien.setVisible(true);
            }
        });
        btn_them.setBounds(20, 10, 85, 21);
        add(btn_them);

        JButton btn_sua = new JButton("Sửa");
        btn_sua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table_Nv.getSelectedRow();
                if(row != -1){ // Check if a row is selected
                    DefaultTableModel model = (DefaultTableModel) table_Nv.getModel();
                    int idNv = (int) model.getValueAt(row, 0);
                    SuaNhanVien suaNhanVien = new SuaNhanVien(idNv);

                    suaNhanVien.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần sửa");
                }
            }
        });
        btn_sua.setBounds(120, 10, 85, 21);
        add(btn_sua);

        JButton btn_xoa = new JButton("Xóa");
        btn_xoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = table_Nv.getSelectedRow();
                if(row != -1){ // Check if a row is selected
                    int idNv = (int) tblModel.getValueAt(row, 0);
                    int confirm = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa nhân viên có ID: " + idNv + "?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        // Update the isVisible status of the employee to 0 instead of deleting
                        NhanVienDAO.getInstance().delete(idNv);
                        loadDataTable();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần xóa");
                }
            }
        });
        btn_xoa.setBounds(240, 10, 85, 21);
        add(btn_xoa);

        JButton btn_taiLai = new JButton("Tải Lại");
        btn_taiLai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadDataTable();
            }
        });
        btn_taiLai.setBounds(400, 10, 85, 21);
        add(btn_taiLai);

    }
    public void loadDataTable(){
        ArrayList<NhanVienDTO> dsnv = nvDAO.selectAll();
        tblModel.setRowCount(0);
        for(NhanVienDTO nv : dsnv){
            tblModel.addRow(new Object[]{
                    nv.getIdNV(), nv.getHoTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getSdt(), nv.getIsDelete()
            });
        }
    }
}