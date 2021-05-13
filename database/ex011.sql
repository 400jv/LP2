/* Ex 2 */

SELECT
  a.nome,
  a.idade
FROM
  Ator as a
  INNER JOIN Personagem AS p ON p.ator_id = a.id
  INNER JOIN Novela_personagem AS np ON np.Personagem_id = p.id
  INNER JOIN Novela as n ON n.id = np.Personagem_id
WHERE
  n.nome = 'Ser Estranho'
