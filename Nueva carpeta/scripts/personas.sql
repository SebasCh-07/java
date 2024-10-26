-- crea la tabla personas
drop table personas
create table personas(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	estatura decimal,
	fecha_nacimiento date,
	hora_nacimiento time,
	cantidad_ahorrada money,
	numero_hijo int,
	constraint personas_pk primary key (cedula)
)
insert into personas(cedula,nombre,apellido)
values ('1714616123','Santiago','Mosquera')

insert into personas(cedula,nombre,apellido,estatura)
values ('1714616124','Pepe','Mujica',1.85)

insert into personas(cedula,nombre,apellido,numero_hijo)
values ('1714616125','Santiago','Ramos',2)

insert into personas(cedula,nombre,apellido,numero_hijo,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada)
values ('1714616126','Estefania','Rosales',1,1.58,'22/05/2000','22:54',200.34)

select * from personas