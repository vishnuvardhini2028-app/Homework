create table Books(book_id serial primary key,title text not null,author text not null,published_year int check (published_year>1900),available boolean default 'true')
create table members(member_id serial primary key,name text not null,email varchar unique not null,join_date date default current_date)
create table borrowed(borrow_id serial primary key,book_id serial references Books(book_id),member_id serial references members(member_id),borrow_date date default current_date )

insert into Books(book_id,title,author,published_year)values(1,'A Brief History of Time','Stephen Hawking',1988),(2,'Hamlet','William Shakespeare',2000),(3,'Harry Potter and the Philosophers Stone','J.K. Rowling',1997)
insert into members(member_id,name,email)values(20,'keerthi','keerthi@gmail.com'),(21,'anu','anu@gmail.com')
insert into borrowed(borrow_id,book_id,member_id)values(3,1,20)

select * from Books
select * from members
select * from borrowed
update Books set available='false' where book_id=1
delete from members where member_id=21