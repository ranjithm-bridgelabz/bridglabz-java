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
-- UC11 : Implement ER Diagram into Payroll Service DB
-- =============================================

CREATE TABLE company (
    company_id INT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(100)
);

CREATE TABLE department (
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(100)
);

CREATE TABLE employee (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(100),
    gender CHAR(1),
    phone_number BIGINT,
    address VARCHAR(250) DEFAULT 'TBD',
    start_date DATE,
    company_id INT,
    FOREIGN KEY (company_id)
    REFERENCES company(company_id)
);

CREATE TABLE payroll (
    payroll_id INT PRIMARY KEY AUTO_INCREMENT,
    basic_pay DOUBLE,
    deductions DOUBLE,
    taxable_pay DOUBLE,
    income_tax DOUBLE,
    net_pay DOUBLE,
    employee_id INT,
    FOREIGN KEY (employee_id)
    REFERENCES employee(employee_id)
);

CREATE TABLE employee_department (
    employee_id INT,
    department_id INT,
    PRIMARY KEY(employee_id, department_id),
    FOREIGN KEY (employee_id)
    REFERENCES employee(employee_id),
    FOREIGN KEY (department_id)
    REFERENCES department(department_id)
);

-- Insert Company Data
INSERT INTO company(company_name)
VALUES ('BridgeLabz');

-- Insert Department Data
INSERT INTO department(department_name)
VALUES ('Sales'), ('Marketing'), ('HR');

-- Insert Employee Data
INSERT INTO employee
(employee_name, gender, phone_number, address, start_date, company_id)
VALUES
('Bill', 'M', 9876543210, 'Chennai', '2018-01-03', 1),
('Charlie', 'M', 9876543211, 'Bangalore', '2019-11-13', 1),
('Terisa', 'F', 9876543212, 'Mumbai', '2020-05-21', 1);

-- Insert Payroll Data
INSERT INTO payroll
(basic_pay, deductions, taxable_pay, income_tax, net_pay, employee_id)
VALUES
(50000, 5000, 45000, 2000, 43000, 1),
(60000, 6000, 54000, 3000, 51000, 2),
(70000, 7000, 63000, 4000, 59000, 3);

-- Map Employee and Department
INSERT INTO employee_department(employee_id, department_id)
VALUES
(1,1),
(2,2),
(3,1),
(3,2);

-- =============================================
-- UC12 : Retrieve Queries with New ER Structure
-- =============================================

-- Retrieve All Employee Payroll Data
SELECT e.employee_id,
       e.employee_name,
       e.gender,
       e.phone_number,
       e.address,
       e.start_date,
       p.basic_pay,
       p.deductions,
       p.taxable_pay,
       p.income_tax,
       p.net_pay,
       d.department_name
FROM employee e
JOIN payroll p
ON e.employee_id = p.employee_id
JOIN employee_department ed
ON e.employee_id = ed.employee_id
JOIN department d
ON ed.department_id = d.department_id;

-- Retrieve Salary by Employee Name
SELECT e.employee_name,
       p.basic_pay
FROM employee e
JOIN payroll p
ON e.employee_id = p.employee_id
WHERE e.employee_name = 'Bill';

-- Retrieve Employees Between Date Range
SELECT *
FROM employee
WHERE start_date BETWEEN '2018-01-01' AND NOW();

-- SUM Salary by Gender
SELECT e.gender,
SUM(p.basic_pay) AS total_salary
FROM employee e
JOIN payroll p
ON e.employee_id = p.employee_id
GROUP BY e.gender;

-- AVG Salary by Gender
SELECT e.gender,
AVG(p.basic_pay) AS average_salary
FROM employee e
JOIN payroll p
ON e.employee_id = p.employee_id
GROUP BY e.gender;

-- MIN Salary by Gender
SELECT e.gender,
MIN(p.basic_pay) AS minimum_salary
FROM employee e
JOIN payroll p
ON e.employee_id = p.employee_id
GROUP BY e.gender;

-- MAX Salary by Gender
SELECT e.gender,
MAX(p.basic_pay) AS maximum_salary
FROM employee e
JOIN payroll p
ON e.employee_id = p.employee_id
GROUP BY e.gender;

-- COUNT Employees by Gender
SELECT e.gender,
COUNT(*) AS employee_count
FROM employee e
GROUP BY e.gender;

-- =============================================
-- FINAL OUTPUT
-- =============================================

SELECT * FROM employee_payroll;
SELECT * FROM employee;
SELECT * FROM payroll;
SELECT * FROM department;
SELECT * FROM employee_department;
