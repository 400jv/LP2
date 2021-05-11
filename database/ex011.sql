/* Ex 2 */

SELECT nome, idade
FROM Ator AS a
INNER JOIN Novela AS n
ON a.id = n.Personagem_id
WHERE n.nome = 'Ser Estranho';
