# Parking-Allotment-Application
Parking Allotment Application to be built as a product that can be catering various vendors who requires parking allocation to be automated.
Functional Requirements:
-	Build an application that customer can access and book his parking slot in a particular area/ location for a particular time slot.
-	This product should have a provision to maintain a database of parking lots with the geographical locations.
-	Also, an integrated platform required for admin and customer to connect for booking the parking lot upfront at-least 2 hours earlier.
-	Administration module to include options for adding/ modifying the parking lots along with the location details.
-	Also, Payment gateway should be integrated.
-	Waiting list option should be available for booking.

DATABASE PART
TABLES TO BE CREATED IN MYSQL WORKBENCH FOR APP TO WORK
create database office;
use office;
#Login Table to store credentials of customers.
CREATE TABLE `login` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



#Register table to store customer details.
CREATE TABLE `register` (
   `id` int(3) NOT NULL AUTO_INCREMENT,
   `first_name` varchar(20) DEFAULT NULL,
   `last_name` varchar(20) DEFAULT NULL,
   `username` varchar(250) DEFAULT NULL,
   `password` varchar(20) DEFAULT NULL,
   `vehiclenumber` varchar(45) DEFAULT NULL,
   `contact` varchar(45) DEFAULT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#Lots table to store parking lots available and there status.
create table lots(id integer NOT NULL AUTO_INCREMENT primary key,slotname varchar(20),status varchar(20) default 'empty');
select *from lots;

#Timings table to store the slot booking details like start and end time.
create table timings(slotid varchar(20),starttime varchar(20),endtime varchar(20),vehno varchar(20),duration varchar(10));
select *from timings;


#Admin table to store details of Admin
create table admin(username varchar(20),password varchar(20));
insert into admin values("Rikhita","riky9999"),("Krishna","krish9999");
select *from admin;

#WaitingList Table to store details of Waiting Customers
create table waitinglist(slotid varchar(20),vehnum varchar(20),emailid varchar(30));
select *from waitinglist;



