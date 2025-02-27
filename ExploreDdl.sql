select * from customers;

CREATE TABLE CUSTOMERS( 
	ID INT NOT NULL, 
	NAME VARCHAR (20) NOT NULL, 
	AGE INT NOT NULL CHECK (AGE >= 18), 
	ADDRESS CHAR (25) ,
	SALARY DECIMAL (18, 2), 
	PRIMARY KEY (ID) 
);

desc customers;

INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY) VALUES (1, 'Ramesh', 32, 'Ahmedabad', 2000.00 ); 
INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY) VALUES (2, 'Khilan', 25, 'Delhi', 1500.00 ); 

select * from customers;
--truncate table customers; 	--trunacate is the using delete over all data, table structure  will remain same.
drop table customers;  			-- drop is the using for delete all record and structure will remain same.
