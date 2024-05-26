create database DoAnCk
drop table KHOA
drop table CACKHOA
CREATE TABLE CACKHOA(
	MaKhoa char(5) Primary key,
	TenKhoa nvarchar(50) Not null unique,
	DienThoai nvarchar(12)
)
drop table LOP
CREATE TABLE LOP(
	MaLop char(10) Primary key,			--Khoa chinh
	TenLop nvarchar(50) Not null unique,--Ten lop khong trung nhau
	KhoaHoc tinyint CHECK(KhoaHoc >0),	--Khoa hoc phai la so duong
	HeDaoTao nvarchar(50) default N'Chính quy',	--Mac dinh nhan chinh quy
	NamNhapHoc smallint default 2023,
	MaKhoa char(5) REFERENCES KHOA(MaKhoa) -- Tao quan he voi bang KHOA
)
drop table sinhvien
CREATE TABLE SINHVIEN(	-- Lenh tao bang
	MaSV char(10) not null primary key,
	HoDem nvarchar(50) not null,
	Ten nvarchar(20) not null,
	GioiTinh bit,
	NgaySinh Date,
	NoiSinh nvarchar(100),
	MaLop char(10) references LOP(MaLop)--Lien ket den bang Lop
)
drop table sach
CREATE TABLE Sach(	-- Lenh tao bang
	masach char(10) not null primary key,
	Tensach nvarchar(50) not null,
	Nhaxuatban nvarchar(50) not null,
	Soluong int check (Soluong >0)
)
Drop table Phieumuon
CREATE TABLE Phieumuon (
    Masach CHAR(10) NOT NULL REFERENCES Sach(Masach),
    MaSV CHAR(10) NOT NULL REFERENCES SINHVIEN(MaSV),
    sophieu TINYINT NOT NULL CHECK (sophieu > 0),
    ngaymuon DATE NOT NULL CHECK (ngaymuon >= '1900-01-01'),  
	ngaytra DATE NOT NULL CHECK (ngaytra >= '1900-01-01'),
	-- Sử dụng kiểu dữ liệu DATE cho ngày
    PRIMARY KEY (sophieu)
);
select * from Sach
insert into Sach value (
's112' , 'OOP java & C++' , 'dev', '20'
);

ALTER TABLE Phieumuon
ADD COLUMN HoDem NVARCHAR(50) NOT NULL,
ADD COLUMN Ten NVARCHAR(20) NOT NULL;

select * from Sach

INSERT INTO Phieumuon (Masach, MaSV, sophieu, ngaymuon, ngaytra)
VALUES ('s100', 'dh05-052  ', 3, '2023-01-18', '2023-02-02', 'Phan Anh' ,'Thắng');

-- Câu lệnh thêm bản ghi đầu tiên
INSERT INTO Phieumuon (Masach, MaSV, sophieu, ngaymuon, ngaytra, HoDem, Ten)
VALUES ('s100', 'dh05-052', 3, '2023-01-18', '2023-02-02', 'Phan Anh', 'Thắng');

-- Câu lệnh thêm bản ghi thứ hai (nếu cần)
INSERT INTO Phieumuon (Masach, MaSV, sophieu, ngaymuon, ngaytra, HoDem, Ten)
VALUES ('s101', 'dh05-053', 4, '2023-01-20', '2023-02-05', 'Nguyen', 'Van A');

select * from phieumuon 
select * from SINHVIEN where MaSV = 'dl17-061   '
select * from sach
select * from Phieumuon where MaSV like 'dl17-061  '


INSERT INTO CACKHOA
VALUES('cnud', N'Công nghệ Thông tin', '962962-445'),
		('daic', N'Đại cương','962962-449'),
		('khmt', N'Khoa học Máy tính', '962962-450'),
		('kt', N'kinh tế', '962962-451'),
		('ktmt', N'kỹ thuật máy tính', '962962-452'),
		('nn' , N'Ngoại ngữ', '962962-453');
		select * from lop
