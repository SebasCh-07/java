alter table personas 
add constraint personas_estado_civil_fk foreign key(estado_civil_codigo)

references estado_civil(codigo)

insert into personas (cedula,nombre,apellido,estado_civil_codigo)
values ('1714617122','Santi','Miella','C')

insert into estado_civil(codigo,descripcion)
values('U','UNION LIBRE');
insert into estado_civil(codigo,descripcion)
values('C','CASADO');
insert into estado_civil(codigo,descripcion)
values('S','SOLTERO')


select * from personas