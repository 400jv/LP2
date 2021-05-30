/* Ex 14 */

SELECT
	d.nome 'Nome Departamento',
  c.cargo,
  s.salario
FROM
	empregado AS e 
  JOIN cargo as c ON c.id_empregado = e.id
  JOIN salario AS s ON s.id_empregado = e.id
  JOIN gerente_departamento AS gd ON gd.id_empregado = e.id
  JOIN departamento AS d ON d.id = gd.id_departamento
WHERE
	s.fim IS NULL
ORDER BY 
  d.nome;
