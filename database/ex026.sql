/* Ex 8 */

SELECT
	CAST(AVG(s.salario) AS dec(10, 0)) 'Média Sálario'
FROM
	empregado AS e 
  JOIN salario AS s ON s.id_empregado = e.id
WHERE
	e.sexo = 'F'
  AND e.ultimo_nome LIKE '%i';
