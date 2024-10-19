create table prestamo(
	cedula char(10),
	monto money,
	fecha_prestamo date,
	hora_prestamo time,
	garante varchar(40),

	constraint prestamo_pk primary key(cedula)
)
select * from personas
alter table personas
add constraint personas_prestamo_fk foreign key (cedula)
references prestamo (cedula)
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1789546235',100.5,'05/01/2024','10:30','Jose');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1768485235',999,'15/01/2024','10:40','Rosa');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1778224235',500,'20/02/2024','10:45','Sean');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1984125435',100,'27/02/2024','11:03','Manuel');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1798452535',800,'29/02/2024','11:30','Freddy');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('8884888235',700,'05/03/2024','11:50','Jose');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1789999634',623,'10/03/2024','12:10','Marce');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1789458754',954,'25/03/2024','12:30','Misa');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1798755489',915,'06/04/2024','12:50','Marta');
insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1687845889',1000,'05/05/2024','1:30','Pele')
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1789546235','Sean','Ortega','10/06/2001','U');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1768485235','Jose','Sornoza','10/06/2002','C');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1778224235','Sebastian','Rodriguez','10/06/2000','C');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1984125435','Marta','Ronaldo','10/06/1999','S');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1798452535','Misa','Messi','10/06/1999','S');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('8884888235','Rosa','Ortega','10/06/2003','U');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1789999634','Saul','Cepeda','10/06/1998','C');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1789458754','Ivan','Baquero','10/06/1997','S');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1798755489','Juan','Sornoza','10/06/1995','C');
insert into personas(cedula,nombre,apellido,fecha_nacimiento,estado_civil_codigo)
values('1687845889','Sara','Casa','10/06/2000','S')
--------------------------------------------------------------------------------------------
select per.cantidad_ahorrada,pr.monto,pr.garante from prestamo pr, personas per
where pr.monto between '100'::money and '1000'::money
and pr.cedula = per.cedula

select * from personas 
where cedula = (select cedula from personas where nombre = 'Sean')

select * from prestamo
select * from personas