-- Last updated: 10/22/2025, 9:54:13 PM
# Write your MySQL query statement below
SELECT customer_id, COUNT(v.visit_id) as count_no_trans
FROM Visits AS v
LEFT JOIN Transactions AS t
ON v.visit_id = t.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id;