# Write your MySQL query statement below
Select c.name as Customers from Customers c  left JOIN Orders o ON c.id = o.customerID where o.customerID is null;