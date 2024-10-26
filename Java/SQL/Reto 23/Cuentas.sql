create table usuario (
	cedula char(5),
	nombre varchar(25) not null,
	apellido varchar(25) not null,
	tipo_cuenta VARCHAR(20),
	limite_credito DECIMAL,

	constraint usuario_pk primary key(cedula)
)
alter table cuentas
add constraint cuentas_cedula_propietario_fk foreign key(cedula_propietario)
references usuario(cedula)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(54578,12345,'22/08/2022',500)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(54585,12346,'23/09/2022',100)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(65874,12347,'18/10/2022',450)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(87756,12348,'27/11/2022',400)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(65478,12349,'01/12/2022',600)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(54568,12310,'05/01/2023',700)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(57885,12311,'09/02/2023',501)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(65456,12312,'15/03/2023',200)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(71346,12313,'16/04/2023',1000)
insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(62458,12314,'20/05/2023',600)

select * from cuentas
insert into usuario(cedula,nombre,apellido)
values(12345,'Marco','Polo')
insert into usuario(cedula,nombre,apellido)
values(12346,'Rayo','McQueen')
insert into usuario(cedula,nombre,apellido)
values(12347,'Jose','Polo')
insert into usuario(cedula,nombre,apellido)
values(12348,'Mario','McDonald')
insert into usuario(cedula,nombre,apellido)
values(12349,'Mirella','Pila')
insert into usuario(cedula,nombre,apellido)
values(12310,'Rosa','Andrango')
insert into usuario(cedula,nombre,apellido)
values(12311,'Rocio','Davila')
insert into usuario(cedula,nombre,apellido)
values(12312,'Atlas','Maclovin')
insert into usuario(cedula,nombre,apellido)
values(12313,'Marco','Baquero')
insert into usuario(cedula,nombre,apellido)
values(12314,'Ramon','Flores')
select * from usuario


