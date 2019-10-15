create database mydata;
create table contacts
(contact_id int(11) not null auto_increment,
last_name varchar(30) not null,
first_name varchar(25),
birthday date,
constraint contacts_pk primary key(contact_id)
);
create table suppliers
(supplier_id int(11) not null auto_increment,
supplier_name varchar(50) not null,
account_rep varchar(30) not null default 'TBD',
constraint suppliers_pk primary key (supplier_id)
);
alter table contacts 
add phone int(11) after first_name, 
add address varchar(50) after phone;
alter table contacts
modify last_name varchar(50) not null,
modify first_name varchar(30);
alter table contacts
drop column first_name;
alter table contacts change column phone phoneNumber int(11);
alter table contacts rename to people;

create table users(
user_id int auto_increment primary key,
userName varchar(40),
password varchar(50),
email varchar(50)
);

create table roles(
role_id int auto_increment,
role_name varchar(50),
primary key (role_id)
);

create table userroles(
user_id int not null,
role_id int not null,
primary key(user_id,role_id),
foreign key(user_id) references users(user_id),
foreign key(role_id) references roles(role_id)
);

create table customers(
id int auto_increment primary key,
name varchar(40),
address varchar(255),
email varchar(50)
);

create table orders(
order_id int auto_increment primary key,
staff varchar(50),
customer_id int references customers(id)
);