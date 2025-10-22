-- Last updated: 10/22/2025, 9:54:08 PM
SELECT s.user_id, ROUND(AVG(IF(c.action = 'confirmed', 1.00, 0)), 2) AS confirmation_rate
FROM Signups AS s
LEFT JOIN Confirmations AS c
ON s.user_id = c.user_id
GROUP BY s.user_id;