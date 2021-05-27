/* Ex 7 */

SELECT 
	CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) as nome, 
  c.cargo
FROM
	empregado AS e 
  INNER JOIN cargo AS c ON e.id = c.id_empregado
WHERE
	c.fim IS NULL;
