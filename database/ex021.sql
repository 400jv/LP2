/* Ex 3 */

SELECT 
  CONCAT(primeiro_nome, ' ', ultimo_nome) as nome
FROM 
  empregado
WHERE 
  sexo = 'F' 
  AND primeiro_nome LIKE 'A%';
