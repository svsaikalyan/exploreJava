/*
* Data Manipulation Language.
*/





create table dept (sno number(10),
name varchar2(20),
fee number(23),
location varchar2(29));

insert into dept values('01','krishna','23000','Snpadu');
insert into dept values('02','kalyan','22000','Nellore');
insert into dept values ('03','saikiran','20000','Kavali');
insert into dept values('04','harsha','26000','Ongole');
INSERT into dept values('05','sandeep','30000','Guntur');

select * from dept;

UPDATE dept set name = 'komal' where sno ='01';

desc dept;

DELETE  from dept;

rollback;