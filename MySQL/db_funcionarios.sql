create database db_funcionarios;
use db_funcionarios;

create table tb_funcionario(
id bigint auto_increment,
nome varchar (255) not null,
telefone bigint not null,
email varchar (255),
salario decimal not null,
primary key(id)
);

select * from tb_funcionario;
insert into tb_funcionario(nome, telefone, email, salario) values ("Thamires", 972957214, "thamiresfrpereira2@gmail.com", 2300);
insert into tb_funcionario(nome, telefone, email, salario) values ("Matheus", 865435613, "matheus@gmail", 2500);
insert into tb_funcionario(nome, telefone, email, salario) values ("Julia", 932546789, "julia@gmail.com", 1800);
insert into tb_funcionario(nome, telefone, email, salario) values ("Raphael", 984374578, "Raphael@gmail.com", 1900);
insert into tb_funcionario(nome, telefone, salario) values ("Katia", 983471232, 3000);

select * from tb_funcionario where salario > 2000;
select * from tb_funcionario where salario <2000;

update tb_funcionario set email = "katia123@gmail.com" where id = 5;

