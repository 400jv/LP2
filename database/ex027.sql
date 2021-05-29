/* Ex 9 */

SELECT
	d.nome AS departamento,
  CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) AS gerente,
  s.salario
FROM
	departamento AS d
  JOIN gerente_departamento AS gd ON gd.id_departamento = d.id
  JOIN empregado AS e ON gd.id_empregado = e.id
  JOIN salario AS s ON s.id_empregado = e.id
WHERE
	s.fim IS NULL;
