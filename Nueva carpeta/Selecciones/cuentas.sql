create table cuentas(
	numero_cuenta char(5) not null,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,
	constraint cuentas_pk primary key(numero_cuenta)
)
---inserts------------------------------------------------------------------------
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(54578,17539,'20/04/2025',50)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(54585,17642,'29/06/2022',500)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(65874,23468,'15/12/2023',0.05)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(87756,87846,'29/06/2022',400)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(65478,17842,'19/07/2007',60)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(54568,52539,'16/04/2019',70)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(57885,25642,'21/08/2012',501)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(65456,35168,'15/12/2029',0.15)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(78946,83246,'06/01/2002',785)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(62458,56842,'12/06/2017',600)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(62788,56123,'12/08/2024',600)
select * from cuentas
---selects------------------------------------------------------------------------------

select numero_cuenta, saldo from cuentas 
select * from cuentas where fecha_creacion between '20/07/2024' and '20/09/2024'
select numero_cuenta, saldo from cuentas where fecha_creacion between '20/07/2024' and '20/09/2024'
