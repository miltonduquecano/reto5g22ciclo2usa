--
-- Script de creacion de la base de datos productos
--

drop schema if exists producto;
create schema if not exists producto default character set utf8 ;

USE producto;

DROP TABLE IF EXISTS Productos;
CREATE TABLE Productos (
	  codigo INTEGER PRIMARY KEY AUTO_INCREMENT comment 'codigo del producto',
	  nombre TEXT  comment 'nombre del producto',
	  precio REAL  comment 'precio del producto',
	  inventario INTEGER  comment 'cantidad del producto en inventario'
) comment='administrar informacion de los productos disponibles en la tienda';
	  
-- iNSERCION DE REGISTRO EN LA TALBA PRODUCTOS
INSERT INTO Productos(nombre, precio, inventario) values ('Manzanas', 5000, 25);
INSERT INTO Productos(nombre, precio, inventario) values ('Limones', 2300, 15);
INSERT INTO Productos(nombre, precio, inventario) values ('Peras', 2700, 33);
INSERT INTO Productos(nombre, precio, inventario) values ('Arandanos', 9300, 5);
INSERT INTO Productos(nombre, precio, inventario) values ('Tomates', 2100, 42);
INSERT INTO Productos(nombre, precio, inventario) values ('Fresas', 4100, 3);
INSERT INTO Productos(nombre, precio, inventario) values ('Helado', 4500, 41);
INSERT INTO Productos(nombre, precio, inventario) values ('Galletas', 500, 8);
INSERT INTO Productos(nombre, precio, inventario) values ('Chocolates', 3500, 80);
INSERT INTO Productos(nombre, precio, inventario) values ('Jamon', 15000, 10);