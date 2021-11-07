CREATE DATABASE QLBH_DIENMAYDO
GO

USE QLBH_DIENMAYDO
GO

CREATE TABLE NHOMHANG
(
MANH VARCHAR(10) NOT NULL,
TENNH NVARCHAR(100) NOT NULL,
GHICHU NVARCHAR(200) NOT NULL,
PRIMARY KEY (MANH) 
)
GO

CREATE TABLE DANHMUC
(
MADANHMUC VARCHAR(10) NOT NULL,
MANH VARCHAR(10) NOT NULL,
TENDM NVARCHAR(100) NOT NULL,
GHICHU NVARCHAR(200) NOT NULL,
PRIMARY KEY (MADANHMUC) ,
FOREIGN KEY(MANH) REFERENCES NHOMHANG(MANH)
)
GO

CREATE TABLE VAITRO
(
MAVT VARCHAR(10) NOT NULL,
TENVT NVARCHAR(100) NOT NULL,
PRIMARY KEY(MAVT)
)
GO

CREATE TABLE NHANVIEN
(
MANV VARCHAR(10) NOT NULL,
MAVT VARCHAR(10) NOT NULL,
TENNV NVARCHAR(100) NOT NULL,
DIACHI NVARCHAR(100) NOT NULL,
DIENTHOAI VARCHAR(12) NOT NULL,
GIOITINH BIT NOT NULL,
NGAYSINH DATE NOT NULL,
PRIMARY KEY (MANV),
FOREIGN KEY(MAVT) REFERENCES VAITRO(MAVT)
)
GO

CREATE TABLE XUATXU
(
MAXX VARCHAR(10) NOT NULL,
NHASX NVARCHAR(100) NOT NULL,
NUOCSX NVARCHAR(100) NOT NULL,
PRIMARY KEY(MAXX)
)
GO

CREATE TABLE SANPHAM
(
MASP VARCHAR(10) NOT NULL,
MADANHMUC VARCHAR(10) NOT NULL,
MAXX VARCHAR(10) NOT NULL,
TENSP NVARCHAR(50) NOT NULL,
PRIMARY KEY (MASP),
FOREIGN KEY (MADANHMUC) REFERENCES DANHMUC (MADANHMUC),
FOREIGN KEY (MAXX) REFERENCES XUATXU (MAXX),
)
GO

CREATE TABLE TAIKHOAN
(
MANV VARCHAR(10) NOT NULL,
MAVT VARCHAR(10) NOT NULL,
MatKhau VARCHAR(100) NOT NULL,
PRIMARY KEY(MANV),
FOREIGN KEY (MANV) REFERENCES NHANVIEN (MANV),
FOREIGN KEY (MAVT) REFERENCES VAITRO (MAVT)
)
GO

CREATE TABLE HOADON
(
MAHD VARCHAR(10) NOT NULL,
MANV VARCHAR(10) NOT NULL,
NGAYLAP DATE NOT NULL,
TRANGTHAI_TT NVARCHAR(100) NOT NULL,
HINHTHUC_TT NVARCHAR(100) NOT NULL,
TONGTIEN MONEY NOT NULL,
GHICHU NVARCHAR(200) NOT NULL,
PRIMARY KEY (MAHD),
FOREIGN KEY (MANV) REFERENCES NHANVIEN (MANV),
)
GO

CREATE TABLE MAUSAC
(
MAMAUSAC VARCHAR(10) NOT NULL,
TENMAUSAC NVARCHAR(50) NOT NULL,
PRIMARY KEY(MAMAUSAC)
)
GO

CREATE TABLE DONVITINH
(
MADV VARCHAR(10) NOT NULL,
TENDV NVARCHAR(50) NOT NULL,
PRIMARY KEY(MADV)
)
GO

CREATE TABLE KICHTHUOC
(
MAKICHTHUOC VARCHAR(10) NOT NULL,
MADV VARCHAR(10) NOT NULL,
CHIEUDAI FLOAT NOT NULL,
CHIEURONG FLOAT NOT NULL,
CHIEUCAO FLOAT NOT NULL,
PRIMARY KEY(MAKICHTHUOC),
FOREIGN KEY (MADV) REFERENCES DONVITINH(MADV)
)
GO

