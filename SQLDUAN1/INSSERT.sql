USE QLBH_DIENMAYDO
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
VALUES  ('DM001','NH001', N'Tivi,Loa,Dàn Karaoke', N'...'),
		('DM002','NH002', N'Tủ lạnh, Tủ đông, Tủ mát', N'...'),
		('DM003','NH003', N'Máy giặt, Sấy quần áo', N'...'),
		('DM004','NH004', N'Máy lạnh, Quạt điều hòa', N'...'),
		('DM005','NH005', N'Điện gia dụng, Dụng cụ', N'...'),
		('DM006','NH006', N'Đồ dùng nhà bếp', N'...'),
		('DM007','NH007', N'Lọc nước, Máy nước nóng', N'...'),
		('DM008','NH008', N'Điện thoại, Laptop, Tablet', N'...'),
		('DM009','NH009', N'Phụ kiện, Đồng hồ', N'...')


INSERT INTO VAITRO
VALUES  ('VT01', N'Quản Lý'),
		('VT02', N'Nhân Viên')


INSERT INTO NHANVIEN
VALUES  ('NV001','VT01', N'Thiều Quang Vinh', N'Thanh Hóa', '09867655439', 0, '2002-08-19'),
		('NV002','VT02', N'Đỗ Tất Hòa', N'Thanh Hóa', '04573927342', 0, '2002-09-21'),
		('NV003','VT01', N'Nguyễn Viết Hiên', N'Bắc Ninh', '08756475834', 0, '2002-01-01'),
		('NV004','VT02', N'Lê Thị Ngọc Thúy', N'Hà Nội', '07645362734', 1, '1997-02-02'),
		('NV005','VT01', N'Lê Thành Vinh', N'Hà Nội', '01234567898', 0, '1997-03-03'),
		('NV006','VT02', N'Nguyễn Hồng Sơn', N'Hải Dương', '06743478596', 0, '2002-04-04'),
		('NV007','VT01', N'Lê Thị Thanh Hà', N'Thanh Hóa', '03245768794', 1, '2002-07-12'),
		('NV008','VT02', N'Trần Văn Quang', N'Thanh Hóa', '05748576934', 0, '2002-05-23'),
		('NV009','VT01', N'Trương Thị Tú', N'Thanh Hóa', '07845678765', 1, '2002-12-23')


INSERT INTO XUATXU
VALUES  (N'NSX Đông Sơn', N'Việt Nam'),
		(N'NSX Triều Tiên', N'Trung Quốc'),
		(N'NSX New York', N'Anh'),
		(N'NSX Saitama', N'Nhật Bản'),
		(N'NSX Seoul', N'Hàn Quốc')

INSERT INTO SANPHAM
VALUES  ('SP001','DM001' , 1, N'Máy lạnh'),
		('SP002','DM002',2, N'Loa Blooth'),
		('SP003','DM003',3, N'Điều hòa'),
		('SP004','DM004',4, N'Máy giặt'),
		('SP005','DM005',5,N'Tivi'),
		('SP006','DM006',5, N'Tủ lạnh'),
		('SP007','DM007',4, N'Máy hút bụi'),
		('SP008','DM008',3, N'Lò vi sóng'),
		('SP009','DM009',2, N'Bình nóng lạnh')
		SET IDENTITY_INSERT XUATXU ON


INSERT INTO TAIKHOAN
VALUES  ('ID_NV01', 'ID_VT01', '123'),
		('ID_NV02', 'ID_VT02', '345'),
		('ID_NV03', 'ID_VT03', '456'),
		('ID_NV04', 'ID_VT04', '567'),
		('ID_NV05', 'ID_VT05', '678'),
		('ID_NV06', 'ID_VT06', '789'),
		('ID_NV07', 'ID_VT07', '890'),
		('ID_NV08', 'ID_VT08', '111'),
		('ID_NV09', 'ID_VT09', '222'),


