-- Cozinha
INSERT INTO algafood.cozinha (id, nome) VALUES (1, 'Tailandesa');
INSERT INTO algafood.cozinha (id, nome) VALUES (2, 'Indiana');
SELECT setval('algafood.cozinha_id_seq', 3, false);

-- Restaurante
INSERT INTO algafood.restaurante (id, nome, taxa_frete, cozinha_id) values (1, 'Thai Gourmet', 10.00, 1);
INSERT INTO algafood.restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Thai Delivery', 9.50, 1);
INSERT INTO algafood.restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Tuk Tuk Comida Indiana', 15.00, 2);
SELECT setval('algafood.restaurante_id_seq', 4, false);

-- Forma de pagamento
INSERT INTO algafood.forma_pagamento (id, descricao) VALUES (1, 'Debito');
INSERT INTO algafood.forma_pagamento (id, descricao) VALUES (2, 'Credito');
SELECT setval('algafood.forma_pagamento_id_seq', 3, false);

-- Permissão
INSERT INTO algafood.permissao (id, nome, descricao) VALUES (1, 'Gerente', 'Total');
INSERT INTO algafood.permissao (id, nome, descricao) VALUES (2, 'Técnico', 'Parcial');
SELECT setval('algafood.permissao_id_seq', 3, false);

-- Estado
INSERT INTO algafood.estado (id, nome) VALUES (1, 'São Paulo');
INSERT INTO algafood.estado (id, nome) VALUES (2, 'Minas Gerais');
SELECT setval('algafood.estado_id_seq', 3, false);

-- Cidade
INSERT INTO algafood.cidade (id, nome, estado_id) VALUES (1, 'São Paulo', 1);
INSERT INTO algafood.cidade (id, nome, estado_id) VALUES (2, 'Itumirim', 2);
SELECT setval('algafood.cidade_id_seq', 3, false);
