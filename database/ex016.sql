/* Ex 7 */

SELECT 
  a.nome
FROM 
  Ator AS a 
  INNER JOIN Personagem AS p ON p.Ator_id = a.id
  INNER JOIN Novela_personagem AS np ON np.Personagem_id = p.id
  INNER JOIN Personagem AS p2 ON p2.id = np.Personagem_id
  INNER JOIN Ator AS a2 ON a2.id = p2.ator_id and a2.id <> a.id
WHERE 
  a.nome <> 'Joaquina Penteado';
