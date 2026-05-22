-- =============================================
-- EMPLOYEE PAYROLL SQL QUERIES (UC1 to UC10)
-- =============================================

-- =============================================
-- UC1 : Create Payroll Service Database
-- =============================================

CREATE DATABASE payroll_service;

SHOW DATABASES;

USE payroll_service;

-- =============================================
-- UC2 : Create Employee Payroll Table
-- =============================================

CREATE TABLE employee_payroll(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    salary DOUBLE,
    start_date DATE
);

SHOW TABLES;

DESC employee_payroll;

-- =============================================
-- UC3 : Insert Employee Payroll Data
-- =============================================

INSERT INTO employee_payroll(name, salary, start_date)
VALUES
('Bill', 50000, '2018-01-03'),
('Charlie', 60000, '2019-11-13'),
('Terisa', 70000, '2020-05-21');

-- =============================================
-- UC4 : Retrieve All Employee Payroll Data
-- =============================================

SELECT * FROM employee_payroll;

-- =============================================
-- UC5 : Retrieve Salary and Employee Data by Date Range
-- =============================================

SELECT salary
FROM employee_payroll
WHERE name = 'Bill';

SELECT *
FROM employee_payroll
WHERE start_date BETWEEN '2018-01-01' AND NOW();

-- =============================================
-- UC6 : Add Gender Column and Update Gender
-- =============================================

ALTER TABLE employee_payroll
ADD gender CHAR(1)
AFTER name;

UPDATE employee_payroll
SET gender = 'M'
WHERE name = 'Bill' OR name = 'Charlie';

UPDATE employee_payroll
SET gender = 'F'
WHERE name = 'Terisa';

SELECT * FROM employee_payroll;

-- =============================================
-- UC7 : Find SUM, AVG, MIN, MAX and COUNT by Gender
-- =============================================

-- SUM
SELECT gender,
SUM(salary) AS total_salary
FROM employee_payroll
GROUP BY gender;

-- AVG
SELECT gender,
AVG(salary) AS average_salary
FROM employee_payroll
GROUP BY gender;

-- MIN
SELECT gender,
MIN(salary) AS minimum_salary
FROM employee_payroll
GROUP BY gender;

-- MAX
SELECT gender,
MAX(salary) AS maximum_salary
FROM employee_payroll
GROUP BY gender;

-- COUNT
SELECT gender,
COUNT(*) AS employee_count
FROM employee_payroll
GROUP BY gender;

-- =============================================
-- UC8 : Extend Employee Payroll Table
-- =============================================

ALTER TABLE employee_payroll
ADD phone_number BIGINT,
ADD address VARCHAR(250) DEFAULT 'TBD',
ADD department VARCHAR(150) NOT NULL;

DESC employee_payroll;

-- =============================================
-- UC9 : Add Payroll Calculation Columns
-- =============================================

ALTER TABLE employee_payroll
ADD basic_pay DOUBLE,
ADD deductions DOUBLE,
ADD taxable_pay DOUBLE,
ADD income_tax DOUBLE,
ADD net_pay DOUBLE;

DESC employee_payroll;

-- =============================================
-- UC10 : Add Terisa to Sales and Marketing Departments
-- =============================================

INSERT INTO employee_payroll
(name, gender, salary, start_date, department,
 basic_pay, deductions, taxable_pay, income_tax, net_pay)
VALUES
('Terisa', 'F', 3000000, '2018-01-03', 'Sales',
3000000, 1000000, 2000000, 500000, 1500000);

INSERT INTO employee_payroll
(name, gender, salary, start_date, department,
 basic_pay, deductions, taxable_pay, income_tax, net_pay)
VALUES
('Terisa', 'F', 3000000, '2018-01-03', 'Marketing',
3000000, 1000000, 2000000, 500000, 1500000);

-- =============================================
-- FINAL OUTPUT
-- =============================================

SELECT * FROM employee_payroll;
