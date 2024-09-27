create table if not exists `db_agencia_de_turismo`.`tbl_checkins` (
`id` int not null auto_increment,
`nome` varchar(255),
`estadia` varchar(255),
primary key (`id`)
);