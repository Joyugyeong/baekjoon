WITH RECURSIVE CTE AS (
SELECT 0 AS H
UNION ALL
SELECT H + 1 FROM CTE WHERE H < 23
)
SELECT CTE.H AS HOUR, COUNT(A.ANIMAL_ID) AS COUNT
FROM CTE
LEFT JOIN ANIMAL_OUTS A ON CTE.H = HOUR(a.DATETIME)
GROUP BY CTE.H
ORDER BY CTE.H;