create table if not exists `db_agencia_de_turismo`.`tbl_agentes_de_turismo` (
`id` int not null auto_increment,
`nome` varchar(255),
`experiencia` varchar(255),
primary key (`id`)
);