INSERT INTO KHACHHANG
VALUES	('ID_KH01','KH1',N'Võ Thị Sáu',1,'0389456758','sdhsa@gmail.com',N'Thanh Hóa',N'No Status'),
		('ID_KH02','KH2',N'Trịnh Hoa',1,'0545465758','tring1323@gmail.com',N'Thanh Hóa',N'No Status'),
		('ID_KH03','KH3',N'Hoàng Hoa Thám',0,'056858758','tham234@gmail.com',N'Thanh Hóa',N'No Status'),
		('ID_KH04','KH4',N'Nguyễn THị Hoa',1,'035685675','hoanguyen@gmail.com',N'Đà Nẵng',N'No Status'),
		('ID_KH05','KH5',N'Trần Văn Bình',0,'0385896758','binhgold123@gmail.com',N'Thái Nguyên',N'No Status'),
		('ID_KH06','KH6',N'Đỗ Thị Chanh',1,'0658456758','chanh987gmail.com',N'Hà Nội',N'No Status'),
		('ID_KH07','KH7',N'Nguyễn Văn Quân',0,'0956856758','quan235@gmail.com',N'Bắc Cạn',N'No Status'),
		('ID_KH08','KH8',N'Đỗ Hải Anh',0,'0658946758','haianh365@gmail.com',N'Thái Bình',N'No Status'),
		('ID_KH09','KH9',N'Hạ Thị Huyền Trang',1,'0365494758','trangxinh145@gmail.com',N'Bắc Ninh',N'No Status'),


