USE QLBH_DIENMAYDO1
GO

INSERT INTO KHUYENMAI
VALUES  ('KM001' ,N'Ngày 11-11',N'Giảm theo tiền','2021-01-01','2021-01-02',500000, N'Hết Hạn',N'No Mô Tả'),
		('KM002' ,N'Ngày 11-11',N'Giảm theo %','2021-02-02','2021-02-03',50,N'Hết hạn',N'No Mô Tả'),
		('KM003' ,N'Ngày 11-11',N'Giảm theo %','2021-12-01','2021-12-20',10,N'Đang áp dụng',N'No Mô Tả'),
		('KM004' ,N'Ngày 11-11',N'Giảm theo tiền','2021-12-01','2021-12-20',200000,N'Đang áp dụng',N'No Mô Tả'),
		('KM005' ,N'Ngày 11-11',N'Giảm theo %','2021-12-01','2021-12-20',20,N'Đang áp dụng',N'No Mô Tả')

INSERT INTO DANHMUC
VALUES  ('DM001', N'Tivi,Loa,Dàn Karaoke',1, N'...'),
		('DM002', N'Tủ lạnh, Tủ đông, Tủ mát',1, N'...'),
		('DM003', N'Máy giặt, Sấy quần áo',1, N'...'),
		('DM004', N'Máy lạnh, Quạt điều hòa',1, N'...'),
		('DM005', N'Điện gia dụng, Dụng cụ',1, N'...'),
		('DM006', N'Đồ dùng nhà bếp',1, N'...'),
		('DM007', N'Lọc nước, Máy nước nóng',1, N'...'),
		('DM008', N'Điện thoại, Laptop, Tablet',1, N'...'),
		('DM009', N'Phụ kiện, Đồng hồ',1, N'...')


INSERT INTO NHANVIEN
VALUES  ('NV001','123', N'Thiều Quang Vinh', N'Thanh Hóa', '0986765543', 1, '2002-08-19',1,'vinhtqph13704@fpt.edu.vn',1),
		('NV002','123', N'Đỗ Tất Hòa', N'Thanh Hóa', '0457392734', 1, '2002-09-21',1,'hoadtph13703@fpt.edu.vn',1),
		('NV003','123', N'Nguyễn Viết Hiên', N'Bắc Ninh', '0875647583', 1, '2002-01-01',1,'hiennvph13697@fpt.edu.vn',1),
		('NV004','123', N'Lê Thị Ngọc Thúy', N'Hà Nội', '0764536273', 0, '1998-02-02',0,'thuyltnph13652@fpt.edu.vn',1),
		('NV005','123', N'Lê Thành Vinh', N'Hà Nội', '0123456789', 1, '1998-03-03',0,'vinhltph13651@fpt.edu.vn',1),
		('NV006','123', N'Nguyễn Hồng Sơn', N'Hải Dương', '0674347859', 1, '2002-04-04',0,'sonnhph13627@fpt.edu.vn',1)


INSERT INTO XUATXU
VALUES  (N'NSX Đông Sơn', N'Việt Nam'),
		(N'NSX Triều Tiên', N'Trung Quốc'),
		(N'NSX New York', N'Anh'),
		(N'NSX Saitama', N'Nhật Bản'),
		(N'NSX Seoul', N'Hàn Quốc')


INSERT INTO SANPHAM
VALUES  ('SP001','DM001', 1, N'Máy lạnh',1),
		('SP002','DM002',2, N'Loa Blooth',1),
		('SP003','DM003',3, N'Quạt điều hòa',1),
		('SP004','DM004',4, N'Máy giặt',1),
		('SP005','DM005',5,N'Tivi',1),
		('SP006','DM006',5, N'Tủ lạnh',1),
		('SP007','DM007',4, N'Máy hút bụi',1),
		('SP008','DM008',3, N'Lò vi sóng',1),
		('SP009','DM009',2, N'Bình nóng lạnh',1)


