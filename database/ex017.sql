/* Ex 8 */

SELECT a.nome
FROM
  Ator as a
  INNER JOIN Personagem AS p ON p.ator_id = a.id
WHERE 
  p.situacao_financeira_personagem = 'Baixa'
