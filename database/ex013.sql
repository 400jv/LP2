/* Ex 4 */

SELECT
  p.nome,
  MIN(a.idade)
FROM
  Personagem AS p
  INNER JOIN Ator AS a ON p.Ator_id = a.id;
