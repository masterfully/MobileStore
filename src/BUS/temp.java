package BUS;

import javax.swing.JFrame;

import GUI.JPanel_QuanLyCuaHangDienThoai.SanPham_GUI;

public class temp {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Your Frame Title");
	    SanPham_GUI panel = new SanPham_GUI();
	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setVisible(true);
	}
}
