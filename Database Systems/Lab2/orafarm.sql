create table emp(
empno number(4) not null
	CONSTRAINT emp_empno_PK PRIMARY KEY,
fname varchar2(30) not null,
lname varchar2(30) not null,
address varchar2(30) not null,
sex char(1) not null,
salary number(15) not null,
pos varchar2(30) not null,
deptno number(2) not null
);

describe emp;

insert into emp(empno, fname, lname, address, sex, salary, pos, deptno) Values
    (1007, 'Diana', 'Lorentz', '638 Voss, Bellaire, TX', 'F', 24000, 'Clerk', 20);
insert into emp(empno, fname, lname, address, sex, salary, pos, deptno) Values
    (2002, 'Pat', 'Fay', '3321 Castle, Spring, TX', 'F', 15000, 'Sales Representative', 80);
insert into emp(empno, fname, lname, address, sex, salary, pos, deptno) Values    
    (1760, 'Johnathan', 'Taylor', '561 Rice, Houston, TX', 'M', 60000, 'Manager', 20);
insert into emp(empno, fname, lname, address, sex, salary, pos, deptno) Values
    (1740, 'Ellen', 'Abel', '890 Stone, Houston, TX', 'F', 65000, 'Manager', 60);
insert into emp(empno, fname, lname, address, sex, salary, pos, deptno) Values
    (2060, 'William', 'Gietz', '450 Berry, Bellaire, TX', 'M', 65000, 'Manager', 80);
insert into emp(empno, fname, lname, address, sex, salary, pos, deptno) Values
    (2000, 'Jennifer', 'Whalen', '980 Fire Oak, Humble, TX', 'F', 28000, 'Clerk', 60);
insert into emp(empno, fname, lname, address, sex, salary, pos, deptno) Values
    (1444, 'Peter', 'Vargas', '975 Dallas, Houston, TX', 'M', 20000, 'Sales Representative', 80);

select * from emp;

create table dept(
deptnumber number(2) not null
	CONSTRAINT dept_deptnumber_UK PRIMARY KEY,
deptname varchar2(30) not null,
mgr number(5) not null
);

describe dept;

insert into dept(deptnumber, deptname, mgr) values
    (20, 'Marketing', 1760);
insert into dept(deptnumber, deptname, mgr) values
    (60, 'IT', 1740);
insert into dept(deptnumber, deptname, mgr) values
    (80, 'Sales', 2060);

select * from dept;

create table proj(
projnumber number(2) not null
    CONSTRAINT proj_projnumber_PK PRIMARY KEY,
projname varchar2(30) not null,
deptnum number(2) not null
);

describe proj;

insert into proj(projnumber, projname, deptnum) values
    (10, 'Product X', 20);
insert into proj(projnumber, projname, deptnum) values
    (20, 'Product Y', 20);
insert into proj(projnumber, projname, deptnum) values
    (30, 'Computerization', 60);
insert into proj(projnumber, projname, deptnum) values
    (40, 'Product Z', 80);
insert into proj(projnumber, projname, deptnum) values
    (50, 'Mobile Apps', 60);


select * from proj;

create table emp_proj(
empno number(4) not null,
projno number(2) not null,
hoursworked number(3,1) not null,
CONSTRAINT emp_proj_empno_projno_PK PRIMARY KEY (empno, projno)
);

describe emp_proj;

insert into emp_proj(empno, projno, hoursworked) values
    (1000, 30, 32.5);
insert into emp_proj(empno, projno, hoursworked) values
    (1000, 50, 7.5);
insert into emp_proj(empno, projno, hoursworked) values
    (2002, 10, 40.0);
insert into emp_proj(empno, projno, hoursworked) values
    (1444, 20, 20.0);
insert into emp_proj(empno, projno, hoursworked) values
    (1760, 10, 5.0);
insert into emp_proj(empno, projno, hoursworked) values
    (1760, 20, 10.0);
insert into emp_proj(empno, projno, hoursworked) values
    (1740, 50, 15.0);
insert into emp_proj(empno, projno, hoursworked) values
    (2060, 40, 12.0);

select * from emp_proj;

alter table emp
    add constraint emp_deptno_fk foreign key (deptno) references dept(deptnumber);
alter table proj
    add constraint proj_deptnum_fk foreign key (deptnum) references dept(deptnumber);
alter table dept
    add constraint dept_mgr_fk foreign key (mgr) references emp(empno);
alter table emp_proj
    add constraint emp_proj_empno_fk foreign key (empno) references emp(empno);
alter table emp_proj
    add constraint emp_proj_projno_fk foreign key (projno) references proj(projnumber);

update emp_proj set empno = 1007 where empno = 1000;

select * from emp_proj ;
select empno from emp ;
select * from emp_proj where empno not in (select empno from emp) ;
insert into emp_proj values ('&empno', '&projno', '&hoursworked');

select * from emp_proj;

alter table emp
    add email VARCHAR2(50);
    
insert into emp values (1172, 'joe', 'Calvert', '672 White Pine, Austin, TX', 'X', 10000, 10);

insert into emp(empno, fname, lname, address, sex, salary, pos, deptno) values 
(1172, 'joe', 'Calvert', '672 White Pine, Austin, TX', 'X', 10000, 'UNKNOWN', 20);

select * from emp;
