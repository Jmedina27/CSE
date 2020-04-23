--select * from HR.employees;
--select * from HR.departments;
--select * from HR.locations;
--select * from HR.jobs;
--select * from HR.job_history;

--1
select last_name, department_id, department_name 
from HR.employees JOIN HR.departments using (department_id);

--2
select job_title, city, state_province, country_id 
from HR.jobs, HR.locations 
where(job_id like 'SA%' and location_id=2500);

--3
select e.last_name, d.department_name, d.location_id, l.city
from HR.employees e, HR.departments d, HR.locations l
where e.department_id = d.department_id and d.location_id = l.location_id and e.commission_pct is not NULL;

--4
select e.last_name, d.department_name
from HR.employees e, HR.departments d
where e.department_id = d.department_id and last_name like '%a%';

--5
select e.last_name, j.job_title, e.department_id, d.department_name, l.city
from HR.employees e, HR.departments d, HR.jobs j, HR.locations l
where e.department_id = d.department_id and e.job_id = j.job_id and d.location_id = l.location_id and l.location_id = 1800;

--6
select e.last_name "Employee", e.employee_id "EMP#", m.last_name "Manager", m.employee_id "MN#"
from HR.employees e, HR.employees m
where e.manager_id = m.employee_id ;

--7
select e.last_name "Employee", e.employee_id "EMP#", m.last_name "Manager", m.employee_id "MN#"
from HR.employees e
left outer join HR.employees m
on (e.manager_id = m.employee_id);

--8
select e.last_name "NAME", e.hire_date "Hire Date"
from HR.employees e, HR.employees davies
where davies.last_name = 'Davies' and davies.hire_date < e.hire_date;

--9
select e.last_name "Employee", e.hire_date "Emp Hired", m.last_name "Manager", m.hire_date "Mgr Hired"
from HR.employees e, HR.employees m
where e.manager_id = m.employee_id and e.hire_date < m.hire_date;

--10
CREATE OR REPLACE VIEW employees_vu AS
select employee_id, last_name employee, department_id 
from HR.employees;
--10(a)
select * from employees_vu;
--10(b)
set long 600
SELECT view_name, text 
FROM user_views;
--10(c)
select employee, department_id
from employees_vu;

--11
CREATE VIEW DEPT50 AS
select employee_id "EMPNO", last_name "EMPLOYEE", department_id "DEPTNO"
from HR.employees
where department_id = 50;
--11(a)
DESCRIBE DEPT50
select * 
from DEPT50;
--11(b)
select view_name, text
from user_views;
--11(c)
update DEPT50
set deptno = 80
where employee = 'Matos';



