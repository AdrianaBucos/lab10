drop table if exists persoane;
create table masini (id integer not null primary key, nrInmatriculare varchar(10) not null, marca varchar(20) not null, anul int, culoare varchar(20), Nrkm int);
insert into masini (id, nrInmatriculare, marca, anul, culoare, Nrkm) values (1, 'B123ABC', 'Ford', 2018, 'rosu', 50000);
insert into masini (id, nrInmatriculare, marca, anul, culoare, Nrkm) values (2, 'C456DEF', 'BMW', 2020, 'negru', 20000);
insert into masini (id, nrInmatriculare, marca, anul, culoare, Nrkm) values (3, 'A789GHI', 'Audi', 2019, 'alb', 30000);
insert into masini (id, nrInmatriculare, marca, anul, culoare, Nrkm) values (4, 'D012JKL', 'Mercedes', 2017, 'argintiu', 60000);