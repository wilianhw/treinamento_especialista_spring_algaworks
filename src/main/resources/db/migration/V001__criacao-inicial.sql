CREATE TABLE cozinha (
    id bigint NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    nome varchar(60) NOT NULL,

    PRIMARY KEY (id)
);