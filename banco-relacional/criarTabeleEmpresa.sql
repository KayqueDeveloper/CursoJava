create table if not exists empresas(
    id int unsigned not null auto_increment, 
    nome varchar(255) not null, 
    cnpj varchar(15), 
    primary key(id), 
    unique key (cnpj)
);

CREATE TABLE IF NOT EXISTS empresas_unidades (
    empresa_id  INT UNSIGNED NOT NULL, 
    cidade_id INT UNSIGNED NOT NULL, 
    sede TINYINT(1) NOT NULL,
    PRIMARY KEY (empresa_id, cidade_id)
);

