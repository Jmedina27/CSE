select p.projname, e.fname from proj p, emp e, dept d
where d.mgr = e.empno and d.deptnumber = p.deptnum;

select * from emp;

select e.empno, SUM(j.hoursworked) "Hours Spent"
from emp e, proj p, emp_proj j
where e.empno = j.empno and j.projno = p.projnumber
group by e.empno;

create view "EMPLOYEE HOURLY RATE" as
select round(e.salary/408, 2) "HOURLY RATE"
from emp e;

select * from "EMPLOYEE HOURLY RATE";

select e.empno, p.projnumber, round(sum(j.hoursworked * (e.salary/408)), 2) "TOTAL LABOR COST"
from emp e, proj p, emp_proj j
where e.empno = j.empno and j.projno = p.projnumber
group by e.empno, p.projnumber;

alter table emp
    add dob DATE;
alter table emp
    add hire_date DATE;
    
update emp set dob = to_date('1981-10-31', 'YYYY-MM-DD'), hire_date = to_date('2018-01-02', 'YYYY-MM-DD') where empno = 1007;
update emp set dob = to_date('1964-07-12', 'YYYY-MM-DD'), hire_date = to_date('2014-10-15', 'YYYY-MM-DD') where empno = 2002;
update emp set dob = to_date('1976-02-28', 'YYYY-MM-DD'), hire_date = to_date('2009-06-15', 'YYYY-MM-DD') where empno = 1760;
update emp set dob = to_date('1990-09-10', 'YYYY-MM-DD'), hire_date = to_date('2011-09-02', 'YYYY-MM-DD') where empno = 1740;
update emp set dob = to_date('1980-06-25', 'YYYY-MM-DD'), hire_date = to_date('2013-04-13', 'YYYY-MM-DD') where empno = 2060;
update emp set dob = to_date('1999-05-05', 'YYYY-MM-DD'), hire_date = to_date('2019-08-01', 'YYYY-MM-DD') where empno = 2000;
update emp set dob = to_date('1993-01-24', 'YYYY-MM-DD'), hire_date = to_date('2012-07-15', 'YYYY-MM-DD') where empno = 1444;

create table emp_proj_overtime(
empno number(4) not null,
projno number(2) not null,
hourot number(6) not null
);

alter table emp_proj_overtime add constraint emp_proj_empno_PK PRIMARY KEY(empno);
alter table emp_proj_overtime add constraint emp_proj_projno_PK FOREIGN KEY(projno) references proj(projnumber);


update emp_proj set hoursworked = 111 where empno = 2060 and projno= 40;
update emp_proj set hoursworked = 115 where empno = 2002 and projno = 10;
update emp_proj set hoursworked = 130 where empno = 1760 and projno = 20;
select * from emp_proj_overtime;

select e.empno, round( ( ((e.salary/ 52)/ 40) * 1.5) * ot.hourot) "Overtime Pay"
from emp e, emp_proj_overtime ot
where e.empno = ot.empno;

commit;


create or replace trigger ot_trigger
after insert or update of hoursworked on emp_proj
referencing old as old new as new
for each row when (new.hoursworked > 100)
begin
    insert into emp_proj_overtime (empno, projno, hourot) values
        (:new.empno, :new.projno, :new.hoursworked - 100);
        EXCEPTION WHEN dup_val_on_index then
            update emp_proj_overtime epo 
            set epo.hourot = :new.hoursworked -10
            where epo.empno = :old.empno and epo.projno = :old.projno;
    commit;
end;

drop trigger ot_trigger;

select * from emp where hire_date > TO_DATE('2012-01-01', 'YYYY-MM-DD');

---select columnfrom user_tab_columns where table_name ='emp'; 