INSERT INTO KHACHHANG
VALUES	('KH00',N'Khách bán lẻ',1,'Not','Not',N'Not',1),
		('KH01',N'Võ Thị Sáu',1,'0389456758','sdhsa@gmail.com',N'Thanh Hóa',1),
		('KH02',N'Trịnh Thị Hoa',1,'0545465758','tring1323@gmail.com',N'Thanh Hóa',1),
		('KH03',N'Hoàng Hoa Thám',0,'0568587587','tham234@gmail.com',N'Thanh Hóa',1),
		('KH04',N'Nguyễn Thị Hoa',1,'0356856755','hoanguyen@gmail.com',N'Đà Nẵng',1),
		('KH05',N'Trần Văn Bình',0,'0385896758','binhgold123@gmail.com',N'Thái Nguyên',1),
		('KH06',N'Đỗ Thị Chanh',1,'0658456758','chanh987gmail.com',N'Hà Nội',1),
		('KH07',N'Nguyễn Văn Quân',0,'0956856758','quan235@gmail.com',N'Bắc Cạn',1),
		('KH08',N'Đỗ Thị Hải Anh',0,'0658946758','haianh365@gmail.com',N'Thái Bình',1),
		('KH09',N'Đường Huyền Trang',1,'0365494758','trang145@gmail.com',N'Bắc Ninh',1)

INSERT INTO TRANGTHAITHANHTOAN	
VALUES ('TT001',N'Chờ thanh toán'),
	   ('TT002',N'Đã Thanh toán'),
	   ('TT003',N'Đã hủy')

INSERT INTO HINHTHUCTHANHTOAN
VALUES ('HT001',N'Tiền mặt'),
	   ('HT002',N'Chuyển khoản'),
	   ('HT003',N'Quẹt thẻ')

INSERT INTO HINHTHUCGIAOHANG
VALUES ('GH001',N'Bán trực tiếp'),
	   ('GH002',N'Khác')

INSERT INTO HOADON
VALUES  ('NV001','KH01','TT002','HT001','GH001','2021-01-01',10000,7200000,7000000,N''),
		('NV002','KH02','TT002','HT001','GH001','2021-02-02',10000,1400000,1000000,N''),
		('NV003','KH03','TT002','HT002','GH001','2020-03-03',10000,7500000,7100000,N''),
		('NV004','KH04','TT002','HT001','GH001','2021-04-04',10000,4750000,4000000,N''),
		('NV005','KH05','TT002','HT001','GH001','2021-05-05',10000,8400000,8000000,N''),
		('NV006','KH06','TT002','HT002','GH001','2020-06-06',10000,4550000,4000000,N''),
		('NV001','KH07','TT002','HT001','GH001','2021-07-07',10000,2520000,2000000,N''),
		('NV002','KH08','TT002','HT003','GH001','2019-08-08',10000,105000,90000,N''),
		('NV003','KH09','TT002','HT001','GH001','2020-09-09',10000,750000,70000,N'')




INSERT INTO MAUSAC
VALUES  ('MS001', N'Trắng đen'),
		('MS002', N'Đen'),
		('MS003', N'Xám'),
		('MS004', N'Trắng'),
		('MS005', N'Xanh'),
        ('MS006', N'Vàng'),
		('MS007', N'Đỏ'),
		('MS008', N'Cam'),
		('MS009', N'Nâu'),
		('MS0010', N'Nâu bi'),
		('MS0011', N'Xanh thẫm'),
		('MS0012', N'Đỏ thẫm')


INSERT INTO DONVITINH
VALUES  ('KG', N'Kilogam'),
		('CM', N'Centimet')

INSERT INTO KICHTHUOC
VALUES  ('KT001', 'CM', 74, 25.5, 48.2),
		('KT002', 'CM', 30, 15.5, 14),
		('KT003', 'CM', 70, 30, 25.5),
		('KT004', 'CM', 80, 70.5, 104.7),
		('KT005', 'CM', 90, 5, 70),
		('KT006', 'CM', 70, 65, 150),
		('KT007', 'CM', 40, 20, 70),
		('KT008', 'CM', 50.5, 40, 30),
		('KT009', 'CM', 82, 20.5, 48.2)


INSERT INTO KHOILUONG
VALUES  ('KL001', 'KG', 25.5),
		('KL002', 'KG', 2),
		('KL003', 'KG', 18),
		('KL004', 'KG', 30.8),
		('KL005', 'KG', 10),
		('KL006', 'KG', 32.5),
		('KL007', 'KG', 5),
		('KL008', 'KG', 3),
		('KL009', 'KG', 26)


