create table registros_entrada(
	codigo_registro int not null,
	cedula_empleado char(10) not null,
	fecha date not null,
	hora time not null,
	constraint registros_entrada_pk primary key(codigo_registro)
)
---inserts-----------------------------------------------------------------------
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12345,1236549852,'12/04/2024','10:30')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12346,7441852369,'12/04/2024','10:35')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12347,9517536548,'12/04/2024','10:41')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12348,8524567891,'12/04/2024','10:47')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12349,7458963251,'12/04/2024','10:53')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12350,7418965245,'12/04/2024','10:59')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12351,1753999364,'12/04/2024','11:07')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12352,4521789635,'12/04/2024','11:14')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12353,1754666872,'12/04/2024','11:24')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (12354,9874562159,'12/04/2024','11:30')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (13354,9874562759,'12/08/2024','11:30')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (13624,9874546559,'10/08/2020','11:40')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (11424,9884546559,'10/06/2020','11:40')
insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values (11454,1784546559,'10/08/2020','11:40')
select * from registros_entrada
---select------------------------------------------------------------------------
select cedula_empleado,fecha,hora from registros_entrada
select * from registros_entrada where hora between '7:00' and '14:00'
select * from registros_entrada where hora > '8:00'
---Updates-----------------------------------------------------------------------
update registros_entrada set cedula_empleado='082345679'
where Extract(month from fecha) = 8
select cedula_empleado, fecha from registros_entrada
where Extract(month from fecha) = 8
----Deletes-------------------------------------------------------------------------------
delete from registros_entrada where Extract(month from fecha) = 6
---select 2-------------------------------------------------------------------------------
select * from registros_entrada where extract(month from fecha) = 9 or cedula_empleado like '17%'

select * from registros_entrada 
where (extract(month from fecha) = 8) 
and (cedula_empleado like '17%') 
and (hora between '08:00' and '12:00')

select * from registros_entrada
where (extract(month from fecha)= 8
and cedula_empleado like '17%'
and hora between '08:00' and '12:00')
or (extract(month from fecha)=9
and cedula_empleado like '08%'
and hora between '09:00' and '13:00')
