/* Ex 18 */
SELECT
	d.nome,
  COUNT(e.id) 'Quantidade'
FROM
	departamento as d
  JOIN departamento_empregado AS de ON de.id_departamento = d.id
  JOIN empregado AS e ON e.id = de.id_empregado
GROUP BY
	d.id
HAVING
	COUNT(e.id) > 5
ORDER BY
	d.nome;
