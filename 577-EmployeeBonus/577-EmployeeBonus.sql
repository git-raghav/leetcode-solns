-- Last updated: 10/22/2025, 9:54:36 PM
# Write your MySQL query statement below
SELECT name, bonus
FROM Employee as e
LEFT JOIN Bonus as b
ON e.empId = b.empId
WHERE bonus < 1000 OR bonus IS NULL;