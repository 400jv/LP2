/* Ex 5 */

SELECT
	CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) as nome,
  MAX(s.salario) AS salario
FROM
	empregado AS e 
  INNER JOIN salario AS s ON e.id = s.id_empregado
WHERE
	e.sexo = 'M';
