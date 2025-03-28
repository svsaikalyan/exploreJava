CREATE TABLE fivetble (
    fiveno NUMBER(4), 
    fname VARCHAR2(15), 
    job VARCHAR2(12), 
    mgr NUMBER(10), 
    hiredate DATE, 
    sal NUMBER(7,2), 
    comm NUMBER(7,2), 
    fivenu NUMBER(10)
)

INSERT INTO fivetble VALUES (01, 'sandeep joe', 'Manager', 2001, TO_DATE('1999-03-26', 'YYYY-MM-DD'), 50000.00, 5000.00, 10)
insert into fivetble values (02,'kiransai','officer',2002,TO_DATE('2000-02-18','yyyy-mm-dd'),45000.00,6000.00,20)
insert into fivetble values (03,'saigiri','salesoffice',2003,TO_DATE('2001-04-13','yyyy-mm-dd'),42000.00,7000.00,30)
insert into fivetble values (04,'srikanth','supervisor',2004,TO_DATE('2005-06-10','yyyy-mm-dd'),34000.00,2000.00,40)
insert into fiveble values (05,'saikrishna','clerk',2004,TO_DATE('2007-05-29','yyyy-mm-dd'),45000.00,6000.00,50)
insert into fivetble values (06,'saiprasad','assiant',2005,TO_DATE('2008-08-30','yyyy-mm-dd'),55000.00,78000.00,60)
select upper ('abc') from dual;
select 30+20 from dual;
select lower(fname) from fiveble;
update fivetble set fname = lower(fname);
select initcap('ab cd ef') from dual;
select length ('AB cD') from dual;
select substr('ABCDEFGH',2,3) from dual;
select * from fivetble where length(fname)>5;
select * from fivetble where substr(fname,2,2)='LA'
select substr ('ABCDEFGH',-5,1) from dual;
select substr('ABCDEFGH',-4) from dual;