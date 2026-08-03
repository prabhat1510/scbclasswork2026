CREATE TABLE Customers (
    customer_id NUMBER PRIMARY KEY,
    first_name VARCHAR2(50),
    last_name VARCHAR2(50),
    email VARCHAR2(100),
    phone VARCHAR2(20),
    city VARCHAR2(50),
    dob DATE
);

CREATE TABLE Branch (
    branch_id NUMBER PRIMARY KEY,
    branch_name VARCHAR2(100),
    city VARCHAR2(50)
);

CREATE TABLE Accounts (
    account_id NUMBER PRIMARY KEY,
    account_type VARCHAR2(20),
    account_balance VARCHAR2(20),
    dop DATE,
    customer_id NUMBER,
    branch_id NUMBER,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (branch_id) REFERENCES Branch(branch_id)
);

CREATE TABLE Loan (
    loan_id NUMBER PRIMARY KEY,
    loan_type VARCHAR2(30),
    loan_amount NUMBER,
    customer_id NUMBER,
    account_id NUMBER,
    branch_id NUMBER,
    FOREIGN KEY(customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY(account_id) REFERENCES Accounts(account_id),
    FOREIGN KEY(branch_id) REFERENCES Branch(branch_id)
);

Sample Data
Customers
INSERT INTO Customers VALUES (101,'Amit','Sharma','amit@gmail.com','9876543210','Delhi',DATE '1995-05-12');
INSERT INTO Customers VALUES (102,'Priya','Singh','priya@gmail.com','9876543211','Mumbai',DATE '1992-08-20');
INSERT INTO Customers VALUES (103,'Rahul','Verma','rahul@gmail.com','9876543212','Delhi',DATE '1990-11-18');
INSERT INTO Customers VALUES (104,'Sneha','Roy','sneha@gmail.com','9876543213','Kolkata',DATE '1997-03-15');
INSERT INTO Customers VALUES (105,'John','Doe','john@gmail.com','9876543214','India',DATE '1991-01-25');

Branch
INSERT INTO Branch VALUES(1,'SBI MG Road','Bangalore');
INSERT INTO Branch VALUES(2,'HDFC Whitefield','Bangalore');
INSERT INTO Branch VALUES(3,'ICICI Andheri','Mumbai');
INSERT INTO Branch VALUES(4,'Axis Connaught','Delhi');

Accounts
INSERT INTO Accounts VALUES(1001,'Saving','15000',SYSDATE-20,101,1);
INSERT INTO Accounts VALUES(1002,'Current','9000',SYSDATE-150,102,3);
INSERT INTO Accounts VALUES(1003,'Saving','25000',SYSDATE-40,103,4);
INSERT INTO Accounts VALUES(1004,'Saving','7000',SYSDATE-10,104,2);
INSERT INTO Accounts VALUES(1005,'Current','30000',SYSDATE-5,105,1);
INSERT INTO Accounts VALUES(1006,'Saving','18000',SYSDATE-3,101,2);

Loan
INSERT INTO Loan VALUES(501,'Home',2500000,101,1001,1);
INSERT INTO Loan VALUES(502,'Car',600000,101,1006,2);
INSERT INTO Loan VALUES(503,'Education',400000,103,1003,4);
INSERT INTO Loan VALUES(504,'Personal',200000,105,1005,1);


1. Change account_balance from String to Number
ALTER TABLE Accounts
MODIFY account_balance NUMBER;
2. Display customer id, firstname, account balance sorted by DOB and firstname
SELECT c.customer_id,
       c.first_name,
       a.account_balance
FROM Customers c
JOIN Accounts a
ON c.customer_id=a.customer_id
ORDER BY c.dob,c.first_name;

3. Count customers from India
SELECT COUNT(*) AS Cust_Count
FROM Customers
WHERE city='India';

4. Customers who do not have loan
SELECT *
FROM Customers
WHERE customer_id NOT IN
(
SELECT customer_id
FROM Loan
);

Alternative

SELECT c.*
FROM Customers c
LEFT JOIN Loan l
ON c.customer_id=l.customer_id
WHERE l.customer_id IS NULL;

5. Display city and count of branches
SELECT city,
       COUNT(*) AS Branch_Count
FROM Branch
GROUP BY city;

6. Customer having highest number of loans
SELECT *
FROM Customers
WHERE customer_id=
(
SELECT customer_id
FROM Loan
GROUP BY customer_id
ORDER BY COUNT(*) DESC
FETCH FIRST 1 ROW ONLY
);

7. Customers who opened account in past 3 months
SELECT DISTINCT c.*
FROM Customers c
JOIN Accounts a
ON c.customer_id=a.customer_id
WHERE a.dop>=ADD_MONTHS(SYSDATE,-3);

8. Account id, firstname, lastname for Saving accounts
SELECT a.account_id,
       c.first_name,
       c.last_name
FROM Accounts a
JOIN Customers c
ON a.customer_id=c.customer_id
WHERE a.account_type='Saving';

9. Customer id, firstname, branch id and loan amount
SELECT c.customer_id,
       c.first_name,
       l.branch_id,
       l.loan_amount
FROM Customers c
JOIN Loan l
ON c.customer_id=l.customer_id;

10. Customer number, customer name, account number where balance <10000
SELECT c.customer_id,
       c.first_name,
       a.account_id
FROM Customers c
JOIN Accounts a
ON c.customer_id=a.customer_id
WHERE a.account_balance<10000;

11. Customer city different from branch city
SELECT c.customer_id,
       c.first_name,
       c.city AS Customer_City,
       b.city AS Branch_City
FROM Customers c
JOIN Accounts a
ON c.customer_id=a.customer_id
JOIN Branch b
ON a.branch_id=b.branch_id
WHERE c.city<>b.city;

12. Customers who have taken loan from more than one bank
SELECT c.customer_id,
       c.first_name,
       c.last_name,
       a.account_id
FROM Customers c
JOIN Accounts a
ON c.customer_id=a.customer_id
JOIN Loan l
ON a.account_id=l.account_id
WHERE c.customer_id IN
(
SELECT customer_id
FROM Loan
GROUP BY customer_id
HAVING COUNT(DISTINCT branch_id)>1
);

13. City-wise, branch-wise count of accounts (show 0 if none)
SELECT b.city,
       b.branch_name,
       COUNT(a.account_id) AS Account_Count
FROM Branch b
LEFT JOIN Accounts a
ON b.branch_id=a.branch_id
GROUP BY b.city,b.branch_name
ORDER BY b.city,b.branch_name;

14. Customers having more than one account
SELECT c.first_name
FROM Customers c
JOIN Accounts a
ON c.customer_id=a.customer_id
GROUP BY c.customer_id,c.first_name
HAVING COUNT(a.account_id)>1;

15. Branch having maximum customers
SELECT branch_name,
       city
FROM Branch
WHERE branch_id=
(
SELECT branch_id
FROM Accounts
GROUP BY branch_id
ORDER BY COUNT(DISTINCT customer_id) DESC
FETCH FIRST 1 ROW ONLY
);