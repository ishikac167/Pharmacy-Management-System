create database pharmacy_management;
use pharmacy_management;

create table Customer
(CID numeric(4),
fname varchar(10),
lname varchar(10),
phone_no numeric(10),
customer_address varchar(50),
check(phone_no=10),
PRIMARY KEY(CID)
);

create table Pharmacist
(PID numeric(4),
fname varchar(10),
lname varchar(10),
phone_no numeric(10),
check(phone_no=10),
PRIMARY KEY(PID)
);

create table Employee
(EID numeric(4),
fname varchar(10),
lname varchar(10),
employee_address varchar(50),
dob date,
salary integer,
phone_no numeric(10),
check(phone_no=10),
PID numeric(4),
FOREIGN KEY (PID) references Pharmacist(PID),
PRIMARY KEY(EID)
);

create table Company
(company_id numeric(4),
company_name varchar(10),
company_address varchar(50),
phone_no numeric(10),
check(phone_no=10),
PID numeric(4),
FOREIGN KEY (PID) references Pharmacist(PID),
PRIMARY KEY(company_id)
);

create table Brand
(BID numeric(4),
brand_name varchar(10),
drug varchar(30),
barcode varchar(15),
price integer,
quantity numeric,
company_id numeric(4),
date_of_expiry date,
date_of_manufacture date,
FOREIGN KEY (company_id) references Company(company_id),
PRIMARY KEY(BID)
);

create table Purchase_History
(purchase_id numeric(4),
medicine varchar(20),
date_of_purchase date,
quantity numeric,
total_amt integer,
payment_mode varchar(20),
CID numeric(4),
check (payment_mode in ('cash', 'card')),
FOREIGN KEY (CID) references Customer(CID),
PRIMARY KEY(purchase_id)
);

create table Sells
(CID numeric(4),
EID numeric(4),
FOREIGN KEY (CID) references Customer(CID),
FOREIGN KEY (EID) references Employee(EID)
);