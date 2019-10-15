select * from classicmodels.orders;
select status from classicmodels.orders
group by status;

select status, count(*) as "So luong status" 
from classicmodels.orders
group by status;

select status, sum(classicmodels.orderdetails.quantityOrdered * classicmodels.orderdetails.priceEach) as amount
from classicmodels.orders
inner join classicmodels.orderdetails 
on classicmodels.orders.orderNumber = classicmodels.orderdetails.orderNumber
group by status;

select classicmodels.orderdetails.orderNumber, sum(classicmodels.orderdetails.quantityOrdered * classicmodels.orderdetails.priceEach) as total
from classicmodels.orderdetails 
group by classicmodels.orderdetails.orderNumber;

select classicmodels.orders.orderNumber, year(classicmodels.orders.orderDate) as year, sum(classicmodels.orderdetails.quantityOrdered * classicmodels.orderdetails.priceEach) as total
from classicmodels.orders
inner join classicmodels.orderdetails 
on classicmodels.orders.orderNumber = classicmodels.orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;