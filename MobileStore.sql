CREATE TABLE LoaiSanPham
(
	IDLoai nchar(10) primary key,
	TenLoai nvarchar(50) not null,
	isDelete int not null
)

-- Thêm dữ liệu vào bảng LoaiSanPham
INSERT INTO LoaiSanPham (IDLoai, TenLoai, isDelete) 
VALUES 
	('IPX',N'Iphone X series',0),
	('IP11',N'Iphone 11 series',0),
	('IP12',N'Iphone 12 series',0),
	('IP13',N'Iphone 13 series',0),
	('IP14',N'Iphone 14 series',0),
	('IP15',N'Iphone 15 series',0);

CREATE TABLE SanPham
(
	IDSanPham nchar(10) primary key,
	tenSanPham nvarchar(50),
	donGia int,
	soLuong int,
	hinhAnh nchar(100),
	mauSac nvarchar(50),
	chip nchar(50),
	pin nchar(50),
	manHinh nchar(50),
	phienBanHDH nchar(50),
	cameraSau nchar(50),
	cameraTruoc nchar(50),
	baoHanh nchar(50),
	ram nchar(50),
	rom nchar(50),
	isDelete int,
	IDLoai nchar(10),
	FOREIGN KEY (IDLoai) REFERENCES LoaiSanPham(IDLoai)
)

