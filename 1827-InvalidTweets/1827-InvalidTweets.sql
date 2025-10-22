-- Last updated: 10/22/2025, 9:54:11 PM
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15;