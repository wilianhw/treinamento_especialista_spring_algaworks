DELETE FROM restaurante_forma_pagamento;
DELETE FROM produto;
DELETE FROM restaurante;
DELETE FROM cidade;
DELETE FROM cozinha;
DELETE FROM estado;
DELETE FROM forma_pagamento;
DELETE FROM grupo;
DELETE FROM grupo_permissao;
DELETE FROM permissao;
DELETE FROM usuario;
DELETE FROM usuario_grupo;

-- Cozinha
INSERT INTO algafood.cozinha (id, nome) VALUES (1, 'Tailandesa') ON CONFLICT DO NOTHING;
INSERT INTO algafood.cozinha (id, nome) VALUES (2, 'Indiana') ON CONFLICT DO NOTHING;
SELECT setval('algafood.cozinha_id_seq', 3, false);

-- Estado
INSERT INTO algafood.estado (id, nome) VALUES (1, 'São Paulo');
INSERT INTO algafood.estado (id, nome) VALUES (2, 'Minas Gerais');
SELECT setval('algafood.estado_id_seq', 3, false);

-- Cidade
INSERT INTO algafood.cidade (id, nome, estado_id) VALUES (1, 'São Paulo', 1);
INSERT INTO algafood.cidade (id, nome, estado_id) VALUES (2, 'Itumirim', 2);
SELECT setval('algafood.cidade_id_seq', 3, false);

-- Restaurante
INSERT INTO algafood.restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, ativo, endereco_cep, endereco_logradouro, endereco_numero, endereco_complemento, endereco_bairro, endereco_cidade_id) VALUES (1, 'Thai Gourmet', 10.00, 1, current_timestamp, current_timestamp, true, '37212', 'casa', '69', 'casa', 'centro', 1);
INSERT INTO algafood.restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, ativo) VALUES (2, 'Thai Delivery', 9.50, 1, current_timestamp , current_timestamp, true);
INSERT INTO algafood.restaurante (id, nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, ativo) VALUES (3, 'Tuk Tuk Comida Indiana', 15.00, 2, current_timestamp , current_timestamp, true);
SELECT setval('algafood.restaurante_id_seq', 4, false);

-- Produto
INSERT INTO algafood.produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES (1, 'Carne', 'Carne Bovina', 21.50, true, 1);
INSERT INTO algafood.produto (id, nome, descricao, preco, ativo, restaurante_id) VALUES (2, 'Verdura', 'Alface', 1.50, true, 2);
SELECT setval('algafood.produto_id_seq', 3, false);

-- Forma de pagamento
INSERT INTO algafood.forma_pagamento (id, descricao) VALUES (1, 'Debito');
INSERT INTO algafood.forma_pagamento (id, descricao) VALUES (2, 'Credito');
SELECT setval('algafood.forma_pagamento_id_seq', 3, false);

-- Permissão
INSERT INTO algafood.permissao (id, nome, descricao) VALUES (1, 'Gerente', 'Total');
INSERT INTO algafood.permissao (id, nome, descricao) VALUES (2, 'Técnico', 'Parcial');
SELECT setval('algafood.permissao_id_seq', 3, false);

-- Grupo
insert into grupo (nome) values ('Gerente'), ('Vendedor'), ('Secretária'), ('Cadastrador');

INSERT INTO algafood.restaurante_forma_pagamento (restaurante_id, forma_pagamento_id) VALUES (1, 1), (1, 2), (2, 1), (2, 2), (3, 1);