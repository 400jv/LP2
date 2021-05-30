/* Ex 12 */

SELECT
	CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) AS nome,
  c.cargo,
  s.salario,
  d.nome AS departamento,
FROM
	empregado AS e 
  JOIN cargo as c ON c.id_empregado = e.id
  JOIN salario AS s ON s.id_empregado = e.id
  JOIN departamento_empregado AS de ON de.id_empregado = e.id
  JOIN departamento AS d ON d.id = de.id_departamento
WHERE
	(e.primeiro_nome LIKE '%a%' OR e.ultimo_nome LIKE '%a%')
  AND c.fim IS NULL
  AND s.fim IS NULL;