INSERT INTO LOP
VALUES
	('dh01', N'Đồ họa 5', '1', N'Chính quy', 2020, 'cnud'),
	('dh02', N'Đồ họa 2', '2', N'Chính quy', 2021, 'cnud'),
	('dh03', N'Đồ họa 3', '3',  N'Chính quy', 2022, 'cnud'),
	('dh04', N'Đồ họa 4', '3',  N'Chính quy', 2023, 'cnud'),
	('oop04', N'Lập trình hướng đối tượng', '3',  N'Chính quy', 2023, 'cnud'),
	('knm01', N'kỹ năng mềm ', '3', N'Chính quy', 2023, 'khmt'),
	('tkw01', N'Thiết kế web', '3', N'Chính quy', 2023, 'cnud'),
	('ta1', N'tiếng anh 1', '3', N'Chính quy', 2023, 'nn'),
	('ta2', N'tiếng anh 2', '3', N'Chính quy', 2023, 'nn'),
	('trr02', N'toán rời rạc', '2', N'Chính quy', 2022, 'daic'),
	('tacn03', N'tiếng anh CN 1', '3', N'Chính quy', 2023, 'nn'),
	('tacn03', N'tiếng anh CN 2', '3', N'Chính quy', 2023, 'nn'),
	('ltcb03', N'Lập trình cơ bản', '3', N'Chính quy', 2023, 'cnud'),
	('ctdl&gt', N'Cấu trúc dữ liệu và giải thuật', '3', N'Chính quy', 2023, 'cnud'),
	('dl01', N'Dữ liệu 1', '1', N'Chính quy', 2020, 'khmt'),
	('dl02', N'Dữ liệu 2', '2', N'Chính quy', 2021, 'khmt'),
	('dl03', N'Dữ liệu 3', '2', N'Chính quy', 2022, 'khmt'),
	('dl04', N'Dữ liệu 2', '2', N'Chính quy', 2023, 'khmt'),
	('ml01', N'Triết học Mác-Lênin 1', '1', N'Chính quy', 2021, 'daic'),
	('ml02', N'Triết học Mác-Lênin 2', '2', N'Chính quy', 2020, 'daic'),
	('ktml01', N'Kinh tế chính trị Mác Lênin 1', '1',  N'Chính quy', 2021, 'kt'),
	('ktml02', N'Kinh tế chính trị Mác Lênin 2', '2',  N'Chính quy', 2020, 'kt'),
	('cnxh01', N'Chủ nghĩa xã hội khoa học 1', '1',  N'Chính quy', 2021, 'daic'),
	('cnxh02', N'Chủ nghĩa xã hội khoa học 1', '2',  N'Chính quy', 2020, 'daic'),
	('csdl04', N'cơ sở dữ liệu 1', '1', N'Chính quy', 2023, 'cnud'),
	('gt01', N'giải tích 1', '1', N'Chính quy', 2023, 'daic'),
	('gt02', N'giải tích 2', '1', N'Chính quy', 2022, 'daic'),
	('mk01', N'Marketing 1', '1', N'Chính quy', 2020, 'kt'),
	('mk02', N'Marketing 2', '2', N'Chính quy', 2021, 'kt'),
	('mk03', N'Marketing 3', '3', N'Chính quy', 2022, 'kt'),
	('mk04', N'Marketing 1', '4', N'Chính quy', 2023, 'kt'),
	('lt01a', N'Lập trình 1 A', '1', N'Chính quy', 2020, 'khmt'),
	('lt01b', N'Lập trình 1 B', '1', N'Chính quy', 2021, 'khmt'),
	('lt02', N'Lập trình 2', '2', N'Chính quy', 2023, 'khmt'),
	('mm01', N'Mạng máy tính 1', '1', N'Chính quy', 2022, 'khmt'),
	('qc02a', N'Quảng cáo 2A', '2', N'Chính quy', 2020, 'kt'),
	('tm01', N'Thương mại điện tử 1', '1', N'Chính quy', 2021, 'kt'),
	('tm02', N'Thương mại điện tử 2', '2', N'Chính quy', 2022, 'kt'),
	('tk01', N'Thiết kế mỹ thuật số 1', '1', N'Chính quy', 2022, 'kt');

	INSERT INTO SINHVIEN
	VALUES
('dl20-144', N'Trần Minh', N'Ngọc', 0, '14-1-2005', N'Duy Xuyên, Quảng Nam', 'tm01'),
('dl101-145', N'Phan Thị', N'Hương', 1, '3-3-2002', N'Thừa Thiên Huế', 'tm02'),
('dl102-146', N'Nguyễn Văn', N'Thảo', 0, '18-5-2002', N'Hương Thủy, Thừa Thiên Huế', 'tm02');


select * from Phieumuon




select * from Sach
	select * from SINHVIEN
	INSERT INTO SINHVIEN
VALUES
('dl20-144', N'Trần Minh', N'Ngọc', 0, '2005-01-14', N'Duy Xuyên, Quảng Nam', 'tm01');
INSERT INTO Sach 
VALUES
('s301', N'Lập trình C#', N'NXB GD&DT', 100)
INSERT INTO Phieumuon
VALUES 
('s100', 'dh02-002', 2 , '2023-02-02', '2023-08-03')
('s301', 'dl20-144', 1, '2023-01-01', '2023-02-01');
-- Câu lệnh thêm một bản ghi vào bảng Phieumuon
INSERT INTO Phieumuon (Masach, MaSV, sophieu, ngaymuon, ngaytra)
VALUES ('s100', 'dh02-002', 3, '2023-02-02', '2023-08-03');

