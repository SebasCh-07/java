create table transacciones(
	codigo int not null,
	numero_cuenta char(5) not null,
	monto money not null,
	tipo char(1) not null,
	fecha date not null,
	hora time not null,
	constraint transacciones_pk primary key(codigo)
)
-----Inserts---------------------------------------------------------------------
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54498,'12345',12.2,'C','19/09/2024','17:24')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54494,'12346',124,'D','17/10/2024','17:30')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54497,'12347',14,'C','04/04/2024','14:24')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54499,'12348',66,'C','16/06/2026','16:56')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54491,'12349',122,'D','09/12/2024','12:20')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54492,'12341',1202,'D','11/11/2021','11:21')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54493,'12342',18.2,'C','14/07/2024','04:14')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54495,'12343',78.2,'D','20/05/2023','19:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(54496,'12344',12.2,'D','04/10/2010','00:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(57454,'12347',1452,'C','18/08/2024','17:24')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(59487,'16487',200,'C','18/08/2024','17:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(59887,'22008',200,'D','25/05/2012','17:00')
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(3,'22002',200,'D','29/05/2012','17:00');
insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(2,'22003',200,'D','26/05/2012','17:00');
select * from transacciones
---select---------------------------------------------------------------------------
select * from transacciones where tipo like 'D'
select * from transacciones where monto between '200'::money and '2000'::money
select codigo,monto,tipo,fecha from transacciones where fecha is not null
---Updates--------------------------------------------------------------------------
update transacciones set tipo='T'
where monto > '100'::money and monto <'500'::money 
and Extract(Month From fecha) = 9 
and hora between '14:00' and '20:00'
select tipo, monto, fecha, hora from transacciones
where monto > '100'::money and monto <'500'::money 
and Extract(Month From fecha) = 9 
and hora between '14:00' and '20:00'
----Deletes--------------------------------------------------------------------------
delete from transacciones 
where hora between '14:00' and '18:00'
and fecha between '01/08/2024' and '31/08/2024'
---select 2---------------------------------------------------------------------------
select * from transacciones where tipo = 'C' and cast(numero_cuenta as int) between 22004 and 222001

select * from transacciones 
where tipo = 'D' 
and extract(month from fecha) = 5 and extract(day from fecha) = 25 
and cast(numero_cuenta as int) between 22007 and 22010

select * from transacciones 
where codigo between 1 and 5 
and cast(numero_cuenta as int) between 22002 and 22004
and extract(month from fecha) = 5 and extract(day from fecha) = 26 or extract(day from fecha) = 29 