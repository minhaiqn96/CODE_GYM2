create database furama;

create table furama.accomodation_category(
acc_category_id nvarchar(50) primary key,
acc_category_name nvarchar(50),
size int not null,
price float not null);

create table furama.accomodation_type(
acc_type_id nvarchar(50) primary key,
acc_category_id nvarchar(50) not null,
acc_type_name nvarchar(50) not null,
amount_bed int not null,
price float not null,
employee_number nvarchar(50) not null,
description nvarchar(50),
foreign key (acc_category_id) references furama.accomodation_category(acc_category_id),
foreign key (employee_number) references furama.employees(employee_number));

create table furama.payments(
payment_type_id nvarchar(50) primary key,
payment_type_name nvarchar(50) not null,
payment_date date not null,
amount_money float,
customer_number nvarchar(50) not null,
foreign key (customer_number) references furama.customer(customer_number));

create table furama.customer(
customer_number nvarchar(50) primary key,
customer_first_name nvarchar(50) not null,
customer_last_name nvarchar(50) not null,
amount_days_rent int not null,
age int not null,
address nvarchar(50) not null,
city nvarchar(50) not null,
country nvarchar(50) not null);

create table furama.offices(
office_code nvarchar(50) primary key,
phone nvarchar(50) not null,
location nvarchar(50) not null);

create table furama.employees(
employee_number nvarchar(50) primary key,
employee_first_name nvarchar(50) not null,
employee_last_name nvarchar(50) not null,
job_postion nvarchar(50) not null,
office_code nvarchar(50) not null,
age int not null,
address nvarchar(50) not null,
city nvarchar(50) not null,
country nvarchar(50) not null,
foreign key (office_code) references furama.offices(office_code));

create table furama.orders(
order_number nvarchar(50) primary key,
customer_number nvarchar(50) not null,
date_order date not null,
date_receive date not null,
status nvarchar(500),
foreign key (customer_number) references furama.customer(customer_number));

create table furama.order_details(
order_number nvarchar(50) not null,
acc_type_id nvarchar(50) not null,
primary key(order_number,acc_type_id),
amount_order int not null,
price_each float not null,
order_line_number nvarchar(50),
foreign key (order_number) references furama.orders(order_number),
foreign key (acc_type_id) references furama.accomodation_type(acc_type_id));

create table furama.library_category(
library_categogy_id nvarchar(50) primary key,
library_categogy_name nvarchar(50) not null,
image nvarchar(500));

create table furama.library_type(
library_type_code nvarchar(50) primary key,
library_categogy_id nvarchar(50) not null,
library_type_name nvarchar(50) not null,
quatity_stock int not null,
customer_number nvarchar(50) not null,
foreign key (library_categogy_id) references furama.library_category(library_categogy_id),
foreign key (customer_number) references furama.customer(customer_number));

create table furama.swimmingPool(
swimming_id nvarchar(50) primary key,
hour_open int not null,
price_each_hour float not null,
description nvarchar(50));

alter table furama.customer
add column swimming_id nvarchar(50),
add foreign key (swimming_id) references furama.swimmingPool(swimming_id);

alter table furama.employees 
add column salary float not null after office_code;

alter table furama.customer
add column date_of_birth date not null
after age;

