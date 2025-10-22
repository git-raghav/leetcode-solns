-- Last updated: 10/22/2025, 9:54:14 PM
# Write your MySQL query statement below
SELECT u.unique_id, e.name
FROM Employees AS e
LEFT JOIN EmployeeUNI AS u
ON e.id = u.id;