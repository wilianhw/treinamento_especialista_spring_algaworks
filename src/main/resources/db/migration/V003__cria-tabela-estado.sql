CREATE TABLE estado (
    id bigint NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    nome varchar(80) NOT NULL,

    PRIMARY KEY (id)
);

INSERT INTO estado (nome) SELECT DISTINCT nome_estado FROM cidade;

ALTER TABLE cidade ADD COLUMN estado_id bigint NOT NULL CONSTRAINT estado_id_d DEFAULT 0;

UPDATE cidade AS c SET estado_id = (SELECT e.id FROM estado e WHERE e.nome = c.nome_estado);

ALTER TABLE cidade ADD CONSTRAINT fk_cidade_estado
    FOREIGN KEY (estado_id) REFERENCES estado (id);

ALTER TABLE cidade DROP COLUMN nome_estado;

ALTER TABLE cidade RENAME COLUMN nome_cidade TO nome;