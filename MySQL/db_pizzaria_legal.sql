create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categorias(
id int auto_increment,
sabor varchar(50) not null,
 primary key (id)
);

create table tb_pizzas(
id int auto_increment,
nome varchar(50) not null,
acompanhamento varchar (50),
tamanho varchar (50) not null,
preco float,
primary key (id) 
);

alter table tb_pizzas add categoria_id int;
alter table tb_pizzas add constraint fk_pizzas_categorias
foreign key (categoria_id) references tb_categorias (id);

select * from tb_pizzas;
select * from tb_categorias;

insert into tb_categorias (sabor) values ("Doce");
insert into tb_categorias (sabor) values ("Salgada");
insert into tb_categorias (sabor) values ("Light");
insert into tb_categorias (sabor) values ("Vegetariana");
insert into tb_categorias (sabor) values ("Vegana");

insert into tb_pizzas (nome, acompanhamento, tamanho, preco, categoria_id) values ("Marguerita", "Coca-cola", "Familia", 70, 2);
insert into tb_pizzas (nome, acompanhamento, tamanho, preco, categoria_id) values ("Palmito", "Coca-cola", "grande", 50, 5);
insert into tb_pizzas (nome, acompanhamento, tamanho, preco, categoria_id) values ("Mussarela", "Familia", 70, 4);
insert into tb_pizzas (nome, acompanhamento, tamanho, preco, categoria_id) values ("Chocolate", "Batata frita", "Pequena", 25, 1);
insert into tb_pizzas (nome, acompanhamento, tamanho, preco, categoria_id) values ("Portuguesa", "Fanta laranja", "Familia", 70, 2);
insert into tb_pizzas (nome, acompanhamento, tamanho, preco, categoria_id) values ("Ricota e espinafre", "Grande", 45, 3);
insert into tb_pizzas (nome, acompanhamento, tamanho, preco, categoria_id) values ("Romeu e Julieta", "Coca-cola", "Grande", 50, 1);
insert into tb_pizzas (nome, acompanhamento, tamanho, preco, categoria_id) values ("Calabresa", "Fanta uva", "Média", 30, 2);

select * from tb_pizzas where preco > 45;
select * from tb_pizzas where preco between 50 and 100;
select * from tb_pizzas where nome like "M%";

select * from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.categoria_id;
select * from tb_pizzas 
inner join tb_categorias on tb_categorias.id = tb_pizzas.categoria_id where categoria_id = 1;