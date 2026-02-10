create table classes(class_id int primary key,class_name varchar not null)
insert into classes(class_id,class_name)values(1,'vishnu')
select * from classes

create table students(student_id int primary key,student_name varchar not null,age int check(age>=5),class_id int references classes(class_id))
insert into students(student_id,student_name,age,class_id)values(2,'taj',22,1)
select * from students


create table customers(id int primary key,email varchar unique)
insert into customers(id,email)values(20,'taj@gmail.com')
select * from customers

create table orders(order_id int primary key,customer_id int not null,amt int check(amt>0),id int references customers(id))
insert into orders(order_id,customer_id,amt,id)values(25,5,100,20)
select * from orders

create table employees(emp_id int primary key,emp_name varchar not null,emp_designation varchar not null,salary int check(salary>=10000),status varchar default 'active')
insert into employees(emp_id,emp_name,emp_designation,status)values(1,'kavitha','java developer',50000,'active')
select * from employees

create table employees1(emp_id int primary key,emp_name varchar not null,emp_designation varchar not null,salary int check(salary>=10000),status varchar default 'active')
insert into employees1(emp_id,emp_name,emp_designation,salary,status)values(1,'kavitha','java developer',50000,'active')
select * from employees1
create table employees2(emp_id int primary key,emp_name varchar not null,emp_designation varchar not null,salary int check(salary>=10000),status varchar default 'active')
insert into employees2(emp_id,emp_name,emp_designation,salary)values(1,'kavitha','java developer',50000)
select * from employees2

create table books(book_id int primary key,available varchar default 'Yes' check (available IN ('Yes','No')))
insert into books values(1,default)
select * from books

create table doctors(doctor_id int primary key,doctor_name varchar not null,doctor_specialization varchar not null)
insert into doctors (doctor_id, doctor_name, doctor_specialization)values(1,'kavitha','cardiologist')
select * from doctors

create table appoinments(appoinment_id int primary key,patient_name varchar not null,appoinmentdate int not null,doctor_id int references doctors(doctor_id))
insert into appoinments (appoinment_id, patient_name,appoinmentdate,doctor_id )values(5,'deepthi',10,1)
select * from appoinments

create table busseats(seat_id int primary key,bus_number int not null,seat_number int not null, is_booked varchar default 'No' check(is_booked in('Yes','No')))
insert into busseats(seat_id,bus_number,seat_number)values(1,1234,25)
select * from busseats


create table plans1(plan_id int primary key,name varchar not null,fees int not null,fee int check(fee>0))
insert into plans1(plan_id,name,fees,fee)values(1,'keerthi',15000,10000)
select * from plans1

create table members(member_id int primary key,plan_id int references plans1(plan_id))
insert into members(member_id,plan_id)values(120,1)
select * from members

create table tickets(ticket_id int primary key,movie_name varchar not null,seat_number int check(seat_number between 1 and 100),price int default 150)
insert into tickets(ticket_id,movie_name,seat_number,price)values(20,'bison',50,200)
select * from tickets
create table tickets1(ticket_id int primary key,movie_name varchar not null,seat_number int check(seat_number between 1 and 100),price int default 150)
insert into tickets1(ticket_id,movie_name,seat_number)values(20,'bison',50)
select * from tickets1

create table courses(course_id int primary key,student_name varchar not null)
insert into courses(course_id,student_name)values(35,'anu')
select * from courses

create table enrollments(enroll_id int primary key,course_id int references courses(course_id))
insert into enrollments(enroll_id,course_id)values(20,35)
select * from enrollments

create table products(product_id int primary key,product_name varchar not null,stock int check(stock>=0),min_stocklevel int default 10 check(min_stocklevel>=0))
insert into products(product_id,product_name,stock,min_stocklevel)values(1,'microwave oven',50,200)
select * from products
create table products1(product_id int primary key,product_name varchar not null,stock int check(stock>=0),min_stocklevel int default 10 check(min_stocklevel>=0))
insert into products1(product_id,product_name,stock)values(1,'microwave oven',50)
select * from products1
