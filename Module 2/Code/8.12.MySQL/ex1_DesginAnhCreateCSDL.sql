create database bankaccountmanagement;
create table bankaccountmanagement.Customers(
customer_number int not null primary key,
fullname nvarchar(20) not null,
address nvarchar(50)not null,
email varchar(50) not null unique,
phone varchar(12) unique);

create table bankaccountmanagement.Accounts(
account_number int primary key,
customer_number int not null,
account_type nvarchar(20),
date datetime default now(),
balance int,
foreign key(customer_number) references bankaccountmanagement.customers(customer_number)); 

create table bankaccountmanagement.Transactions(
tran_number int primary key,
account_number int,
date datetime default now(),
amounts int,
descriptions nvarchar(500),
foreign key(account_number) references bankaccountmanagement.Accounts(account_number));