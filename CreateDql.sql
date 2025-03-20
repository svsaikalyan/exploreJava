create table dmp (
    dmpno NUMBER(10) NOT NULL, 
    dname VARCHAR2(20), 
    job VARCHAR2(10), 
    mgr NUMBER(7), 
    sal NUMBER(7,2), 
    comm NUMBER(7,2), 
    dpno NUMBER(2)
);

insert into dmp values ('102','john doe','manager',4000,6500.00,5000.00,10);
insert into dmp values ('103','kalyan','sale','2000',5400.00,4500.00,10);
insert into dmp values ('104','vamshi','tech',null,5200.00,4700.00,20);
insert into dmp values ('105','keerthi','operator','2001',3400.00,5500.00,30);
insert into dmp values ('106','kiran','analyst','3000',3300.00,4200.00,40);
insert into dmp values ('107','harsha','supervisor','6000',2400.00,7600.00,50);
insert into dmp values ('108','komali','ceo','9000',9000.00,7500.00,60);
insert into dmp values ('109','sreekavya','clerk','6000',7400.00,8900.00,70);
insert into dmp values ('110','alekhya','busniess','7000',6700.00,8600.00,80);

select * from dmp where job<> 'clerk';

select * from dmp;

desc dmp;

select * from dmp where sal>2000;

select * from dmp where sal<2000;

SELECT * from dmp where dpno=20;

select dname,sal,sal*12 annsal from dmp where sal*12>30000;

select * from dmp where  job ='clerk' and sal>3000;

select * from dmp where job = 'clerk' and dpno = 20;

select * from dmp where job = 'ceo' or sal>1000;

select * from dmp where job = 'clerk' or job = 'sale' or job = 'ceo' or job = 'manager';