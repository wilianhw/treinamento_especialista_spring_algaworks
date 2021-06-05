-- Cozinha
INSERT INTO algafood.cozinha (id, nome) VALUES (1, 'Tailandesa');
INSERT INTO algafood.cozinha (id, nome) VALUES (2, 'Indiana');

-- Restaurante
INSERT INTO algafood.restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', 10.00, 1);
INSERT INTO algafood.restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', 9.50, 1);
INSERT INTO algafood.restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', 15.00, 2);

-- Forma de pagamento
INSERT INTO algafood.forma_pagamento (descricao) VALUES ('Debito');
INSERT INTO algafood.forma_pagamento (descricao) VALUES ('Credito');

-- Permissão
INSERT INTO algafood.permissao (nome, descricao) VALUES ('Gerente', 'Total');
INSERT INTO algafood.permissao (nome, descricao) VALUES ('Técnico', 'Parcial');

-- Estado
INSERT INTO algafood.estado (id, nome) VALUES (1, 'São Paulo');
INSERT INTO algafood.estado (id, nome) VALUES (2, 'Minas Gerais');

-- Cidade
INSERT INTO algafood.cidade (nome, estado_id) VALUES ('São Paulo', 1);
INSERT INTO algafood.cidade (nome, estado_id) VALUES ('Itumirim', 2);
