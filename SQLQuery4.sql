
alter table usertable alter column UserName varchar(30)  not null 

create table Paymentmode (
PaymentID varchar(20) not null primary key,
userid varchar(25) not null foreign key references usertable(userid),
 Paymentmode varchar(30) not null,
 Referenceno bigint not null,
 Totalamount bigint not null);


 insert into Paymentmode values('P2','priya','paytm',9876435289,150),
                               ('P3','poornima','Debitcard',3407869,120),
							   ('P4','vishalini','creditcard',5674832,100),
							   ('P5','vighnesh','Debitcard',8765400,340),
							   ('P6','dharani','Debitcard',8743200,190),
							   ('P7','dhanush','creditcard',9876390,250),
							   ('P8','keerthi','paytm',8765438897,125),
							   ('P9','thilaga','Debitcard',8002238,165),
							   ('P10','niranj','creditcard',2254639,700),
							   ('P11','pachai','Debitcard',9933457,180),
							   ('P12','poornima','creditcard',6785430,500);						   



create table Confirmation(
BookingID varchar(20) primary key,
userid varchar(25) not null foreign key references usertable(userid),
TheatreID varchar(10) not null foreign key references Theatre(TheatreID),
PaymentID varchar(20) not null foreign key references Paymentmode(PaymentID),
NoofSeats int not null,
MovieID varchar(10) not null foreign key references Movie(MovieID),
Sequenceno int not null foreign key references TimingTable(Sequenceno),
SeatID varchar(10) not null foreign key references Seatmanagement(SeatID));

select *from Confirmation








 select * from [dbo].[Paymentmode]

 drop table [dbo].[TimingTable]

 insert into  [dbo].[TimingTable] values()

 create table Seatmanagement (

SeatID varchar(10) primary key  ,
TheatreID varchar(10) not null foreign key references Theatre (TheatreID),
 AN varchar(10) not null,
 FN varchar(10) not null);

 select * from[dbo].[Seatmanagement]

 insert into [dbo].[Seatmanagement] values('1R1C1','T1','N','Y'),
                                          ('1R1C2','T1','N','N'),
										  ('1R1C3','T1','N','N'),
										  ('1R1C4','T1','N','N'),
										  ('1R1C5','T1','N','N'),
										  ('1R2C1','T1','N','N'),
										  ('1R2C2','T1','N','Y'),
										  ('1R2C3','T1','N','N'),
										  ('1R2C4','T1','N','N'),
										  ('1R2C5','T1','N','N'),
										  ('2R1C1','T2','N','N'),
                                          ('2R1C2','T2','Y','N'),
										  ('2R1C3','T2','Y','N'),
										  ('2R1C4','T2','N','N'),
										  ('2R1C5','T2','N','N'),
										  ('2R2C1','T2','N','N'),
										  ('2R2C2','T2','N','Y'),
										  ('2R2C3','T2','N','N'),
										  ('2R2C4','T2','N','N'),
										  ('2R2C5','T2','N','N'),
										   ('3R1C1','T3','N','N'),
                                          ('3R1C2','T3','N','N'),
										  ('3R1C3','T3','N','N'),
										  ('3R1C4','T3','N','N'),
										  ('3R1C5','T3','N','N'),
										  ('3R2C1','T3','N','N'),
										  ('3R2C2','T3','N','Y'),
										  ('3R2C3','T3','N','N'),
										  ('3R2C4','T3','N','Y'),
										  ('3R2C5','T3','N','Y'),
										  ('4R1C1','T4','N','N'),
                                          ('4R1C2','T4','N','N'),
										  ('4R1C3','T4','N','N'),
										  ('4R1C4','T4','N','N'),
										  ('4R1C5','T4','N','N'),
										  ('4R2C1','T4','N','N'),
										  ('4R2C2','T4','N','Y'),
										  ('4R2C3','T4','N','N'),
										  ('4R2C4','T4','Y','N'),
										  ('4R2C5','T4','Y','N'),
										  ('6R1C1','T6','N','N'),
                                          ('6R1C2','T6','N','Y'),
										  ('6R1C3','T6','N','Y'),
										  ('6R1C4','T6','N','N'),
										  ('6R1C5','T6','N','N'),
										  ('6R2C1','T6','N','N'),
										  ('6R2C2','T6','N','N'),
										  ('6R2C3','T6','N','N'),
										  ('6R2C4','T6','N','N'),
										  ('6R2C5','T6','N','N'),
										  ('7R1C1','T7','N','N'),
                                          ('7R1C2','T7','N','N'),
										  ('7R1C3','T7','N','N'),
										  ('7R1C4','T7','N','N'),
										  ('7R1C5','T7','N','N'),
										  ('7R2C1','T7','N','N'),
										  ('7R2C2','T7','N','N'),
										  ('7R2C3','T7','Y','N'),
										  ('7R2C4','T7','Y','N'),
										  ('7R2C5','T7','N','N');


alter table Seatmanagement drop column MovieID;

select * from Seatmanagement

