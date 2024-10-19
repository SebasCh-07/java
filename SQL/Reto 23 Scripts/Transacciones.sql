create table banco(
	codigo_banco int,
	codigo_transaccion int,
	detalle varchar(100),
	constraint banco_pk primary key (codigo_banco)
)

alter table banco
add constraint banco_fk foreign key (codigo_transaccion)
references transacciones (codigo)

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(123,1,'Credito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(124,2,'Debito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(125,3,'Credito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(126,4,'Debito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(127,5,'Credito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(128,6,'Debito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(129,7,'Credito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(110,8,'Debito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(111,9,'Credito');
insert into banco(codigo_banco,codigo_transaccion,detalle)
values(112,10,'Debito')

select * from transacciones

insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(1,'22001',100,'C','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(2,'22002',100,'D','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(3,'22003',100,'C','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(4,'22004',100,'D','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(5,'22001',100,'C','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(6,'22002',100,'D','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(7,'22003',100,'C','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(8,'22004',100,'D','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(9,'22002',100,'C','19/09/2024','17:24');
insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
values(10,'22004',100,'D','19/09/2024','17:24')