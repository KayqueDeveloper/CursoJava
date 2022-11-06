SELECT e.nome AS Empresa, c.nome AS Cidade, e.id as 'ID Empresa', c.id as 'ID Cidade'
FROM empresas e, cidades c, empresas_unidades eu
WHERE e.id = eu.empresa_id AND c.id = eu.cidade_id AND sede = 1;



