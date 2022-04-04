create database XYZ_Corps_DB;

use XYZ_Corps_DB;

create table actor(
act_id int not null auto_increment primary key,
act_fname varchar(20),
act_lname varchar(20),
gender enum('M','F')
);

create table movie(
mov_id int auto_increment primary key,
mov_title varchar(50),
mov_year int not null,
mov_time int not null,
mov_lang varchar(50),
mov_dt_rel date,
mov_rel_country varchar(5)
);

create table movie_cast(
act_id int not null,
mov_id int not null,
role varchar(30),
foreign key(act_id) references actor(act_id),
foreign key(mov_id) references movie(mov_id)
);
desc movie_cast;
create table director(
dir_id int not null auto_increment primary key,
dir_fname varchar(20),
dir_lname varchar(20)
);

create table movie_direction(
dir_id int not null,
mov_id int not null,
foreign key(dir_id) references director(dir_id),
foreign key(mov_id) references movie(mov_id)
);
desc movie_direction;
create table reviewer(
rev_id int not null auto_increment primary key,
rev_name varchar(30)
);

create table genres(
gen_id int not null auto_increment primary key,
gen_title varchar(20)
);
desc genres;
create table movie_genres(
mov_id int not null,
gen_id int not null,
foreign key(gen_id) references genres(gen_id),
foreign key(mov_id) references movie(mov_id)
);

