# RailwayReservation

A quick and simple project for college java subject.

## Setting up the project 

For now clone the project and create a postgres database named "railway" with relevant tables

run the following psql query for that 

create table userlogin ( username varchar(30) Primary key, fname varchar(30), age integer, address varchar(30), pass varchar(30) )

create table stations(id integer, sname varchar(30));

INSERT INTO stations VALUES(1,'Virar');

INSERT INTO stations VALUES(2,'Vasai');

INSERT INTO stations VALUES(3,'Bhayander');

INSERT INTO stations VALUES(4,'Borivali');

INSERT INTO stations VALUES(5,'Andheri');

And so on , for however many stations one wants.

CREATE TABLE ticket
(
    usernamet varchar(30),
    boardingstation varchar(30),
    deboardingstation varchar(30),
    berthtype varchar(30),
    quantity integer,
    amount integer
)

## Credits

@Mithil467 and @barath121 for helping me out. 
~ @kriticalflare
