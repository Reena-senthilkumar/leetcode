# Write your MySQL query statement below
Select e.unique_id,n.name from Employees n LEFT JOIN EmployeeUNI e ON n.id=e.id;