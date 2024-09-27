create table if not exists `db_agencia_de_turismo`.`tbl_tipos_enderecos` (
`id` int not null auto_increment,
`nome` varchar(255),
`cpf` varchar(255),
primary key (`id`)
);