USE QLBH_DIENMAYDO1
GO

INSERT INTO NHOMHANG
VALUES  ('NH001', N'Tivi, Âm thanh, Máy chiếu', N'...'),
		('NH002', N'Máy giặt, sấy quần áo', N'...'),
		('NH003', N'Máy lạnh', N'...'),
		('NH004', N'Xe đạp', N'...'),
		('NH005', N'Máy lọc nước & phụ kiện', N'...'),
		('NH006', N'Tủ đông, Tủ lạnh', N'...'),
		('NH007', N'Điện gia dụng nhỏ', N'...'),
		('NH008', N'Máy nước nóng, máy rửa chén', N'...'),
		('NH009', N'Đồ dùng gia đình', N'...')



INSERT INTO DANHMUC
VALUES  ('DM001','NH001', N'Tivi,Loa,Dàn Karaoke',1, N'...'),
		('DM002','NH002', N'Tủ lạnh, Tủ đông, Tủ mát',1, N'...'),
		('DM003','NH003', N'Máy giặt, Sấy quần áo',1, N'...'),
		('DM004','NH004', N'Máy lạnh, Quạt điều hòa',1, N'...'),
		('DM005','NH005', N'Điện gia dụng, Dụng cụ',1, N'...'),
		('DM006','NH006', N'Đồ dùng nhà bếp',1, N'...'),
		('DM007','NH007', N'Lọc nước, Máy nước nóng',1, N'...'),
		('DM008','NH008', N'Điện thoại, Laptop, Tablet',1, N'...'),
		('DM009','NH009', N'Phụ kiện, Đồng hồ',1, N'...')


INSERT INTO VAITRO
VALUES  ('VT01', N'Quản Lý'),
		('VT02', N'Nhân Viên')


INSERT INTO NHANVIEN
VALUES  ('NV001','VT01','123', N'Thieu Quang Vinh', N'Thanh Hoa', '09867655439', 1, '2002-08-19',N'Đang làm việc'),
		('NV002','VT02','123', N'Do Tat Hoa', N'Thanh Hoa', '04573927342', 1, '2002-09-21',N'Đang làm việc'),
		('NV003','VT01','123', N'Nguyen Viet Hien', N'Bac Ninh', '08756475834', 1, '2002-01-01',N'Đang làm việc'),
		('NV004','VT02','123', N'Le Thi Ngoc Thuy', N'Ha Noi', '07645362734', 1, '1998-02-02',N'Đang làm việc'),
		('NV005','VT01','123', N'Le Thanh Vinh', N'Ha Noi', '01234567898', 1, '1998-03-03',N'Đang làm việc'),
		('NV006','VT02','123', N'Nguyen Hong Son', N'Hai Duong', '06743478596', 1, '2002-04-04',N'Đang làm việc')


INSERT INTO XUATXU
VALUES  (N'NSX Đông Sơn', N'Việt Nam'),
		(N'NSX Triều Tiên', N'Trung Quốc'),
		(N'NSX New York', N'Anh'),
		(N'NSX Saitama', N'Nhật Bản'),
		(N'NSX Seoul', N'Hàn Quốc')


INSERT INTO SANPHAM
VALUES  ('SP001','DM001', 1, N'Máy lạnh'),
		('SP002','DM002',2, N'Loa Blooth'),
		('SP003','DM003',3, N'Điều hòa'),
		('SP004','DM004',4, N'Máy giặt'),
		('SP005','DM005',5,N'Tivi'),
		('SP006','DM006',5, N'Tủ lạnh'),
		('SP007','DM007',4, N'Máy hút bụi'),
		('SP008','DM008',3, N'Lò vi sóng'),
		('SP009','DM009',2, N'Bình nóng lạnh')


