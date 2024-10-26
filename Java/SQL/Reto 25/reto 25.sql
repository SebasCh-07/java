---------------------------Relacion cuentas/usuario------------------------------------------------
elect AVG(cast(saldo as numeric)) from cuentas
where cedula_propietario = '12313'

select tipo_cuenta,count(*) from usuario 
group by tipo_cuenta

select * from cuentas
select * from usuario
-------------------------------Relacion clientes/compras------------------------------------------
select cedula, sum(monto) from compras
group by cedula 

select fecha_compra, count(*) from compras
where fecha_compra = '12-12-2022' group by fecha_compra 


select * from compras
select * from clientes
-------------------------------Relacion estudiantes/prefesores-------------------------------------
select codigo_profesor, count(*) from estudiantes 
group by codigo_profesor

select ROUND(AVG(EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM fecha_nacimiento)))
from estudiantes

select * from estudiantes 
-------------------------------Relacion personas/prestamo--------------------------------------------
select cedula,sum(monto) from prestamo
group by cedula

select count(*)from personas 
where numero_hijo>1

select * from personas
-------------------------------Relacion Productos/Ventas--------------------------------------------
select max(precio) from productos

select sum(cantidad) from ventas 
select * from ventas
-------------------------------Relacion Transaccion/Banco--------------------------------------------
select count(*) from transacciones
where tipo = 'C'

select numero_cuenta, ROUND(AVG(cast(monto as decimal)), 2)from transacciones
group by numero_cuenta

select * from transacciones
-------------------------------Relacion VideoJuegos/Plataformas--------------------------------------------
select codigo_videojuego, count(*) from plataformas
group by codigo_videojuego

select ROUND(AVG(valoracion), 2)from videojuegos;
-------------------------------Relacion Regsitro_Entrada/Empleado--------------------------------------------
select cedula_empleado, count(*) from registros_entrada
group by cedula_empleado

select MIN(fecha), MAX(fecha) from registros_entrada

select * from registros_entrada
