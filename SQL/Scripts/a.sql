---count cuenta cuantas filas hay en una tabla 
select count(*) from personas per, estado_civil ec where per.estado_civil_codigo = ec.codigo and estado_civil_codigo= 'C'

- - AVG saca el promedio de una columna de tipo int
select AVG(cast(money)) from personas
AVG(columna para hacer promedio :)

--SUM MAX MIN
 select sum(columba para sumar)
 select MAX(sacar el valor maximo de una columna)
 select MIN(sacar el valor minimo de una columna)


--group by ------
select estado_civil_codigo,sum(numero_hijos) from personas 
group by estado_civil_codigo 

