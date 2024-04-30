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
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import BUS.SanPham_BUS;
import DAO.SanPham_DAO;
import DTO.SanPham_DTO;
import GUI.Dialog.SanPham_Dialog;

import javax.swing.JTextField;

public class SanPham_GUI extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable table_SP;
    private JTextField textField_timkiem;
    DefaultTableModel tblModel;
    public SanPham_BUS spBUS = new SanPham_BUS();
    public ArrayList<SanPham_DTO> listSP = spBUS.getAll();
    public SanPham_DAO spDAO = new SanPham_DAO();
    public SanPham_Dialog spDialog = new SanPham_Dialog();
    /**
     * Create the panel.
     */

    public void loadDataTalbe() {
        System.out.println("Loading data...");
        ArrayList<SanPham_DTO> result = spDAO.selectAll();
        System.out.println("Number of records retrieved: " + result.size());
        tblModel.setRowCount(0); // Clear existing data
        for (SanPham_DTO sp : result) {
            tblModel.addRow(new Object[]{sp.getIdSP(), sp.getTenSP(), sp.getSoLuong(), sp.getMauSac()});
        }
    }

    public SanPham_GUI() {
//        setLayout(new BorderLayout());
        String[] columnNames = {"Mã SP", "Tên sản phẩm", "Số lượng tồn", "Màu sắc"};
        tblModel = new DefaultTableModel(columnNames, 0);
        loadDataTalbe();
        setLayout(new GridLayout(0, 1, 0, 0));
        JPanel panel_SanPham = new JPanel();
        add(panel_SanPham, BorderLayout.NORTH);
        panel_SanPham.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        add(panel_SanPham);
        GridBagLayout gbl_panel_SanPham = new GridBagLayout();
        gbl_panel_SanPham.columnWidths = new int[]{104, 123, 129, 126, 129, 116, 189, 0};
        gbl_panel_SanPham.rowHeights = new int[]{68, 456, 0};
        gbl_panel_SanPham.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
        gbl_panel_SanPham.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        panel_SanPham.setLayout(gbl_panel_SanPham);

        JButton btn_them = new JButton("Thêm");
        btn_them.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	SanPham_Dialog spdialog = new SanPham_Dialog();
            	spdialog.setSize(1000,500);
            	spdialog.setVisible(true);
            }
        });
        btn_them.setForeground(new Color(0, 0, 0));
        btn_them.setBackground(new Color(255, 255, 255));
        GridBagConstraints gbc_btn_them = new GridBagConstraints();
        gbc_btn_them.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_them.insets = new Insets(0, 0, 5, 5);
        gbc_btn_them.gridx = 0;
        gbc_btn_them.gridy = 0;
        panel_SanPham.add(btn_them, gbc_btn_them);
        btn_them.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham_GUI.class.getResource("icon_them.png"))));


        JButton btn_sua = new JButton("Sửa");
        GridBagConstraints gbc_btn_sua = new GridBagConstraints();
        gbc_btn_sua.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_sua.insets = new Insets(0, 0, 5, 5);
        gbc_btn_sua.gridx = 1;
        gbc_btn_sua.gridy = 0;
        panel_SanPham.add(btn_sua, gbc_btn_sua);
        btn_sua.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham_GUI.class.getResource("icon_sua.png"))));


        JButton btn_xoa = new JButton("Xóa");
        GridBagConstraints gbc_btn_xoa = new GridBagConstraints();
        gbc_btn_xoa.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_xoa.insets = new Insets(0, 0, 5, 5);
        gbc_btn_xoa.gridx = 2;
        gbc_btn_xoa.gridy = 0;
        panel_SanPham.add(btn_xoa, gbc_btn_xoa);
        btn_xoa.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(SanPham_GUI.class.getResource("icon_xoa.png"))));

        JButton btn_chitiet = new JButton("Chi tiết");
        btn_chitiet.setIcon(new ImageIcon(SanPham_GUI.class.getResource("/GUI/JPanel_QuanLyCuaHangDienThoai/icon_info.png")));
        GridBagConstraints gbc_btn_chitiet = new GridBagConstraints();
        gbc_btn_chitiet.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_chitiet.insets = new Insets(0, 0, 5, 5);
        gbc_btn_chitiet.gridx = 3;
        gbc_btn_chitiet.gridy = 0;
        panel_SanPham.add(btn_chitiet, gbc_btn_chitiet);

        JButton btn_xemDS = new JButton("Xem DS");
        btn_xemDS.setIcon(new ImageIcon(SanPham_GUI.class.getResource("/GUI/JPanel_QuanLyCuaHangDienThoai/icon_xemDS.png")));
        GridBagConstraints gbc_btn_xemDS = new GridBagConstraints();
        gbc_btn_xemDS.fill = GridBagConstraints.HORIZONTAL;
        gbc_btn_xemDS.insets = new Insets(0, 0, 5, 5);
        gbc_btn_xemDS.gridx = 4;
        gbc_btn_xemDS.gridy = 0;
        panel_SanPham.add(btn_xemDS, gbc_btn_xemDS);

        JComboBox comboBox_timkiem = new JComboBox();
        comboBox_timkiem.setModel(new DefaultComboBoxModel(new String[]{"Tất cả", "IPhone 11", "IPhone 12"}));
        GridBagConstraints gbc_comboBox_timkiem = new GridBagConstraints();
        gbc_comboBox_timkiem.insets = new Insets(0, 0, 5, 5);
        gbc_comboBox_timkiem.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox_timkiem.gridx = 5;
        gbc_comboBox_timkiem.gridy = 0;
        panel_SanPham.add(comboBox_timkiem, gbc_comboBox_timkiem);

        textField_timkiem = new JTextField();
        GridBagConstraints gbc_textField_timkiem = new GridBagConstraints();
        gbc_textField_timkiem.insets = new Insets(0, 0, 5, 0);
        gbc_textField_timkiem.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_timkiem.gridx = 6;
        gbc_textField_timkiem.gridy = 0;
        panel_SanPham.add(textField_timkiem, gbc_textField_timkiem);
        textField_timkiem.setColumns(10);
        table_SP = new JTable(tblModel);
        JScrollPane scrollPane = new JScrollPane(table_SP); // Tạo JScrollPane và đặt table_SP vào đó
        table_SP.getTableHeader().setBackground(Color.LIGHT_GRAY); // Đặt màu nền cho thanh tiêu đề
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridwidth = 7;
        gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 0;
        gbc_scrollPane.gridy = 1;
        panel_SanPham.add(scrollPane, gbc_scrollPane); // Thêm JScrollPane chứa table_SP vào panel_SanPham


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
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
//        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }
}
