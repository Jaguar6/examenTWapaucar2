DROP TABLE IF EXISTS Personas;
 
CREATE TABLE Personas(
  id INT AUTO_INCREMENT  PRIMARY KEY NOT NULL,
  nombre VARCHAR(20) DEFAULT NULL,
  apellido1 VARCHAR(20) DEFAULT NULL,
  apellido2 VARCHAR(20) DEFAULT NULL,
  movil VARCHAR(20) DEFAULT NULL
);


insert into Personas (nombre,apellido1,apellido2,movil) values ('John','Connor',' ','+34 666 666 666');
insert into Personas (nombre,apellido1,apellido2,movil) values ('Wanda','Gould',' ','+1 212 555 555');
insert into Personas (nombre,apellido1,apellido2,movil) values ('Perico','Palotes','Pérez','+34 666 666 667');
insert into Personas (nombre,apellido1,apellido2,movil) values ('Ana','Palotes','García','+34 666 666 668');

