﻿USE QLBHDIENMAY_DO
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
VALUES  ('SP001','DM001', 1, N'Máy lạnh'),
		('SP002','DM002',2, N'Loa Blooth'),
		('SP003','DM003',3, N'Điều hòa'),
		('SP004','DM004',4, N'Máy giặt'),
		('SP005','DM005',5,N'Tivi'),
		('SP006','DM006',5, N'Tủ lạnh'),
		('SP007','DM007',4, N'Máy hút bụi'),
		('SP008','DM008',3, N'Lò vi sóng'),
		('SP009','DM009',2, N'Bình nóng lạnh')



INSERT INTO TAIKHOAN
VALUES  ('NV001', 'VT01', '123', N'Còn sử dụng'),
		('NV002', 'VT02', '345', N'Còn sử dụng'),
		('NV003', 'VT01', '456', N'Còn sử dụng'),
		('NV004', 'VT02', '567', N'Còn sử dụng'),
		('NV005', 'VT01', '678', N'Còn sử dụng'),
		('NV006', 'VT02', '789', N'Còn sử dụng'),
		('NV007', 'VT01', '890', N'Còn sử dụng'),
		('NV008', 'VT02', '111', N'Còn sử dụng'),
		('NV009', 'VT01', '222', N'Không còn sử dụng')


INSERT INTO HOADON
VALUES  ('HD001','NV001','2021-01-01',N'CHƯA THANH TOÁN', N'TIỀN MẶT',3000,N'NOT'),
		('HD002','NV002','2021-02-02',N'ĐÃ THANH TOÁN', N'ATM',5000,N'NOT'),
		('HD003','NV003','2021-03-03',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',6700,N'NOT'),
		('HD004','NV004','2021-04-04',N'ĐÃ THANH TOÁN', N'VISA',3500,N'NOT'),
		('HD005','NV005','2021-05-05',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',4000,N'NOT'),
		('HD006','NV006','2021-06-06',N'CHƯA THANH TOÁN', N'TIỀN MẶT',2000,N'NOT'),
		('HD007','NV007','2021-07-07',N'ĐÃ THANH TOÁN', N'VISA',1000,N'NOT'),
		('HD008','NV008','2021-08-08',N'ĐÃ THANH TOÁN', N'TIỀN MẶT',8000,N'NOT'),
		('HD009','NV009','2021-09-09',N'CHƯA THANH TOÁN', N'TIỀN MẶT',7000,N'NOT')



INSERT INTO MAUSAC
VALUES  ('MS001', N'Trắng đen'),
		('MS002', N'Đen'),
		('MS003', N'Xám'),
		('MS004', N'Trắng'),
		('MS005', N'Xanh')

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
		('CL003', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('CL004', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('CL005', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện, Kính'),
		('CL006', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('CL007', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện'),
		('CL008', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện, Kính'),
		('CL009', N'Thép không gỉ, Kim loại phủ sơn tĩnh điện')


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
VALUES  ('SPCT01', 'IME001', 'SP001', 'MS004', 'KT001', 'CL001', 'TT001', 'KL001',N'AH-X9XEW', 100, 0, 2000, 3000, N'No Mô Tả'),
		('SPCT02', 'IME002', 'SP002', 'MS002', 'KT002', 'CL002', 'TT002', 'KL002',N'BM01', 1000, 0, 2500, 4000, N'No Mô Tả'),
		('SPCT03', 'IME003', 'SP003', 'MS004', 'KT003', 'CL003', 'TT003', 'KL003',N'KG50F62', 50, 1, 3400, 4000, N'No Mô Tả'),
		('SPCT04', 'IME004' , 'SP004', 'MS001', 'KT004', 'CL004', 'TT004', 'KL004',N'FV1409S4W', 90, 0, 2000, 3500, N'No Mô Tả'),
		('SPCT05', 'IME005', 'SP005', 'MS002', 'KT005', 'CL005', 'TT005', 'KL005',N'KD-43X75', 120, 0, 2200, 3000, N'No Mô Tả'),
		('SPCT06', 'IME006', 'SP006', 'MS001', 'KT006', 'CL006', 'TT006', 'KL006',N'Inverter 322 lít NR-BC360QKVN', 90, 1, 1500, 2000, N'No Mô Tả'),
		('SPCT07', 'IME007', 'SP007', 'MS001', 'KT007', 'CL007', 'TT007', 'KL007',N'MC-CL575KN49 2000W', 100, 0, 600, 2000, N'No Mô Tả'),
		('SPCT08', 'IME008', 'SP008', 'MS002', 'KT008', 'CL008', 'TT008', 'KL008',N'MG23K3575AS/SV-N', 80, 0, 1000, 1500, N'No Mô Tả'),
		('SPCT09', 'IME009', 'SP009', 'MS004', 'KT009', 'CL009', 'TT009', 'KL009',N'EWE451LB-DPX2', 70, 1, 900, 1000, N'No Mô Tả')
		

INSERT INTO HOADONCHITIET
VALUES  ('HDCT01','SPCT01', 'HD001', 90, 3000),
		('HDCT02','SPCT02', 'HD002', 900, 3000),
		('HDCT03','SPCT03', 'HD003', 40, 2500),
		('HDCT04','SPCT04', 'HD004', 80, 2500),
		('HDCT05','SPCT05', 'HD005', 100, 2500),
		('HDCT06','SPCT06', 'HD006', 90, 3000),
		('HDCT07','SPCT07', 'HD007', 90, 2000),
		('HDCT08','SPCT08', 'HD008', 70, 3000),
		('HDCT09','SPCT09', 'HD009', 50, 2500)


INSERT INTO KHUYENMAI
VALUES  ('KM001' ,N'Sale 1-1','ONLINE','2021-01-01','2021-01-02',50,'No Mô Tả', N'CÒN ÁP DỤNG'),
		('KM002' ,N'Sale 2-2','ONLINE','2021-02-02','2021-02-03',50,'No Mô Tả',N'CÒN ÁP DỤNG'),
		('KM003' ,N'Sale 3-3','ONLINE','2021-03-03','2021-03-04',50,'No Mô Tả',N'CÒN ÁP DỤNG'),
		('KM004' ,N'Sale 4-4','ONLINE','2021-04-04','2021-04-05',50,'No Mô Tả',N'CÒN ÁP DỤNG'),
		('KM005' ,N'Sale 5-5','ONLINE','2021-05-05','2021-05-06',50,'No Mô Tả',N'CÒN ÁP DỤNG')



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
