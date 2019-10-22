## RailwayReservation

A quick and simple project for college java subject.

# Setting up the project 

For now clone the project and create a postgres database named "railway" with relevant tables

run the following psql query for that 

create table userlogin ( username varchar(30) Primary key, fname varchar(30), age integer, address varchar(30), pass varchar(30) )

create table stations(id integer, sname varchar(30));

INSERT INTO stations VALUES(1,'Virar');
INSERT INTO stations VALUES(2,'Vasai');
INSERT INTO stations VALUES(3,'Bhayander');
INSERT INTO stations VALUES(4,'Borivali');
INSERT INTO stations VALUES(5,'Andheri');
INSERT INTO stations VALUES(6,'Bandra');
INSERT INTO stations VALUES(7,'Asangaon');
INSERT INTO stations VALUES(8,'Titwala');
INSERT INTO stations VALUES(9,'Dombivli');
INSERT INTO stations VALUES(10,'Thane');
INSERT INTO stations VALUES(11,'Ghatkopar');
INSERT INTO stations VALUES(12,'Kurla');
INSERT INTO stations VALUES(13,'Dadar');
INSERT INTO stations VALUES(14,'Panvel');
INSERT INTO stations VALUES(15,'Belapur');
INSERT INTO stations VALUES(16,'Vashi');
INSERT INTO stations VALUES(17,'Mankhurd');

Any future tables that would be needed will be updated here and maybe the tables would be setup by the program itself later
