create table usuario(
	id_usuario serial primary key,
	nome varchar(50) not null,
	email varchar(50) not null,
	senha varcahr(100) not null,
	tipo int
);

create table evento(
	id_evento serial primary key,
	nome_evento varchar(100) not null,
	qtd_limite int,
	valor numeric(10,2),
	id_criador int,
	foreign key(id_criador) references usuario (id_usuario)
);

create table compra(
	id_compra serial primary key,
	id_evento int,
	id_comprador int,
	foreign key(id_criador) references usuario (id_evento),
	foreign key(id_comprador) references usuario (id_usuario)
);