alter table Seatmanagement drop constraint FK__Seatmanag__Movie__656C112C;

--alter table [dbo].[usertable] add UserName varchar(30) 

update TimingTable set MovieID='M3' where Sequenceno=4

insert into seatmanagement values('A1','T1','N','N')
insert into seatmanagement values('A1','T2','N','N')
insert into seatmanagement values('A2','T2','N','N')
insert into seatmanagement values('A3','T2','N','N')
insert into seatmanagement values('A4','T2','N','N')
insert into seatmanagement values('A5','T2','N','N')
insert into seatmanagement values('A6','T2','N','N')
insert into seatmanagement values('A7','T2','N','N')
insert into seatmanagement values('A8','T2','N','N')
insert into seatmanagement values('A9','T2','N','Y')
insert into seatmanagement values('A10','T2','N','N')
insert into seatmanagement values('B1','T2','N','N')
insert into seatmanagement values('B2','T2','N','N')
insert into seatmanagement values('B3','T2','N','N')
insert into seatmanagement values('B4','T2','N','N')
insert into seatmanagement values('B5','T2','N','N')
insert into seatmanagement values('B6','T2','N','N')
insert into seatmanagement values('B7','T2','N','N')
insert into seatmanagement values('B8','T2','N','N')
insert into seatmanagement values('B9','T2','N','N')
insert into seatmanagement values('B10','T2','N','N')
insert into seatmanagement values('C1','T2','N','N')
insert into seatmanagement values('C2','T2','N','N')
insert into seatmanagement values('C3','T2','N','N')
insert into seatmanagement values('C4','T2','N','N')
insert into seatmanagement values('C5','T2','N','N')
insert into seatmanagement values('C6','T2','N','N')
insert into seatmanagement values('C7','T2','N','N')
insert into seatmanagement values('C8','T2','N','N')
insert into seatmanagement values('C9','T2','N','N')
insert into seatmanagement values('C10','T2','N','N')
insert into seatmanagement values('D1','T2','N','N')
insert into seatmanagement values('D2','T2','N','N')
insert into seatmanagement values('D3','T2','N','N')
insert into seatmanagement values('D4','T2','N','N')
insert into seatmanagement values('D5','T2','N','N')
insert into seatmanagement values('D6','T2','N','N')
insert into seatmanagement values('D7','T2','N','N')
insert into seatmanagement values('D8','T2','N','N')
insert into seatmanagement values('D9','T2','N','N')
insert into seatmanagement values('D10','T2','N','N')
insert into seatmanagement values('E1','T2','N','N')
insert into seatmanagement values('E2','T2','N','N')
insert into seatmanagement values('E3','T2','N','N')
insert into seatmanagement values('E4','T2','N','N')
insert into seatmanagement values('E5','T2','N','N')
insert into seatmanagement values('E6','T2','N','N')
insert into seatmanagement values('E7','T2','N','N')
insert into seatmanagement values('E8','T2','N','N')
insert into seatmanagement values('E9','T2','N','N')
insert into seatmanagement values('E10','T2','N','N')


select *from [dbo].[Seatmanagement]

insert into Confirmation values('B1','pachai','T1','P1',1,'M1',1,'1R1C1'),
                               ('B2','priya','T1','P2',1,'M1',1,'1R2C2'),
							   ('B3','poornima','T2','P3',1,'M3',1,'2R1C2'),
							   ('B4','vishalini','T2','P4',1,'M3',1,'2R1C3'),
							   ('B5','vighnesh','T3','P5',1,'M4',1,'3R2C4'),
							   ('B6','dhanush','T3','P7',1,'M4',1,'3R2C5'),
							   ('B7','thilaga','T4','P9',1,'M5',1,'4R1C4'),
							   ('B8','dharani','T4','P6',1,'M5',1,'4R1C5'),
							   ('B9','keerthi','T6','P8',1,'M3',1,'6R1C2'),
							   ('B10','niranj','T6','P10',1,'M3',1,'6R1C3'),
							   ('B11','pachai','T7','P11',1,'M1',1,'7R2C3'),
							   ('B12','poornima','T7','P12',1,'M1',1,'7R2C4');

select *from Paymentmode

alter table TimingTable add MovieID varchar(10) foreign key references Movie(MovieID); 



 
 
 
 insert into[dbo].[TimingTable]  values   ('1R2C2','T1','priya','N','Y'),
										  ('2R1C2','T2','poornima','Y','N'),
										  ('2R2C3','T2','vishalini','Y','N'),
										  ('3R2C4','T3','vighnesh','N','Y'),
										  ('3R2C5','T3','dhanush','N','Y'),
										  ('4R1C4','T4','thilaga','Y','N'),
										  ('4R1C5','T4','dharani','Y','N'),
										  ('6R1C2','T6','keerthi','N','Y'),
										  ('6R1C3','T6','niranj','N','Y'),
										  ('7R2C3','T7','pachai','Y','N'),
                                          ('7R2C4','T7','poornima','Y','N');
				

alter table Seatmanagement add MovieID varchar(10) foreign key references Movie(MovieID)

