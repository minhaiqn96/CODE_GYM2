create database carsalemanagement;
create table carsalemanagement.customers(
customerNumber int primary key,
customerName nvarchar(50) not null,
contactLastName nvarchar(50) not null,
contactFirstName nvarchar(50) not null,
phone varchar(50) not null,
addraddressLine1 nvarchar(50) not null,
addraddressLine2 nvarchar(50),
city nvarchar(50) not null,
state nvarchar(50) not null,
postalCode nvarchar(15) not null,
country nvarchar(50) not null,
salesRepEmployeeNumber int,
creditLimit float,
foreign key (salesRepEmployeeNumber) references employees(employeeNumber));

create table carsalemanagement.productlines(
productLine nvarchar(50) primary key,
textDescription text,
image varchar(500));

create table carsalemanagement.products(
productCode varchar(15) primary key,
productLine nvarchar(50),
productName nvarchar(70) not null,
productScale nvarchar(10) not null,
productVendor nvarchar(50) not null,
productDescription text not null,
quantityInStock int not null,
buyPrice float not null,
MSRP float not null,
foreign key (productLine) references productlines(productLine));

create table carsalemanagement.orders(
orderNumber int primary key,
customerNumber int,
orderDate datetime not null,
requiredDate datetime not null,
shippedDate datetime,
status nvarchar(15) not null,
comments text,
quantityOrdered int not null,
priceEach float not null,
foreign key (customerNumber) references customers(customerNumber));

create table carsalemanagement.payments(
customerNumber int,
checkNumber varchar(50),
paymentDate datetime not null,
amountOfMoney float not null,
primary key (customerNumber, checkNumber),
foreign key (customerNumber) references customers(customerNumber));

create table carsalemanagement.employees(
employeeNumber int primary key,
lastName nvarchar(50) not null,
firstName nvarchar(50) not null,
emai varchar(100) not null,
reportTo int,
jobTitle nvarchar(50) not null,
officeCode varchar(10),
-- foreign key (reportTo) references customers(customerNumber),
foreign key (reportTo) references employees(employeeNumber),
foreign key (officeCode) references offices(officeCode));

create table carsalemanagement.offices(
officeCode varchar(10) primary key,
city nvarchar(50) not null,
phone varchar(50) not null,
addressLine1 nvarchar(50) not null,
addressLine2 nvarchar(50),
state nvarchar(50),
country nvarchar(50) not null,
postalCode nvarchar(50) not null);

create table carsalemanagement.orderdetails(
orderNumber int,
productCode varchar(15),
primary key (orderNumber, productCode),
foreign key (orderNumber) references orders(orderNumber),
foreign key (productCode) references products(productCode)); 

insert into carsalemanagement.products(productCode,productName,productScale,productVendor,productDescription,quantityInStock,buyPrice,MSRP)
value('c08_01','elantra','1:2','mazda','aaa',123,25000,27000);
insert into carsalemanagement.products(productCode,productName,productScale,productVendor,productDescription,quantityInStock,buyPrice,MSRP)
value('c08_02','CR-V','2:3','hyundai','bbb',456,30000,40000);
insert into carsalemanagement.products(productCode,productName,productScale,productVendor,productDescription,quantityInStock,buyPrice,MSRP)
value('c08_03','CX-5','3:4',',mazda','ccc',789,50000,60000);

insert into carsalemanagement.productlines(productLine,textDescription)
value('Classic cars','123');
insert into carsalemanagement.productlines(productLine,textDescription)
value('Motorcycles','456');
insert into carsalemanagement.productlines(productLine,textDescription)
value('Cycles','789');

-- products
update carsalemanagement.products set productVendor ='mazda' where productCode='c08_03';
update carsalemanagement.products set productLine ='Classic cars' where productCode='c08_01';
update carsalemanagement.products set productLine ='Motorcycles' where productCode='c08_02';
update carsalemanagement.products set productLine ='Motorcycles' where productCode='c08_03';

select productCode,productName,productVendor,quantityInStock,buyPrice from carsalemanagement.products 
where buyPrice>29000 and quantityInStock> 100;

select productCode,productName,buyPrice,textDescription
from carsalemanagement.products
inner join carsalemanagement.productlines
on products.productLine = productlines.productLine
where buyPrice>24000 and buyPrice<55000;

select productCode, productName, buyPrice, quantityInStock, productVendor, productLine
from carsalemanagement.products
where productVendor='mazda' or productLine='Motorcycles';

