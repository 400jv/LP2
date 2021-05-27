/* Ex 6 */

SELECT 
	CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) as nome,
  s.salario
FROM
	empregado AS e
  INNER JOIN salario AS s ON s.id_empregado = e.id
HAVING 
	salario = (
    SELECT 
      MAX(salario) 
    FROM 
      salario AS s 
    WHERE s.id_empregado = e.id
  );
