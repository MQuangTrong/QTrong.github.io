create database ATMDB
go
use ATMDB
go
-- tao bang khach hang
create table customer
(
	Id varchar(50) not null primary key,
	Name varchar(50),
	Address	varchar(100),
	Date datetime,
	Email varchar(50),
	Phone nvarchar(50),
	Gender bit,
)
ALTER TABLE history
DROP CONSTRAINT FK_lichsu
drop table account

-- tao bang tai khoan
create table account
(
	Sotaikhoan varchar(50) primary key,
	Customer_id varchar(50),	
	Password varchar(50),
	Status bit,
)

-- tao bang lich su giao dich
create table history
(
	Id int identity not null primary key,
	Sotaikhoan varchar(50),
	Date datetime,
	Sotien float(50),
	Reason varchar(50)
)
-- tao khoa ngoai bang account voi bang customer
alter table account 
ADD CONSTRAINT FK_taikhoan
FOREIGN KEY (Customer_id) 
REFERENCES customer(Id)
-- tao khoa ngoai bang history voi bang account
alter table history 
ADD CONSTRAINT FK_lichsu
FOREIGN KEY (Sotaikhoan) 
REFERENCES account(Sotaikhoan)
-- tao thu tuc insert khach hang
create proc addNewCustomer
    @Id varchar(50),
	@Name varchar(50),
	@Address	varchar(100),
	@Date datetime,
	@Email varchar(50),
	@Phone nvarchar(50),
	@Gender bit
as
	begin 
	insert into customer values (@Id,@Name,@Address,@Date,@Email,@Phone,@Gender)
	end
go
drop proc addNewCustomer
-- tao thu tuc insert account
create proc addNewAccount
	@Sotaikhoan varchar(50),
	@Customer_id int,	
	@Password varchar(50),
	@Status bit
as
	begin 
	insert into account values (@Sotaikhoan,@Customer_id,@Password,@Status)
	end
go
-- thu tuc lay du lieu tu bang khach hang
create proc getCustomer
as
select * from customer
go

select * from customer
