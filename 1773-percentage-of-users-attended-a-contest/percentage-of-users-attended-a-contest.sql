# Write your MySQL query statement below
SELECT r.contest_id, 
    ROUND(COUNT(r.user_id) * 100 / (SELECT COUNT(*) FROM Users), 2) as percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;