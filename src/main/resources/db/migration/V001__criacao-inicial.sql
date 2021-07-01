CREATE SEQUENCE cozinha_id_seq;

CREATE TABLE cozinha (
    id bigint NOT NULL DEFAULT nextval('cozinha_id_seq'),
    nome varchar(60) NOT NULL
);

ALTER SEQUENCE cozinha_id_seq
    OWNED BY cozinha.id;