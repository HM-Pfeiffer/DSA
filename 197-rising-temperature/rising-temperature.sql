# Write your MySQL query statement below
SELECT w1.id
FROM Weather w1
JOIN Weather w2
    ON w1.recordDate = DATE_ADD(w2.recordDate, INTERVAL 1 DAY)
WHERE w2.recordDate IS NOT NULL
    AND w1.temperature > w2.temperature
ORDER BY w1.recordDate;