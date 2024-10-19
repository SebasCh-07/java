create table profesores(
	codigo int,
	nombre varchar(50) not null,
	constraint profesores_pk primary key (codigo) 
)
create table estudiantes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	email varchar(50) not null,
	fecha_nacimiento date,
	codigo_profesor int,
	constraint estudiantes_pk primary key(cedula)
)


alter table estudiantes
add constraint estudiantes_codigo_profesor_fk foreign key (codigo_profesor)
references profesores(codigo)

select * from estudiantes

insert into profesores(codigo, nombre)
values(21,'Gladys Medina');
insert into profesores(codigo, nombre)
values(22,'Julian Alvarez');
insert into profesores(codigo, nombre)
values(23,'Rocio Davila');
insert into profesores(codigo, nombre)
values(24,'Francisco Pillajo');
insert into profesores(codigo, nombre)
values(25,'Eva Morales')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values(1753999364,'Sebastian','Chamorro','sebasch.est@gmail.com','07/06/2007',21);
insert into estudiantes(cedula,nombre,apellido,email,codigo_profesor)
values(1753666364,'Pedro','Cartagena','elmasPro@gmail.com',22);
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values(1753996574,'Thomas','Villacorte','ElThomas32@gmail.com','01/03/2007',21);
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values(1753654852,'Polett','Alcón','milgrethAlcon@gmail.com','29/09/2006',25);
insert into estudiantes(cedula,nombre,apellido,email,codigo_profesor)
values(1845328142,'Julian','Cofre','est@gmail.com',24);
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values(1234456874,'David','Caracas','Caracas123@gmail.com','15/12/2012',23);
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values(7412589874,'Natalia','Fernandez','FernaNati@gmail.com','24/08/2014',21);
insert into estudiantes(cedula,nombre,apellido,email,codigo_profesor)
values(1766548905,'Ada','Corona','4D4CR@gmail.com',22);
insert into estudiantes(cedula,nombre,apellido,email,codigo_profesor)
values(1766544905,'Sergio','Paredes','Sergi@gmail.com',25);
insert into estudiantes(cedula,nombre,apellido,email,codigo_profesor)
values(1766565575,'Aida','Wong','AidaWng@gmail.com',23)
select * from estudiantes