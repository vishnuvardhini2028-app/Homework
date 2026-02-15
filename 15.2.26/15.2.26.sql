create table studentts(s_id int primary key,s_name varchar not null,dept_id int unique not null)
create table departments(dept_id int references studentts(dept_id),dept_name varchar not null)
create table employee(emp_id int primary key,emp_name text not null,manager_id int not null)
insert into studentts values(1,'keerthi',30),(2,'kavitha',87),(3,'rani',67),(4,'geetha',55),(5,'riya',70)
insert into departments values(30,'EEE'),(87,'cpmmerce'),(67,'IT'),(55,'EEE'),(70,'IT')
insert into employee values(1,'anu',28),(2,'ritu',34),(3,'pooja',55),(4,'madhu',40)
select * from studentts
select * from departments
select * from employee
select s_name,dept_name from studentts inner join departments on studentts.dept_id=departments.dept_id
select s_name,dept_name from studentts left join departments on studentts.dept_id=departments.dept_id
select s_name,dept_name from studentts right join departments on studentts.dept_id=departments.dept_id
select s_name,dept_name from studentts full outer join departments on studentts.dept_id=departments.dept_id
