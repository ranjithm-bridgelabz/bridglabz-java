-- ============================================================
-- EMPLOYEE PAYROLL SQL QUERIES (UC1 to UC12)
-- ============================================================

CREATE DATABASE payroll_service;

SHOW DATABASES;

USE payroll_service;

CREATE TABLE employee_payroll(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    salary DOUBLE,
    start_date DATE
);

INSERT INTO employee_payroll(name, salary, start_date)
VALUES
('Bill', 50000, '2018-01-03'),
('Charlie', 60000, '2019-11-13'),
('Terisa', 70000, '2020-05-21');

SELECT * FROM employee_payroll;

SELECT salary
FROM employee_payroll
WHERE name = 'Bill';

SELECT *
FROM employee_payroll
WHERE start_date BETWEEN '2018-01-01' AND NOW();

ALTER TABLE employee_payroll
ADD gender CHAR(1)
AFTER name;

UPDATE employee_payroll
SET gender = 'M'
WHERE name = 'Bill' OR name = 'Charlie';

UPDATE employee_payroll
SET gender = 'F'
WHERE name = 'Terisa';

SELECT gender,
SUM(salary) AS total_salary
FROM employee_payroll
GROUP BY gender;

SELECT gender,
AVG(salary) AS average_salary
FROM employee_payroll
GROUP BY gender;

SELECT gender,
MIN(salary) AS minimum_salary
FROM employee_payroll
GROUP BY gender;

SELECT gender,
MAX(salary) AS maximum_salary
FROM employee_payroll
GROUP BY gender;

SELECT gender,
COUNT(*) AS employee_count
FROM employee_payroll
GROUP BY gender;

ALTER TABLE employee_payroll
ADD phone_number BIGINT,
ADD address VARCHAR(250) DEFAULT 'TBD',
ADD department VARCHAR(150) NOT NULL;

ALTER TABLE employee_payroll
ADD basic_pay DOUBLE,
ADD deductions DOUBLE,
ADD taxable_pay DOUBLE,
ADD income_tax DOUBLE,
ADD net_pay DOUBLE;

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

CREATE TABLE company (
    company_id INT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(100)
);

CREATE TABLE department_table (
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
    REFERENCES department_table(department_id)
);

-- ============================================================
-- ADDRESS BOOK SQL QUERIES (UC1 to UC13)
-- ============================================================

CREATE DATABASE addressbook_service;

USE addressbook_service;

CREATE TABLE address_book(
    contact_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(250),
    city VARCHAR(100),
    state VARCHAR(100),
    zip BIGINT,
    phone_number BIGINT,
    email VARCHAR(150)
);

INSERT INTO address_book
(first_name, last_name, address, city, state, zip, phone_number, email)
VALUES
('Ranjith', 'K', 'Tambaram', 'Chennai', 'Tamil Nadu', 600045, 9876543210, 'ranjith@gmail.com'),
('Arun', 'Kumar', 'Anna Nagar', 'Chennai', 'Tamil Nadu', 600040, 9876543211, 'arun@gmail.com');

UPDATE address_book
SET city = 'Chengalpattu'
WHERE first_name = 'Ranjith';

SELECT *
FROM address_book
WHERE city = 'Chennai';

SELECT city,
COUNT(*) AS total_persons
FROM address_book
GROUP BY city;

SELECT *
FROM address_book
WHERE city = 'Chennai'
ORDER BY first_name ASC;

ALTER TABLE address_book
ADD book_name VARCHAR(100),
ADD contact_type VARCHAR(100);

SELECT contact_type,
COUNT(*) AS total_contacts
FROM address_book
GROUP BY contact_type;

INSERT INTO address_book
(first_name, last_name, address, city, state, zip, phone_number, email, book_name, contact_type)
VALUES
('Suresh', 'K', 'Velachery', 'Chennai', 'Tamil Nadu', 600042, 9876543299, 'suresh@gmail.com', 'FriendBook', 'Friend'),
('Suresh', 'K', 'Velachery', 'Chennai', 'Tamil Nadu', 600042, 9876543299, 'suresh@gmail.com', 'FamilyBook', 'Family');

SELECT * FROM address_book;
