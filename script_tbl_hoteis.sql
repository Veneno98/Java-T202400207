create table if not exists `db_agencia_de_turismo`.`tbl_hoteis` (
`id` int not null auto_increment,
`nome` varchar(255),
`localidade` varchar(255),
primary key (`id`)
);