# Write your MySQL query statement below
Select a.name,b.bonus from Employee a  LEFT JOIN Bonus b ON a.empId=b.empId where b.bonus<1000 OR b.bonus is null;