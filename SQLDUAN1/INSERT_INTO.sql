USE QLBH_DIEN_MAY_DO
GO

INSERT INTO NHOMHANG
VALUES  ('ID_NH01', 'MNH1', N'Tivi, Âm thanh, Máy chiếu', N'...'),
		('ID_NH02', 'MNH2', N'Máy giặt, sấy quần áo', N'...'),
		('ID_NH03', 'MNH3', N'Máy lạnh', N'...'),
		('ID_NH04', 'MNH4', N'Xe đạp', N'...'),
		('ID_NH05', 'MNH5', N'Máy lọc nước & phụ kiện', N'...'),
		('ID_NH06', 'MNH6', N'Tủ đông, Tủ lạnh', N'...'),
		('ID_NH07', 'MNH7', N'Điện gia dụng nhỏ', N'...'),
		('ID_NH08', 'MNH8', N'Máy nước nóng, máy rửa chén', N'...'),
		('ID_NH09', 'MNH9', N'Đồ dùng gia đình', N'...'),
		('ID_NH10', 'MNH10', N'Thiết bị điện nước', N'...')


INSERT INTO DANHMUC
VALUES  ('ID_DM01', 'ID_NH01','MDM1', N'Tivi,Loa,Dàn Karaoke', N'...'),
		('ID_DM02', 'ID_NH02','MDM2', N'Tủ lạnh, Tủ đông, Tủ mát', N'...'),
		('ID_DM03', 'ID_NH03','MDM3', N'Máy giặt, Sấy quần áo', N'...'),
		('ID_DM04', 'ID_NH04','MDM4', N'Máy lạnh, Quạt điều hòa', N'...'),
		('ID_DM05', 'ID_NH05','MDM5', N'Điện gia dụng, Dụng cụ', N'...'),
		('ID_DM06', 'ID_NH06','MDM6', N'Đồ dùng nhà bếp', N'...'),
		('ID_DM07', 'ID_NH07','MDM7', N'Lọc nước, Máy nước nóng', N'...'),
		('ID_DM08', 'ID_NH08','MDM8', N'Điện thoại, Laptop, Tablet', N'...'),
		('ID_DM09', 'ID_NH09','MDM9', N'Phụ kiện, Đồng hồ', N'...'),
		('ID_DM10', 'ID_NH10','MDM10', N'Xe đạp, Phụ kiện xe đạp', N'...')

INSERT INTO VAITRO
VALUES  ('ID_VT01', 'MVT1', N'Quản Lý'),
		('ID_VT02', 'MVT2', N'Nhân Viên'),
		('ID_VT03', 'MVT3', N'Quản Lý'),
		('ID_VT04', 'MVT4', N'Nhân Viên'),
		('ID_VT05', 'MVT5', N'Quản Lý'),
		('ID_VT06', 'MVT6', N'Nhân Viên'),
		('ID_VT07', 'MVT7', N'Quản Lý'),
		('ID_VT08', 'MVT8', N'Nhân Viên'),
		('ID_VT09', 'MVT9', N'Quản Lý'),
		('ID_VT10', 'MVT10', N'Nhân Viên')

INSERT INTO NHANVIEN
VALUES  ('ID_NV01', 'ID_VT01', 'NV1', N'Thiều Quang Vinh', N'Thanh Hóa', '09867655439', 0, '2002-08-19'),
		('ID_NV02', 'ID_VT02', 'NV2', N'Đỗ Tất Hòa', N'Thanh Hóa', '04573927342', 0, '2002-09-21'),
		('ID_NV03', 'ID_VT03', 'NV3', N'Nguyễn Viết Hiên', N'Bắc Ninh', '08756475834', 0, '2002-01-01'),
		('ID_NV04', 'ID_VT04', 'NV4', N'Lê Thị Ngọc Thúy', N'Hà Nội', '07645362734', 1, '1997-02-02'),
		('ID_NV05', 'ID_VT05', 'NV5', N'Lê Thành Vinh', N'Hà Nội', '01234567898', 0, '1997-03-03'),
		('ID_NV06', 'ID_VT06', 'NV6', N'Nguyễn Hồng Sơn', N'Hải Dương', '06743478596', 0, '2002-04-04'),
		('ID_NV07', 'ID_VT07', 'NV7', N'Lê Thị Thanh Hà', N'Thanh Hóa', '03245768794', 1, '2002-07-12'),
		('ID_NV08', 'ID_VT08', 'NV8', N'Trần Văn Quang', N'Thanh Hóa', '05748576934', 0, '2002-05-23'),
		('ID_NV09', 'ID_VT09', 'NV9', N'Lê Văn Cường', N'Thanh Hóa', '06578493234', 0, '2002-11-24'),
		('ID_NV10', 'ID_VT10', 'NV10', N'Trương Thị Tú', N'Thanh Hóa', '07845678765', 1, '2002-12-23')

INSERT INTO XUATXU
VALUES  ('ID_XX01', 'MXX1', N'NSX Đông Sơn', N'Việt Nam'),
		('ID_XX02', 'MXX2', N'NSX Triều Tiên', N'Trung Quốc'),
		('ID_XX03', 'MXX3', N'NSX New York', N'Anh'),
		('ID_XX04', 'MXX4', N'NSX Saitama', N'Nhật Bản'),
		('ID_XX05', 'MXX5', N'NSX Seoul', N'Hàn Quốc')

