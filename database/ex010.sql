/* Ex 1 */

SELECT * 
FROM Ator AS a
INNER JOIN Novela AS n
ON a.id=  n.Personagem_id
WHERE n.horario = 18;
