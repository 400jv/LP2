/* Ex 4 */

SELECT 
	CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) as nome,
  s.salario,
FROM 
	empregado AS e
  INNER JOIN salario AS s ON e.id = s.id_empregado
WHERE
	s.fim is NULL;
