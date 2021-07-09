USE adlister_db;
DROP TABLE iF EXISTS users;

CREATE TABLE users (
    id int UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(50),
    email VARCHAR(100),
    password VARCHAR(100),
    PRIMARY KEY (id)
);

INSERT INTO users(username, email, password)
VALUES('user1', 'user@email.com','password');