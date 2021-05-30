/* Ex 15 */

SELECT
	d.nome,
  SUM(s.salario) 'Soma Salário'
FROM
	departamento AS d 
  JOIN departamento_empregado AS de ON de.id_departamento = d.id
  JOIN gerente_departamento AS gd ON gd.id_departamento = d.id
  JOIN empregado AS e ON e.id = gd.id_empregado OR de.id_empregado = e.id
  JOIN salario AS s ON s.id_empregado = e.id
WHERE
	s.fim IS NULL
GROUP BY
	d.id;
