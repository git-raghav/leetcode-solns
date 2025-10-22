-- Last updated: 10/22/2025, 9:54:38 PM
# Write your MySQL query statement below
SELECT e1.name
FROM Employee AS e1
INNER JOIN Employee AS e2
ON e1.id = e2.managerId
GROUP BY e2.managerId
HAVING COUNT(e2.managerId) >= 5;