INSERT INTO HOADON
VALUES  ('ID_HD01','ID_NV01','ID_KH01','MHD1','2021-01-01',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',3000,'No Status'),
		('ID_HD02','ID_NV02','ID_KH02','MHD2','2021-02-02',N'ĐÃ THANH TOÁN', N'ATM',5000,'No Status'),
		('ID_HD03','ID_NV03','ID_KH03','MHD3','2021-03-03',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',6700,'No Status'),
		('ID_HD04','ID_NV04','ID_KH04','MHD4','2021-04-04',N'ĐÃ THANH TOÁN', N'VISA',3500,'No Status'),
		('ID_HD05','ID_NV05','ID_KH05','MHD5','2021-05-05',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',4000,'No Status'),
		('ID_HD06','ID_NV06','ID_KH06','MHD6','2021-06-06',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',2000,'No Status'),
		('ID_HD07','ID_NV07','ID_KH07','MHD7','2021-07-07',N'ĐÃ THANH TOÁN', N'VISA',1000,'No Status'),
		('ID_HD08','ID_NV08','ID_KH08','MHD8','2021-08-08',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',8000,'No Status'),
		('ID_HD09','ID_NV09','ID_KH09','MHD9','2021-09-09',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',7000,'No Status'),



INSERT INTO MAUSAC
VALUES  ('ID_MS01', 'MMS1', N'Trắng đen'),
		('ID_MS02', 'MMS2', N'Đen'),
		('ID_MS03', 'MMS3', N'Xám'),
		('ID_MS04', 'MMS4', N'Trắng'),
		('ID_MS05', 'MMS5', N'Xanh')

INSERT INTO DONVITINH
VALUES  ('ID_DV01', 'KG', N'Kilogam'),
		('ID_DV02', 'CM', N'Centimet'),
		('ID_DV03', 'G', N'Gam')

INSERT INTO KICHTHUOC
VALUES  ('ID_KT01', 'ID_DV02', 'MKT1', 74, 25.5, 48.2),
		('ID_KT02', 'ID_DV02', 'MKT2', 30, 15.5, 14),
		('ID_KT03', 'ID_DV02', 'MKT3', 70, 30, 25.5),
		('ID_KT04', 'ID_DV02', 'MKT4', 80, 70.5, 104.7),
		('ID_KT05', 'ID_DV02', 'MKT5', 90, 5, 70),
		('ID_KT06', 'ID_DV02', 'MKT6', 70, 65, 150),
		('ID_KT07', 'ID_DV02', 'MKT7', 40, 20, 70),
		('ID_KT08', 'ID_DV02', 'MKT8', 50.5, 40, 30),
		('ID_KT09', 'ID_DV02', 'MKT9', 82, 20.5, 48.2),


INSERT INTO KHOILUONG
VALUES  ('ID_KL01', 'ID_DV01', 'MKL1', 25.5),
		('ID_KL02', 'ID_DV01', 'MKL2', 2),
		('ID_KL03', 'ID_DV01', 'MKL3', 18),
		('ID_KL04', 'ID_DV01', 'MKL4', 30.8),
		('ID_KL05', 'ID_DV01', 'MKL5', 10),
		('ID_KL06', 'ID_DV01', 'MKL6', 32.5),
		('ID_KL07', 'ID_DV01', 'MKL7', 5),
		('ID_KL08', 'ID_DV01', 'MKL8', 3),
		('ID_KL09', 'ID_DV01', 'MKL9', 26),


INSERT INTO THETICH
VALUES  ('ID_TT01', 'MTT1', 20),
		('ID_TT02', 'MTT2', 2),
		('ID_TT03', 'MTT3', 12),
		('ID_TT04', 'MTT4', 30),
		('ID_TT05', 'MTT5', 5),
		('ID_TT06', 'MTT6', 16),
		('ID_TT07', 'MTT7', 5),
		('ID_TT08', 'MTT8', 7),
		('ID_TT09', 'MTT9', 20),

		
INSERT INTO CHATLIEU
VALUES  ('ID_CL01', 'MCL1', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('ID_CL02', 'MCL2', N'Thép không gỉ'),
		('ID_CL03', 'MCL3', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('ID_CL04', 'MCL4', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('ID_CL05', 'MCL5', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện, Kính'),
		('ID_CL06', 'MCL6', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('ID_CL07', 'MCL7', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('ID_CL08', 'MCL8', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện, Kính'),
		('ID_CL09', 'MCL9', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),


INSERT INTO _IMAGE
VALUES  ('ID_IME01', 'MIM1', 'maylanh.png'),
		('ID_IME02', 'MIM2', 'loa.png'),
		('ID_IME03', 'MIM3', 'dieuhoa.png'),
		('ID_IME04', 'MIM4', 'maygiat.png'),
		('ID_IME05', 'MIM5', 'tivi.png'),
		('ID_IME06', 'MIM6', 'tulanh.png'),
		('ID_IME07', 'MIM7', 'mayhutbui.png'),
		('ID_IME08', 'MIM8', 'lovisong.png'),
		('ID_IME09', 'MIM9', 'binhnonglanh.png'),


INSERT INTO SANPHAMCHITIET
VALUES  ('ID_SPCT01', 'ID_IME01', 'ID_SP01', 'ID_MS04', 'ID_KT01', 'ID_CL01', 'ID_TT01', 'ID_KL01', 'SPCT1',N'AH-X9XEW', 100, 0, 2000, 3000, N'No Status', N'No Mô Tả'),
		('ID_SPCT02', 'ID_IME02', 'ID_SP02', 'ID_MS02', 'ID_KT02', 'ID_CL02', 'ID_TT02', 'ID_KL02', 'SPCT2',N'BM01', 1000, 0, 2500, 4000, N'No Status', N'No Mô Tả'),
		('ID_SPCT03', 'ID_IME03', 'ID_SP03', 'ID_MS04', 'ID_KT03', 'ID_CL03', 'ID_TT03', 'ID_KL03', 'SPCT3',N'KG50F62', 50, 1, 3400, 4000, N'No Status', N'No Mô Tả'),
		('ID_SPCT04', 'ID_IME04', 'ID_SP04', 'ID_MS01', 'ID_KT04', 'ID_CL04', 'ID_TT04', 'ID_KL04', 'SPCT4',N'FV1409S4W', 90, 0, 2000, 3500, N'No Status', N'No Mô Tả'),
		('ID_SPCT05', 'ID_IME05', 'ID_SP05', 'ID_MS02', 'ID_KT05', 'ID_CL05', 'ID_TT05', 'ID_KL05', 'SPCT5',N'KD-43X75', 120, 0, 2200, 3000, N'No Status', N'No Mô Tả'),
		('ID_SPCT06', 'ID_IME06', 'ID_SP06', 'ID_MS01', 'ID_KT06', 'ID_CL06', 'ID_TT06', 'ID_KL06', 'SPCT6',N'Inverter 322 lít NR-BC360QKVN', 90, 1, 1500, 2000, N'No Status', N'No Mô Tả'),
		('ID_SPCT07', 'ID_IME07', 'ID_SP07', 'ID_MS01', 'ID_KT07', 'ID_CL07', 'ID_TT07', 'ID_KL07', 'SPCT7',N'MC-CL575KN49 2000W', 100, 0, 600, 2000, N'No Status', N'No Mô Tả'),
		('ID_SPCT08', 'ID_IME08', 'ID_SP08', 'ID_MS02', 'ID_KT08', 'ID_CL08', 'ID_TT08', 'ID_KL08', 'SPCT8',N'MG23K3575AS/SV-N', 80, 0, 1000, 1500, N'No Status', N'No Mô Tả'),
		('ID_SPCT09', 'ID_IME09', 'ID_SP09', 'ID_MS04', 'ID_KT09', 'ID_CL09', 'ID_TT09', 'ID_KL09', 'SPCT9',N'EWE451LB-DPX2', 70, 1, 900, 1000, N'No Status', N'No Mô Tả'),
		

INSERT INTO HOADONCHITIET
VALUES  ('ID_HDCT01','ID_SPCT01', 'ID_HD01', 'HDCT1', 90, 3000),
		('ID_HDCT02','ID_SPCT02', 'ID_HD02', 'HDCT2', 900, 3000),
		('ID_HDCT03','ID_SPCT03', 'ID_HD03', 'HDCT3', 40, 2500),
		('ID_HDCT04','ID_SPCT04', 'ID_HD04', 'HDCT4', 80, 2500),
		('ID_HDCT05','ID_SPCT05', 'ID_HD05', 'HDCT5', 100, 2500),
		('ID_HDCT06','ID_SPCT06', 'ID_HD06', 'HDCT6', 90, 3000),
		('ID_HDCT07','ID_SPCT07', 'ID_HD07', 'HDCT7', 90, 2000),
		('ID_HDCT08','ID_SPCT08', 'ID_HD08', 'HDCT8', 70, 3000),
		('ID_HDCT09','ID_SPCT09', 'ID_HD09', 'HDCT9', 50, 2500),


INSERT INTO KHUYENMAI
VALUES  ('ID_KM01' ,'MKM1',N'Sale 1-1','ONLINE','2021-01-01','2021-01-02',50,'No Mô Tả'),
		('ID_KM02' ,'MKM2',N'Sale 2-2','ONLINE','2021-02-02','2021-02-03',50,'No Mô Tả'),
		('ID_KM03' ,'MKM3',N'Sale 3-3','ONLINE','2021-03-03','2021-03-04',50,'No Mô Tả'),
		('ID_KM04' ,'MKM4',N'Sale 4-4','ONLINE','2021-04-04','2021-04-05',50,'No Mô Tả'),
		('ID_KM05' ,'MKM5',N'Sale 5-5','ONLINE','2021-05-05','2021-05-06',50,'No Mô Tả')

INSERT INTO DANHMUC_KHUYENMAI
VALUES  ('ID_DMKM01', 'ID_KM01', 'ID_DM01'),
		('ID_DMKM02', 'ID_KM02', 'ID_DM02'),
		('ID_DMKM03', 'ID_KM03', 'ID_DM03'),
		('ID_DMKM04', 'ID_KM04', 'ID_DM04'),
		('ID_DMKM05', 'ID_KM05', 'ID_DM05'),
		('ID_DMKM06', 'ID_KM05', 'ID_DM06'),
		('ID_DMKM07', 'ID_KM04', 'ID_DM07'),
		('ID_DMKM08', 'ID_KM03', 'ID_DM08'),
		('ID_DMKM09', 'ID_KM02', 'ID_DM09'),
