create table Theatre(
TheatreID varchar(10) not null primary key,
TheatreName varchar(20) not null,
MovieID varchar(10) not null Foreign key references Movie(MovieID),
LocationID int foreign key references Location_table(LocationID),
showdate int ,
);


insert into Theatre values ('T1','Kamala','M1',11,3005),
                            ('T2','Avm','M2',11,0106),
							('T3','LAcinemas','M3',12,3005),
							('T4','Ramba','M4',12,0106),
							('T6','KSR','M5',13,3005),
							('T7','Oscar','M1',13,0106);

--Movie_Name varchar(25)
Userid varchar(25) not null foreign key references  usertable(userid),
Reviews varchar(100) null,
Ratings int ,
);

insert into Rating values ('M1','pachai','Good flow',5),
                          ('M3','priya','Nice',4),
						  ('M2','dhanush','Interesting',5);
select * from Theatre

insert into MovieDetails values ('M4','Kathiresan,who escapes from prison ,accidentally meets his lookalike,jeeva,who gets shot by criminals.Kathiresan masquerades as jeeva in order to save himself,but it turns him into a crusader','A.R.Murugadoss'),
                                 ('M5','A woman aims to excel intensely competitive world of cricket with the help of her supportive father','Arun raja kamaraj');
alter table MovieDetails alter column synopsis varchar(300);
add  TotalSeats int

alter table Theatre drop column AvailableSeats

alter table Theatre 
alter column TotalSeats int not null;

insert into Theatre (TotalSeats,AvailableSeats) 
values(10,6);







