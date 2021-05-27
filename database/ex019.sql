/* Ex 01 */
SELECT 
  CONCAT (primeiro_nome, ' ', ultimo_nome) AS nome
FROM 
  empregado 
GROUP BY 
	nome;
