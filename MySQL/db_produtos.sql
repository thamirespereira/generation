create database db_loja;
use db_loja;

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
quantidade int not null,
descricao varchar(255),
preco decimal not null,
primary key (id)
);

insert into tb_produto(nome, quantidade, descricao, preco) values ("Coturno", 120, "Couro", 260);
insert into tb_produto(nome, quantidade, descricao, preco) values ("Tenis", 320, "Corrida", 400);
insert into tb_produto(nome, quantidade, descricao, preco) values ("Sandalha", 300, "Salto", 160);
insert into tb_produto(nome, quantidade, preco) values ("Chinelo", 520, 30);
insert into tb_produto(nome, quantidade, preco) values ("Bota", 100, 280);
insert into tb_produto(nome, quantidade, descricao, preco) values ("All-Star", 320, "varias cores", 360);
insert into tb_produto(nome, quantidade, descricao, preco) values ("All-Star", 170, "Cano longo", 560);
insert into tb_produto(nome, quantidade, descricao, preco) values ("Sandalha", 620,"Rasteirinha", 60);

select * from tb_produto;

select * from tb_produto where preco > 500;
select * from tb_produto where preco < 500;

update tb_produto set descricao = "vermelho" where id = 7;