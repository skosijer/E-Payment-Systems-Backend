
-- Kategorija --

insert into kategorija (idKategorija, naziv) values (1, 'Putno osiguranje');
insert into kategorija (idKategorija, naziv) values (2, 'Osiguranje vozila');
insert into kategorija (idKategorija, naziv) values (3, 'Osiguranje nekretnine');

-- Tip Rizika --

insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (1, 'Region', 1);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (2, 'Starost osobe', 1);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (3, 'Sport', 1);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (4, 'Osiguran do iznosa', 1);

insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (5, 'Paket', 2);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (6, 'Slepovanje', 2);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (7, 'Popravka', 2);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (8, 'Prevoz', 2);

insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (9, 'Povrsina', 3);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (10, 'Starost stana', 3);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (11, 'Procenjena vrednost', 3);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (12, 'Od cega se osigurava', 3);

-- Rizik --



