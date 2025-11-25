# Write your MySQL query statement below
select e.name as Employee from Employee e Left join Employee m ON m.id=e.managerID where e.salary>m.salary;
