-- Select, Distinct, Where, And & Or, Order By:
SELECT column1, column2 FROM table_name WHERE condition AND/OR condition ORDER BY column1;
-- Insert Into:
INSERT INTO table_name (column1, column2) VALUES (value1, value2);

-- Update:
UPDATE table_name SET column1 = value1 WHERE condition;

-- Delete:
DELETE FROM table_name WHERE condition;

-- Select Top:
SELECT TOP n column1 FROM table_name;

-- Like, Wildcards:
SELECT column1 FROM table_name WHERE column1 LIKE 'pattern%';

-- In, Between:
SELECT column1 FROM table_name WHERE column1 IN (value1, value2);
SELECT column1 FROM table_name WHERE column1 BETWEEN value1 AND value2;

-- Aliases:
SELECT column1 AS alias_name FROM table_name;

-- JOINS
-- Inner Join:
SELECT * FROM table1 INNER JOIN table2 ON table1.column = table2.column;

-- Left Join, Right Join, Full Join:
SELECT * FROM table1 LEFT JOIN table2 ON table1.column = table2.column;
SELECT * FROM table1 RIGHT JOIN table2 ON table1.column = table2.column;
SELECT * FROM table1 FULL JOIN table2 ON table1.column = table2.column;

-- Union, Select Into, Insert Into Select:
-- Union:
SELECT column1 FROM table1 UNION SELECT column1 FROM table2;

-- Select Into:
SELECT column1 INTO new_table FROM table_name WHERE condition;

-- Insert Into Select:
INSERT INTO table1 (column1, column2) SELECT column1, column2 FROM table2 WHERE condition;

-- CREATE CONSTRAINTS
-- Create Table, Constraints, Not Null:
CREATE TABLE table_name (
  column1 datatype NOT NULL,
  column2 datatype,
  CONSTRAINT constraint_name PRIMARY KEY (column1)
);

-- Unique, Primary Key, Foreign Key, Check, Default:
CREATE TABLE table_name (
  column1 datatype PRIMARY KEY,
  column2 datatype UNIQUE,
  column3 datatype REFERENCES other_table(column),
  column4 datatype CHECK (condition),
  column5 datatype DEFAULT default_value
);

-- Create Index:
CREATE INDEX index_name ON table_name (column1, column2);

-- DROP, ALTER, AUTO INCREMENT
-- Drop:
DROP TABLE table_name;

-- Alter:
ALTER TABLE table_name ADD column_name datatype;

-- Auto Increment:
CREATE TABLE table_name (
  id INT PRIMARY KEY AUTO_INCREMENT,
  column1 datatype
);

-- VIEWS, NULL VALUES, GROUP BY, HAVING FUNCTIONS, NULL FUNCTIONS:
-- Views, Null Values:
CREATE VIEW view_name AS SELECT column1, column2 FROM table_name WHERE column1 IS NULL;

-- Group By, Having Functions, Null Functions:
SELECT column1, COUNT(column2) FROM table_name GROUP BY column1 HAVING COUNT(column2) > 1;

-- CALLABLE STATEMENT, PREPARED STATEMENT, STORED PROCEDURE:
-- Callable Statement:
{CALL procedure_name(?, ?, ?)}

-- Prepared Statement:
PreparedStatement pstmt = conn.prepareStatement("INSERT INTO table_name (column1, column2) VALUES (?, ?)");
pstmt.setString(1, value1);
pstmt.setString(2, value2);
pstmt.executeUpdate();

-- Stored Procedure:
CREATE PROCEDURE procedure_name (IN param1 datatype, IN param2 datatype)
BEGIN
  -- SQL statements
END;

--NORMALISATION
-- Original table (Not normalized)
CREATE TABLE Order (
  order_id INT PRIMARY KEY,
  customer_name VARCHAR(50),
  product_name VARCHAR(50),
  quantity INT
);

-- Normalized tables (1NF and 2NF)
CREATE TABLE Customer (
  customer_id INT PRIMARY KEY,
  customer_name VARCHAR(50)
);

CREATE TABLE Product (
  product_id INT PRIMARY KEY,
  product_name VARCHAR(50)
);

CREATE TABLE Order (
  order_id INT PRIMARY KEY,
  customer_id INT,
  product_id INT,
  quantity INT,
  FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
  FOREIGN KEY (product_id) REFERENCES Product(product_id)
);



