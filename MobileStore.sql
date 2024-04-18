CREATE TABLE SanPham
(
	IDSanPham nchar(10) primary key,
	tenSanPham nvarchar(50),
	giaBan int,
	giaNhap int,
	soLuong int,
	hinhAnh nchar(100),
	mauSac nvarchar(50),
	chip nchar(50),
	pin nchar(50),
	manHinh nchar(50),
	phienBanHDH nchar(50),
	cameraSau nchar(50),
	cameraTruoc nchar(50),
	ram nchar(50),
	rom nchar(50),
	isDelete int
)




-- Chèn dữ liệu cho các sản phẩm iPhone từ iPhone X đến iPhone 15 Pro Max
INSERT INTO SanPham (IDSanPham, tenSanPham, giaBan, giaNhap, soLuong, hinhAnh, mauSac, chip, pin, manHinh, phienBanHDH, cameraSau, cameraTruoc, ram, rom, isDelete)
VALUES
    ('SP001', 'iPhone X', 10000000, 8000000, 100, 'Image\X\X\xam.webp', 'Xám', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '4 GB', '64 GB', 0),
	('SP002', 'iPhone X', 10000000, 8000000, 100, 'Image\X\X\trang.webp', 'Trắng', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '4 GB', '64 GB', 0),
    ('SP003', 'iPhone X', 10000000, 8000000, 100, 'Image\X\X\xam.webp', 'Xám', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '4 GB', '256 GB', 0),
	('SP004', 'iPhone X', 10000000, 8000000, 100, 'Image\X\X\trang.webp', 'Trắng', 'A11 Bionic', '2716 mAh', '5.8 inches', 'iOS 11', '12 MP', '7 MP', '4 GB', '256 GB', 0),  

	('SP005', 'iPhone XR', 12000000,  100000000, 150, 'Image\X\XR\cam.webp', 'Cam', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '64 GB', 0),
    ('SP006', 'iPhone XR', 12000000,  100000000, 150, 'Image\X\XR\den.webp', 'Đen', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '128 GB', 0),
    ('SP007', 'iPhone XR', 12000000,  100000000, 150, 'Image\X\XR\do.webp', 'Đỏ', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '256 GB', 0),
    ('SP008', 'iPhone XR', 12000000,  100000000, 150, 'Image\X\XR\trang.webp', 'Trắng', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '64 GB', 0),
    ('SP009', 'iPhone XR', 12000000,  100000000, 150, 'Image\X\XR\vang.webp', 'Vàng', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '128 GB', 0),
    ('SP010', 'iPhone XR', 12000000,  100000000, 150, 'Image\X\XR\xanh.webp', 'Xanh', 'A12 Bionic', '2942 mAh', '6.1 inches', 'iOS 12', '12 MP', '7 MP', '3 GB', '256 GB', 0),
    
	('SP011', 'iPhone XS', 15000000,  13000000, 80, 'Image\X\XS\vang.webp', 'Vàng', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '64 GB', 0),
    ('SP012', 'iPhone XS', 15000000,  13000000, 80, 'Image\X\XS\trang.webp', 'Trắng', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '256 GB', 0),
    ('SP013', 'iPhone XS', 15000000,  13000000, 80, 'Image\X\XS\xam.webp', 'Xám', 'A12 Bionic', '2658 mAh', '5.8 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '128 GB', 0),
    
	('SP014', 'iPhone XS Max', 17000000,  15000000, 70, 'Image\X\XSM\trang.webp', 'Trắng', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '64 GB', 0),
    ('SP015', 'iPhone XS Max', 17000000,  15000000, 70, 'Image\X\XSM\xam.webp', 'Xám', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '1028 GB', 0),
    ('SP016', 'iPhone XS Max', 17000000,  15000000, 70, 'Image\X\XSM\vang.webp', 'Vàng', 'A12 Bionic', '3174 mAh', '6.5 inches', 'iOS 12', '12 MP + 12 MP', '7 MP', '4 GB', '256 GB', 0),
    
	('SP017', 'iPhone 11', 18000000,  16000000, 120, 'Image\11\11\den.webp', 'Đen', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP018', 'iPhone 11', 18000000,  16000000, 120, 'Image\11\11\do.webp', 'Đỏ', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP019', 'iPhone 11', 18000000,  16000000, 120, 'Image\11\11\tim.webp', 'Tím', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP020', 'iPhone 11', 18000000,  16000000, 120, 'Image\11\11\trang.webp', 'Trắng', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP021', 'iPhone 11', 18000000,  16000000, 120, 'Image\11\11\vang.webp', 'Vàng', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP022', 'iPhone 11', 18000000,  16000000, 120, 'Image\11\11\xanh.webp', 'Xanh', 'A13 Bionic', '3110 mAh', '6.1 inches', 'iOS 13', '12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    
	('SP023', 'iPhone 11 Pro', 22000000, 20000000, 90, 'Image\11\11pro\trang.webp', 'Trắng', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP024', 'iPhone 11 Pro', 22000000, 20000000, 90, 'Image\11\11pro\vang.webp', 'Vàng', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP025', 'iPhone 11 Pro', 22000000, 20000000, 90, 'Image\11\11pro\xam.webp', 'Xám', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP026', 'iPhone 11 Pro', 22000000, 20000000, 90, 'Image\11\11pro\xanh.webp', 'Xanh', 'A13 Bionic', '3046 mAh', '5.8 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '512 GB', 0),
    
	('SP027', 'iPhone 11 Pro Max', 25000000, 23000000, 90, 'Image\11\11prm\trang.webp', 'Trắng', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP028', 'iPhone 11 Pro Max', 25000000, 23000000, 90, 'Image\11\11prm\vang.webp', 'Vàng', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP029', 'iPhone 11 Pro Max', 25000000, 23000000, 90, 'Image\11\11prm\xam.webp', 'Xám', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP030', 'iPhone 11 Pro Max', 25000000, 23000000, 90, 'Image\11\11prm\xanh.webp', 'Xanh', 'A13 Bionic', '3046 mAh', '6.5 inches', 'iOS 13', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '512 GB', 0),
    
    ('SP031', 'iPhone 12', 25000000, 23000000, 100, 'Image\12\12\den.webp', 'Đen', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP032', 'iPhone 12', 25000000, 23000000, 100, 'Image\12\12\do.webp', 'Đỏ', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP033', 'iPhone 12', 25000000, 23000000, 100, 'Image\12\12\tim.webp', 'Tím', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP034', 'iPhone 12', 25000000, 23000000, 100, 'Image\12\12\trang.webp', 'Trắng', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP035', 'iPhone 12', 25000000, 23000000, 100, 'Image\12\12\xanh.webp', 'Xanh', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP036', 'iPhone 12', 25000000, 23000000, 100, 'Image\12\12\xanhla.webp', 'Xanh lá', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '512 GB', 0),
    
	('SP037', 'iPhone 12 Mini', 22000000, 20000000, 80, 'Image\12\12\den.webp', 'Đen', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP038', 'iPhone 12 Mini', 22000000, 20000000, 80, 'Image\12\12\do.webp', 'Đỏ', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '64 GB', 0),
    ('SP039', 'iPhone 12 Mini', 22000000, 20000000, 80, 'Image\12\12\tim.webp', 'Tím', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP040', 'iPhone 12 Mini', 22000000, 20000000, 80, 'Image\12\12\trang.webp', 'Trắng', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP041', 'iPhone 12 Mini', 22000000, 20000000, 80, 'Image\12\12\xanh.webp', 'Xanh', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP042', 'iPhone 12 Mini', 22000000, 20000000, 80, 'Image\12\12\xanhla.webp', 'Xanh lá', 'A14 Bionic', '2227 mAh', '5.4 inches', 'iOS 14', '12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    
	('SP043', 'iPhone 12 Pro', 30000000, 27000000, 70, 'Image\12\12pro\xam.webp', 'Xám', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
    ('SP044', 'iPhone 12 Pro', 30000000, 27000000, 70, 'Image\12\12pro\trang.webp', 'Trắng', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
    ('SP045', 'iPhone 12 Pro', 30000000, 27000000, 70, 'Image\12\12pro\vang.webp', 'Vàng', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),
    ('SP046', 'iPhone 12 Pro', 30000000, 27000000, 70, 'Image\12\12pro\xanh.webp', 'Xanh', 'A14 Bionic', '2815 mAh', '6.1 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),
    
	('SP047', 'iPhone 12 Pro Max', 33000000, 27000000, 50, 'Image\12\12pro\xam.webp', 'Xám', 'A14 Bionic', '3687 mAh', '6.7 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
    ('SP048', 'iPhone 12 Pro Max', 33000000, 27000000, 50, 'Image\12\12pro\trang.webp', 'Trắng', 'A14 Bionic', '3687 mAh', '6.7 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),
    ('SP049', 'iPhone 12 Pro Max', 33000000, 27000000, 50, 'Image\12\12pro\vang.webp', 'Vàng', 'A14 Bionic', '3687 mAh', '6.7 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),
    ('SP050', 'iPhone 12 Pro Max', 33000000, 27000000, 50, 'Image\12\12pro\xanh.webp', 'Xanh', 'A14 Bionic', '3687 mAh', '6.7 inches', 'iOS 14', '12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),
    
	('SP051', 'iPhone 13', 33000000, 29000000, 100, 'Image\13\13\den.webp', 'Đen', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP052', 'iPhone 13', 33000000, 29000000, 100, 'Image\13\13\do.webp', 'Đỏ', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP053', 'iPhone 13', 33000000, 29000000, 100, 'Image\13\13\hong.webp', 'Hồng', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP054', 'iPhone 13', 33000000, 29000000, 100, 'Image\13\13\trang.webp', 'Trắng', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP055', 'iPhone 13', 33000000, 29000000, 100, 'Image\13\13\xanh.webp', 'Xanh', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '512 GB', 0),
    ('SP056', 'iPhone 13', 33000000, 29000000, 100, 'Image\13\13\xanhla.webp', 'Xanh lá', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '512 GB', 0),
    
	('SP057', 'iPhone 13 Mini', 29000000, 27000000, 70, 'Image\13\13\den.webp', 'Đen', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP058', 'iPhone 13 Mini', 29000000, 27000000, 70, 'Image\13\13\do.webp', 'Đỏ', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '128 GB', 0),
    ('SP059', 'iPhone 13 Mini', 29000000, 27000000, 70, 'Image\13\13\hong.webp', 'Hồng', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP060', 'iPhone 13 Mini', 29000000, 27000000, 70, 'Image\13\13\trang.webp', 'Trắng', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP061', 'iPhone 13 Mini', 29000000, 27000000, 70, 'Image\13\13\xanh.webp', 'Xanh', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '256 GB', 0),
    ('SP062', 'iPhone 13 Mini', 29000000, 27000000, 70, 'Image\13\13\xanhla.webp', 'Xanh lá', 'A15 Bionic', '2406 mAh', '5.4 inches', 'iOS 15', '12 MP + 12 MP + 12 MP', '12 MP', '4 GB', '512 GB', 0),
    
	('SP063', 'iPhone 13 Pro', 40000000, 36000000, 60, 'Image\13\13pro\trang.webp', 'Trắng', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
    ('SP064', 'iPhone 13 Pro', 40000000, 36000000, 60, 'Image\13\13pro\vang.webp', 'Vàng', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
    ('SP065', 'iPhone 13 Pro', 40000000, 36000000, 60, 'Image\13\13pro\xanh.webp', 'Xanh', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),
    ('SP066', 'iPhone 13 Pro', 40000000, 36000000, 60, 'Image\13\13pro\xam.webp', 'Xám', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),
    ('SP067', 'iPhone 13 Pro', 40000000, 36000000, 60, 'Image\13\13pro\xanhla.webp', 'Xanh lá', 'A15 Bionic', '3095 mAh', '6.1 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),
    
	('SP068', 'iPhone 13 Pro Max', 45000000, 40000000, 40, 'Image\13\13pro\trang.webp', 'Trắng', 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
	('SP069', 'iPhone 13 Pro Max', 45000000, 40000000, 40, 'Image\13\13pro\vang.webp', 'Vàng', 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
	('SP070', 'iPhone 13 Pro Max', 45000000, 40000000, 40, 'Image\13\13pro\xanh.webp', 'Xanh' , 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),
	('SP071', 'iPhone 13 Pro Max', 45000000, 40000000, 40, 'Image\13\13pro\xam.webp', 'Xám', 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),
	('SP0711', 'iPhone 13 Pro Max', 45000000, 40000000, 40, 'Image\13\13pro\xanhla.webp', 'Xanh lá', 'A15 Bionic', '4352 mAh', '6.7 inches', 'iOS 15', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),

	('SP072', 'iPhone 14', 55000000, 50000000, 10, 'Image\14\14\den.webp', 'den', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),
    ('SP073', 'iPhone 14', 55000000, 50000000, 10, 'Image\14\14\do.webp', 'Đỏ', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
    ('SP074', 'iPhone 14', 55000000, 50000000, 10, 'Image\14\14\tim.webp', 'Tím', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),
    ('SP075', 'iPhone 14', 55000000, 50000000, 10, 'Image\14\14\trang.webp', 'Trắng', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
    ('SP076', 'iPhone 14', 55000000, 50000000, 10, 'Image\14\14\xanh.webp', 'Xanh', 'A16 Bionic', '4100 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),

	('SP077', 'iPhone 14 Plus', 60000000, 56000000, 18, 'Image\14\14plus\den.webp', 'Đen', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),
    ('SP078', 'iPhone 14 Plus', 60000000, 56000000, 18, 'Image\14\14plus\do.webp', 'Đỏ', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '128 GB', 0),
    ('SP079', 'iPhone 14 Plus', 60000000, 56000000, 18, 'Image\14\14plus\tim.webp', 'Tím', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),
    ('SP080', 'iPhone 14 Plus', 60000000, 56000000, 18, 'Image\14\14plus\trang.webp', 'Trắng', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '256 GB', 0),
    ('SP081', 'iPhone 14 Plus', 60000000, 56000000, 18, 'Image\14\14plus\xanh.webp', 'Xanh', 'A16 Bionic', '4300 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '6 GB', '512 GB', 0),
    
	('SP082', 'iPhone 14 Pro', 65000000, 60000000, 16, 'Image\14\14pro\tim.webp', 'Tím', 'A16 Bionic', '4500 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '128 GB', 0),
	('SP083', 'iPhone 14 Pro', 65000000, 60000000, 16, 'Image\14\14pro\trang.webp', 'Trắng', 'A16 Bionic', '4500 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '256 GB', 0),
	('SP084', 'iPhone 14 Pro', 65000000, 60000000, 16, 'Image\14\14pro\vang.webp', 'Vàng', 'A16 Bionic', '4500 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '512 GB', 0),
	('SP085', 'iPhone 14 Pro', 65000000, 60000000, 16, 'Image\14\14pro\xam.webp', 'Xám', 'A16 Bionic', '4500 mAh', '6.1 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '512 GB', 0),
	
	('SP086', 'iPhone 14 Pro Max', 60000000, 56000000, 10, 'Image\14\14pro\tim.webp', 'Tím', 'A16 Bionic', '4200 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '128 GB', 0),
    ('SP087', 'iPhone 14 Pro Max', 60000000, 56000000, 10, 'Image\14\14pro\trang.webp', 'Trắng', 'A16 Bionic', '4200 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '256 GB', 0),
    ('SP088', 'iPhone 14 Pro Max', 60000000, 56000000, 10, 'Image\14\14pro\vang.webp', 'Vàng', 'A16 Bionic', '4200 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '256 GB', 0),
    ('SP089', 'iPhone 14 Pro Max', 60000000, 56000000, 10, 'Image\14\14pro\xam.webp', 'Xám', 'A16 Bionic', '4200 mAh', '6.7 inches', 'iOS 16', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '512 GB', 0),
		      
	('SP090', 'iPhone 15', 70000000, 65000000, 8, 'Image\15\15\den.webp', 'Đen', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '512 GB', 0),
    ('SP091', 'iPhone 15', 70000000, 65000000, 8, 'Image\15\15\hong.webp', 'Hồng', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '128 GB', 0),
    ('SP092', 'iPhone 15', 70000000, 65000000, 8, 'Image\15\15\vang.webp', 'Vàng', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '128 GB', 0),
    ('SP093', 'iPhone 15', 70000000, 65000000, 8, 'Image\15\15\xanh.webp', 'Xanh', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '512 GB', 0),
    ('SP094', 'iPhone 15', 70000000, 65000000, 8, 'Image\15\15\xanhla.webp', 'Xanh lá', 'A17 Bionic', '4500 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '256 GB', 0),
    
	('SP095', 'iPhone 15 Plus', 75000000, 70000000, 6, 'Image\15\15\den.webp', 'Đen', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '1 TB', 0),
    ('SP096', 'iPhone 15 Plus', 75000000, 70000000, 6, 'Image\15\15\hong.webp', 'Hồng', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '128 GB', 0),
    ('SP097', 'iPhone 15 Plus', 75000000, 70000000, 6, 'Image\15\15\vang.webp', 'Vàng', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '256 GB', 0),
    ('SP098', 'iPhone 15 Plus', 75000000, 70000000, 6, 'Image\15\15\xanh.webp', 'Xanh', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '256 GB', 0),
    ('SP099', 'iPhone 15 Plus', 75000000, 70000000, 6, 'Image\15\15\xanhla.webp', 'Xanh lá', 'A17 Bionic', '4800 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '8 GB', '512 GB', 0),
    
	('SP100', 'iPhone 15 Pro', 80000000, 75000000, 5, 'Image\15\15pro\den.webp', 'Đen', 'A17 Bionic', '5000 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 GB', '1 TB', 0),
    ('SP101', 'iPhone 15 Pro', 80000000, 75000000, 5, 'Image\15\15pro\den.webp', 'Titan', 'A17 Bionic', '5000 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 GB', '128 GB', 0),
    ('SP102', 'iPhone 15 Pro', 80000000, 75000000, 5, 'Image\15\15pro\trang.webp', 'Trắng', 'A17 Bionic', '5000 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 GB', '256GB', 0),
    ('SP103', 'iPhone 15 Pro', 80000000, 75000000, 5, 'Image\15\15pro\xanh.webp', 'Xanh', 'A17 Bionic', '5000 mAh', '6.1 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 GB', '512 GB', 0),
    
	('SP104', 'iPhone 15 Pro Max', 85000000, 80000000, 3, 'Image\15\15pro\den.webp', 'Đen', 'A17 Bionic', '5200 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 GB', '128 GB', 0),
	('SP105', 'iPhone 15 Pro Max', 85000000, 80000000, 3, 'Image\15\15pro\den.webp', 'Titan', 'A17 Bionic', '5200 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 GB', '256 GB', 0),
	('SP106', 'iPhone 15 Pro Max', 85000000, 80000000, 3, 'Image\15\15pro\trang.webp', 'Trắng', 'A17 Bionic', '5200 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 GB', '512 GB', 0),
	('SP107', 'iPhone 15 Pro Max', 85000000, 80000000, 3, 'Image\15\15pro\xanh.webp', 'Xanh', 'A17 Bionic', '5200 mAh', '6.7 inches', 'iOS 17', '12 MP + 12 MP + 12 MP + 12 MP', '12 MP', '12 GB', '1 TB', 0);



create table KhachHang
(
	IDKhachHang nchar(10) primary key,
	tenKhachHang nvarchar(50),
	diaChi nvarchar(50),
	sdt nvarchar(50)
)

INSERT INTO KhachHang (IDKhachHang, tenKhachHang, diaChi, sdt)
VALUES
    ('KH001', N'Nguyễn Văn A', N'123 Đường ABC', '0123456789'),
    ('KH002', N'Trần Thị B', N'456 Đường XYZ', '0987654321'),
    ('KH003', N'Lê Văn C', N'789 Đường MNO', '0369852147'),
    ('KH004', N'Phạm Thị D', N'321 Đường PQR', '0123456789'),
    ('KH005', N'Hoàng Văn E', N'654 Đường UVW', '0987654321'),
    ('KH006', N'Nguyễn Thị F', N'987 Đường DEF', '0369852147'),
    ('KH007', N'Trần Văn G', N'159 Đường GHI', '0123456789'),
    ('KH008', N'Lê Thị H', N'357 Đường JKL', '0987654321'),
    ('KH009', N'Phạm Văn I', N'753 Đường STU', '0369852147'),
    ('KH010', N'Hoàng Thị K', N'852 Đường VWX', '0123456789'),
    ('KH011', N'Nguyễn Văn L', N'456 Đường YZA', '0987654321'),
    ('KH012', N'Trần Thị M', N'789 Đường BCD', '0369852147'),
    ('KH013', N'Lê Văn N', N'123 Đường EFG', '0123456789'),
    ('KH014', N'Phạm Thị O', N'654 Đường HIJ', '0987654321'),
    ('KH015', N'Hoàng Văn P', N'987 Đường KLM', '0369852147'),
    ('KH016', N'Nguyễn Thị Q', N'321 Đường NOP', '0123456789'),
    ('KH017', N'Trần Văn R', N'159 Đường QRS', '0987654321'),
    ('KH018', N'Lê Thị S', N'357 Đường TUV', '0369852147'),
    ('KH019', N'Phạm Văn T', N'753 Đường WXY', '0123456789'),
    ('KH020', N'Hoàng Thị U', N'852 Đường ZAB', '0987654321');


create table NhanVien
(
	IDNhanVien nchar(10) primary key,
	tenNhanVien nvarchar(50),
	gioiTinh nvarchar(50),
	ngaySinh date,
	sdt nvarchar(50)
)

INSERT INTO NhanVien (IDNhanVien, tenNhanVien, gioiTinh, ngaySinh, sdt)
VALUES
    ('NV001', N'Nguyễn Văn A', N'Nam', '1990-01-01', '0123456789'),
    ('NV002', N'Trần Thị B', N'Nữ', '1995-02-02', '0987654321'),
    ('NV003', N'Lê Văn C', N'Nam', '1985-03-03', '0369852147'),
    ('NV004', N'Phạm Thị D', N'Nữ', '1992-04-04', '0123456789'),
    ('NV005', N'Hoàng Văn E', N'Nam', '1997-05-05', '0987654321'),
    ('NV006', N'Nguyễn Thị F', N'Nữ', '1988-06-06', '0369852147'),
    ('NV007', N'Trần Văn G', N'Nam', '1993-07-07', '0123456789'),
    ('NV008', N'Lê Thị H', N'Nữ', '1991-08-08', '0987654321'),
    ('NV009', N'Phạm Văn I', N'Nam', '1989-09-09', '0369852147'),
    ('NV010', N'Hoàng Thị K', N'Nữ', '1994-10-10', '0123456789');

