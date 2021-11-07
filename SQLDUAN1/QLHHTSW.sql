﻿CREATE DATABASE QLBH_DIEN_MAY_DO
GO

USE QLBH_DIEN_MAY_DO
GO

CREATE TABLE NHOMHANG
(
ID_NHOMHANG VARCHAR(10) NOT NULL,
MANH VARCHAR(10) NOT NULL,
TENNH NVARCHAR(100) NOT NULL,
GHICHU NVARCHAR(200) NOT NULL,
PRIMARY KEY (ID_NHOMHANG) 
)
GO

CREATE TABLE DANHMUC
(
ID_DANHMUC VARCHAR(10) NOT NULL,
ID_NHOMHANG VARCHAR(10) NOT NULL,
MADANHMUC VARCHAR(10) NOT NULL,
TENDM NVARCHAR(100) NOT NULL,
GHICHU NVARCHAR(200) NOT NULL,
PRIMARY KEY (ID_DANHMUC) ,
FOREIGN KEY(ID_NHOMHANG) REFERENCES NHOMHANG(ID_NHOMHANG)
)
GO

CREATE TABLE VAITRO
(
ID_VAITRO VARCHAR(10) NOT NULL,
MAVT VARCHAR(10) NOT NULL,
TENVT NVARCHAR(100) NOT NULL,
PRIMARY KEY(ID_VAITRO)
)
GO

CREATE TABLE NHANVIEN
(
ID_NHANVIEN VARCHAR(10) NOT NULL,
ID_VAITRO VARCHAR(10) NOT NULL,
MANV VARCHAR(10) NOT NULL,
TENNV NVARCHAR(100) NOT NULL,
DIACHI NVARCHAR(100) NOT NULL,
DIENTHOAI VARCHAR(12) NOT NULL,
GIOITINH BIT NOT NULL,
NGAYSINH DATE NOT NULL,
PRIMARY KEY (ID_NHANVIEN),
FOREIGN KEY(ID_VAITRO) REFERENCES VAITRO(ID_VAITRO)
)
GO

CREATE TABLE XUATXU
(
ID_XUATXU VARCHAR(10) NOT NULL,
MAXX VARCHAR(10) NOT NULL,
NHASX NVARCHAR(100) NOT NULL,
NUOCSX NVARCHAR(100) NOT NULL,
PRIMARY KEY(ID_XUATXU)
)
GO

CREATE TABLE SANPHAM
(
ID_SANPHAM VARCHAR(10) NOT NULL,
ID_DANHMUC VARCHAR(10) NOT NULL,
ID_XUATXU VARCHAR(10) NOT NULL,
MASP VARCHAR(10) NOT NULL,
TENSP NVARCHAR(50) NOT NULL,
PRIMARY KEY (ID_SANPHAM),
FOREIGN KEY (ID_DANHMUC) REFERENCES DANHMUC (ID_DANHMUC),
FOREIGN KEY (ID_XUATXU) REFERENCES XUATXU (ID_XUATXU),
)
GO

CREATE TABLE TAIKHOAN
(
ID_NHANVIEN VARCHAR(10) NOT NULL,
ID_VAITRO VARCHAR(10) NOT NULL,
MatKhau VARCHAR(100) NOT NULL,
PRIMARY KEY(ID_NHANVIEN),
FOREIGN KEY (ID_NHANVIEN) REFERENCES NHANVIEN (ID_NHANVIEN),
FOREIGN KEY (ID_VAITRO) REFERENCES VAITRO (ID_VAITRO)
)
GO

CREATE TABLE KHACHHANG
(
ID_KHACHHANG VARCHAR(10) NOT NULL,
MAKH VARCHAR(10) NOT NULL,
TENKH NVARCHAR(100) NOT NULL,
GIOITINH BIT NOT NULL,
DIENTHOAI VARCHAR(12) NOT NULL,
EMAIL VARCHAR(100) NOT NULL,
DIACHI NVARCHAR(100) NOT NULL,
TRANGTHAI NVARCHAR(100) NOT NULL,
PRIMARY KEY (ID_KHACHHANG)
)
GO

CREATE TABLE HOADON
(
ID_HOADON VARCHAR(10) NOT NULL,
ID_NHANVIEN VARCHAR(10) NOT NULL,
ID_KHACHHANG VARCHAR(10) NOT NULL,
MAHD VARCHAR(10) NOT NULL,
NGAYLAP DATE NOT NULL,
TRANGTHAI_TT NVARCHAR(100) NOT NULL,
HINHTHUC_TT NVARCHAR(100) NOT NULL,
TONGTIEN MONEY NOT NULL,
GHICHU NVARCHAR(200) NOT NULL,
PRIMARY KEY (ID_HOADON),
FOREIGN KEY (ID_NHANVIEN) REFERENCES NHANVIEN (ID_NHANVIEN),
FOREIGN KEY (ID_KHACHHANG) REFERENCES KHACHHANG(ID_KHACHHANG)
)
GO

CREATE TABLE MAUSAC
(
ID_MAUSAC VARCHAR(10) NOT NULL,
MAMAUSAC VARCHAR(10) NOT NULL,
TENMAUSAC NVARCHAR(50) NOT NULL,
PRIMARY KEY(ID_MAUSAC)
)
GO

CREATE TABLE DONVITINH
(
ID_DONVITINH VARCHAR(10) NOT NULL,
MADV VARCHAR(10) NOT NULL,
TENDV NVARCHAR(50) NOT NULL,
PRIMARY KEY(ID_DONVITINH)
)
GO

