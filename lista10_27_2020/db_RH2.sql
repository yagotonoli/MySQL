USE db_RH2;

drop table tb_funcionario;
drop table tb_cargo;

CREATE TABLE tb_cargo (
	nivel_cargo ENUM('Assistente', 'Analista', 'Analista II', 'Gerência', 'Diretoria') NULL,
    setor_cargo ENUM('TI', 'RH', 'Financeiro', 'Operacional', 'Marketing') NULL,
	cargo VARCHAR(40) NOT NULL,
  PRIMARY KEY (cargo))
ENGINE = InnoDB;

CREATE TABLE tb_funcionario (
  id_fun INT NOT NULL,
  nome_fun VARCHAR(45) NULL,
  sobrenome_fun VARCHAR(45) NULL,
  sexo_fun CHAR(1) NULL,
  tb_cargo_cargo VARCHAR(40) NOT NULL,
  salario_fun DECIMAL(8,2) NULL,
  PRIMARY KEY (id_fun),
  CONSTRAINT fk_tb_funcionario_tb_cargo
    FOREIGN KEY (tb_cargo_cargo)
    REFERENCES db_RH2.tb_cargo (cargo)
)ENGINE = InnoDB;


insert into tb_cargo values
	('Analista', 'TI', 'Analista de TI Jr.'),
    ('Assistente', 'RH', 'Assistente de RH'),
    ('Diretoria', 'Marketing', 'Diretora de Marketing'),
    ('Gerência', 'Operacional', 'Gerente Operacional'),
    ('Analista II', 'Financeiro', 'Analista Financeiro Pleno');

insert into tb_funcionario values
	(1, 'João', 'Silva', 'M', 'Analista de TI Jr.', 3000),
	(2, 'Maria', 'Souza', 'F', 'Analista Financeiro Pleno', 2500),
	(3, 'José', 'Matos', 'M', 'Assistente de RH', 1800),
	(4, 'Joana', 'Oliveira', 'F', 'Analista de TI Jr.', 3000),
	(5, 'Lucas', 'Alcantara', 'M', 'Analista de TI Jr.', 3000),
	(6, 'Lais', 'Rodrigues', 'F', 'Analista Financeiro Pleno', 2500),
	(7, 'Gabriel', 'de Paula', 'M', 'Analista Financeiro Pleno', 2500),
	(8, 'Luiza', 'Marques', 'F', 'Analista de TI Jr.', 3000),
	(9, 'Paulo', 'Ramos', 'M', 'Analista de TI Jr.', 3000),
	(10, 'Julia', 'Tenório', 'F', 'Assistente de RH', 1800),
	(11, 'Hamilton', 'Holanda', 'M', 'Gerente Operacional', 8000),
	(12, 'Luana', 'Farias', 'F', 'Analista Financeiro Pleno', 2500),
	(13, 'Carlos', 'Santos', 'M', 'Analista de TI Jr.', 3000),
	(14, 'Sabrina', 'Medeiros', 'F', 'Diretora de Marketing', 15000),
	(15, 'Camila', 'Fernandes', 'F', 'Analista de TI Jr.', 3000);

select * from tb_funcionario;
    
select * from tb_funcionario where salario_fun > 2000.00;
select * from tb_funcionario where salario_fun < 2000.00;