create table rating(
mov_id int not null,
rev_id int not null,
rev_stars int,
num_o_ratings int,
foreign key(rev_id) references reviewer(rev_id),
foreign key(mov_id) references movie(mov_id)
);
show tables;
-------------------------------------------------------
INSERT INTO actor(act_id, act_fname, act_lname, gender)
values('101','James','Stewart','M'),('102','Deborah','Kerr','F'),('103','Peter','OToole','M'),('104','Robert','De Niro','M'),('105','F.Murray','Abraham','M'),
('106','Harrison','Ford','M'),('107','Nicole','Kidman','F'),('108','Stephen','Baldwin','M'),('109','Jack','Nicholson','M'),('110','Mark','Wahlberg','M'),
('111','Woody','Allen','M'),('112','Claire','Danes','F'),('113','Tim','Robbins','M'),('114','Kevin','Spacey','M'),('115','Kate','Winslet','F'),('116','Robin','Williams','M'),
('117','jon','Voight','M'),('118','Ewan','McGregor','M'),('119','Christian','Bale','M'),('120','Maggie','Gyllenhaal','F'),('121','Dev','Patel','M'),('122','Sigourney','Astin','F'),
('123','David','Aston','M'),('124','Ali','Astin','F');
select* from  actor;
INSERT INTO director(dir_id,dir_fname,dir_lname)
values('201','Alfred','Hitchcock'),('202','Jack','Clayton'),('203','David','Lean'),('204','Michael','Cimino'),('205','Milos','Forman'),('206','Ridley','Scott'),
('207','Stanley','Kubrick'),('208','Bryan','Singer'),('209','Roman','Polanski'),('210','Paul','Thomas Anderson'),('211','Woody','Allen'),('212','Hayao','Miyazaki'),
('213','Frank','Darabony'),('214','Sam','Mendes'),('215','James','Cmaeron'),('216','Gus','Van Sant'),('217','John','Boorman'),('218','Danny','Boyle'),('219','Christopher','Nolan'),
('220','Richard','Kelly'),('221','Kevin','Spacey'),('222','Andrei','Tarkovsky'),('223','Peter','Jackson');
select* from  director;
INSERT INTO movie_direction(dir_id,mov_id)
values('201','901'),('202','902'),('203','903'),('204','904'),('205','905'),('206','906'),('207','907'),('208','908'),('209','909'),('210','910'),('211','911'),('212','912'),
('213','913'),('214','914'),('215','915'),('216','916'),('217','917'),('218','918'),('219','919'),('218','921'),('215','922'),('221','923');
select* from   movie_direction;
INSERT INTO movie_cast(act_id,mov_id,role)
values('101','901','John Scottie Ferguson'),('102','902','Miss Giddens'),('103','903','T.E.Lawrence'),('104','904','Michael'),('105','905','Antonio Saileri'),
('106','906','Rick Deckard'),('107','907','Alice Harford'),('108','908','McManus'),('110','910','Eddie Adams'),('111','911','Alvy Singer'),('112','912','San'),('113','913','Andy Dufresne'),
('114','914','Lester Burnham'),('115','915','Rose DeWitt Bukater'),('116','916','Sean Maguire'),('117','917','Ed'),('118','918','Renton'),('120','920','Elizabeth Darko');
select* from   movie_cast;
INSERT INTO movie(mov_id ,mov_title, mov_year ,mov_time ,mov_lang ,mov_dt_rel ,mov_rel_country)
values(901, ' Vertigo', '1958',' 128', ' English  ', '1958-08-24', ' UK'),
(902, ' The Innocents      ', 1961, 100, ' English  ', '1962-02-19', ' SW'),
(903, ' Lawrence of Arabia ', 1962, 216, ' English  ', '1962-12-11', ' UK'),
(904, ' The Deer Hunter    ', 1978, 183, ' English  ', '1979-03-08', ' UK'),
(905, ' Amadeus            ', 1984, 160, ' English  ', '1985-01-07', ' UK'),
(906, ' Blade Runner       ', 1982, 117, ' English  ', '1982-09-09', ' UK'),
(907, ' Eyes Wide Shut     ', 1999, 159, ' English  ', '0000-00-00', ' UK'),
(908, ' The Usual Suspects ', 1995, 106, ' English  ', '1995-08-25', ' UK'),
(909, ' Chinatown          ', 1974, 130, ' English  ', '1974-08-09', ' UK'),
(910, ' Boogie Nights      ', 1997, 155, ' English  ', '1998-02-16', ' UK'),
(911, ' Annie Hall         ', 1977, 93, ' English  ', '1977-04-20', ' USA'),
(912, ' Princess Mononoke  ', 1997, 134, ' Japanese ', '2001-10-19', ' UK'),
(913, ' The Shawshank Redem', 1994, 142, ' English  ', '1995-02-17', ' UK'),
(914, ' American Beauty    ', 1999, 122, ' English  ', '0000-00-00', ' UK'),
(915, ' Titanic            ', 1997, 194, ' English  ', '1998-01-23', ' UK'),
(916, ' Good Will Hunting  ', 1997, 126, ' English  ', '1998-06-03', ' UK'),
(917, ' Deliverance        ', 1972, 109, ' English  ', '1982-10-05', ' UK'),
(918, ' Trainspotting      ', 1996, 94, ' English  ', '1996-02-23', ' UK'),
(919, ' The Prestige       ', 2006, 130, ' English  ', '2006-11-10', ' UK'),
(920, ' Donnie Darko       ', 2001, 113, ' English  ', '0000-00-00', ' UK'),
(921, ' Slumdog Millionaire', 2008, 120, ' English  ', '2009-01-09', ' UK'),
(922, ' Aliens             ', 1986, 137, ' English  ', '1986-08-29', ' UK'),
(923, ' Beyond the Sea     ', 2004, 118, ' English  ', '2004-11-26', ' UK'),
(924, ' Avatar             ', 2009, 162, ' English  ', '2009-12-17', ' UK'),
(925, ' Braveheart         ', 1995, 178, ' English  ', '1995-09-08', ' UK'),
(926, ' Seven Samurai      ', 1954, 207, ' Japanese ', '1954-04-26', ' JP'),
(927, ' Spirited Away      ', 2001, 125, ' Japanese ', '2003-09-12', ' UK'),
(928, ' Back to the Future ', 1985, 116, ' English  ', '1985-12-04', ' UK');


select* from  movie;

