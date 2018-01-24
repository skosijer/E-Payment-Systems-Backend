
-- Kategorija --

insert into kategorija (idKategorija, naziv) values (1, 'Putno osiguranje');
insert into kategorija (idKategorija, naziv) values (2, 'Osiguranje vozila');
insert into kategorija (idKategorija, naziv) values (3, 'Osiguranje nekretnine');

-- Tip Rizika --

insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (1, 'Region', 1);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (2, 'Starost osoba', 1);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (3, 'Sport', 1);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (4, 'Osiguran do iznosa', 1);

insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (5, 'Paket', 2);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (6, 'Slepovanje', 2);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (7, 'Popravka', 2);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (8, 'Prevoz', 2);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (101, 'Smestaj', 2);

insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (9, 'Povrsina', 3);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (10, 'Starost stana', 3);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (11, 'Procenjena vrednost', 3);
insert into TipRizika (idTipRizika, naziv, kategorija_idKategorija) values (12, 'Od cega se osigurava', 3);

-- Rizik --


insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(1, 'Evropa', 1);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(2, 'Svet', 1);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(3, 'Interkontinetalne', 1);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(4, 'do 18 godina', 2);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(5, 'od 18 - 60 godina', 2);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(6, 'preko 60 godina', 2);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(7, 'Fudbal', 3);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(8, 'Kriket', 3);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(9, 'Golf', 3);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(10, 'Skakanje sa planine', 3);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(11, 'do 10000 evra', 4);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(12, 'od 10000 - 20000 evra', 4);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(13, 'preko 20000 evra', 4);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(14, 'do 50', 9);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(15, 'od 50 - 110', 9);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(16, 'preko 110', 9);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(17, 'do 20', 10);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(18, 'od 20 - 70', 10);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(19, 'preko 70', 10);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(20, 'do 30000 evra', 11);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(21, 'od 30000 - 80000 evra', 11);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(22, 'preko 80000 evra', 11);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(23, 'Poplava', 12);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(24, 'Kradja', 12);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(25, 'Pozar', 12);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(26, 'Naknada stete do 8000 evra', 5);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(27, 'Naknada stete od 8000 - 30000 evra', 5);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(28, 'Naknada stete preko 30000 evra', 5);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(29, 'do 50', 6);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(30, 'od 50 - 110', 6);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(31, 'preko 110', 6);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(32, 'do 2000 evra', 7);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(33, 'od 2000 - 8000 evra', 7);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(34, 'preko 8000 evra', 7);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(35, 'Avion', 8);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(36, 'Autobus', 8);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(37, 'Auto', 8);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(38, 'Kombi', 8);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(39, 'Hotel', 101);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(40, 'Apartman', 101);

insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(40, 'Apartman', 101);
insert into rizik (idRizik, vrednost,tipRizika_idTipRizika) values(40, 'Apartman', 101);





