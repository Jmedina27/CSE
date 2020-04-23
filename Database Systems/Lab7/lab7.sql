select city from hr.locations 
intersect 
select state_province from hr.locations;
--select * from hr.employees;
--select * from HR.departments;
--select city, state_province from hr.locations;

select count(*)
from (
(select city from hr.locations union select state_province from HR.locations)
minus
(select city from hr.locations intersect select state_province from HR.locations)
);

select count(*)
from (
(select city from hr.locations)
union all
(select state_province from HR.locations)
);

select first_name, last_name from hr.employees where department_id = 10
minus
select first_name, last_name from hr.employees where department_id != 10;

create table empl_dup
as (select * from hr.employees);

create or replace view employees_vu
as (select employee_id, first_name "EMPLOYEE", department_id from empl_dup);


select * from employees_vu;

select view_name, text from user_views;

select employee, department_id from employees_vu;


create or replace view dept50
as (select employee_id, last_name, department_id from empl_dup where department_id = 50);

select * from dept50 order by last_name;

select view_name, text from user_views;

update dept50 set department_id = 80 where last_name = 'Matos';

