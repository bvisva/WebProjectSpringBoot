CREATE TABLE expense (
  id int(11) NOT NULL AUTO_INCREMENT,
  item varchar(45) NOT NULL,
  amount float NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

CREATE TABLE student (
  id bigint NOT NULL,
  name varchar(255) DEFAULT NULL,
  passport_number varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB; 



CREATE TABLE country (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);