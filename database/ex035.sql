/* Ex 17 */

SELECT
	CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) 'Nome',
	CAST(AVG(s.salario) AS DEC(10, 0)) 'Média Salárial'
FROM
	empregado AS e 
  JOIN salario AS s ON s.id_empregado = e.id
WHERE
	(
    SELECT
      AVG(salario)
    FROM
      salario as s
    WHERE
      s.id_empregado = e.id
  ) > 25000
GROUP BY e.id;
