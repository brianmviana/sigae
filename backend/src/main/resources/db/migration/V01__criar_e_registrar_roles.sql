CREATE TABLE role (
  name_role varchar(50) NOT NULL PRIMARY KEY
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO role(name_role) values('ROLE_ADMIN');
INSERT INTO role(name_role) values('ROLE_USER');