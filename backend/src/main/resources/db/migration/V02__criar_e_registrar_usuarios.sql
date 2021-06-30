CREATE TABLE usuario (
  username varchar(50) NOT NULL PRIMARY KEY,
  senha varchar(255) DEFAULT NULL,
  nome varchar(255) NOT NULL,
  status bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO usuario(username, senha, nome, status) VALUES('admin', 'admin', 'Administrador', 1);