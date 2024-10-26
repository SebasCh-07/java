create table estudiantes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	email varchar(50) not null,
	fecha_nacimiento date,
	constraint estudiantes_pk primary key(cedula)
)
----inserts--------------------------------------------------------------------
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values(1753999364,'Sebastian','Chamorro','sebasch.est@gmail.com','07/06/2007')
insert into estudiantes(cedula,nombre,apellido,email)
values(1753666364,'Pedro','Cartagena','elmasPro@gmail.com')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values(1753996574,'Thomas','Villacorte','ElThomas32@gmail.com','01/03/2007')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values(1753654852,'Polett','Alcón','milgrethAlcon@gmail.com','29/09/2006')
insert into estudiantes(cedula,nombre,apellido,email)
values(1845698142,'Julian','Jofre','est@gmail.com')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values(1234456874,'David','Caracas','Caracas123@gmail.com','15/12/2012')
insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values(7412589874,'Natalia','Fernandez','FernaNati@gmail.com','24/08/2014')
insert into estudiantes(cedula,nombre,apellido,email)
values(1766548964,'Ada','Corona','4D4CR@gmail.com')
select * from estudiantes
---selects-------------------------------------------------------------------------------
select nombre, cedula from estudiantes
select nombre from estudiantes where cedula like '17%'
select nombre, apellido from estudiantes where nombre like 'A%'
---Updates-------------------------------------------------------------------------------
update estudiantes set apellido='Hernández'
where cedula like '17%'

select cedula, apellido, * from estudiantes
where cedula like '17%'
