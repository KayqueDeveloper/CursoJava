UPDATE ESTADOS
SET
    NOME = 'Maranhão'
WHERE
    SIGLA = 'MA'

select est.nome from estados est WHERE sigla = "MA"

update `estados`
set nome = 'paraná',
    populacao = 11.32
WHERE sigla = 'PR'

select est.nome, sigla, populacao from estados est WHERE sigla = "PR"