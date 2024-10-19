create table ventas (
	id_venta int,
	codigo_produto int not null,
	fecha_venta date not null,
	cantidad int,
	constraint ventas_pk primary key (id_venta)
)
alter table ventas
add constraint ventas_codigo_producto foreign key (codigo_produto)
references productos (codigo)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (10,'Jabon','jabon de platos',5,10)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (11,'Bolsos','bolsos de tela',2.5,9)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (12,'Esferos','azul',1.2,50)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (13,'Esferos','rojo',1.2,45)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (15,'Borrador','para pizarra',2,30)
insert into productos(codigo,nombre,precio,stock)
values (16,'Sacapuntas',0.9,10)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (17,'Marcadores','para pizarra',1.5,20)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (18,'Mesa','de metal',3.6,9)
insert into productos(codigo,nombre,descripcion,precio,stock)
values (19,'Goma','pegamento de hojas',3,10)
insert into productos(codigo,nombre,precio,stock)
values (20,'Compas',1.3,5)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(123,10,'10/02/2022',4)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(132,11,'11/01/2022',5)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(142,12,'12/06/2023',20)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(134,13,'12/12/2023',15)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(162,15,'01/08/2023',10)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(126,16,'05/11/2023',7)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(136,17,'06/03/2023',6)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(175,18,'08/06/2023',2)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(146,19,'05/09/2024',2)
insert into ventas(id_venta,codigo_produto,fecha_venta,cantidad)
values(113,20,'06/08/2024',1)
----------------------------------------------------------------------------------
select pr.nombre,pr.stock,ve.cantidad from productos pr, ventas ve
where pr.nombre like '%m%' or pr.nombre like '%m' or pr.descripcion = '0'

select nombre, stock from productos
where codigo = 5

select * from productos
select * from ventas
