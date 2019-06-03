alter table [Location_table] 
 add primary key ([LocationID]);

 alter table Movie
  add   LocationID int  ;

  alter table Movie add foreign key (LocationID) references Location_table([LocationID]);

 select * from 
 [dbo].[Movie];
 create table MovieDetail(
 MovieID varchar (25) not null foreign key references Movie (MovieID),
 Synopsis varchar(100) not null ,
 Timing varchar(20) not null primary key,
 );

 DROP table Movie
 update Movie set LocationID= 11 where MovieID='M2' ;



 insert into MovieDetails (MovieID, Movie_Name,TheatreID,Theatre_Name,MovieDate,LocationID) 
 values ('M7','Kaththi','K4','',2501,13);

 