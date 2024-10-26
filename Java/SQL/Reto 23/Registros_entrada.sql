create table empleado(
	codigo_empleado int not null,
	nombre varchar(25) not null,
	fecha date not null,
	hora time not null,

	constraint empleado_pk primary key (codigo_empleado)
)

alter table registros_entrada
add constraint registros_entrada_fk foreign key (codigo_empleado)
references empleado (codigo_empleado)

select * from empleado
select * from registros_entrada

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2201,'Jose','01/08/2023','10:30');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2202,'Manuel','12/08/2023','10:35');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2203,'Marta','16/08/2023','10:41');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2204,'Mirella','18/09/2023','10:47');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2205,'San Antonio','20/04/2023','10:53');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2206,'"Sebastian"','10/04/2023','10:59');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2207,'"Carl"','22/11/2023','11:07');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2208,'"Jimmy"','12/11/2023','11:14');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2209,'"Juan"','16/11/2023','11:24');
insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2210,'Consuelo','10/12/2023','11:40')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(123,'1753999364','01/08/2023','10:30',2201);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(124,'1753995474','12/08/2023','10:35',2202);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(125,'1753995454','16/08/2023','10:41',2203);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(126,'1753978524','18/09/2023','10:47',2204);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(127,'1753974624','20/04/2023','10:53',2205);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(128,'1753978854','10/04/2023','10:59',2206);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(129,'1755525824','22/11/2023','11:07',2207);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(110,'1845424554','12/11/2023','11:14',2208);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(111,'1765112874','16/11/2023','11:24',2209);
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora,codigo_empleado)
values(112,'1778455884','10/12/2023','11:40',2210)
