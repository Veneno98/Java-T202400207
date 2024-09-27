create table if not exists `db_agencia_de_turismo`.`tbl_descontos` (
`id` int not null auto_increment,
`nome` varchar(255),
`valor_descontado` varchar(255),
primary key (`id`)
);