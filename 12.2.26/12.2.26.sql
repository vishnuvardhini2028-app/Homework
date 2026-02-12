create table students(id int primary key,name varchar not null,age smallint not null,marks int not null,dept varchar not null)
insert into students values(1,'keerthi',23,85,'CSE'),(2,'kavitha',20,90,'IT'),(3,'anu',30,70,'CSE'),(4,'rasi',20,80,'ECE'),(5,'regina',22,60,'CSE'),(6,'jessy',19,60,'CSE'),(7,'kayal',24,55,'MCA'),(8,'riya',21,78,'EEE')
select * from students
select * from students where marks>70
select * from students where dept='CSE'
select age from students where age between 18 and 22
select * from students order by marks desc
select * from students order by marks desc limit 3

create table employeess(emp_id int primary key,name varchar not null,depts varchar not null,salary decimal not null)
insert into employeess values(1,'kavi','manager',10000),(2,'pooja','audit',50000),(3,'ritu','manager',15000),(4,'kavya','audit',20000),(5,'renu','accountant',40000),(6,'reshmi','R&D',25000),(7,'preeti','R&D',100000)
select * from employeess
select depts,sum(salary) from employeess group by depts,salary 
select depts,avg(salary)from employeess group by depts having avg(salary)>30000
select depts, count(depts) from employeess group by depts

create table customerss(cust_id int primary key,name varchar not null,city varchar not null)
insert into customerss values(1,'kavya','bangalore'),(2,'vishnu','chennai'),(3,'thendral','coimbatore'),(4,'pavai','trichy'),(5,'shriya','Hyderabad'),(6,'Anu','Nagpur')
select * from customerss
select name from customerss where name like 'A%'
select name from customerss where name like '%l'
select city from customerss where city like '%pur'




