select * from estados

select 
    Sigla, 
    regiao,
    nome as 'Nome dos Estados' 
from estados
where regiao = 'sul'

select nome,
    regiao, 
    populacao 
    from estados
where populacao >= 10
order by populacao desc