INSERT INTO SANPHAM
VALUES  ('ID_SP01', 'ID_DM01', 'ID_XX01', 'SP1', N'Máy lạnh'),
		('ID_SP02', 'ID_DM02', 'ID_XX02', 'SP2', N'Loa Blooth'),
		('ID_SP03', 'ID_DM03', 'ID_XX03', 'SP3', N'Điều hòa'),
		('ID_SP04', 'ID_DM04', 'ID_XX04', 'SP4', N'Máy giặt'),
		('ID_SP05', 'ID_DM05', 'ID_XX05', 'SP5', N'Tivi'),
		('ID_SP06', 'ID_DM06', 'ID_XX01', 'SP6', N'Tủ lạnh'),
		('ID_SP07', 'ID_DM07', 'ID_XX02', 'SP7', N'Máy hút bụi'),
		('ID_SP08', 'ID_DM08', 'ID_XX03', 'SP8', N'Lò vi sóng'),
		('ID_SP09', 'ID_DM09', 'ID_XX04', 'SP9', N'Bình nóng lạnh'),
		('ID_SP10', 'ID_DM10', 'ID_XX05', 'SP10', N'Máy chiếu')

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
		('ID_NV10', 'ID_VT10', '333')

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
		('ID_KH10','KH10',N'Võ Văn Hoàng',0,'0389856758','hoang1@gmail.com',N'Hà Nội',N'No Status')

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
		('ID_HD10','ID_NV10','ID_KH10','MHD10','2021-11-10',N'ĐÃ THANH TOÁN', N'ATM',8600,'No Status')


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
		('ID_KT10', 'ID_DV02', 'MKT10', 30, 20, 15)

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
		('ID_KL10', 'ID_DV01', 'MKL10',0.9)

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
		('ID_TT10', 'MTT10', 3)
		
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
		('ID_CL10', 'MCL10', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện, Kính')

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
		('ID_IME10', 'MIM10', 'maychieu.png')

INSERT INTO SANPHAMCHITIET
VALUES  ('ID_SPCT01', 'ID_IME01', 'ID_SP01', 'ID_MS04', 'ID_KT01', 'ID_CL01', 'ID_TT01', 'ID_KL01', 'SPCT1',N'Sản phẩm chi tiết 1', 100, 0, 2000, 3000, N'No Status', N'No Mô Tả'),
		('ID_SPCT02', 'ID_IME02', 'ID_SP02', 'ID_MS02', 'ID_KT02', 'ID_CL02', 'ID_TT02', 'ID_KL02', 'SPCT2',N'Sản phẩm chi tiết 2', 1000, 0, 2500, 4000, N'No Status', N'No Mô Tả'),
		('ID_SPCT03', 'ID_IME03', 'ID_SP03', 'ID_MS04', 'ID_KT03', 'ID_CL03', 'ID_TT03', 'ID_KL03', 'SPCT3',N'Sản phẩm chi tiết 3', 50, 1, 3400, 4000, N'No Status', N'No Mô Tả'),
		('ID_SPCT04', 'ID_IME04', 'ID_SP04', 'ID_MS01', 'ID_KT04', 'ID_CL04', 'ID_TT04', 'ID_KL04', 'SPCT4',N'Sản phẩm chi tiết 4', 90, 0, 2000, 3500, N'No Status', N'No Mô Tả'),
		('ID_SPCT05', 'ID_IME05', 'ID_SP05', 'ID_MS02', 'ID_KT05', 'ID_CL05', 'ID_TT05', 'ID_KL05', 'SPCT5',N'Sản phẩm chi tiết 5', 120, 0, 2200, 3000, N'No Status', N'No Mô Tả'),
		('ID_SPCT06', 'ID_IME06', 'ID_SP06', 'ID_MS01', 'ID_KT06', 'ID_CL06', 'ID_TT06', 'ID_KL06', 'SPCT6',N'Sản phẩm chi tiết 6', 90, 1, 1500, 2000, N'No Status', N'No Mô Tả'),
		('ID_SPCT07', 'ID_IME07', 'ID_SP07', 'ID_MS01', 'ID_KT07', 'ID_CL07', 'ID_TT07', 'ID_KL07', 'SPCT7',N'Sản phẩm chi tiết 7', 100, 0, 600, 2000, N'No Status', N'No Mô Tả'),
		('ID_SPCT08', 'ID_IME08', 'ID_SP08', 'ID_MS02', 'ID_KT08', 'ID_CL08', 'ID_TT08', 'ID_KL08', 'SPCT8',N'Sản phẩm chi tiết 8', 80, 0, 1000, 1500, N'No Status', N'No Mô Tả'),
		('ID_SPCT09', 'ID_IME09', 'ID_SP09', 'ID_MS04', 'ID_KT09', 'ID_CL09', 'ID_TT09', 'ID_KL09', 'SPCT9',N'Sản phẩm chi tiết 9', 70, 1, 900, 1000, N'No Status', N'No Mô Tả'),
		('ID_SPCT10', 'ID_IME10', 'ID_SP10', 'ID_MS04', 'ID_KT10', 'ID_CL10', 'ID_TT10', 'ID_KL10', 'SPCT10',N'Sản phẩm chi tiết 10', 1000, 0, 1000, 1400, N'No Status', N'No Mô Tả')

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
		('ID_HDCT10','ID_SPCT10', 'ID_HD10', 'HDCT10', 300, 1500)

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
		('ID_DMKM10', 'ID_KM01', 'ID_DM10')
