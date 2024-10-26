create table productos(
	codigo int not null,
	nombre varchar(50) not null,
	descripcion varchar(200),
	precio money not null,
	stock int not null,
	constraint productos_pk primary key(codigo)
)
--Inserts-----------------------------------------------------------
insert into productos(codigo,nombre,descripcion,precio,stock)
values (15,'Sebastian','Una docena de Esferos',20,10)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (17,'Pepe','Hojas',15,9)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (18,'Julia','Fruta',11,50)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (19,'Julio','Fundas',23.65,4)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (11,'Beto','Pintura',29,10)
insert into productos(codigo,nombre,precio,stock)
values (16,'Mateo',15,4)
insert into productos(codigo,nombre,precio,stock)
values (21,'Thomas',16,4)
insert into productos(codigo,nombre,precio,stock)
values (22,'Perla',17,5)
select * from productos 
--Selects-------------------------------------------------------------------
select * from productos where nombre like 'Q%'
select * from productos where descripcion is null
select * from productos where precio between '10'::money and '20'::money
---Updates-------------------------------------------------------------------
update productos set stock=0
where stock is null
---Deletes-------------------------------------------------------------------
delete from productos where descripcion is null
