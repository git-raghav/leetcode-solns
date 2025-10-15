-- Last updated: 10/15/2025, 5:53:06 PM
# Write your MySQL query statement below
-- SELECT MAX(salary) AS SecondHighestSalary
-- FROM (
--     SELECT id, salary,
--     DENSE_RANK() OVER (ORDER BY salary DESC) AS dense_ranked
--     FROM Employee
-- ) AS a
-- WHERE dense_ranked = 2;

-- approach 2
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);