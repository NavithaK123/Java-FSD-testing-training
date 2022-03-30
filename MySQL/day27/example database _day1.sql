create database example;
use example;
create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6)
);
alter table addresses
add primary key (id);

create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int
);
alter table people
add primary key(id);

alter table people
add constraint fk_adresses
foreign Key(address_id)references addresses(id);
describe people;
alter table people
drop foreign key fk_adresses;
alter table people
drop index fk_adresses;
describe people;
show create table people;
create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int
);
describe pets;
alter table petsidname
add constraint u_species unique(species);
alter table pets modify owner_id char;
alter table pets 
change name petname  varchar(25);
describe pets;

