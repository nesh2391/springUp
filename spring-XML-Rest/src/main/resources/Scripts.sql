create database movieFlexTest;
use movieFlexTest;
DROP TABLE IF EXISTS MovieGenre;
create table MovieGenre(
	id int(11) NOT NULL AUTO_INCREMENT,
	uuid varchar(36),
	gener varchar(120),
	PRIMARY KEY (id) 
);
DROP TABLE IF EXISTS MovieMain;
create table MovieMain(
	id int unsigned NOT NULL AUTO_INCREMENT,
	UUID varchar(36) NOT NULL,
	Title varchar(250) NOT NULL,
	Released Year(4),
	Poster varchar(250) NOT NULL,
	PRIMARY KEY (id) 
);
select * from MovieGenre;
