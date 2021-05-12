/* Ex 3 */

SELECT 
  nome
FROM 
  Ator AS a INNER JOIN Personagem as P ON a.id = p.Ator_id
WHERE 
  p.nome LIKE '%Anna%';
