# Write your MySQL query statement below
select customer_id, 
count(v.visit_id) AS count_no_trans from Visits v 
LEFT JOIN Transactions t ON v.visit_id = t.visit_id 
WHERE t.visit_id IS NULL
GROUP BY customer_id;