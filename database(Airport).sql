
create table tickets(
id_ticket int,
how_long varchar(100),
id_class_ticket int not null,
price double,
primary key(ID_TICKET),
foreign key(id_class_ticket) references 
classes(id_class));

drop table classes;
drop table tickets;
drop table planes;
drop table airports;

select id_ticket,how_long,id_class_ticket,
price from tickets;

create table classes(
id_class int,
class_name varchar(100) not null,
primary key(id_class)
)ENGINE = InnoDB;

create table planes(
id_plane int,
plane_name varchar(100) not null,
id_ticket_plane int not null,
id_class_plane int not null,
primary key (id_plane),
foreign key(id_ticket_plane) references 
tickets(id_ticket),
foreign key(id_class_plane) references 
classes(id_class)
);

create table airports(
id_airport int,
airport_name varchar(100) not null,
city_name varchar(100) not null,
id_plane_airport int  not null ,
primary key (id_airport),
foreign key(id_plane_airport) references 
planes(id_plane)
);


insert into classes(
id_class,class_name 
)
values(
2,'Economy Class'
);

insert into tickets(
id_ticket,
how_long,
id_class_ticket,
price
)
values(1,'2018-05-17 12:00-15:02',2,2000),
(2,'2018-05-19 11:00-14:08',2,2000),
(3,'2018-09-14 13:50-16:58',2,7500),
(4,'2018-10-12 8:50-12:45',2,6800),
(5,'2018-12-12 19:07-19:50',2,4500),
(6,'2018-12-13 14:38-15:35',2,4900),
(7,'2018-10-14 8:30-23:00',2,9700),
(8,'2019-01-08 12:57-14:40',2,3600),
(9,'2018-11-27 16:50-00:32',2,2750),
(10,'2018-10-16 7:10-21:45',2,5500
);
insert into planes(
id_plane,
plane_name,
id_class_plane,
id_ticket_plane
)values(1,'Airbus A320neo',2,3),
(2,'Boeing 737MAX',2,1),
(3,'Airbus A330neo',2,4),
(4,'Bombardier CSeries',2,2),
(5,'Comac C919',2,5),
(6,'Mitsubishi MRJ',2,8),
(7,'Airbus A380',2,6),
(8,'Суперджет-100',2,7),
(9,'Антонов Ан-38',2,9),
(10,'Airbus A340',2,10);

insert into airports(
id_airport,
airport_name,
city_name,
id_plane_airport 
)values(1,'Минск2-Гартвик','Минск-Лондон',8),
(2,'Гартвик-Минск2','Лондон-Минск',2),
(3,'Минск2-Хитроу','Минск-Лондон',3),
(4,'Шереметьево-Шарль де Голь','Москва-Париж',4),
(5,'Домодедово-Минск2','Москва-Минск',5),
(6,'Минск2-Шереметьево','Минск-Москва',6),
(7,'Домодедово-Кингсфорд Смит','Москва-Сидней',7),
(8,'Шёнефельд-Минск2','Минск-Берлин',1),
(9,'Шереметьево-Даболлим','Москва-ГОА',10),
(10,'Минск2-Кеннеди','Минск-Нью-Йорк',9);

