-- Last updated: 10/22/2025, 9:54:33 PM
# Write your MySQL query statement below
SELECT * FROM Cinema
WHERE id%2 != 0 AND description != 'boring'
ORDER BY rating DESC;