select * from Phieumuon where MaSV = 'dh02-002'
select * from SINHVIEN
update SINHVIEN set MaSV = ' dl01-00100  '  where Hodem = 'Trần Tuấn' and Ten = 'Anh';
	INSERT INTO SINHVIEN
VALUES ('lt02-003', N'Phan Thị', N'Hương', 1, '2003-05-15', N'Thăng Bình, Quảng Nam', 'cnxh01');
INSERT INTO SINHVIEN
VALUES
('lt05-006', N'Nguyễn Văn', N'Hiệp', 0, '2003-11-21', N'Phú Thượng, Huế', 'cnxh01'),
('lt06-007', N'Hoàng Thị', N'Mai', 1, '2003-04-06', N'Thăng Bình, Quảng Nam', 'cnxh01');


UPDATE SINHVIEN
SET MaSV = 'dl01-00100'
WHERE Hodem = 'Trần Tuấn' AND Ten = 'Anh';


INSERT INTO SINHVIEN
VALUES
('mm01-010', N'Lê Văn', N'Bằng', 1, '2005-05-08', N'Kỳ Anh - Hà Tĩnh', 'ktml02'),
('tm01-020', N'Hà Ngọc', N'Anh', 1, '2005-03-03', N'Thăng Bình, Quảng Nam', 'ktml02'),
('tm02-021', N'Phương Mai', N'Tuấn', 1, '2002-07-15', N'Phú Nhuận, Huế', 'ktml02'),
('tm03-022', N'Thị Hương', N'Dương', 0, '2001-05-20', N'Quận 10, Quảng Trị', 'ktml02'),
('tm04-023', N'Quang Huy', N'Trí', 1, '2002-11-10', N'Long Biên, Quảng Trị', 'ktml02'),
('tm05-024', N'Hồng Nhung', N'Thảo', 0, '2002-09-08', N'Kỳ Anh - Hà Tĩnh', 'ktml02'),
('tm06-025', N'Văn Hải', N'Đức', 1, '2002-04-05', N'Tân Bình, Quảng Nam', 'ktml02'),
('tm07-026', N'Thị Thu Hà', N'An', 0, '2003-12-12', N'Tân Bình, Quảng Nam', 'ktml02'),
('tm08-027', N'Quốc Bảo', N'Minh', 1, '2003-06-07', N'Thăng Bình, Quảng Nam', 'ktml02'),
('tm09-028', N'Kim Ngân', N'Văn', 1, '2001-03-18', N'Quận 1, Quảng Trị', 'ktml02'),
('tm10-029', N'Đức Thắng', N'Tuấn', 1, '2004-02-23', N'Hoàng Mai, Hà Nội', 'ktml02'),
('tm11-030', N'Thị Linh', N'Trang', 0, '2004-01-09', N'Thủ Đức, TP.Hồ Chí Minh', 'ktml02'),
('tm12-031', N'Quang Nam', N'Thành', 1, '2004-08-14', N'Thăng Bình, Quảng Nam', 'ktml02'),
('tm13-032', N'Hải Yến', N'Thùy', 0, '2000-06-30', N'Tam Kỳ, Quảng Nam', 'ktml02'),
('tm14-033', N'Văn Phương', N'Bình', 1, '2002-05-04', N'Tam Kỳ, Quảng Nam', 'dhmt'),
('tm15-034', N'Quỳnh Anh', N'Ngọc', 0, '2002-10-11', N'Hội An, Quảng Nam', 'dhmt'),
('tm16-035', N'Đức Hùng', N'Trí', 1, '2003-09-17', N'Hội An, Quảng Nam', 'dhmt'),
('tm17-036', N'Thị Thảo', N'Trâm', 0, '2005-04-22', N'Đại Lộc, Quảng Nam', 'dhmt'),
('tm18-037', N'Quang Thắng', N'Anh', 1, '2003-11-27', N'Điện Bàn, Quảng Nam', 'dhmt'),
('tm19-038', N'Kim Thanh', N'Mai', 1, '2002-03-03', N'Hiệp Đức, Quảng Nam', 'dhmt'),
('tm20-039', N'Văn Dũng', N'Tuấn', 1, '2004-07-19', N'Hiệp Đức, Quảng Nam', 'dhmt'),
('tm21-040', N'Thị Hà', N'Hoài', 0, '2003-05-14', N'Nam Trà My, Quảng Nam', 'dhmt');


INSERT INTO SINHVIEN
VALUES
('dl04-054', N'Đỗ Thị', N'Ngọc', 0, '2002-09-21', N'Bình Sơn, Quảng Ngãi', 'dl04');


INSERT INTO SINHVIEN
	VALUES
  ('dl04-054', N'Đỗ Thị', N'Ngọc', 0, '21-9-2002', N'Bình Sơn, Quảng Ngãi', 'dl04'),
  	INSERT INTO SINHVIEN
