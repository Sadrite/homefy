create database homefy;
use homefy;

create table Usuarios (
id int auto_increment primary key not null, 
ingresoUsuario nvarchar(50),
ingresoContrasenia nvarchar(50)
);

select * from Usuarios;

 
insert into Usuarios(ingresoUsuario, ingresoContrasenia) values ('admin','contra');
insert into Usuarios(ingresoUsuario, ingresoContrasenia) values ('tech','contra1');

DELETE FROM Usuarios WHERE id = '4';
INSERT INTO Usuarios(id, ingresoUsuario, ingresoContrasenia) VALUES (1, 'admin', 'contra');
 

select * from Usuarios where Usuarios.ingresoUsuario = 'admin' and Usuarios.ingresoContrasenia = 'contra';