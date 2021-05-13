/* Ex 1 */

SELECT a.nome
FROM 
  Ator AS a
  INNER JOIN Personagem AS p ON p.ator_id = a.id
  INNER JOIN Novela_personagem AS np ON np.Personagem_id = p.id
  INNER JOIN Novela AS n ON n.id = np.novela_id
WHERE 
  n.horario = '18:00:00';
