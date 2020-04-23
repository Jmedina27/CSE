alter table employees
    drop constraint employees_departments_fk ;
alter table departments
    drop constraint departments_mgr_fk ;

alter table employees
    add constraint employees_departments_fk foreign key (deptno) references departments(deptno) ;
    
alter table departments
    add constraint departments_mgr_fk foreign key (mgr) references employees(empno) ;
    
alter table employees
    drop constraint employees_departments_fk ;
alter table departments
    drop constraint departments_mgr_fk ;
