CREATE TABLE `tb_postagem` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`tema_id` INT NOT NULL AUTO_INCREMENT,
	`usuario_id` INT NOT NULL AUTO_INCREMENT,
	`descricao` varchar(255) NOT NULL,
	`titulo` varchar(150) NOT NULL,
	`data_postagem` DATE NOT NULL,
	`midia` varchar(400) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_tema` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`disciplina_tema` varchar(100) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_usuario` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(100) NOT NULL,
	`senha` varchar(11) NOT NULL,
	`email` varchar(100) NOT NULL,
	`disciplina` varchar(100) NOT NULL,
	`formacao` varchar(100) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`id`) REFERENCES ``(``);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`tema_id`) REFERENCES `tb_tema`(`id`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk2` FOREIGN KEY (`usuario_id`) REFERENCES `tb_usuario`(`id`);

