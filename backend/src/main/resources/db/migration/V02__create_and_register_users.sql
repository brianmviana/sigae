CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(50) NOT NULL,
  login varchar(50) NOT NULL,
  password varchar(255) DEFAULT NULL,
  status bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (id, name, login, password, status) 
VALUES ('1', 'Administrador', 'admin', 'admin', 1);