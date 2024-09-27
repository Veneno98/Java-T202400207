create table if not exists `db_agencia_de_turismo`.`tbl_paradas_de_viagem` (
`id` int not null auto_increment,
`nome` varchar(255),
`localidade` varchar(255),
primary key (`id`)
);