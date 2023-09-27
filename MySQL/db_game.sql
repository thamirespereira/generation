create database db_generation_game_online;
use db_generation_game_online;

create table tb_classes(
id int auto_increment,
classe varchar(50) not null,
habilidade varchar(255) not null,
 primary key (id)
);

create table tb_personagens(
id int auto_increment,
nome varchar(50) not null,
vida int not null,
ataque float,
defesa float,
primary key (id) 
);

alter table tb_personagens add classe_id int;
alter table tb_personagens add constraint fk_personagens_classes
foreign key (classe_id) references tb_classes (id);

select * from tb_classes;
select * from tb_personagens;

insert into tb_classes (classe, habilidade) values ("Bruxo(a/e)", "Magia");
insert into tb_classes (classe, habilidade) values ("Ladino(a/e)", "Espreitar");
insert into tb_classes (classe, habilidade) values ("Caçador(a/e)", "Caçar");
insert into tb_classes (classe, habilidade) values ("Mago(a/e)", "Magia");
insert into tb_classes (classe, habilidade) values ("Guerreiro(a/e)", "Esgrima");

insert into tb_personagens (nome, vida, ataque, defesa, classe_id) values ("Elsa", 100, 1000, 1500, 4);
insert into tb_personagens (nome, vida, ataque, defesa, classe_id) values ("Felix", 100, 1000, 2000, 2);
insert into tb_personagens (nome, vida, ataque, defesa, classe_id) values ("Nana", 100, 3000, 2000, 1);
insert into tb_personagens (nome, vida, ataque, defesa, classe_id) values ("Nico", 100, 4000, 1000, 5);
insert into tb_personagens (nome, vida, ataque, defesa, classe_id) values ("Chris", 100, 2000, 1000, 3);
insert into tb_personagens (nome, vida, ataque, defesa, classe_id) values ("Momo", 100, 3000, 1000, 4);
insert into tb_personagens (nome, vida, ataque, defesa, classe_id) values ("Lana", 100, 3000, 3000, 5);
insert into tb_personagens (nome, vida, ataque, defesa, classe_id) values ("Jason", 100, 2000, 4000, 2);

select * from tb_personagens where ataque > 2000;
select * from tb_personagens where defesa between 1000 and 2000;
select * from tb_personagens where nome like "C%";

select * from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.classe_id;
select * from tb_personagens 
inner join tb_classes on tb_classes.id = tb_personagens.classe_id where classe_id = "2";
