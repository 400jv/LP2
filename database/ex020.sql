/* Ex 02 */

SELECT 
	d.nome AS Departamento, CONCAT(e.primeiro_nome, ' ', e.ultimo_nome) AS Gerente
FROM 
	departamento AS d
  INNER JOIN gerente_departamento AS gd ON d.id = gd.id_departamento
  INNER JOIN empregado as e ON e.id = gd.id_empregado;
