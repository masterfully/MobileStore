/////////////////////////////
//Nhập dữ liệu vào bảng sanpham
INSERT INTO SanPham (idSP, tenSP, giaNhap, giaBan, soLuong, hinhAnh, mauSac, isDelete)
VALUES
    ('1001', 'iPhone X', 8000000, 10000000, 100, 'Image\\X\\X\\xam.webp', 'Xám', 0),
	('1002', 'iPhone X', 8000000, 10000000, 100, 'Image\\X\\X\\trang.webp', 'Trắng', 0),
    ('1003', 'iPhone X', 8000000, 10000000, 100, 'Image\\X\\X\\xam.webp', 'Xám', 0),
	('1004', 'iPhone X', 8000000, 10000000, 100, 'Image\\X\\X\\trang.webp', 'Trắng', 0),

	('1005', 'iPhone XR', 10000000,  120000000, 150, 'Image\\X\\XR\\cam.webp', 'Cam', 0),
    ('1006', 'iPhone XR', 10000000,  120000000, 150, 'Image\\X\\XR\\den.webp', 'Đen', 0),
    ('1007', 'iPhone XR', 10000000,  120000000, 150, 'Image\\X\\XR\\do.webp', 'Đỏ', 0),
    ('1008', 'iPhone XR', 10000000,  120000000, 150, 'Image\\X\\XR\\trang.webp', 'Trắng', 0),
    ('1009', 'iPhone XR', 10000000,  120000000, 150, 'Image\\X\\XR\\vang.webp', 'Vàng', 0),
    ('1010', 'iPhone XR', 10000000,  120000000, 150, 'Image\\X\\XR\\xanh.webp', 'Xanh', 0),

	('1011', 'iPhone XS', 10000000,  13000000, 80, 'Image\\X\\XS\\vang.webp', 'Vàng', 0),
    ('1012', 'iPhone XS', 10000000,  13000000, 80, 'Image\\X\\XS\\trang.webp', 'Trắng', 0),
    ('1013', 'iPhone XS', 10000000,  13000000, 80, 'Image\\X\\XS\\xam.webp', 'Xám', 0),

	('1014', 'iPhone XS Max', 15000000,  17000000, 70, 'Image\\X\\XSM\\trang.webp', 'Trắng', 0),
    ('1015', 'iPhone XS Max', 15000000,  17000000, 70, 'Image\\X\\XSM\\xam.webp', 'Xám', 0),
    ('1016', 'iPhone XS Max', 15000000,  17000000, 70, 'Image\\X\\XSM\\vang.webp', 'Vàng', 0),

	('1017', 'iPhone 11', 16000000,  18000000, 120, 'Image\\11\\11\\den.webp', 'Đen', 0),
    ('1018', 'iPhone 11', 16000000,  18000000, 120, 'Image\\11\\11\\do.webp', 'Đỏ', 0),
    ('1019', 'iPhone 11', 16000000,  18000000, 120, 'Image\\11\\11\\tim.webp', 'Tím', 0),
    ('1020', 'iPhone 11', 16000000,  18000000, 120, 'Image\\11\\11\\trang.webp', 'Trắng', 0),
    ('1021', 'iPhone 11', 16000000,  18000000, 120, 'Image\\11\\11\\vang.webp', 'Vàng', 0),
    ('1022', 'iPhone 11', 16000000,  18000000, 120, 'Image\\11\\11\\xanh.webp', 'Xanh', 0),

	('1023', 'iPhone 11 Pro', 20000000, 22000000, 90, 'Image\\11\\11pro\\trang.webp', 'Trắng', 0),
    ('1024', 'iPhone 11 Pro', 20000000, 22000000, 90, 'Image\\11\\11pro\\vang.webp', 'Vàng', 0),
    ('1025', 'iPhone 11 Pro', 20000000, 22000000, 90, 'Image\\11\\11pro\\xam.webp', 'Xám', 0),
    ('1026', 'iPhone 11 Pro', 20000000, 22000000, 90, 'Image\\11\\11pro\\xanh.webp', 'Xanh', 0),

	('1027', 'iPhone 11 Pro Max', 23000000, 25000000, 90, 'Image\\11\\11prm\\trang.webp', 'Trắng', 0),
    ('1028', 'iPhone 11 Pro Max', 23000000, 25000000, 90, 'Image\\11\\11prm\\vang.webp', 'Vàng', 0),
    ('1029', 'iPhone 11 Pro Max', 23000000, 25000000, 90, 'Image\\11\\11prm\\xam.webp', 'Xám', 0),
    ('1030', 'iPhone 11 Pro Max', 23000000, 25000000, 90, 'Image\\11\\11prm\\xanh.webp', 'Xanh', 0)

