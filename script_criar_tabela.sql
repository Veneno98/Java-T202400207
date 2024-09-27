create table if not exists `db_turma_java`.`tbl_alunos` (
`id` int not null auto_increment,
`nome` varchar(255),
`data_nascimento` varchar(255),
`genero` varchar(255),
`whatsapp` varchar(255),
primary key (`id`)
);