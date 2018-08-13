DROP DATABASE IF EXISTS exercicio_web_banco_01;
CREATE DATABASE IF NOT EXISTS exercicio_web_banco_01;
USE exercicio_web_banco_01;

CREATE TABLE alunos(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(200),
codigo_matricula VARCHAR(10),
nota_1 FLOAT,
nota_2 FLOAT,
nota_3 FLOAT,
frequencia TINYINT);

INSERT INTO alunos(nome, codigo_matricula, nota_1, nota_2, nota_3, frequencia)VALUES
("João", "0123456789", 5, 6, 9, 70),
("Alfredo", "9876543210", 9, 3, 6, 20);