VALUES ('dl010-054', N'Đỗ Thị', N'Ngọc', 0, CONVERT(DATE, '2002-09-21'), N'Bình Sơn, Quảng Ngãi', 'dl03');
	INSERT INTO SINHVIEN
VALUES
('dl010-054', N'Đỗ Thị', N'Ngọc', 0, CONVERT(DATE, '2002-09-21'), N'Bình Sơn, Quảng Ngãi', 'dl03'),
('dl11-055', N'Lê Minh', N'Thùy', 1, CONVERT(DATE, '2002-06-17'), N'Sơn Tịnh, Quảng Ngãi', 'dl03');
('dl100-144', N'Trần Thị', N'Ngọc', 0, '15-1-2002', N'Duy Xuyên, Quảng Nam', 'tm01'),
('dl101-145', N'Phan Thị', N'Hương', 1, '3-3-2002', N'Thừa Thiên Huế', 'tm02'),
('dl102-146', N'Nguyễn Văn', N'Thảo', 0, '18-5-2002', N'Hương Thủy, Thừa Thiên Huế', 'tm02'),
INSERT INTO Sach 
VALUES
('s44', N'Lập trình hướng đối tượng JAVA core dành cho người mới', N'NXB VN', 1);
('s68', N'Tôi đã kiếm 2.000.000 USD từ thị trường chứng khoán như thế nào? ', N'Nicolas Darvas', 1),
('s89', N'pháp luật đại cương', N'NXB HN', 12),
 select * from sach
INSERT INTO Sach 
VALUES
('s109', N'c++ cơ bản', N'NXB GD&DT', 32),


('s90', N'Đổi Mới Sáng Tạo ', N' Larry Keeley, Ryan Pikkel, Brian Quinn, Helen Walters', 12);
drop table DIEMTHI
drop table HOCPHAN
drop table KHOA
select * from Sach
	select * from SINHVIEN
	UPDATE Sach
SET SoLuong = 25
WHERE MaSach = 's67' 

select * from Phieumuon
select * from sach
select * from Account where Username='user01' and Password='123456'

select * from sinhvien
DELETE FROM Sach
WHERE masach= 's108';

CREATE TABLE Signup (
    masv CHAR(10) NOT NULL PRIMARY KEY,
    tendangnhap NVARCHAR(50) NOT NULL,
    matkhau NVARCHAR(50) NOT NULL,
    nhaplaimk INT CHECK (nhaplaimk >= 0) 
);
insert into Signup 
values 
('dh06-003', 'happy', '123456', '123456')
-- MaSV char(10) not null primary key,
-- HoDem nvarchar(50) not null,
-- Ten nvarchar(20) not null,
-- GioiTinh bit,
-- NgaySinh Date,
-- NoiSinh nvarchar(100),
-- MaLop char(10) references LOP(MaLop)
-- ('dl100-144', N'Trần Thị', N'Ngọc', 0, '15-1-2002', N'Duy Xuyên, Quảng Nam', 'tm01'),
select * from SINHVIEN
update SINHVIEN set Hodem = N'Lê Thị Ngọc' , Ten = N'Huệ ', GioiTinh = 0, NgaySinh = '27-3-2005' , NoiSinh = N'Duy Xuyên', MaLop = 'dh03' where MaSV = 'dh01-003' ;
UPDATE SINHVIEN
SET 
    Hodem = N'Lê Ngọc',
    Ten = N'Trúc',
    GioiTinh = 1,
    NgaySinh = '27-4-2005',
    NoiSinh = N'Đại Lộc',
    MaLop = 'java'
WHERE
    MaSV = 'dl15-059' ;
	update SINHVIEN
set 
    Hodem = N'Lê Ngọc',
    Ten = N'Trúc',
    GioiTinh = 1,
    NgaySinh = '2005-04-27', 
    NoiSinh = N'Đại Lộc',
    MaLop = 'java'
	select * from SINHVIEN
where
    MaSV = 'dl15-059';

	INSERT INTO SINHVIEN VALUES ('dl0100-05', N'Đỗ', N'Ngọc', 0, CONVERT(DATE, '2002-09-21'), N'Bình Sơn, Quảng Ngãi', 'dl03')
	select * from SINHVIEN
	SELECT *
FROM SINHVIEN
WHERE MaSV = 'dh02-002' 
LIKE '%a Mai' 
SELECT *
FROM SINHVIEN
like MaSV = 'dh02-002' 

SELECT *
FROM SINHVIEN
WHERE MaSV LIKE N'dh02-002%'
select * from sach
select * from sach where masach = 's10'
select * from Account
update Account set Password = 1234 , enterpassword = 1234 where Username = 'MyMy'
select * from Phieumuon
insert into Sach values (
's112' , 'OOP java & C++' , 'dev', '20'
)
select * from Sinhvien where Hodem like '%M'