-- b1
update furama.accomodation_type set price=(price*110)/100 where acc_type_id(vil);
-- b2 
update furama.swimmingPool set hour_open = 8 where swimming_id='swp';
-- b3
-- c1 
select acc_type_id, acc_category_id, acc_type_name, amount_bed, price, employee_number from furama.accomodation_type
where employee_number is not null and acc_category_id='hou';
-- c2
select acc_type_id, acc_category_id, acc_type_name, amount_bed, price from furama.accomodation_type
where acc_category_id = 'vil' and employee_number is null;
-- c3
select employee_number, employee_first_name, employee_last_name, job_postion, office_code, salary, age, address, city, country
from furama.employees
where salary <= 10000;
-- c4
select customer_number, customer_first_name, customer_last_name, age, address, city, country 
from furama.customer
where address in ('Phuong Hoan Co Tran','Dong Hoi');
-- c5 
select customer_number, customer_first_name, customer_last_name, age, date_of_birth, address, city, country
from furama.customer
where year(date_of_birth) = 1990;
-- c6 
select customer_number, customer_first_name, customer_last_name, age, date_of_birth, address, city, country
from furama.customer
where day(date_of_birth) = day(now()) and month(date_of_birth) = month(now());
-- c7
select order_number, customer_number, date_order, date_of_payment, status
from furama.orders
where status = 'paid';
-- c8
select order_number, customer_number, date_order, date_of_payment, status
from furama.orders
where status = 'paid' and date(date_of_payment) = date(now());
-- c9
select employee_first_name, employee_last_name, job_postion, office_code, date_of_birth, age, address, city, country
from furama.employees 
where year(date_of_birth) between 1996 and 2000;
-- c10
select employee_first_name, employee_last_name, job_postion, office_code, date_of_birth, age, address, city, country
from furama.employees 
where (year(now()) - year(date_of_birth))  > 45 ;
-- c11
select order_number, acc_type_id, amount_day_order, payment_method
from furama.order_details
where payment_method = 'payment_type3';
-- c12
select order_number, acc_type_id, amount_day_order, payment_method
from furama.order_details
where payment_method = 'payment_type2';
-- c13
-- c14
select employee_first_name, employee_last_name, job_postion, office_code, date_of_birth, age, address, city, country
from furama.employees 
where month(date_of_birth) = 8 ;
-- c15
select acc_category_name, acc_type_id, acc_type_name
from furama.accomodation_type
inner join furama.accomodation_category
on accomodation_type.acc_category_id = accomodation_category.acc_category_id;
-- c16
select order_number, date_order, customer_first_name, customer_last_name, customer_last_name, age, 
address, city, country
from furama.orders
inner join furama.customer
on orders.customer_number = customer.customer_number;
-- c17
select order_number, employee_first_name as 'invoice_creation_staff', date_order, customer_first_name, customer_last_name, customer.age, 
customer.address, customer.city, customer.country
from furama.orders
inner join furama.customer on orders.customer_number = customer.customer_number
inner join furama.employees on orders.invoice_creation_staff = employees.employee_number;
-- c18
select acc_category_name, acc_type_name, size, amount_bed, accomodation_category.price
from furama.accomodation_category   
inner join furama.accomodation_type
on accomodation_category.acc_category_id = accomodation_type.acc_category_id;
-- c19
select employee_number, employee_first_name, job_postion, office_code, count(employee_number) as 'Number_of_times_employee_created_table'
from furama.employees 
inner join furama.orders
on employees.employee_number = orders.invoice_creation_staff
group by orders.invoice_creation_staff
order by Number_of_times_employee_created_table desc
limit 3;
-- c20
select acc_type_name, amount_bed, price 
from furama.accomodation_type
inner join furama.order_details on accomodation_type.acc_type_id = order_details.acc_type_id
inner join furama.orders on order_details.order_number = orders.order_number
where orders.date_checkin between '2019-06-01' and '2019-07-01';
 -- c21
