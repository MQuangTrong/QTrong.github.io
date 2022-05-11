create database DB_ATM
go
use DB_ATM
go

-- tao bang khach hang
create table customer
(
	Sotaikhoan varchar(50) not null primary key,
	Password nvarchar(10),
	Name varchar(50),
	Address	varchar(100),
	Date datetime,
	Email varchar(50) unique,
	Phone nvarchar(50) unique,
	Money float,
	Gender bit,

)
drop table customer
-- tao bang lich su giao dich
create table history
(
	Id int identity not null primary key,
	MaId int constraint FK_loaiGD foreign key (MaId) references LoaiGiaoDich ,
	Sotaikhoan varchar(50),
	Date datetime,
	Sotien float,	
)

select * from history

drop table history
ALTER TABLE history
DROP CONSTRAINT FK_lichsu;
-- tao bang LoaiGD
create table LoaiGiaoDich
(
	MaId int  identity not null primary key,
	Reason varchar(50) ,
	Content varchar(50),
)
INSERT LoaiGiaoDich(Reason) values ('Rut Tien')
INSERT LoaiGiaoDich(Reason) values ('Nap Tien')
INSERT LoaiGiaoDich(Reason) values ('Chuyen tien')
INSERT LoaiGiaoDich(Reason) values ('Nhan tien')

select * from LoaiGiaoDich

-- tao khoa ngoai bang history voi ban customer
alter table history 
ADD CONSTRAINT FK_lichsu
FOREIGN KEY (Sotaikhoan) 
REFERENCES customer(Sotaikhoan)
-- tao thu tuc lay du lieu tu bang customer
create proc getCustomer
as
select * from customer
go
-- tao thu tuc them du lieu vao bang customer
create proc addNewCustomer
	@Sotaikhoan varchar(50),
	@Password nvarchar(10),
	@Name varchar(50),
	@Address	varchar(100),
	@Date datetime,
	@Email varchar(50),
	@Phone nvarchar(50),
	@Money float,
	@Gender bit
as
	begin 
	insert into customer values (@Sotaikhoan,@Password,@Name,@Address,@Date,@Email,@Phone,@Money,@Gender)
	end
go
-- tao thu tuc getCustomerId
create proc getCustomerId
	@Sotaikhoan varchar(50)
as
select * from customer where Sotaikhoan=@Sotaikhoan
go


-- tao thu tuc update customer
 create proc updateCustomer
	@Sotaikhoan varchar(50),
	@Password nvarchar(10),
	@Name varchar(50),
	@Address	varchar(100),
	@Date datetime,
	@Email varchar(50),
	@Phone nvarchar(50),
	@Money float,
	@Gender bit
as
	begin 
	update customer set Sotaikhoan=@Sotaikhoan,Password=@Password,Name=@Name,Address=@Address,Date=@Date,Email=@Email,Phone=@Phone,Money=@Money,Gender=@Gender where Sotaikhoan=@Sotaikhoan
	end
go
drop proc updateCustomer
-- tao thu tuc xoa du lieu bảng customer
 create proc deleteCustomer
	@Sotaikhoan varchar(50)
as
delete from customer where Sotaikhoan=@Sotaikhoan
go

-- tao thu tuc update mat khau
create proc updatePass
	@Sotaikhoan varchar(50),
	@Password nvarchar(10)
as
 update customer set Password=@Password where Sotaikhoan=@Sotaikhoan
 go
 

 select * from customer

--tao proc check pass
create proc checkPass
	@Sotaikhoan varchar(50),
	@Password nvarchar(10)
as
select * from customer where Sotaikhoan=@Sotaikhoan and Password=@Password
go
-- tao thu tuc update money
create proc updateMoney
	@Sotaikhoan varchar(50),
	@Money float
as
 update customer set Money=@Money where Sotaikhoan=@Sotaikhoan
 go

 -- create thu tuc insertHistory
 create proc insertHistory 
	@MaId int ,
	@Sotaikhoan varchar(50),
	@Date datetime,
	@Sotien float
as
	begin 
	insert into history values (@MaId,@Sotaikhoan,getdate(),@Sotien)
	end
go
drop proc  insertHistory
-- tao thu tuc getHistory
create proc getHistory
as
select * from history join LoaiGiaoDich on history.MaId = LoaiGiaoDich.MaId
go
-- tao thu tuc getHistoryStk
create proc getHistoryStk
	@Sotaikhoan varchar(50)
as
select * from history join LoaiGiaoDich on history.MaId = LoaiGiaoDich.MaId where Sotaikhoan=@Sotaikhoan
go