//Nhập dữ liệu vào bảng ctsanpham
INSERT INTO ctsanpham(maIMEI, chip, pin, manHinh, phienBanHDH, cameraSau, cameraTruoc, ram, rom, SANPHAM_idSP)
VALUES
  ('113114001', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '4 GB', '64 GB', '1001'),
  ('113114002', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '4 GB', '256 GB', '1002'),
  ('113114003', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '4 GB', '256 GB', '1003'),
  ('113114004', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '4 GB', '256 GB', '1004'),

  ('113114005', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '64 GB', '1005'),
  ('113114006', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '128 GB', '1006'),
  ('113114007', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '256 GB', '1007'),
  ('113114008', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '64 GB', '1008'),
  ('113114009', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '128 GB', '1009'),
  ('113114010', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '256 GB', '1010'),

  ('113114011', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '64 GB', '1011'),
  ('113114012', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '256 GB', '1012'),
  ('113114013', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '128 GB', '1013'),

  ('113114014', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '64 GB', '1014'),
  ('113114015', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '128 GB', '1015'),
  ('113114016', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '128 GB', '1016'),
  ('113114017', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '256 GB', '1017'),

  ('113114018', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', '1018'),
  ('113114019', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', '1019'),
  ('113114020', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '128 GB', '1020'),
  ('113114021', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '128 GB', '1021'),
  ('113114022', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '256 GB', '1022'),
  ('113114023', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '256 GB', '1023'),

  ('113114024', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '64 GB', '1024'),
  ('113114025', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '128 GB', '1025'),
  ('113114026', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', '1026'),
  ('113114027', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '512 GB', '1027'),

  ('113114028', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '64 GB', '1028'),
  ('113114029', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '128 GB', '1029'),
  ('113114030', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', '1030'),
  ('113114031', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', '1030')


//Thêm dữ liệu vào bảng khachhang
INSERT INTO khachhang (idKH, tenKH, diaChi, sdt)
VALUES
    ('77001', N'Nguyễn Văn A', N'123 Đường ABC', '0123456789'),
    ('77002', N'Trần Thị B', N'456 Đường XYZ', '0987654321'),
    ('77003', N'Lê Văn C', N'789 Đường MNO', '0369852147'),
    ('77004', N'Phạm Thị D', N'321 Đường PQR', '0123456789'),
    ('77005', N'Hoàng Văn E', N'654 Đường UVW', '0987654321'),
    ('77006', N'Nguyễn Thị F', N'987 Đường DEF', '0369852147'),
    ('77007', N'Trần Văn G', N'159 Đường GHI', '0123456789'),
    ('77008', N'Lê Thị H', N'357 Đường JKL', '0987654321'),
    ('77009', N'Phạm Văn I', N'753 Đường STU', '0369852147'),
    ('77010', N'Hoàng Thị K', N'852 Đường VWX', '0123456789'),
    ('77011', N'Nguyễn Văn L', N'456 Đường YZA', '0987654321'),
    ('77012', N'Trần Thị M', N'789 Đường BCD', '0369852147'),
    ('77013', N'Lê Văn N', N'123 Đường EFG', '0123456789'),
    ('77014', N'Phạm Thị O', N'654 Đường HIJ', '0987654321'),
    ('77015', N'Hoàng Văn P', N'987 Đường KLM', '0369852147'),
    ('77016', N'Nguyễn Thị Q', N'321 Đường NOP', '0123456789'),
    ('77017', N'Trần Văn R', N'159 Đường QRS', '0987654321'),
    ('77018', N'Lê Thị S', N'357 Đường TUV', '0369852147'),
    ('77019', N'Phạm Văn T', N'753 Đường WXY', '0123456789'),
    ('77020', N'Hoàng Thị U', N'852 Đường ZAB', '0987654321');


//Nhập dữ liệu vào bảng nhanvien
INSERT INTO NhanVien (idNV, hoTen, gioiTinh, ngaySinh, sdt, isDelete)
VALUES
    ('33001', N'Nguyễn Văn A', N'Nam', '1990-01-01', '0123456789', 0),
    ('33002', N'Trần Thị B', N'Nữ', '1995-02-02', '0987654321', 0),
    ('33003', N'Lê Văn C', N'Nam', '1985-03-03', '0369852147', 0),
    ('33004', N'Phạm Thị D', N'Nữ', '1992-04-04', '0123456789', 0),
    ('33005', N'Hoàng Văn E', N'Nam', '1997-05-05', '0987654321', 0),
    ('33006', N'Nguyễn Thị F', N'Nữ', '1988-06-06', '0369852147', 0),
    ('33007', N'Trần Văn G', N'Nam', '1993-07-07', '0123456789', 0),
    ('33008', N'Lê Thị H', N'Nữ', '1991-08-08', '0987654321', 0),
    ('33009', N'Phạm Văn I', N'Nam', '1989-09-09', '0369852147', 0),
    ('33010', N'Hoàng Thị K', N'Nữ', '1994-10-10', '0123456789', 0);

//Nhập dữ liệu vào bảng taikhoan
INSERT INTO taikhoan (userName, matKhau, trangThai, chucVu, NHANVIEN_idNV)
VALUES
  ('NV001', '123456', 'Hoạt động', 'Nhân viên bán hàng', '33001'),
  ('NV002', '123456', 'Hoạt động', 'Nhân viên bán hàng', '33002'),
  ('NV003', '123456', 'Hoạt động', 'Nhân viên kho', '33003'),
  ('NV004', '123456', 'Hoạt động', 'Nhân viên bán hàng', '33004'),
  ('NV005', '123456', 'Hoạt động', 'Nhân viên quản lí', '33005'),
  ('NV006', '123456', 'Ngưng hoạt động', 'Nhân viên kho', '33006'),
  ('NV007', '123456', 'Hoạt động', 'Nhân viên bán hàng', '33007'),
  ('NV008', '123456', 'Hoạt động', 'Nhân viên bán hàng', '33008'),
  ('NV009', '123456', 'Hoạt động', 'Nhân viên kho', '33009'),
  ('NV010', '123456', 'Ngưng hoạt động', 'Nhân viên quản lí', '33010');

//Nhập dữ liệu vào bảng HOADON
INSERT INTO HOADON (idHoaDon, thoiGian, tongTien, NHANVIEN_idNV, KHACHHANG_idKH)
VALUES
  (44001, '2024-04-27 11:34:04','', 33001, 77001),
  (44002, '2024-04-27 11:34:04','', 33002, 77002),
  (44003, '2024-04-27 11:34:04','', 33003, 77003),
  (44004, '2024-04-27 11:34:04','', 33004, 77004),
  (44005, '2024-04-27 11:34:04','', 33005, 77005),
  (44006, '2024-04-27 11:34:04','', 33001, 77006),
  (44007, '2024-04-27 11:34:04','', 33002, 77007),
  (44008, '2024-04-27 11:34:04','', 33003, 77008),
  (44009, '2024-04-27 11:34:04','', 33004, 77009),
  (44010, '2024-04-27 11:34:04','', 33005, 77010);

//Nhập dữ liệu vào bảng KHUYENMAI
INSERT INTO KHUYENMAI (idKM, dieukien, phanTram, ngayBatDau, ngayKetThuc)
VALUES
  (9901, 'Mua hàng từ 10 triệu đến 20 triệu', 10, '2024-04-27', '2024-05-31'),
  (9902, 'Mua hàng từ 20 triệu đến 30 triệu', 20, '2024-04-27', '2024-05-31'),
  (9903, 'Mua hàng từ 30 triệu đến 40 triệu', 30, '2024-04-27', '2024-05-31'),
  (9904, 'Mua hàng từ 40 triệu trở lên', 40, '2024-04-27', '2024-05-31'),
  (9905, 'Khuyến mãi đặc biệt: Giảm 50% cho tất cả sản phẩm', 50, '2024-04-27', '2024-04-30');

//Nhập dữ liệu vào bảng PHIEUBAOHANH
INSERT INTO phieubaohanh (idBaoHanh, thoiGian)
VALUES
  (8801, 6),
  (8802, 12),
  (8803, 18),
  (8804, 24);


//Nhập dữ liệu vào bảng chi tiết hóa đơn

INSERT INTO cthoadon (soLuong, donGia, thanhTien, KHUYENMAI_idKM, PHIEUBAOHANH_idBaoHanh, SANPHAM_idSP, HOADON_idHoaDon)
VALUES
    (2201,'','', 9901, 8801, 1002, 44001),
    (2202,'','', 9902, 8803, 1001, 44002)

//Nhập dữ liệu vào bảng Phiếu nhập
INSERT INTO phieunhapkho (idPhieuNhap, thoiGian, tongTien, NHANVIEN_idNV)
VALUES
  (5501, '2024-04-27 11:34:04', 10000000, 33001),
  (5502, '2024-04-27 11:34:04', 20000000, 33002),
  (5503, '2024-04-27 11:34:04', 30000000, 33003),
  (5504, '2024-04-27 11:34:04', 40000000, 33004),
  (5505, '2024-04-27 11:34:04', 50000000, 33005),
  (5506, '2024-04-27 11:34:04', 60000000, 33001),
  (5507, '2024-04-27 11:34:04', 70000000, 33002),
  (5508, '2024-04-27 11:34:04', 80000000, 33003),
  (5509, '2024-04-27 11:34:04', 90000000, 33004),
  (5510, '2024-04-27 11:34:04', 100000000, 33005);

//Nhập dữ liệu vào bảng chi tiết phiếu Nhập
INSERT INTO ctphieunhapkho (soLuong, donGia, thanhTien, PHIEUNHAP_idPhieuNhap, SANPHAM_idSP)
VALUES
  (6610, 10000000, 100000000, 5501, 1001),
  (6605, 12000000, 60000000, 5501, 1002),
  (6607, 13000000, 91000000, 5501, 1003),
  (6602, 17000000, 34000000, 5502, 1004),
  (6608, 18000000, 144000000, 5502, 1005),
  (6601, 22000000, 22000000, 5503, 1006),
  (6603, 25000000, 75000000, 5503, 1007),
  (6606, 18000000, 108000000, 5504, 1008),
  (6604, 20000000, 80000000, 5504, 1009),
  (6609, 25000000, 225000000, 5505, 1010);

//Nhập dữ liệu vào phiếu xuất kho
INSERT INTO PHIEUXUATKHO (idPhieuXuat, thoiGian, tongTien, NHANVIEN_idNV)
VALUES
  (11101, '2024-04-27 11:34:04', 10000000, 33001),
  (11102, '2024-04-27 11:34:04', 20000000, 33002),
  (11103, '2024-04-27 11:34:04', 30000000, 33003),
  (11104, '2024-04-27 11:34:04', 40000000, 33004),
  (11105, '2024-04-27 11:34:04', 50000000, 33005),
  (11106, '2024-04-27 11:34:04', 60000000, 33001),
  (11107, '2024-04-27 11:34:04', 70000000, 33002),
  (11108, '2024-04-27 11:34:04', 80000000, 33003),
  (11109, '2024-04-27 11:34:04', 90000000, 33004),
  (11110, '2024-04-27 11:34:04', 100000000, 33005);

//Nhập dữ liệu vào chi tiết phiếu xuất kho

INSERT INTO ctphieuxuatkho (soLuong, PHIEUXUATKHO_idPhieuXuat, SANPHAM_idSP)
VALUES
  (22201, 11101, 1001),
  (22202, 11102, 1002),
  (22203, 11103, 1003),
  (22204, 11104, 1004),
  (22205, 11105, 1005),
  (22206, 11106, 1001),
  (22207, 11107, 1002),
  (22208, 11108, 1003),
  (22209, 11109, 1004),
  (22210, 11110, 1005);

//Xóa cột loaiIP của bảng Kho
ALTER TABLE KHO
DROP COLUMN loaiIP;

//Nhập vào bảng kho
INSERT INTO kho 
VALUES 
    (33301,NULL, NULL),
    (33302,NULL, NULL),
    (33303,NULL, NULL),
    (33304,NULL, NULL),
    (33305,NULL, NULL);

//Thêm dữ liệu vào bảng thống kê
INSERT INTO thongke 
VALUES 
    (44401,NULL, NULL, NULL),
    (44402,NULL, NULL, NULL),
    (44403,NULL, NULL, NULL),
    (44404,NULL, NULL, NULL),
    (44405,NULL, NULL, NULL);
