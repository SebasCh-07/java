--crea la tabla clientes  
drop table clientes

create table clientes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	edad int,
	constraint clientes_pk primary key(cedula)
)

insert into clientes(cedula,nombre,apellido)
values ('1753999364','Sebastian','Chamorro')

insert into clientes(cedula,nombre,apellido,edad)
values ('1753666364','Pepe','Nose',1.85)

select cedula,nombre,apellido,edad from clientes

select * from clientes