INSERT INTO reviewer(rev_id,rev_name)
values('9001','Righty Sock'),('9002','Jack Malvern'),('9003','Flagrant Baronessa'),('9004','Alec Shaw'),('9005',''),('9006','Victor Woeltjen'),('9007','Simon Wright'),('9008','Neal Wruck'),
('9009','Paul Monks'),('9010','Mike Salvati'),('9011',''),('9012','Wesley S.Walker'),('9013','Sasha Goldshtein'),('9014','Josh Cates'),('9015','Krug Stillo'),('9016','Scott LeBrun'),('9017','Hannah Steele'),
('9018','Vincent Cadena'),('9019','Brandt Sponseller'),('9020','Richard Adams');

INSERT INTO genres(gen_id,gen_title)
values('1001','Action'),('1002','Adventure'),('1003','Animation'),('1004','Biography'),('1005','Comedy'),('1006','Crime'),('1007','Drama'),('1008','Horror'),('1009','Music'),
('1010','Mystery'),('1011','Romance'),('1012','Thriller'),('1013','War');

INSERT INTO movie_genres(mov_id,gen_id)
values('922','1001'),('917','1002'),('903','1002'),('912','1003'),('911','1005'),('908','1006'),('913','1006'),('926','1007'),('928','1007'),
('918','1007'),('921','1007'),('902','1008'),('923','1009'),('907','1010'),('927','1010'),('901','1010'),('914','1011'),
('906','1012'),('904','1013');

INSERT INTO rating(mov_id,rev_id,rev_stars,num_o_ratings)
Values('901','9001','8.4','263575'),('902','9002','7.9','20207'),('903','9003','8.3','202778'),('906','9005','8.2','484746'),('924','9006','7.3','0000'),('908','9007','8.6','779489'),('909','9008','000','227235'),
('910','9009','3','195961'),('911','9010','8.1','203875'),('912','9011','8.4','000'),('914','9013','7','862618'),('915','9001','7.7','830095'),('916','9014','4','642132'),('925','9015','7.7','830095'),
('918','9016','000','580301'),('920','9017','8.1','609451'),('921','9018','8','667758'),('922','9019','8.4','511313'),('923','9020','6.7','13091');
------------------------------------------------------------------------------

-----------------------------------
/*Write a query in SQL to list the Horror movies?*/
select mov_title from movie m
inner join movie_genres mg on m.mov_id=mg.mov_id
inner join genres g on g.gen_id=mg.gen_id
where gen_title="Horror";
--------------------------------------------
/*Write a query in SQL to find the name of all reviewers who have rated 8 or   more stars?*/
select rev_name from reviewer re
inner join rating ra on re.rev_id=ra.rev_id
where rev_stars>=8;
-----------------------------------------------------
/*--Write a query in SQL to find the movie title, year, date of release, director and actor for those movies which reviewer is ‘Neal Wruck’*/
select*from movie
where mov_id in
(select mov_id from reviewer re
inner join rating ra on re.rev_id =ra.rev_id
where rev_name='Neal Wruck');


----------------------------
/*--------Write a query in SQL to find the name of all movies who have rated their ratings with a NULL value*/
select mov_title from movie m
inner join rating r on m.mov_id=r.mov_id
where r.rev_stars=0;
-----------------------------------------------------------------------------------
/*---Write a query in SQL to find the name of movies who were directed by ‘David’*/
select mov_title from movie m
inner join movie_direction md on m.mov_id=md.mov_id
inner join director d on md.dir_id=d.dir_id
where dir_fname ='David';
------------------------------
/*Write a query in SQL to list the first and last names of all the actors who were cast in the movie ‘Boogie Nights’, 
and the roles they played in that production*/

select act_fname,act_lname,mov_title,role from actor
inner join movie_cast on actor.act_id=movie_cast.act_id
inner join movie on movie_cast.mov_id=movie.mov_id
where movie.mov_title='Boogie Nights';