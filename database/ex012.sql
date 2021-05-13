/* Ex 3 */

SELECT 
  nome
FROM 
  Ator AS a 
  INNER JOIN Personagem as p ON a.id = p.Ator_id
WHERE 
  p.nome LIKE '%Anna%';
