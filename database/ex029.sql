/* Ex 11 */

SELECT
	CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) AS nome,
  c.cargo
FROM
	empregado AS e 
  JOIN cargo AS c ON c.id_empregado = e.id
WHERE
	e.sexo = 'F'
ORDER BY nome, c.cargo;
