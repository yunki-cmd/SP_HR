/*
Obtener los datos de region pais a partir de un campo de la tabla localitions */
SELECT
  *
FROM
  countries c
  INNER join locations l on l.COUNTRY_ID = c.COUNTRY_ID
  INNER join regions on regions.REGION_ID = c.REGION_ID
WHERE
  l.CITY = "Roma"

SELECT
  *
FROM
  countries c
  INNER join locations l on l.COUNTRY_ID = c.COUNTRY_ID
  INNER join regions on regions.REGION_ID = c.REGION_ID
WHERE
  l.STREET_ADDRESS = "2004 Charade Rd"
