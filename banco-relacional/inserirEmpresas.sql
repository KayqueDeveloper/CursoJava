ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO empresas
    (nome, cnpj)
VALUES
    ('Bradesco', 34739302748394), 
    ('Vale', 8943038475022), 
    ('Cielo', 84957385610470);


DESC empresas; -- Descreve as tabelas


select * from empresas;
select * from cidades;

INSERT INTO empresas_unidades
        (empresa_id, cidade_id, sede)
VALUES
    (1, 1, 1), 
    (1, 2, 0), 
    (2, 1, 0), 
    (2, 2, 1);

