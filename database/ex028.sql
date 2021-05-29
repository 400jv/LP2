/* Ex 10 */

SELECT
	c.cargo,
  e.sexo,
  CAST(AVG(s.salario) AS DEC(10, 0)) 'Média Salário'
FROM
	empregado AS e 
  JOIN cargo AS c ON c.id_empregado = e.id
  JOIN salario AS s ON s.id_empregado = e.id
GROUP By 
  c.cargo, e.sexo;
