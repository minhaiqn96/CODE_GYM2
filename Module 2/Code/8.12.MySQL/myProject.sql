create database myproject;

create table myproject.categories(
id int auto_increment primary key,
name nvarchar(50) unique not null,
description nvarchar(500));

create table myproject.suppliers(
id int auto_increment primary key,
name nvarchar(100) not null,
email varchar(50) unique not null,
phoneNumber varchar(50),
address nvarchar(500) not null);

create table myproject.customers(
id nvarchar(50) primary key,
firstName nvarchar(50) not null,
lastName nvarchar(50) not null,
phone varchar(50),
address nvarchar(500) not null,
email varchar(50) unique not null,
birthday datetime);

create table myproject.employees(
id varchar(50) primary key,
firstName nvarchar(50) not null,
lastName nvarchar(50) not null,
phoneNumber varchar(50),
address nvarchar(500) not null,
email varchar(50) unique not null,
birthday datetime);

create table myproject.products(
id int auto_increment primary key,
name nvarchar(50) not null,
imageURL nvarchar(1000) not null,
price decimal(18,2) not null default 0 check (price>=0),
discount decimal(18,2) not null default 0 check ((discount>=0) and (discount<=100)),
stock decimal(18,2) default 0 not null,
categoryId int not null,
supplierId int not null,
description nvarchar(1000) not null,
foreign key (categoryId) references myproject.categories(id),
foreign key (supplierId) references myproject.suppliers(id));

create table myproject.orders(
id int auto_increment primary key,
createdDate datetime not null default now(),
shippedDate datetime,
status varchar(50) not null default 'waiting',
description nvarchar(1000),
shippingAddress nvarchar(500) not null,
shippingCity nvarchar(50) not null,
paymentType varchar(20) not null default 'cash',
customerId nvarchar(50) not null,
employeeId varchar(50) not null,
check (shippedDate>=createdDate),
foreign key (customerId) references myproject.customers(id),
foreign key (employeeId) references myproject.employees(id));

create table myproject.orderDetails(
id int auto_increment primary key,
orderId int not null,
productId int not null,
quantity decimal(18,2) not null,
foreign key (orderId) references myproject.orders(id),
foreign key (productId) references myproject.products(id));

insert into myproject.categories(id,name) value (1,'Car');
insert into myproject.categories(id,name) value (2,'Bike');
insert into myproject.categories(id,name) value (3,'Office Supplier');
insert into myproject.categories(id,name) value (4,'Electronic Tool');
insert into myproject.categories(id,name) value (5,'Fruit');

insert into myproject.suppliers(id,name,email,address) value (1,'carVendor','Car@gmail.com','nearCar');
insert into myproject.suppliers(id,name,email,address) value (2,'bikeVendor','Bike@gmail.com','nearBike');
insert into myproject.suppliers(id,name,email,address) value (3,'officeSupplierVendor','OfficeSupplier@gmail.com','nearOfficeSupplier');
insert into myproject.suppliers(id,name,email,address) value (4,'electronicToolVendor','ElectronicTool@gmail.com','nearElectronicTool');
insert into myproject.suppliers(id,name,email,address) value (5,'fruitVendor','Fruit@gmail.com','nearFruit');

insert into myproject.customers(id,firstName,lastName,address,email) value (1,'Minh','Hai','homes Hai','hai@gmail.com');
insert into myproject.customers(id,firstName,lastName,address,email) value (2,'Minh','Duc','homes Duc','duc@gmail.com');
insert into myproject.customers(id,firstName,lastName,address,email) value (3,'Thi','Xuan','homes Xuan','xuan@gmail.com');
insert into myproject.customers(id,firstName,lastName,address,email) value (4,'Ly','Na','homes Na','na@gmail.com');
insert into myproject.customers(id,firstName,lastName,address,email) value (5,'Khac','Tan','homes Tan','tan@gmail.com');

insert into myproject.employees(id,firstName,lastName,address,email) value (1,'employee1','A','homesA','a@gmail.com');
insert into myproject.employees(id,firstName,lastName,address,email) value (2,'employee2','B','homesB','b@gmail.com');
insert into myproject.employees(id,firstName,lastName,address,email) value (3,'employee3','C','homesC','c@gmail.com');
insert into myproject.employees(id,firstName,lastName,address,email) value (4,'employee4','D','homesD','d@gmail.com');
insert into myproject.employees(id,firstName,lastName,address,email) value (5,'employee5','E','homesE','e@gmail.com');

insert into myproject.products(id,name,imageURL,price,discount,stock,categoryId,supplierId,description) 
value ();

insert into myproject.orders(id,createdDate,shippedDate,status,shippingAddress,shippingCity,paymentType,customerId,employeeId) 
value ();

insert into myproject.orderDetails(id,orderId,productId,quantity) value ();