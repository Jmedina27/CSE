
PROJNAME                       FNAME                         
------------------------------ ------------------------------
Product X                      Johnathan                     
Product Y                      Johnathan                     
Mobile Apps                    Ellen                         
Computerization                Ellen                         
Product Z                      William                       


     EMPNO FNAME                          LNAME                          ADDRESS                        S     SALARY POS                                DEPTNO EMAIL                                              DOB       HIRE_DATE
---------- ------------------------------ ------------------------------ ------------------------------ - ---------- ------------------------------ ---------- -------------------------------------------------- --------- ---------
      1007 Diana                          Lorentz                        638 Voss, Bellaire, TX         F      24000 Clerk                                  20                                                    30-APR-95 01-MAY-10
      2002 Pat                            Fay                            3321 Castle, Spring, TX        F      15000 Sales Representative                   80                                                    12-JUL-64 15-OCT-14
      1760 Johnathan                      Taylor                         561 Rice, Houston, TX          M      60000 Manager                                20                                                    28-FEB-76 15-JUN-09
      1740 Ellen                          Abel                           890 Stone, Houston, TX         F      65000 Manager                                60                                                    10-SEP-90 02-SEP-11
      2060 William                        Gietz                          450 Berry, Bellaire, TX        M      65000 Manager                                80                                                    25-JUN-80 13-APR-13
      2000 Jennifer                       Whalen                         980 Fire Oak, Humble, TX       F      28000 Clerk                                  60                                                    05-MAY-99 01-AUG-19
      1444 Peter                          Vargas                         975 Dallas, Houston, TX        M      20000 Sales Representative                   80                                                    24-JAN-93 15-JUL-12

7 rows selected. 


     EMPNO Hours Spent
---------- -----------
      1007          40
      1444          20
      1740        50.5
      1760          15
      2002          40
      2060          12

6 rows selected. 


Error starting at line : 11 in command -
create view "EMPLOYEE HOURLY RATE" as
select round(e.salary/408, 2) "HOURLY RATE"
from emp e
Error report -
ORA-00955: name is already used by an existing object
00955. 00000 -  "name is already used by an existing object"
*Cause:    
*Action:

HOURLY RATE
-----------
      58.82
      36.76
     147.06
     159.31
     159.31
      68.63
      49.02

7 rows selected. 


     EMPNO PROJNUMBER TOTAL LABOR COST
---------- ---------- ----------------
      1444         20           980.39
      2060         40          1911.76
      1740         50          2389.71
      1760         20          1470.59
      2002         10          1470.59
      1007         30          1911.76
      1007         50           441.18
      1760         10           735.29
      1740         30          5655.64

9 rows selected. 


Error starting at line : 22 in command -
alter table emp
    add dob DATE
Error report -
ORA-01430: column being added already exists in table
01430. 00000 -  "column being added already exists in table"
*Cause:    
*Action:

Error starting at line : 24 in command -
alter table emp
    add hire_date DATE
Error report -
ORA-01430: column being added already exists in table
01430. 00000 -  "column being added already exists in table"
*Cause:    
*Action:

1 row updated.


1 row updated.


1 row updated.


1 row updated.


1 row updated.


1 row updated.


1 row updated.


Error starting at line : 35 in command -
create table emp_proj_overtime(
empno number(4) not null,
projno number(2) not null,
hourot number(6) not null
)
Error report -
ORA-00955: name is already used by an existing object
00955. 00000 -  "name is already used by an existing object"
*Cause:    
*Action:

Error starting at line : 41 in command -
alter table emp_proj_overtime add constraint emp_proj_empno_PK PRIMARY KEY(empno)
Error report -
ORA-02260: table can have only one primary key
02260. 00000 -  "table can have only one primary key"
*Cause:    Self-evident.
*Action:   Remove the extra primary key.

Error starting at line : 42 in command -
alter table emp_proj_overtime add constraint emp_proj_projno_PK FOREIGN KEY(projno) references proj(projnumber)
Error report -
ORA-02275: such a referential constraint already exists in the table
02275. 00000 -  "such a referential constraint already exists in the table"
*Cause:    Self-evident.
*Action:   Remove the extra constraint.

Table EMP_PROJ_OVERTIME dropped.


ERROR:
ORA-04043: object emp_proj_overtime does not exist

Trigger OT_TRIGGER compiled

LINE/COL  ERROR
--------- -------------------------------------------------------------
2/9       PL/SQL: SQL Statement ignored
3/13      PL/SQL: ORA-00933: SQL command not properly ended
8/1       PLS-00103: Encountered the symbol "DROP" 
Errors: check compiler log
