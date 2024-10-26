create table videojuegos(
	codigo int not null,
	nombre varchar(100) not null,
	descripcion varchar(300),
	valoracion int not null,
	constraint videojuegos_pk primary key(codigo)
)
---Inserts----------------------------------------------------------
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(12345,'FarCry 3','Accion',9)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(13654,'God of War','Accion',8)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(18456,'Minecraft','Aventura',9)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(45684,'COD Black Ops','Accion',10)
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(14458,'Fifa 24','Deporte',5)
insert into videojuegos(codigo,nombre,valoracion)
values(14548,'Fall Guys',8)
insert into videojuegos(codigo,nombre,valoracion)
values(14659,'Terraria',7)
insert into videojuegos(codigo,nombre,valoracion)
values(12347,'Fifa 22',5)
select * from videojuegos
---select-------------------------------------------------------------
select * from videojuegos where nombre like 'C%'
select * from videojuegos where valoracion between 9 and 10
select * from videojuegos where descripcion is null 
---Updates------------------------------------------------------------
update videojuegos set descripcion='Mejor puntuado'
where valoracion > 9
select descripcion,valoracion,* from videojuegos
where valoracion > 9
----Deletes------------------------------------------------------------
delete from videojuegos where valoracion < 7
---select 2-------------------------------------------------------------
select * from videojuegos where nombre ilike '%C%' or valoracion = 7
select * from videojuegos where codigo between 3 and 7 or valoracion = 7

select * from videojuegos where (descripcion ilike '%guerra%' and valoracion > 7 and nombre like 'C%')
or (valoracion > 8 and nombre like 'D%')