CREATE TABLE KHOILUONG
(
MAKL VARCHAR(10) NOT NULL,
MADV VARCHAR(10) NOT NULL,
KHOILUONG FLOAT NOT NULL,
PRIMARY KEY(MAKL),
FOREIGN KEY (MADV) REFERENCES DONVITINH(MADV)
)
GO

CREATE TABLE THETICH
(
MATHETICH VARCHAR(10) NOT NULL,
THETICH FLOAT NOT NULL,
PRIMARY KEY(MATHETICH)
)
GO

CREATE TABLE CHATLIEU
(
MACHATLIEU VARCHAR(10) NOT NULL,
CHATLIEU NVARCHAR(100) NOT NULL,
PRIMARY KEY(MACHATLIEU)
)
GO

CREATE TABLE _IMAGE
(
MAIMAGE VARCHAR(10) NOT NULL,
TENHINH NVARCHAR(100) NOT NULL,
PRIMARY KEY(MAIMAGE)
)
GO

CREATE TABLE SANPHAMCHITIET
(
MASPCT VARCHAR(10) NOT NULL,
MAIMAGE VARCHAR(10) NOT NULL,
MASP VARCHAR(10) NOT NULL,
MAMAUSAC VARCHAR(10) NOT NULL,
MAKICHTHUOC VARCHAR(10) NOT NULL,
MACHATLIEU VARCHAR(10) NOT NULL,
MATHETICH VARCHAR(10) NOT NULL,
MAKL VARCHAR(10) NOT NULL,
TENSPCT NVARCHAR(50) NOT NULL,
SOLUONG INT NOT NULL,
NHOMPHOBIEN BIT NOT NULL,
GIANHAP MONEY NOT NULL,
GIABAN MONEY NOT NULL,
TRANGTHAI NVARCHAR(100) NOT NULL,
MOTA NVARCHAR(200) NOT NULL,
PRIMARY KEY(MASPCT),
FOREIGN KEY (MAIMAGE) REFERENCES _IMAGE(MAIMAGE),
FOREIGN KEY (MASP) REFERENCES SANPHAM (MASP),
FOREIGN KEY (MAMAUSAC) REFERENCES MAUSAC(MAMAUSAC),
FOREIGN KEY (MAKICHTHUOC) REFERENCES KICHTHUOC(MAKICHTHUOC),
FOREIGN KEY (MACHATLIEU) REFERENCES CHATLIEU(MACHATLIEU),
FOREIGN KEY (MATHETICH) REFERENCES THETICH(MATHETICH),
FOREIGN KEY (MAKL) REFERENCES KHOILUONG(MAKL)
)
GO

CREATE TABLE HOADONCHITIET
(
MAHDCT VARCHAR(10) NOT NULL,
MAHD VARCHAR(10) NOT NULL,
MASPCT VARCHAR(10) NOT NULL,
SOLUONG INT NOT NULL,
DONGIA MONEY NOT NULL,
PRIMARY KEY (MAHDCT),
FOREIGN KEY (MAHD) REFERENCES HOADON (MAHD),
FOREIGN KEY (MASPCT) REFERENCES SANPHAMCHITIET (MASPCT)
)
GO

CREATE TABLE KHUYENMAI
(
MAKM VARCHAR(10) NOT NULL,
TENCT NVARCHAR(100) NOT NULL,
HINHTHUC NVARCHAR(100) NOT NULL,
BATDAU DATE NOT NULL,
KETTHUC DATE NOT NULL,
GIAMGIA FLOAT NOT NULL,
MOTA NVARCHAR(200) NOT NULL,
PRIMARY KEY (MAKM)
)
GO

CREATE TABLE DANHMUC_KHUYENMAI
(
MADMKM VARCHAR(10) NOT NULL,
MAKM VARCHAR(10) NOT NULL,
MADANHMUC VARCHAR(10) NOT NULL,
PRIMARY KEY(MADMKM),
FOREIGN KEY (MAKM) REFERENCES KHUYENMAI (MAKM),
FOREIGN KEY (MADANHMUC) REFERENCES DANHMUC (MADANHMUC)
)
GO