CREATE TABLE KICHTHUOC
(
ID_KICHTHUOC VARCHAR(10) NOT NULL,
ID_DONVITINH VARCHAR(10) NOT NULL,
MAKICHTHUOC VARCHAR(10) NOT NULL,
CHIEUDAI FLOAT NOT NULL,
CHIEURONG FLOAT NOT NULL,
CHIEUCAO FLOAT NOT NULL,
PRIMARY KEY(ID_KICHTHUOC),
FOREIGN KEY (ID_DONVITINH) REFERENCES DONVITINH(ID_DONVITINH)
)
GO

CREATE TABLE KHOILUONG
(
ID_KHOILUONG VARCHAR(10) NOT NULL,
ID_DONVITINH VARCHAR(10) NOT NULL,
MAKL VARCHAR(10) NOT NULL,
KHOILUONG FLOAT NOT NULL,
PRIMARY KEY(ID_KHOILUONG),
FOREIGN KEY (ID_DONVITINH) REFERENCES DONVITINH(ID_DONVITINH)
)
GO

CREATE TABLE THETICH
(
ID_THETICH VARCHAR(10) NOT NULL,
MATHETICH VARCHAR(10) NOT NULL,
THETICH FLOAT NOT NULL,
PRIMARY KEY(ID_THETICH)
)
GO

CREATE TABLE CHATLIEU
(
ID_CHATLIEU VARCHAR(10) NOT NULL,
MACHATLIEU VARCHAR(10) NOT NULL,
CHATLIEU NVARCHAR(100) NOT NULL,
PRIMARY KEY(ID_CHATLIEU)
)
GO

CREATE TABLE _IMAGE
(
ID_IMAGE VARCHAR(10) NOT NULL,
MAIMAGE VARCHAR(10) NOT NULL,
TENHINH NVARCHAR(100) NOT NULL,
PRIMARY KEY(ID_IMAGE)
)
GO

CREATE TABLE SANPHAMCHITIET
(
ID_SPCT VARCHAR(10) NOT NULL,
ID_IMAGE VARCHAR(10) NOT NULL,
ID_SANPHAM VARCHAR(10) NOT NULL,
ID_MAUSAC VARCHAR(10) NOT NULL,
ID_KICHTHUOC VARCHAR(10) NOT NULL,
ID_CHATLIEU VARCHAR(10) NOT NULL,
ID_THETICH VARCHAR(10) NOT NULL,
ID_KHOILUONG VARCHAR(10) NOT NULL,
MASPCT VARCHAR(10) NOT NULL,
TENSPCT NVARCHAR(50) NOT NULL,
SOLUONG INT NOT NULL,
NHOMPHOBIEN BIT NOT NULL,
GIANHAP MONEY NOT NULL,
GIABAN MONEY NOT NULL,
TRANGTHAI NVARCHAR(100) NOT NULL,
MOTA NVARCHAR(200) NOT NULL,
PRIMARY KEY(ID_SPCT),
FOREIGN KEY (ID_IMAGE) REFERENCES _IMAGE(ID_IMAGE),
FOREIGN KEY (ID_SANPHAM) REFERENCES SANPHAM (ID_SANPHAM),
FOREIGN KEY (ID_MAUSAC) REFERENCES MAUSAC(ID_MAUSAC),
FOREIGN KEY (ID_KICHTHUOC) REFERENCES KICHTHUOC(ID_KICHTHUOC),
FOREIGN KEY (ID_CHATLIEU) REFERENCES CHATLIEU(ID_CHATLIEU),
FOREIGN KEY (ID_THETICH) REFERENCES THETICH(ID_THETICH),
FOREIGN KEY (ID_KHOILUONG) REFERENCES KHOILUONG(ID_KHOILUONG)
)
GO

CREATE TABLE HOADONCHITIET
(
ID_HDCT VARCHAR(10) NOT NULL,
ID_SPCT VARCHAR(10) NOT NULL,
ID_HOADON VARCHAR(10) NOT NULL,
MAHDCT VARCHAR(10) NOT NULL,
SOLUONG INT NOT NULL,
DONGIA MONEY NOT NULL,
PRIMARY KEY (ID_HDCT),
FOREIGN KEY (ID_HOADON) REFERENCES HOADON (ID_HOADON),
FOREIGN KEY (ID_SPCT) REFERENCES SANPHAMCHITIET (ID_SPCT)
)
GO

CREATE TABLE KHUYENMAI
(
ID_KHUYENMAI VARCHAR(10) NOT NULL,
MAKM VARCHAR(10) NOT NULL,
TENCT NVARCHAR(100) NOT NULL,
HINHTHUC NVARCHAR(100) NOT NULL,
BATDAU DATE NOT NULL,
KETTHUC DATE NOT NULL,
GIAMGIA FLOAT NOT NULL,
MOTA NVARCHAR(200) NOT NULL,
PRIMARY KEY (ID_KHUYENMAI)
)
GO

CREATE TABLE DANHMUC_KHUYENMAI
(
ID_DMKM VARCHAR(10) NOT NULL,
ID_KHUYENMAI VARCHAR(10) NOT NULL,
ID_DANHMUC VARCHAR(10) NOT NULL,
PRIMARY KEY(ID_DMKM),
FOREIGN KEY (ID_KHUYENMAI) REFERENCES KHUYENMAI (ID_KHUYENMAI),
FOREIGN KEY (ID_DANHMUC) REFERENCES DANHMUC (ID_DANHMUC)
)