INSERT INTO THETICH
VALUES  ('TT001', 20),
		('TT002', 2),
		('TT003', 12),
		('TT004', 30),
		('TT005', 5),
		('TT006', 16),
		('TT007', 5),
		('TT008', 7),
		('TT009', 20)

		
INSERT INTO CHATLIEU
VALUES  ('CL001', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('CL002', N'Thép không gỉ'),
		('CL003', N'Kính nhựa'),
        ('CL004', N'Nhựa dẻo'),
		('CL005', N'Kim loại phủ sơn tĩnh điện'),
		('CL006', N'Kính cường lực'),
		('CL007', N'Sắt không gỉ')


INSERT INTO _IMAGE
VALUES  ('IME001', 'maylanh.png'),
		('IME002', 'loa.png'),
		('IME003', 'dieuhoa.png'),
		('IME004', 'maygiat.png'),
		('IME005', 'tivi.png'),
		('IME006', 'tulanh.png'),
		('IME007', 'mayhutbui.png'),
		('IME008', 'lovisong.png'),
		('IME009', 'binhnonglanh.png')


INSERT INTO SANPHAMCHITIET
VALUES  ('SPCT01', 'IME001', 'SP001', 'MS004', 'KT001', 'CL001', 'TT001', 'KL001',N'AH-X9XEW', 10, 0, 900000, 1200000,1, N'No Mô Tả'),
		('SPCT02', 'IME002', 'SP002', 'MS002', 'KT002', 'CL002', 'TT002', 'KL002',N'BM01', 10, 0, 100000, 200000,1, N'No Mô Tả'),
		('SPCT03', 'IME003', 'SP003', 'MS004', 'KT003', 'CL003', 'TT003', 'KL003',N'KG50F62', 10, 1, 950000, 1500000,1, N'No Mô Tả'),
		('SPCT04', 'IME004' , 'SP004', 'MS001', 'KT004', 'CL004', 'TT004', 'KL004',N'FV1409S4W', 10, 0, 800000, 950000,1, N'No Mô Tả'),
		('SPCT05', 'IME005', 'SP005', 'MS002', 'KT005', 'CL005', 'TT005', 'KL005',N'KD-43X75', 10, 0, 1700000, 2100000,1, N'No Mô Tả'),
		('SPCT06', 'IME006', 'SP006', 'MS001', 'KT006', 'CL006', 'TT006', 'KL006',N'Inverter NR-BC360QKVN', 10, 1, 400000, 650000,1, N'No Mô Tả'),
		('SPCT07', 'IME007', 'SP007', 'MS001', 'KT007', 'CL007', 'TT007', 'KL007',N'MC-CL575KN49 2000W', 10, 0, 100000, 280000,1, N'No Mô Tả'),
		('SPCT08', 'IME008', 'SP008', 'MS002', 'KT008', 'CL001', 'TT008', 'KL008',N'MG23K3575AS/SV-N', 10, 0, 120000, 250000,1, N'No Mô Tả'),
		('SPCT09', 'IME009', 'SP009', 'MS004', 'KT009', 'CL004', 'TT009', 'KL009',N'EWE451LB-DPX2', 10, 1, 90000, 150000,1, N'No Mô Tả'),
		('SPCT10', 'IME001', 'SP001', 'MS001', 'KT001', 'CL001', 'TT001', 'KL001',N'Inverter 1 HP AR10TYGCDWKNSV', 10, 0, 10090000, 12090000,1, N'No Mô Tả'),
		('SPCT11', 'IME001', 'SP001', 'MS002', 'KT002', 'CL002', 'TT001', 'KL002',N'RAS-H10E2KCVG-V', 10, 0, 11490000, 13490000,1, N'No Mô Tả'),
		('SPCT12', 'IME002', 'SP002', 'MS003', 'KT003', 'CL003', 'TT002', 'KL003',N'E8', 10, 0, 950000, 12500000,1, N'No Mô Tả'),
		('SPCT13', 'IME002', 'SP002', 'MS004', 'KT004', 'CL004', 'TT002', 'KL004',N'W5-Plus', 10, 0, 450000, 700000,1, N'No Mô Tả'),
		('SPCT14', 'IME003', 'SP003', 'MS005', 'KT005', 'CL001', 'TT003', 'KL005',N'DEL-AC07DR', 10, 0, 2300000, 3300000,1, N'No Mô Tả'),
		('SPCT15', 'IME003', 'SP003', 'MS006', 'KT006', 'CL002', 'TT003', 'KL006',N'FEAB-110', 10, 0, 6000000, 7000000,1, N'No Mô Tả'),
		('SPCT16', 'IME004', 'SP004', 'MS001', 'KT007', 'CL004', 'TT004', 'KL007',N'FV1450S3W2', 10, 0, 13000000, 15000000,1, N'No Mô Tả'),
		('SPCT17', 'IME004', 'SP004', 'MS002', 'KT008', 'CL003', 'TT004', 'KL008',N'FV1410S3B', 10, 0, 14900000, 16900000,1, N'No Mô Tả'),
		('SPCT18', 'IME005', 'SP005', 'MS008', 'KT009', 'CL001', 'TT005', 'KL009',N'UA32T4500', 10, 0, 9000000, 12000000,1, N'No Mô Tả'),
		('SPCT19', 'IME005', 'SP005', 'MS009', 'KT001', 'CL002', 'TT005', 'KL001',N'QA65Q65A', 10, 0, 32000000, 33000000,1, N'No Mô Tả'),
		('SPCT20', 'IME006', 'SP006', 'MS0010', 'KT002', 'CL004', 'TT006', 'KL002',N'RS62R5001B4/SV', 10, 0, 21900000, 23900000,1, N'No Mô Tả'),
		('SPCT21', 'IME006', 'SP006', 'MS0011', 'KT003', 'CL002', 'TT006', 'KL003',N'SJ-FX600V-SL', 10, 0, 31800000, 33800000,1, N'No Mô Tả'),
		('SPCT22', 'IME007', 'SP007', 'MS007', 'KT004', 'CL001', 'TT007', 'KL004',N'FC6728', 10, 0, 8990000, 9990000,1, N'No Mô Tả'),
		('SPCT23', 'IME007', 'SP007', 'MS0011', 'KT005', 'CL003', 'TT007', 'KL005',N'CM1300', 10, 0, 1420000, 1920000,1, N'No Mô Tả'),
		('SPCT24', 'IME008', 'SP008', 'MS002', 'KT006', 'CL001', 'TT008', 'KL006',N'MOB-7741', 10, 0, 2659000, 2999000,1, N'No Mô Tả'),
		('SPCT25', 'IME008', 'SP008', 'MS001', 'KT007', 'CL002', 'TT008', 'KL007',N'D90D25ETL-ZWA', 10, 0, 2800000, 3800000,1, N'No Mô Tả'),
		('SPCT26', 'IME009', 'SP009', 'MS008', 'KT008', 'CL001', 'TT009', 'KL008',N'EWE451GX-DWB', 10, 0, 2390000, 3390000,1, N'No Mô Tả'),
		('SPCT27', 'IME009', 'SP009', 'MS004', 'KT009', 'CL003', 'TT009', 'KL009',N'SM45E SBS VN', 10, 0, 2890000, 3690000,1, N'No Mô Tả')

INSERT INTO SANPHAMCHITIET_KHUYENMAI

VALUES  ('KM003', 'SPCT01'),
		('KM003', 'SPCT02'),
		('KM003', 'SPCT03'),
		('KM004', 'SPCT04'),
		('KM004', 'SPCT05'),
		('KM004', 'SPCT06'),
		('KM005', 'SPCT07'),
		('KM005', 'SPCT08'),
		('KM005', 'SPCT09')
INSERT INTO HOADONCHITIET
VALUES  ('SPCT01', 1, 6, 1200000),
		('SPCT02', 2, 7, 200000),
		('SPCT03', 3, 5, 1500000),
		('SPCT04', 4, 5, 950000),
		('SPCT05', 5, 4, 2100000),
		('SPCT06', 6, 7, 650000),
		('SPCT07', 7, 9, 280000),
		('SPCT08', 8, 10, 250000),
		('SPCT09', 9, 5, 150000)
