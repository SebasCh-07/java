create table plataformas(
	id_plataforma int,
	nombre_plataforma varchar(50) not null,
	codigo_videojuego int,

	constraint plataformas_pk primary key (id_plataforma)
)

alter table plataformas
add constraint plataformas_id_plataforma_fk foreign key (codigo_videojuego)
references videojuegos (codigo)

select * from videojuegos

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(123,'FarCry 3','Accion',9);
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(124,'God of War','Accion',8);
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(125,'Minecraft','Aventura',9);
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(126,'COD Black Ops','Guerra',10);
insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(127,'Fifa 24','Deporte',5);
insert into videojuegos(codigo,nombre,valoracion)
values(128,'Fall Guys',8);
insert into videojuegos(codigo,nombre,valoracion)
values(129,'Terraria',7);
insert into videojuegos(codigo,nombre,valoracion)
values(1210,'Fifa 22',5);
insert into videojuegos(codigo,nombre,valoracion)
values(1211,'Dark Soul',7);
insert into videojuegos(codigo,nombre,valoracion)
values(1212,'Candy Crash',5)

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(1,'Windows, Xbox, PS',123);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(2,'Windows, Xbox, PS',124);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(3,'Windows, Xbox',125);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(4,'Windows, PS',126);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(5,'Windows, Xbox, PS',127);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(6,'Windows, PS',128);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(7,'Windows, PS',129);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(8,'Windows, Mac, PS',1210);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(9,'Windows, PS',1211);
insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(10,'Andriod',1212)

select * from plataformas
select * from videojuegos
