drop schema if exists slaughterhouse cascade;
create schema if not exists slaughterhouse;
set schema 'slaughterhouse';
create table Animal (
    id serial PRIMARY KEY,
    weight double precision,
    origin varchar,
    dateDelivered date
);
create table AnimalPart
(
    id serial PRIMARY KEY,
    weight double precision,
    type varchar,
    animalId int references Animal(id)
);
create table Tray
(
  id serial PRIMARY KEY,
  maxWeight double precision,
  type varchar
);
create table Tray_has_AnimalPart
(
    animalPartId int references AnimalPart(id),
    trayId int references Tray(id)
);
create table Package
(
    id serial PRIMARY KEY,
    type varchar
);
create table Package_has_Tray
(
    trayId int references Tray(id),
    packageId int references Package (id)
);
create table HalfAnAnimal
(
    id serial PRIMARY KEY
);
create table HalfAnAnimal_has_Tray
(
    halfAnAnimalId int references HalfAnAnimal(id),
    trayId int references  Tray(id)
);

INSERT INTO animal
values (1,23,'Boston','2022-10-09'),
       (2,11,'Warshaw','2002-10-09'),
       (3,19,'Chisinau','2019-11-03');

Insert INTO AnimalPart
values (3,17,'Loin',1),
       (4,7,'Foot',2),
       (5,9,'Head',3),
       (6,17,'Loin',2);


INSERT INTO Tray
values (5,30, 'Huge'),
       (6,10, 'Small'),
       (7,20, 'Medium');

INSERT into Tray_has_AnimalPart
VALUES (3,5),(4,6),(5,7);

INSERT INTO Package
values (1, 'Ups'),
       (2, 'NordStream');

INSERT INTO HalfAnAnimal
values (1),(2), (3);

INSERT INTO HalfAnAnimal_has_Tray
values (1,5),(2,6),(3,7);


INSERT INTO package_has_tray
values(5,1),(6,1),(5,2);