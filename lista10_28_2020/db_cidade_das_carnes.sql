create database db_cidade_das_carnes;
use db_cidade_das_carnes;

drop table tb_produto;
drop table tb_categoria;

create table tb_categoria(
    categoria enum ('Carne', 'Bebida', 'Outros', 'Carvão', 'Utensílios') primary key not null,
    resfriado boolean,
    disponibilidade boolean
);

select * from tb_produto;
select * from tb_categoria;

create table tb_produto (
	id_prod int auto_increment primary key,
    nome varchar (20),
    tb_categoria_categoria enum ('Carne', 'Bebida', 'Outros', 'Carvão', 'Utensílios') not null,
    constraint fk_tb_produto_tb_categoria
    foreign key (tb_categoria_categoria)
    references tb_categoria (categoria),
    tipo_de_carne enum ('Bovina', 'Suína', 'Ave', '-'),
	preco decimal (5,2)
);

insert into tb_categoria values
	('Carne', true, true),
    ('Bebida', true, true),
    ('Outros', true, true),
    ('Carvão', false, true),
    ('Utensílios', false, true);
    
insert into tb_produto (nome, tb_categoria_categoria, tipo_de_carne, preco) values
	('Picanha', 'Carne', 'Bovina', 31.99),
	('Calabresa', 'Carne', 'Suína', 25.00),
	('Filé de Frango', 'Carne', 'Ave', 19.99),
    ('Refrigetante', 'Bebida', '-', 10.00),
	('Pão de Alho', 'Outros', '-', 15.00),
	('Carvão', 'Carvão', '-', 13.00),
    ('Facão', 'Utensílios', '-', 15.00),
	('Vinho', 'Bebida', '-', 60.00);

select * from tb_produto where preco > 50.00;

select * from tb_produto where preco >= 3.00 && preco <= 60.00;

select * from tb_produto where nome like '%co%';

select * from tb_produto where tb_categoria_categoria like 'Carne';

select * from tb_produto
inner join tb_categoria
on tb_categoria.categoria = tb_produto.tb_categoria_categoria;