select orders.order_number, orders.customer_number, customer_first_name, customer_last_name, amount_days_rent, orders.date_checkin
from furama.customer
inner join furama.orders on customer.customer_number = orders.customer_number
where orders.date_checkin between '2019-06-01' and '2019-07-01';
-- c22
select orders.order_number, orders.customer_number, customer_first_name, customer_last_name, amount_days_rent, 
orders.date_checkin, ((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Total payment'
from furama.customer
inner join furama.orders on customer.customer_number = orders.customer_number
inner join furama.order_details on orders.order_number = order_details.order_number
inner join furama.accomodation_type on order_details.acc_type_id = accomodation_type.acc_type_id
inner join furama.accomodation_category on accomodation_type.acc_category_id = accomodation_category.acc_category_id
where ((accomodation_category.price * customer.amount_days_rent ) * 23000) >= 1000000
and orders.date_checkin between '2019-01-01' and now();
-- c23
select orders.order_number, orders.customer_number, date_order, date_of_payment, date_checkin,
((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Total payment'
from furama.customer
inner join furama.orders on customer.customer_number = orders.customer_number
inner join furama.order_details on orders.order_number = order_details.order_number
inner join furama.accomodation_type on order_details.acc_type_id = accomodation_type.acc_type_id
inner join furama.accomodation_category on accomodation_type.acc_category_id = accomodation_category.acc_category_id;
-- c24
select employees.employee_number,employee_accomodation_categoryaccomodation_categoryfirst_name, employee_last_name, job_postion,
((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Total sale'
from furama.employees
inner join furama.orders on employees.employee_number = orders.invoice_creation_staff
inner join furama.customer on customer.customer_number = orders.customer_number
inner join furama.order_details on orders.order_number = order_details.order_number
inner join furama.accomodation_type on order_details.acc_type_id = accomodation_type.acc_type_id
inner join furama.accomodation_category on accomodation_type.acc_category_id = accomodation_category.acc_category_id;
-- 25
select orders.customer_number, customer_first_name, customer_last_name, amount_days_rent, orders.date_checkin,
((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Total_payment'
from furama.customer
inner join furama.orders on customer.customer_number = orders.customer_number
inner join furama.order_details on orders.order_number = order_details.order_number
inner join furama.accomodation_type on order_details.acc_type_id = accomodation_type.acc_type_id
inner join furama.accomodation_category on accomodation_type.acc_category_id = accomodation_category.acc_category_id
where date_checkin between '2019-05-01' and '2019-06-01'
order by Total_payment desc
limit 3;
-- c26
select acc_category_name, accomodation_category.size, amount_bed,
-- ((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Total_sale_each_type',
sum((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Total_sale'
from furama.accomodation_category
inner join furama.accomodation_type on accomodation_category.acc_category_id = accomodation_type.acc_category_id
inner join furama.order_details on accomodation_type.acc_type_id = order_details.acc_type_id
inner join furama.orders on order_details.order_number = orders.order_number
inner join furama.customer on orders.customer_number = customer.customer_number
group by acc_category_name;
-- c27
select orders.order_number, orders.customer_number, date_order, date_of_payment, date_checkin,
((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Total payment'
from furama.customer
inner join furama.orders on customer.customer_number = orders.customer_number
inner join furama.order_details on orders.order_number = order_details.order_number
inner join furama.accomodation_type on order_details.acc_type_id = accomodation_type.acc_type_id
inner join furama.accomodation_category on accomodation_type.acc_category_id = accomodation_category.acc_category_id
where year(orders.date_of_payment) = 2019;
-- c28
select orders.order_number, orders.customer_number, date_order, date_of_payment, date_checkin,
min((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Total_payment_min'
from furama.customer
inner join furama.orders on customer.customer_number = orders.customer_number
inner join furama.order_details on orders.order_number = order_details.order_number
inner join furama.accomodation_type on order_details.acc_type_id = accomodation_type.acc_type_id
inner join furama.accomodation_category on accomodation_type.acc_category_id = accomodation_category.acc_category_id
where date_checkin between '2019-01-01' and '2019-07-01';
-- c29
select count(orders.order_number) as 'Number_Of_Invoice',
avg((accomodation_category.price * customer.amount_days_rent ) * 23000) as 'Average_payment'
from furama.customer
inner join furama.orders on customer.customer_number = orders.customer_number
inner join furama.order_details on orders.order_number = order_details.order_number
inner join furama.accomodation_type on order_details.acc_type_id = accomodation_type.acc_type_id
inner join furama.accomodation_category on accomodation_type.acc_category_id = accomodation_category.acc_category_id
where date_checkin between '2019-01-01' and '2019-07-01';