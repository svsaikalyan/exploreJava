CREATE TABLE Customer(
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(50),
    LastName VARCHAR(50),
    Country VARCHAR(50),
    Age INT CHECK (Age >= 0 AND Age <= 99),
    Phone int(10)
);



insert into customer values('1','shubam','thakur','india','23','7847878789');
insert into customer values('2','kiran','sai','india','27','7174759847');
insert into customer values('3','sarath','sree','USA','25','8748754874');

select * from customer;

update customer set country = 'Usa' where customerid = 3; //update query 

DELETE FROM Customer WHERE CustomerID = 1; // delete query