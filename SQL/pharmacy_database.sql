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

insert into customer values(145, 'Neha', 'Agarwal', 9816735678, 'Santacruz');
insert into customer values(957, 'Rashmi', 'Shetty', 8518945278, 'Khar');
insert into customer values(138, 'Nikhil', 'Mody', 7829478626, 'Vile Parle');
insert into customer values(297, 'Daksh', 'Doshi', 9167356725, 'Khar');

select * from customer;

delete from Customer
where CID = 2875;

alter table customer
drop constraint customer_chk_1;

create table Pharmacist
(PID numeric(4),
fname varchar(10),
lname varchar(10),
phone_no numeric(10),
check(phone_no=10),
PRIMARY KEY(PID)
);

select * from Pharmacist;

alter table Pharmacist
drop constraint pharmacist_chk_1;

alter table Pharmacist
add password varchar(30);

insert into Pharmacist values(1234, 'Raj', 'Mehta', 9876543210, 'admin');
insert into Pharmacist values(6543, 'Ram', 'Agarwal', 9123456780, 'admin2');

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

alter table employee
drop constraint employee_chk_1;

select * from Employee;

insert into employee values(9653, 'Parth', 'Shah', 'Vile Parle West', '1990-06-19', 4500, 9265180537, 1234);

create table Company
(company_id numeric(4),
company_name varchar(30),
company_address varchar(50),
phone_no numeric(10),
check(phone_no=10),
PID numeric(4),
PRIMARY KEY(company_id)
);

drop table Company;

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

alter table brand
drop constraint brand_ibfk_1;

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

alter table Purchase_history
add column quantity numeric(5),
add column rate numeric(5),
drop column total_amt,
add column amount numeric(5),
drop column payment_mode;

select * from Purchase_history;

insert into purchase_history values(176, '2020-11-02', 145, 3, 30, 90, 'GHT672', 'Crocin', 1675);
insert into purchase_history values(2875, '2020-11-04', 957, 1, 51, 51, '589PH', 'Sinarest', 4976);
insert into purchase_history values(1165, '2020-11-10', 138, 2, 131, 262, '738TS', 'Thyronorm 50', 9653);
insert into purchase_history values(2916, '2020-11-09', 297, 2, 171, 342, '739TS', 'Thyronorm 75', 3965);

alter table Purchase_history
add column barcode varchar(20);

alter table Purchase_history
add column EID numeric(4);

truncate table Purchase_history;

alter table Purchase_history
drop constraint purchase_history_ibfk_1;

alter table Purchase_history
add column brand varchar(30);

delete from purchase_history
where purchase_id = 176;

select * from Purchase_history;

create table Sells
(CID numeric(4),
EID numeric(4),
FOREIGN KEY (CID) references Customer(CID),
FOREIGN KEY (EID) references Employee(EID)
);

select * from brand;

alter table brand
add column brand_name varchar(30);

delete from brand
where BID =589;


insert into brand values(3, 'ABC', 'XYZ', 'GH67', 20, 3, 5, '2020-10-20', '2024-10-19');
insert into brand values(123, 'Parecetemol', '123P', 30, 10, 456, '2020-03-20', '2024-03-19', 'Dolo-650');
insert into brand values(989, 'Fexofenadine Hydrochloride', '989F', 172, 50, 234, '2020-10-20', '2022-02-19', 'Allegra 120');
insert into brand values(634, 'Dicyclomine Hydrochloride', '634DH', 46, 25, 678, '2020-04-20', '2023-03-19', 'Cyclopam');
insert into brand values(589, 'Phenylephrine Hydrochloride', '589PH', 51, 35, 835, '2019-10-13', '2022-09-12', 'Sinarest');
insert into brand values(672, 'Paracetemol', 'GHT672', 51, 35, 561, '2019-02-13', '2024-02-12', 'Crocin');

select * from company;
alter table company
drop constraint company_chk_1;

delete from company
where company_id = 974;

insert into company values(456, 'Micro Labs', 'Delhi', 9826716388, 1234);
insert into company values(234, 'Sanofi', 'Mumbai', 9826481388, 6543);
insert into company values(678, 'Indoco', 'Delhi', 8267815635, 6543);
insert into company values(835, 'Centaur', 'Mumbai', 8202745635, 1234);


select BID, brand_name, drug from Brand;

insert into Brand(BID, brand_name, drug) values(783, 'Dolo 650', 'Paracetemol');
