# Write your MySQL query statement below
select * 
from Cinema
where id%2!=0
group by description 
Having description!="boring"
order by rating desc; 