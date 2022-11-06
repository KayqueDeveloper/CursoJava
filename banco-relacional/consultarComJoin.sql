select 
    e.nome as 'Nome do Estado', 
    c.nome as 'Nome da Cidade', 
    regiao 
from estados e, cidades c
where e.id = c.estado_id;


select
    e.nome as Estado,
    c.nome as Cidade,
    regiao as Região, 
    c.id as ID
from estados e inner join cidades c on e.id = c.estado_id

















