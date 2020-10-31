create database pharmacy

create table Customer
(CID numeric(4) CONSTRAINT cid_pk PRIMARY KEY,
fname varchar(10),
lname varchar(10),
phone_no numeric(10),
customer_address varchar(50),
check(phone_no=10)
);

create table Pharmacist
(PID numeric(4) CONSTRAINT pid_pk PRIMARY KEY,
fname varchar(10),
lname varchar(10),
phone_no numeric(10),
check(phone_no=10),
);

create table Employee
(EID numeric(4) CONSTRAINT eid_pk PRIMARY KEY,
fname varchar(10),
lname varchar(10),
employee_address varchar(50),
dob date,
salary integer,
phone_no numeric(10),
check(phone_no=10),
PID numeric(4),
FOREIGN KEY (PID) references Pharmacist(PID)
);

create table Company
(company_id numeric(4) CONSTRAINT company_id_pk PRIMARY KEY,
company_name varchar(10),
company_address varchar(50),
phone_no numeric(10),
check(phone_no=10),
PID numeric(4),
FOREIGN KEY (PID) references Pharmacist(PID) 
);

create table Brand
(BID numeric(4) CONSTRAINT bid_pk PRIMARY KEY,
brand_name varchar(10),
drug varchar(30),
barcode varchar(15),
price integer,
quantity numeric,
company_id numeric(4),
date_of_expiry date,
FOREIGN KEY (company_id) references Company(company_id)
);

create table Purchase_History
(purchase_id numeric(4) CONSTRAINT purchase_id_pk PRIMARY KEY,
medicine varchar,
date_of_purchase date,
quantity numeric,
total_amt integer,
payment_mode varchar,
CID numeric(4),
check (payment_mode in ('cash', 'card')),
FOREIGN KEY (CID) references Customer(CID)
);

create table Sells
(CID numeric(4),
EID numeric(4),
FOREIGN KEY (CID) references Customer(CID),
FOREIGN KEY (EID) references Employee(EID)
);

alter table Brand
add manufacturing_date date;
