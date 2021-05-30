/* Ex 13 */

SELECT
	d.nome 'Nome Departamento',
  c.cargo
FROM
	empregado AS e 
  JOIN cargo as c ON c.id_empregado = e.id
  JOIN gerente_departamento AS gd ON gd.id_empregado = e.id
  JOIN departamento AS d ON d.id = gd.id_departamento
WHERE
	c.fim IS NULL
ORDER BY 
  d.nome;