-- Chèn dữ liệu cho các sản phẩm iPhone từ iPhone X đến iPhone 15 Pro Max
INSERT INTO SanPham (IDSanPham, tenSanPham, donGia, soLuong, hinhAnh, mauSac, chip, pin, manHinh, phienBanHDH, cameraSau, cameraTruoc, baoHanh, ram, rom, isDelete, IDLoai)
VALUES
    ('SP001', 'iPhone X', 10000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\X\xam.webp', 'Xám', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '12 tháng', '4 GB', '64 GB', 0, 'IPX'),
	('SP002', 'iPhone X', 10000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\X\trang.webp', 'Trắng', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '12 tháng', '4 GB', '64 GB', 0, 'IPX'),
    ('SP003', 'iPhone X', 10000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\X\xam.webp', 'Xám', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '12 tháng', '4 GB', '256 GB', 0, 'IPX'),
	('SP004', 'iPhone X', 10000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\X\trang.webp', 'Trắng', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '12 tháng', '4 GB', '256 GB', 0, 'IPX'),  

	('SP005', 'iPhone XR', 12000000, 150, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XR\cam.webp', 'Cam', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '12 tháng', '3 GB', '64 GB', 0, 'IPX'),
    ('SP006', 'iPhone XR', 12000000, 150, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XR\den.webp', 'Đen', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '12 tháng', '3 GB', '128 GB', 0, 'IPX'),
    ('SP007', 'iPhone XR', 12000000, 150, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XR\do.webp', 'Đỏ', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '12 tháng', '3 GB', '256 GB', 0, 'IPX'),
    ('SP008', 'iPhone XR', 12000000, 150, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XR\trang.webp', 'Trắng', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '12 tháng', '3 GB', '64 GB', 0, 'IPX'),
    ('SP009', 'iPhone XR', 12000000, 150, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XR\vang.webp', 'Vàng', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '12 tháng', '3 GB', '128 GB', 0, 'IPX'),
    ('SP010', 'iPhone XR', 12000000, 150, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XR\xanh.webp', 'Xanh', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '12 tháng', '3 GB', '256 GB', 0, 'IPX'),
    
	('SP011', 'iPhone XS', 15000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XS\vang.webp', 'Vàng', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '12 tháng', '4 GB', '64 GB', 0, 'IPX'),
    ('SP012', 'iPhone XS', 15000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XS\trang.webp', 'Trắng', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '12 tháng', '4 GB', '256 GB', 0, 'IPX'),
    ('SP013', 'iPhone XS', 15000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XS\xam.webp', 'Xám', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '12 tháng', '4 GB', '128 GB', 0, 'IPX'),
    
	('SP014', 'iPhone XS Max', 17000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XSM\trang.webp', 'Trắng', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '12 tháng', '4 GB', '64 GB', 0, 'IPX'),
    ('SP015', 'iPhone XS Max', 17000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XSM\xam.webp', 'Xám', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '12 tháng', '4 GB', '1028 GB', 0, 'IPX'),
    ('SP016', 'iPhone XS Max', 17000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\X\XSM\vang.webp', 'Vàng', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '12 tháng', '4 GB', '256 GB', 0, 'IPX'),
    
	('SP017', 'iPhone 11', 18000000, 120, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11\den.webp', 'Đen', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP11'),
    ('SP018', 'iPhone 11', 18000000, 120, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11\do.webp', 'Đỏ', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP11'),
    ('SP019', 'iPhone 11', 18000000, 120, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11\tim.webp', 'Tím', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP11'),
    ('SP020', 'iPhone 11', 18000000, 120, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11\trang.webp', 'Trắng', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP11'),
    ('SP021', 'iPhone 11', 18000000, 120, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11\vang.webp', 'Vàng', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP11'),
    ('SP022', 'iPhone 11', 18000000, 120, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11\xanh.webp', 'Xanh', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP11'),
    
	('SP023', 'iPhone 11 Pro', 22000000, 90, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11pro\trang.webp', 'Trắng', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP11'),
    ('SP024', 'iPhone 11 Pro', 22000000, 90, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11pro\vang.webp', 'Vàng', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP11'),
    ('SP025', 'iPhone 11 Pro', 22000000, 90, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11pro\xam.webp', 'Xám', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP11'),
    ('SP026', 'iPhone 11 Pro', 22000000, 90, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11pro\xanh.webp', 'Xanh', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '512 GB', 0, 'IP11'),
    
	('SP027', 'iPhone 11 Pro Max', 25000000, 90, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11prm\trang.webp', 'Trắng', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP11'),
    ('SP028', 'iPhone 11 Pro Max', 25000000, 90, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11prm\vang.webp', 'Vàng', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP11'),
    ('SP029', 'iPhone 11 Pro Max', 25000000, 90, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11prm\xam.webp', 'Xám', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP11'),
    ('SP030', 'iPhone 11 Pro Max', 25000000, 90, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\11\11prm\xanh.webp', 'Xanh', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '512 GB', 0, 'IP11'),
    
    ('SP031', 'iPhone 12', 25000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\den.webp', 'Đen', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP12'),
    ('SP032', 'iPhone 12', 25000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\do.webp', 'Đỏ', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP12'),
    ('SP033', 'iPhone 12', 25000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\tim.webp', 'Tím', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP12'),
    ('SP034', 'iPhone 12', 25000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\trang.webp', 'Trắng', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP12'),
    ('SP035', 'iPhone 12', 25000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\xanh.webp', 'Xanh', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP12'),
    ('SP036', 'iPhone 12', 25000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\xanhla.webp', 'Xanh lá', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '512 GB', 0, 'IP12'),
    
	('SP037', 'iPhone 12 Mini', 22000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\den.webp', 'Đen', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP12'),
    ('SP038', 'iPhone 12 Mini', 22000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\do.webp', 'Đỏ', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '64 GB', 0, 'IP12'),
    ('SP039', 'iPhone 12 Mini', 22000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\tim.webp', 'Tím', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP12'),
    ('SP040', 'iPhone 12 Mini', 22000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\trang.webp', 'Trắng', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP12'),
    ('SP041', 'iPhone 12 Mini', 22000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\xanh.webp', 'Xanh', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP12'),
    ('SP042', 'iPhone 12 Mini', 22000000, 80, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12\xanhla.webp', 'Xanh lá', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP12'),
    
	('SP043', 'iPhone 12 Pro', 30000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12pro\xam.webp', 'Xám', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP12'),
    ('SP044', 'iPhone 12 Pro', 30000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12pro\trang.webp', 'Trắng', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP12'),
    ('SP045', 'iPhone 12 Pro', 30000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12pro\vang.webp', 'Vàng', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP12'),
    ('SP046', 'iPhone 12 Pro', 30000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12pro\xanh.webp', 'Xanh', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP12'),
    
	('SP047', 'iPhone 12 Pro Max', 33000000, 50, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12pro\xam.webp', 'Xám', 'A14 Bionic', '3687 mAh', '6.7 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP12'),
    ('SP048', 'iPhone 12 Pro Max', 33000000, 50, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12pro\trang.webp', 'Trắng', 'A14 Bionic', '3687 mAh', '6.7 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP12'),
    ('SP049', 'iPhone 12 Pro Max', 33000000, 50, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12pro\vang.webp', 'Vàng', 'A14 Bionic', '3687 mAh', '6.7 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP12'),
    ('SP050', 'iPhone 12 Pro Max', 33000000, 50, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\12\12pro\xanh.webp', 'Xanh', 'A14 Bionic', '3687 mAh', '6.7 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP12'),
    
	('SP051', 'iPhone 13', 33000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\den.webp', 'Đen', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP13'),
    ('SP052', 'iPhone 13', 33000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\do.webp', 'Đỏ', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP13'),
    ('SP053', 'iPhone 13', 33000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\hong.webp', 'Hồng', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP13'),
    ('SP054', 'iPhone 13', 33000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\trang.webp', 'Trắng', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP13'),
    ('SP055', 'iPhone 13', 33000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\xanh.webp', 'Xanh', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '512 GB', 0, 'IP13'),
    ('SP056', 'iPhone 13', 33000000, 100, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\xanhla.webp', 'Xanh lá', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '512 GB', 0, 'IP13'),
    
	('SP057', 'iPhone 13 Mini', 29000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\den.webp', 'Đen', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP13'),
    ('SP058', 'iPhone 13 Mini', 29000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\do.webp', 'Đỏ', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '128 GB', 0, 'IP13'),
    ('SP059', 'iPhone 13 Mini', 29000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\hong.webp', 'Hồng', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP13'),
    ('SP060', 'iPhone 13 Mini', 29000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\trang.webp', 'Trắng', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP13'),
    ('SP061', 'iPhone 13 Mini', 29000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\xanh.webp', 'Xanh', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '256 GB', 0, 'IP13'),
    ('SP062', 'iPhone 13 Mini', 29000000, 70, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13\xanhla.webp', 'Xanh lá', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '4 GB', '512 GB', 0, 'IP13'),
    
	('SP063', 'iPhone 13 Pro', 40000000, 60, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\trang.webp', 'Trắng', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP13'),
    ('SP064', 'iPhone 13 Pro', 40000000, 60, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\vang.webp', 'Vàng', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP13'),
    ('SP065', 'iPhone 13 Pro', 40000000, 60, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\xanh.webp', 'Xanh', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP13'),
    ('SP066', 'iPhone 13 Pro', 40000000, 60, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\xam.webp', 'Xám', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP13'),
    ('SP067', 'iPhone 13 Pro', 40000000, 60, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\xanhla.webp', 'Xanh lá', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP13'),
    
	('SP068', 'iPhone 13 Pro Max', 45000000, 40, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\trang.webp', 'Trắng', 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP13'),
	('SP069', 'iPhone 13 Pro Max', 45000000, 40, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\vang.webp', 'Vàng', 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP13'),
	('SP070', 'iPhone 13 Pro Max', 45000000, 40, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\xanh.webp', 'Xanh' , 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP13'),
	('SP071', 'iPhone 13 Pro Max', 45000000, 40, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\xam.webp', 'Xám', 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP13'),
	('SP0711', 'iPhone 13 Pro Max', 45000000, 40, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\13\13pro\xanhla.webp', 'Xanh lá', 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP13'),

	('SP072', 'iPhone 14', 55000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14\den.webp', 'den', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP14'),
    ('SP073', 'iPhone 14', 55000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14\do.webp', 'Đỏ', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP14'),
    ('SP074', 'iPhone 14', 55000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14\tim.webp', 'Tím', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP14'),
    ('SP075', 'iPhone 14', 55000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14\trang.webp', 'Trắng', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP14'),
    ('SP076', 'iPhone 14', 55000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14\xanh.webp', 'Xanh', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP14'),

	('SP077', 'iPhone 14 Plus', 60000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14plus\den.webp', 'Đen', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP14'),
    ('SP078', 'iPhone 14 Plus', 60000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14plus\do.webp', 'Đỏ', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '128 GB', 0, 'IP14'),
    ('SP079', 'iPhone 14 Plus', 60000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14plus\tim.webp', 'Tím', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP14'),
    ('SP080', 'iPhone 14 Plus', 60000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14plus\trang.webp', 'Trắng', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '256 GB', 0, 'IP14'),
    ('SP081', 'iPhone 14 Plus', 60000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14plus\xanh.webp', 'Xanh', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '6 GB', '512 GB', 0, 'IP14'),
    
	('SP082', 'iPhone 14 Pro', 65000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14pro\tim.webp', 'Tím', 'A16 Bionic', '4500 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '128 GB', 0, 'IP14'),
	('SP083', 'iPhone 14 Pro', 65000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14pro\trang.webp', 'Trắng', 'A16 Bionic', '4500 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '256 GB', 0, 'IP14'),
	('SP084', 'iPhone 14 Pro', 65000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14pro\vang.webp', 'Vàng', 'A16 Bionic', '4500 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '512 GB', 0, 'IP14'),
	('SP085', 'iPhone 14 Pro', 65000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14pro\xam.webp', 'Xám', 'A16 Bionic', '4500 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '512 GB', 0, 'IP14'),
	
	('SP086', 'iPhone 14 Pro Max', 60000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14pro\tim.webp', 'Tím', 'A16 Bionic', '4200 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '128 GB', 0, 'IP14'),
    ('SP087', 'iPhone 14 Pro Max', 60000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14pro\trang.webp', 'Trắng', 'A16 Bionic', '4200 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '256 GB', 0, 'IP14'),
    ('SP088', 'iPhone 14 Pro Max', 60000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14pro\vang.webp', 'Vàng', 'A16 Bionic', '4200 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '256 GB', 0, 'IP14'),
    ('SP089', 'iPhone 14 Pro Max', 60000000, 10, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\14\14pro\xam.webp', 'Xám', 'A16 Bionic', '4200 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '512 GB', 0, 'IP14'),
		      
	('SP090', 'iPhone 15', 70000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\den.webp', 'Đen', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '512 GB', 0, 'IP15'),
    ('SP091', 'iPhone 15', 70000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\hong.webp', 'Hồng', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '128 GB', 0, 'IP15'),
    ('SP092', 'iPhone 15', 70000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\vang.webp', 'Vàng', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '128 GB', 0, 'IP15'),
    ('SP093', 'iPhone 15', 70000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\xanh.webp', 'Xanh', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '512 GB', 0, 'IP15'),
    ('SP094', 'iPhone 15', 70000000, 8, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\xanhla.webp', 'Xanh lá', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '256 GB', 0, 'IP15'),
    
	('SP095', 'iPhone 15 Plus', 75000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\den.webp', 'Đen', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '1 TB', 0, 'IP15'),
    ('SP096', 'iPhone 15 Plus', 75000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\hong.webp', 'Hồng', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '128 GB', 0, 'IP15'),
    ('SP097', 'iPhone 15 Plus', 75000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\vang.webp', 'Vàng', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '256 GB', 0, 'IP15'),
    ('SP098', 'iPhone 15 Plus', 75000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\xanh.webp', 'Xanh', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '256 GB', 0, 'IP15'),
    ('SP099', 'iPhone 15 Plus', 75000000, 6, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15\xanhla.webp', 'Xanh lá', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '8 GB', '512 GB', 0, 'IP15'),
    
	('SP100', 'iPhone 15 Pro', 80000000, 5, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15pro\den.webp', 'Đen', 'A17 Bionic', '5000 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '12 GB', '1 TB', 0, 'IP15'),
    ('SP101', 'iPhone 15 Pro', 80000000, 5, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15pro\den.webp', 'Titan', 'A17 Bionic', '5000 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '12 GB', '128 GB', 0, 'IP15'),
    ('SP102', 'iPhone 15 Pro', 80000000, 5, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15pro\trang.webp', 'Trắng', 'A17 Bionic', '5000 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '12 GB', '256GB', 0, 'IP15'),
    ('SP103', 'iPhone 15 Pro', 80000000, 5, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15pro\xanh.webp', 'Xanh', 'A17 Bionic', '5000 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '12 GB', '512 GB', 0, 'IP15'),
    
	('SP104', 'iPhone 15 Pro Max', 85000000, 3, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15pro\den.webp', 'Đen', 'A17 Bionic', '5200 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '12 GB', '128 GB', 0, 'IP15'),
	('SP105', 'iPhone 15 Pro Max', 85000000, 3, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15pro\den.webp', 'Titan', 'A17 Bionic', '5200 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '12 GB', '256 GB', 0, 'IP15'),
	('SP106', 'iPhone 15 Pro Max', 85000000, 3, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15pro\trang.webp', 'Trắng', 'A17 Bionic', '5200 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '12 GB', '512 GB', 0, 'IP15'),
	('SP107', 'iPhone 15 Pro Max', 85000000, 3, 'D:\University\Second year\2nd Semester\Java\MobileStore\Image\15\15pro\xanh.webp', 'Xanh', 'A17 Bionic', '5200 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 tháng', '12 GB', '1 TB', 0, 'IP15');
