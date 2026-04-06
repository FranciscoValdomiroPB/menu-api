INSERT INTO users (login, password) VALUES ('admin', '1234')
ON CONFLICT DO NOTHING;

INSERT INTO itens_cardapio (item, preco) VALUES 
('Pizza', 35.90),
('Hamburguer', 25.00),
('Suco', 8.50),
('Batata Frita', 15.00),
('Refrigerante', 7.00)
ON CONFLICT DO NOTHING;