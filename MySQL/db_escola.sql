create database db_escola;
use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
telefone bigint not null,
turma bigint not null,
turno varchar (255) not null,
primary key (id)
);

alter table tb_alunos add nota float;

insert into tb_alunos (nome, telefone, turma, turno, nota) values ("Paula", 976756343, 1007, "Tarde", 8.5);
insert into tb_alunos (nome, telefone, turma, turno, nota) values ("Pedro", 921367890, 1007, "Tarde", 6.5);
insert into tb_alunos (nome, telefone, turma, turno, nota) values ("Bruna", 989756373, 2003, "Manhã" , 8);
insert into tb_alunos (nome, telefone, turma, turno, nota) values ("Ricardo", 912234587, 3001, "Integral", 7.5);
insert into tb_alunos (nome, telefone, turma, turno, nota) values ("Felix", 945679834, 1003, "Manhã", 9);
insert into tb_alunos (nome, telefone, turma, turno, nota) values ("Ana", 945679800, 2003, "Tarde", 10);
insert into tb_alunos (nome, telefone, turma, turno, nota) values ("Gustavo", 974557698, 3002, "Integral", 4.5);
insert into tb_alunos (nome, telefone, turma, turno, nota) values ("Maria", 923446798, 2002, "Tarde", 5.5);

select * from tb_alunos;

select * from tb_alunos where nota > 7;
select * from tb_alunos where nota < 7;

update tb_alunos set nota = 7 where id = 7;
