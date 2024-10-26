create table compras(
	id_compra int,
	cedula char(10) not null,
	fecha_compra DATE not null,
	monto DECIMAL not null,
	constraint id_compra_pk primary key (id_compra)
)
alter table compras
add constraint compras_cedula_fk foreign key (cedula)
references clientes(cedula)
insert into clientes(cedula,nombre,apellido)
values('1753999364','Sebastián','Chamorro')
insert into clientes(cedula,nombre,apellido)
values('1753777364','Mónica','Garcia')
insert into clientes(cedula,nombre,apellido)
values('1712365287','Marco','Solis')
insert into clientes(cedula,nombre,apellido)
values('1896541252','Raul','Chamorro')
insert into clientes(cedula,nombre,apellido)
values('7777777777','Monica','Lara')
insert into clientes(cedula,nombre,apellido)
values('9875612485','Sebastián','Pillajo')
insert into clientes(cedula,nombre,apellido)
values('1765422844','Sergio','Baquero')
insert into clientes(cedula,nombre,apellido)
values('1846515154','Misa','Sinfonia')
insert into clientes(cedula,nombre,apellido)
values('5421452155','Alex','Padilla')
insert into clientes(cedula,nombre,apellido)
values('1753999447','Lamil','Yamal')
insert into compras(id_compra,cedula,fecha_compra,monto)
values(20,'1753999364','10/12/2022',20)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(21,'1753777364','11/12/2022',25)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(22,'1712365287','12/12/2022',5)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(23,'1896541252','01/12/2023',5.5)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(24,'7777777777','02/12/2023',10.2)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(25,'9875612485','05/12/2023',20.9)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(26,'1765422844','06/12/2023',16.1)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(27,'1846515154','09/12/2023',20)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(28,'5421452155','01/12/2024',30)
insert into compras(id_compra,cedula,fecha_compra,monto)
values(29,'1753999447','10/12/2024',20)
----------------------------------------------------------------------------------
select nombre,apellido from clientes
where cedula like '&7%' or cedula like '%7' or cedula like '7%' 

select * from clientes where cedula = (select cedula from clientes where nombre = 'Mónica') 

select * from clientes
select * from compras
