create table if not exists `db_agencia_de_turismo`.`tbl_pedidos` (
`id` int not null auto_increment,
`nome` varchar(255),
`recibo` varchar(255),
primary key (`id`)
);