INSERT INTO KHACHHANG
VALUES	('KH01',N'Vo Thi Sau',1,'0389456758','sdhsa@gmail.com',N'Thanh Hoa',N'NO STATUS'),
		('KH02',N'Trinh Thi Hoa',1,'0545465758','tring1323@gmail.com',N'Thanh Hoa',N'NO STATUS'),
		('KH03',N'Hoang Hoa Tham',0,'056858758','tham234@gmail.com',N'Thanh Hoa',N'NO STATUS'),
		('KH04',N'Nguyen Thi Hoa',1,'035685675','hoanguyen@gmail.com',N'Đa Nang',N'NO STATUS'),
		('KH05',N'Tran Van Binh',0,'0385896758','binhgold123@gmail.com',N'Thai Nguyen',N'NO STATUS'),
		('KH06',N'Do Thi Chanh',1,'0658456758','chanh987gmail.com',N'Ha Noi',N'NO STATUS'),
		('KH07',N'Nguyen Van Quan',0,'0956856758','quan235@gmail.com',N'Bac Can',N'NO STATUS'),
		('KH08',N'Do Hai Anh',0,'0658946758','haianh365@gmail.com',N'Thai Binh',N'NO STATUS'),
		('KH09',N'Duong Huyen Trang',1,'0365494758','trang145@gmail.com',N'Bac Ninh',N'NO STATUS')

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
VALUES  ('HD001','NV001','KH01','TT002','HT001','GH001','2021-01-01',100,7200000,N'NOT'),
		('HD002','NV002','KH02','TT002','HT001','GH001','2021-02-02',100,1400000,N'NOT'),
		('HD003','NV003','KH03','TT002','HT002','GH001','2020-03-03',100,7500000,N'NOT'),
		('HD004','NV004','KH04','TT002','HT001','GH001','2021-04-04',100,4750000,N'NOT'),
		('HD005','NV005','KH05','TT002','HT001','GH001','2021-05-05',100,8400000,N'NOT'),
		('HD006','NV006','KH06','TT002','HT002','GH001','2020-06-06',100,4550000,N'NOT'),
		('HD007','NV001','KH07','TT002','HT001','GH001','2021-07-07',100,2520000,N'NOT'),
		('HD008','NV002','KH08','TT002','HT003','GH001','2019-08-08',100,105000,N'NOT'),
		('HD009','NV003','KH09','TT002','HT001','GH001','2020-09-09',100,750000,N'NOT')

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
		('CM', N'Centimet'),
		('G', N'Gam')

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
		('SPCT03', 'IME003', 'SP003', 'MS004', 'KT003', 'CL003', 'TT003', 'KL003',N'KG50F62', 10, 1, 950000, 1500000,0, N'No Mô Tả'),
		('SPCT04', 'IME004', 'SP004', 'MS001', 'KT004', 'CL004', 'TT004', 'KL004',N'FV1409S4W', 10, 0, 800000, 950000,0, N'No Mô Tả'),
		('SPCT05', 'IME005', 'SP005', 'MS002', 'KT005', 'CL005', 'TT005', 'KL005',N'KD-43X75', 10, 0, 1700000, 2100000,1, N'No Mô Tả'),
		('SPCT06', 'IME006', 'SP006', 'MS001', 'KT006', 'CL006', 'TT006', 'KL006',N'Inverter NR-BC360QKVN', 10, 1, 400000, 650000,0, N'No Mô Tả'),
		('SPCT07', 'IME007', 'SP007', 'MS001', 'KT007', 'CL007', 'TT007', 'KL007',N'MC-CL575KN49 2000W', 10, 0, 100000, 280000,1, N'No Mô Tả'),
		('SPCT08', 'IME008', 'SP008', 'MS002', 'KT008', 'CL001', 'TT008', 'KL008',N'MG23K3575AS/SV-N', 10, 0, 120000, 250000,1, N'No Mô Tả'),
		('SPCT09', 'IME009', 'SP009', 'MS004', 'KT009', 'CL004', 'TT009', 'KL009',N'EWE451LB-DPX2', 10, 1, 90000, 150000,1, N'No Mô Tả')

INSERT INTO HOADONCHITIET
VALUES  ('SPCT01', 'HD001', 6, 1200000),
		('SPCT02', 'HD002', 7, 200000),
		('SPCT03', 'HD003', 5, 1500000),
		('SPCT04', 'HD004', 5, 950000),
		('SPCT05', 'HD005', 4, 2100000),
		('SPCT06', 'HD006', 7, 650000),
		('SPCT07', 'HD007', 9, 280000),
		('SPCT08', 'HD008', 10, 250000),
		('SPCT09', 'HD009', 5, 150000)


INSERT INTO KHUYENMAI
VALUES  ('KM001' ,N'Ngày 11-11',N'Giảm theo tiền','2021-01-01','2021-01-02',500000, N'CÒN ÁP DỤNG',N'No Mô Tả'),
		('KM002' ,N'Ngày 11-11',N'Giảm theo %','2021-02-02','2021-02-03',50,N'CÒN ÁP DỤNG',N'No Mô Tả'),
		('KM003' ,N'Ngày 11-11',N'Giảm theo %','2021-03-03','2021-03-04',10,N'CÒN ÁP DỤNG',N'No Mô Tả'),
		('KM004' ,N'Ngày 11-11',N'Giảm theo tiền','2021-04-04','2021-04-05',200000,N'CÒN ÁP DỤNG',N'No Mô Tả'),
		('KM005' ,N'Ngày 11-11',N'Giảm theo %','2021-05-05','2021-05-06',20,N'CÒN ÁP DỤNG',N'No Mô Tả')



INSERT INTO DANHMUC_KHUYENMAI
VALUES  ('DMKM01', 'KM001', 'DM001'),
		('DMKM02', 'KM002', 'DM002'),
		('DMKM03', 'KM003', 'DM003'),
		('DMKM04', 'KM004', 'DM004'),
		('DMKM05', 'KM005', 'DM005'),
		('DMKM06', 'KM005', 'DM006'),
		('DMKM07', 'KM004', 'DM007'),
		('DMKM08', 'KM003', 'DM008'),
		('DMKM09', 'KM002', 'DM009')
