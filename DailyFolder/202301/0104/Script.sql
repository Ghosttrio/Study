--SELECT empno, ename, deptno FROM emp;
--
--SELECT * FROM dept;
--
--SELECT * FROM salgrade;
--
--SELECT * FROM bonus;

--SELECT DISTINCT JOB, deptno FROM EMP;


SELECT 
	ENAME AS NAME, 
	SAL "SAL 3", 
	SAL*12+COMM AS ANNSAL, 
	COMM 
FROM 
	EMP
ORDER BY SAL ASC;

SELECT *
FROM EMP 
ORDER BY deptno DESC , sal ;

SELECT *
FROM EMP
ORDER BY HIREDATE


SELECT * FROM emp WHERE empno = 7782;
-- sal의 값이 3000 이상인 recode만 뽑기

SELECT * FROM emp WHERE sal >= 3000;

SELECT * FROM emp WHERE ename = 'JONES';

SELECT * FROM emp WHERE job = 'SALESMAN';

SELECT * FROM emp WHERE deptno = 30 AND job = 'SALESMAN';

--sal이 2000 이상이고 deptno가 20인

SELECT * FROM emp WHERE sal >= 2000 AND deptno = 20;

-- sal 정보가 1000이상 2000이하
SELECT * FROM emp WHERE (deptno = 30 AND job = 'CLERK') OR ename = 'JONES';
SELECT * FROM emp WHERE (deptno = 30 OR ename = 'JONES' ) AND ( job = 'CLERK' OR ename = 'JONES');

SELECT sal, sal*12 FROM emp WHERE sal*12 = 36000;

SELECT * FROM emp WHERE NOT sal = 3000;

SELECT * FROM emp WHERE job IN ('MANAGER', 'SALESMAN', 'CLERK');

-- IN을 사용하면 FOR문을 사용하기 쉽다.

SELECT * FROM emp WHERE job NOT IN ('MANAGER', 'SALESMAN', 'CLERK');

SELECT * FROM EMP WHERE DEPTNO IN (10, 20);

SELECT * FROM EMP WHERE ENAME LIKE 'S%';


SELECT * FROM EMP WHERE ENAME LIKE 'A\%' ESCAPE '\';

-- 데이터양이 많을 땐 LIKE 사용을 지양한다.

SELECT comm, comm*2 FROM emp;

SELECT * FROM emp WHERE comm < 1000;
-- 값이 null은 조건식에서 제외

SELECT * FROM emp WHERE comm IS NOT NULL;


-- union : 중복된 데이터를 한번만 보여주면서 두 결과를 합쳐준다.
-- 단, 컬럼이 동일해야 함
-- SELECT 뒤에 개수와 타입이 같아야 함 BUT 되도록 같은 컬럼으로 조회
SELECT * FROM emp WHERE deptno = 10
UNION
SELECT * FROM emp WHERE sal > 2000;

SELECT * FROM EMP WHERE DEPTNO = 10
UNION ALL
SELECT * FROM EMP WHERE DEPTNO = 10;


-- UNION ALL에 ORDER BY 적용 시
SELECT * FROM EMP 
WHERE DEPTNO = 10
ORDER BY EMPNO
UNION ALL
SELECT * FROM EMP
WHERE DEPTNO = 10
ORDER BY EMPNO;
-- ERROR
-- 각각 ORDER BY를 적용할 수 없음


SELECT * FROM EMP WHERE DEPTNO = 10
UNION ALL
SELECT * FROM EMP WHERE DEPTNO = 10;


-- Q1
SELECT * FROM EMP WHERE ENAME LIKE '%S';

-- Q2
SELECT * FROM EMP WHERE DEPTNO = 30 AND JOB = 'SALESMAN';

-- Q3-1
SELECT * FROM EMP WHERE (DEPTNO = 20 OR DEPTNO =30) AND SAL > 2000;

-- Q3-2
SELECT * FROM EMP WHERE DEPTNO = 30 AND SAL > 2000
UNION
SELECT * FROM EMP WHERE DEPTNO = 20 AND SAL > 2000 ;

-- Q4
SELECT * FROM EMP WHERE NOT (SAL >= 2000 AND SAL <= 3000);

-- Q5
SELECT * FROM EMP WHERE ((ENAME LIKE '%E%') AND (DEPTNO = 30)) AND (SAL NOT BETWEEN 1000 AND 2000);

-- Q6
SELECT * FROM EMP WHERE ((COMM IS NULL) AND (MGR IS NOT NULL) AND (JOB = 'MANAGER' OR JOB = 'CLERK')) AND (ENAME NOT LIKE '_L%')
-- JOB IN ('MANAGER', 'CLERK')

SELECT 3+4 FROM dual
-- 단독으로 테스트 할 때 유용

SELECT upper('asasdSDFSAD') FROM dual

SELECT LOWER('asasdSDFSAD') FROM dual

SELECT INITCAP('asdasdfDSFDSAF') FROM DUAL 

SELECT ename, lower(ename) AS ename2 FROM emp;

SELECT * FROM emp WHERE lower(ename) = lower('smith');

SELECT ename, length(ename), lengthb('한글'), lengthb('한글')/length('한글') FROM emp;

SELECT ename, LENGTH(ename) FROM emp WHERE length(ename) >= 6;

SELECT job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5), substr(lower(job),5), LOWER(SUBSTR(job, 0, 2)) FROM emp;

SELECT ename, REPLACE (ename, 'E', '*') FROM emp 

-- 실습문제1
SELECT '120103-2123456'
	, rpad('120103-2', 14, '*')
	, length('120103-2123456') AS "전체 자리수"
	, substr('120103-2123456', 1, 8) AS 앞글자
	, rpad(substr('120103-2123456',1,8), LENGTH ('120103-2123456'),'*') AS 결과
FROM dual

-- 실습문제2
SELECT ename, rpad(substr(ename,1,2), LENGTH(ENAME), '*') FROM emp

-- 실습문제3
SELECT ename, REPLACE (ename, SUBSTR(ename,1,1),'*') FROM emp

SELECT concat(empno, ename), concat('*', ename), concat(empno,concat(':', ename)) FROM EMP

SELECT empno || ':' ||ename FROM emp

SELECT SUBSTR(ename,1,1) || '*' || SUBSTR(ename, 3, LENGTH(ENAME))  FROM EMP

-- WHERE ename LIKE '%' || 'S'

SELECT '[' || TRIM('   _ _ORACLE _      ') || ']', 

FROM DUAL

SELECT 
	round(3.14), round(3.56),
	round(1234.5678, 2),
	round(1234.5678, -2)
FROM dual

SELECT
	FLOOR(3.1), FLOOR(-3.1),
	ceil(3.1), CEIL (-3.1)
FROM dual

SELECT mod(10,3) FROM dual


SELECT
	SYSDATE-1,
	sysdate+10
FROM dual


SELECT
	ADD_MONTHS(sysdate, 4)
FROM
	dual

SELECT
	hiredate,
	ADD_MONTHS(hiredate, 120)
FROM
	emp;


SELECT
	months_BEtween(hiredate,SYSDATE)
from
	emp
	
SELECT sysdate, next_day(sysdate, '일'), LAST_day(sysdate) FROM dual

SELECT to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss') FROM dual


SELECT
	sal,
	comm,
	nvl(comm, 0),
	nvl(NULL, 'a1'),
	sal + comm,
	sal + nvl(comm, 0)
FROM
	EMP;


SELECT job, sal, DECODE(job, 'MANAGER', 1000,'SALESMAN', SAL*3, 22222) AS upsal FROM emp;
	
SELECT JOB, SAL, DECODE(COMM, NULL, 'N/A', COMM) FROM EMP;
	

SELECT JOB, SAL,
	CASE JOB
		WHEN 'MANAGER' THEN SAL*1.1
		WHEN 'SALESMAN' THEN SAL*1.05
		ELSE SAL*1.03
	END AS UPSAL
FROM EMP;


SELECT COMM,
	CASE
		WHEN COMM IS NULL THEN 'X'
		WHEN COMM = 0 THEN '0원'
		WHEN COMM > 0 THEN '수당 : ' || COMM
	END AS NO_CASE
FROM EMP;


SELECT EMPNO, ENAME, MGR,
	CASE
		WHEN EMPNO IS NULL THEN '0000'
		WHEN SUBSTR(EMPNO,1,2) = 75 THEN '5555'
		WHEN SUBSTR(EMPNO,1,2) = 76 THEN '6666'
		WHEN SUBSTR(EMPNO,1,2) = 77 THEN '7777'
		WHEN SUBSTR(EMPNO,1,2) = 78 THEN '8888' 
		ELSE SUBSTR(EMPNO,1,LENGTH(EMPNO))
	END AS CHG_MGR
FROM EMP;


SELECT sum(sal) FROM emp;

SELECT sum(empno), sum(sal) FROM emp;

SELECT count(*) FROM emp;
SELECT count(*) FROM emp WHERE deptno = 30;

SELECT max(sal), min(sal), count(comm), max(ename), min(hiredate), min(comm) FROM EMP;

SELECT DISTINCT deptno FROM emp
WHERE sal > 2000;

SELECT deptno, sum(sal)
FROM EMP
GROUP BY DEPTNO 

SELECT deptno FROM emp;

SELECT deptno dno, job, sum(sal), count(*)
FROM EMP
WHERE sal > 2000
GROUP BY DEPTNO, job
HAVING sum(sal) > 3000
-- select에 들어갈 수 있는 것만 사용 가능
ORDER BY DEPTNO

-- Q1
SELECT deptno, TRUNC(avg(sal)) AVG_SAL, max(sal) MAX_SAL, min(sal) MIN_SAL, count(*) CNT FROM emp
GROUP BY deptno;

-- Q2
SELECT job, count(*) FROM emp
GROUP BY JOB 
HAVING count(*) >= 3;




SELECT * FROM EMP
WHERE deptno = 30;

SELECT * FROM dept;

SELECT * FROM emp, dept
WHERE ename = 'SMITH';


SELECT ename, e.DEPTNO, d.DEPTNO, d.deptno
FROM emp e, dept d
WHERE e.DEPTNO = d.DEPTNO AND ename = 'SMITH'
ORDER BY EMPNO;

SELECT *
FROM emp e1, emp e2

SELECT *
FROM emp e, dept d
-- 테이블에다 별칭을 줄 때는 AS를 쓰면 안된다.
WHERE e.DEPTNO = d.DEPTNO ;

SELECT ename, emp.*
FROM emp;


SELECT * FROM EMP WHERE 1=1 AND ename = 'a' AND sal > 2000;


SELECT * FROM SALGRADE;



SELECT e.ENAME , e.SAL , s.GRADE , s.LOSAL , s.HISAL 
FROM emp e, SALGRADE s
WHERE e.sal >= s.LOSAL AND e.sal <=s.HISAL ; 


SELECT * FROM emp
WHERE empno = 7902;


SELECT e1.EMPNO , e1.ENAME , e1.MGR , e2.EMPNO , e2.ENAME ,e2.MGR 
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno

SELECT e1.EMPNO , e1.ENAME , e1.MGR , e2.EMPNO , e2.ENAME ,e2.MGR 
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno(+)
-- left outer join 왼쪽 외부 조인

SELECT e1.EMPNO , e1.ENAME , e1.MGR , e2.EMPNO , e2.ENAME ,e2.MGR 
FROM emp e1, emp e2
WHERE e1.mgr(+) = e2.empno


SELECT deptno
FROM emp NATURAL JOIN dept;

SELECT *
FROM emp JOIN dept USING(deptno)

SELECT *
FROM emp e JOIN dept d ON (e.DEPTNO = d.DEPTNO)


SELECT *
FROM emp e1 LEFT OUTER JOIN emp e2 ON (e1.mgr = e2.empno)

SELECT *
FROM emp e1 RIGHT OUTER JOIN emp e2 ON (e1.mgr = e2.empno)


-- Q1 
SELECT d.DEPTNO , d.DNAME , e.ENAME , e.SAL 
FROM EMP e, DEPT d 
WHERE e.DEPTNO  = d.DEPTNO  AND SAL > 2000
ORDER BY DEPTNO

-- Q2
SELECT e.DEPTNO, d.DNAME , floor(avg(sal)), max(SAL), min(sal), count(*)
FROM EMP e, DEPT d
WHERE e.DEPTNO = d.DEPTNO
GROUP BY e.DEPTNO, d.DNAME 

-- Q3
SELECT e.DEPTNO , d.DNAME , e.EMPNO , e.ENAME , e.JOB , SAL 
FROM emp e, dept d
WHERE e.DEPTNO (+) = d.DEPTNO 
ORDER BY DEPTNO 

SELECT deptno, DNAME ,empno, ename, job, sal
FROM dept LEFT OUTER JOIN emp USING(deptno)
ORDER BY deptno, emp.ename

-- 추가문제 1
SELECT e.ename, e.deptno, d.dname, e.sal, s.grade
FROM emp e, DEPT d ,SALGRADE s 
WHERE e.DEPTNO = d.DEPTNO
AND (e.sal > s.LOSAL  AND e.sal <= s.HISAL)

-- 추가문제 2
-- 매니저보다 월급이 높은 사원의 ename, sal, 매니저 ename, 매니저 sal
SELECT e1.ename, e1.sal, d.DNAME , e2.ENAME, e2.SAL
FROM emp e1
LEFT OUTER JOIN emp e2 ON (e1.mgr = e2.EMPNO)
LEFT OUTER JOIN dept d ON (e1.deptno = d.DEPTNO)
WHERE e2.SAL < e1.SAL 



SELECT * FROM emp WHERE SAL > (SELECT SAL FROM EMP WHERE ENAME = 'JONES');

-- JONES와 같은 JOB을 가지는 사원 모두 출력

SELECT * FROM EMP WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME = 'JONES');

SELECT * FROM EMP WHERE COMM > (SELECT COMM FROM EMP WHERE ENAME = 'ALLEN' );

-- 평균 월급보다 많이 받는 사람

SELECT * FROM EMP WHERE (SELECT SAL FROM EMP WHERE SAL > AVG(SAL));

SELECT * FROM EMP 
WHERE SAL > (SELECT AVG(SAL) FROM EMP WHERE DEPTNO = 10) AND DEPTNO = 20;

SELECT * FROM EMP WHERE SAL IN (SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO);

SELECT * FROM EMP WHERE DEPTNO = 10;


SELECT ENAME, DNAME FROM (SELECT * FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO) WHERE SAL > 2000;

SELECT AVG(SAL) FROM EMP GROUP BY DEPTNO HAVING AVG(SAL) > 2000;

SELECT * 
FROM (SELECT AVG(SAL) A_SAL, DEPTNO AS DNO FROM EMP GROUP BY DEPTNO) E, DEPT D 
WHERE E.A_SAL > 2000 AND E.DNO = D.DEPTNO;




SELECT ROWNUM, ENAME, EMPNO, SAL
FROM EMP
ORDER BY SAL

SELECT ROWNUM, ENAME, EMPNO, SAL
FROM(
	SELECT ENAME, EMPNO, SAL
	FROM EMP
	ORDER BY SAL
	)
	

WITH EMP1 AS (
	SELECT ENAME, EMPNO, SAL
	FROM EMP
	ORDER BY SAL
)
SELECT * FROM EMP1;

SELECT * FROM EMP E1 WHERE SAL > (SELECT MIN(SAL) FROM EMP E2 WHERE E2.DEPTNO =E1. DEPTNO )
ORDER BY DEPTNO , SAL;


SELECT EMPNO, ENAME, JOB, SAL,
	(SELECT GRADE FROM SALGRADE WHERE E.SAL BETWEEN LOSAL AND HISAL) AS SALGRADE, DEPTNO,
	(SELECT DNAME FROM DEPT WHERE E.DEPTNO = DEPT.DEPTNO) AS DNAME
	FROM EMP E;



-- Q1
SELECT E.JOB, E.EMPNO, E.ENAME , SAL, D.DEPTNO , D.DNAME  
FROM EMP E, DEPT D 
WHERE E.DEPTNO = D.DEPTNO AND JOB = (SELECT JOB FROM EMP WHERE ENAME = 'ALLEN');

-- Q2
SELECT EMPNO, ENAME, DNAME, HIREDATE, D.LOC, SAL, S.GRADE  
FROM EMP E, DEPT D, SALGRADE S 
WHERE E.DEPTNO = D.DEPTNO 
AND (E.SAL BETWEEN LOSAL AND HISAL)
AND SAL > (SELECT AVG(SAL) FROM EMP)
ORDER BY SAL DESC

-- Q3
--SELECT E.EMPNO , E.ENAME , E.JOB , D.DEPTNO , D.DNAME , D.LOC 
--FROM EMP E, DEPT D
--WHERE E.DEPTNO = D.DEPTNO 
--AND D.DEPTNO = 10
--AND JOB IN (SELECT JOB FROM EMP WHERE DEPTNO <> 30);

SELECT E.EMPNO , E.ENAME , E.JOB , D.DEPTNO , D.DNAME , D.LOC  
FROM EMP E, DEPT D 
WHERE E.DEPTNO = D.DEPTNO 
AND D.DEPTNO = 10 
AND JOB NOT IN (SELECT JOB FROM EMP WHERE DEPTNO = 30)

-- Q4
SELECT * FROM EMP
WHERE SAL > (SELECT MAX(SAL) FROM EMP WHERE JOB = 'SALESMAN')


CREATE TABLE EMP_DDL (
	EMPNO	 NUMBER(4),
	ENAME	 VARCHAR2(10),
	JOB		 VARCHAR2(9),
	MGR		 NUMBER(4),
	HIREDATE DATE,
	SAL 	 NUMBER(7, 2),
	COMM	 NUMBER(7, 2),
	DEPTNO	 NUMBER(2)
);

SELECT * FROM EMP_DDL

CREATE TABLE DEPT_DDL AS SELECT * FROM DEPT;

SELECT * FROM DEPT_DDL;


CREATE TABLE EMP_DDL_30 AS SELECT * FROM EMP WHERE DEPTNO = 30;

SELECT * FROM EMP_DDL_30;


CREATE TABLE EMP_TEST_COL2 AS SELECT EMPNO, ENAME FROM EMP;

SELECT * FROM EMP_TEST_COL2;


CREATE TABLE EMPDEPT_DDL
AS SELECT EMP.*, DNAME, LOC FROM EMP, DEPT
WHERE 1 != 1

SELECT * FROM EMPDEPT_DDL


CREATE TABLE EMP_ALTER AS SELECT * FROM EMP;

SELECT * FROM EMP_ALTER;

ALTER TABLE EMP_ALTER ADD HP VARCHAR2(20);

SELECT * FROM EMP_ALTER;

ALTER TABLE EMP_ALTER RENAME COLUMN HP TO TEL;

SELECT * FROM EMP_ALTER;

ALTER TABLE EMP_ALTER MODIFY EMPNO NUMBER(5);
-- 크기가 줄어드는 방향은 지원하지 않는다.
-- 줄이려면 컬럼을 삭제하고 다시 만들어야 한다.

ALTER TABLE EMP_ALTER DROP COLUMN TEL;

SELECT * FROM EMP_ALTER;

TRUNCATE TABLE EMP_ALTER;

SELECT * FROM EMP_ALTER;

DROP TABLE EMP_ALTER;

--SELECT * FROM EMP_ALTER;

CREATE TABLE DEPT_TEMP AS SELECT * FROM DEPT;

SELECT * FROM DEPT_TEMP;

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC) VALUES(50, 'DATABASE', 'SEOUL');

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC) VALUES(50, NULL , 'SEOUL');

CREATE TABLE EMP_TEMP AS SELECT * FROM EMP WHERE 1<>1;

SELECT * FROM EMP_TEMP;

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (9999, '홍길동', 'PRESIDENT', NULL, TO_DATE('07/01/2001', 'DD/MM/YYYY'), 5000, 1000, 10);

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (9999, '홍길동', 'PRESIDENT', NULL, SYSDATE, 5000, 1000, 10);

CREATE TABLE DEPT_TEMP2 AS SELECT * FROM DEPT;

SELECT * FROM DEPT_TEMP2;

UPDATE DEPT_TEMP2 SET LOC = 'SEOUL';

ROLLBACK;

UPDATE DEPT_TEMP2 SET DNAME = 'DATABASE', LOC = 'SEOUL'
WHERE DEPTNO = 40;

INSERT INTO EMP_TEMP 
	(EMPNO,
	ENAME,
	JOB,
	MGR,
	HIREDATE,
	SAL,
	COMM,
	DEPTNO)
SELECT
	EMPNO,
	ENAME,
	JOB,
	MGR,
	HIREDATE,
	SAL,
	COMM,
	DEPTNO
FROM
	EMP
WHERE
	DEPTNO = 10;
	
SELECT * FROM EMP_TEMP;

SELECT * FROM DEPT_TEMP2;

UPDATE DEPT_TEMP2
SET (DNAME, LOC) = (SELECT DNAME, LOC FROM DEPT WHERE DEPTNO = 40)
WHERE DEPTNO = 40;

SELECT * FROM DEPT_TEMP2 WHERE DEPTNO = 40;

UPDATE EMP_TEMP SET COMM = 50 WHERE SAL <= 2500;


CREATE TABLE EMP_TEMP2 AS SELECT * FROM EMP;

SELECT * FROM EMP_TEMP2;

DELETE FROM EMP_TEMP2 WHERE JOB = 'MANAGER';

DELETE FROM EMP_TEMP2 
WHERE EMPNO 
IN (SELECT E.EMPNO FROM EMP_TEMP2 E, SALGRADE S 
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE = 3 AND DEPTNO = 30);

ROLLBACK;

DELETE FROM EMP_TEMP2;



CREATE TABLE CHAP10HW_EMP AS SELECT * FROM EMP;
CREATE TABLE CHAP10HW_DEPT AS SELECT * FROM DEPT;
CREATE TABLE CHAP10HW_SALGRADE AS SELECT * FROM SALGRADE;

INSERT INTO CHAP10HW_DEPT(DEPTNO, DNAME, LOC) VALUES (50, 'ORACLE', 'BUSAN');
INSERT INTO CHAP10HW_DEPT(DEPTNO, DNAME, LOC) VALUES (60, 'SQL', 'ILSAN');
INSERT INTO CHAP10HW_DEPT(DEPTNO, DNAME, LOC) VALUES (70, 'SELECT', 'INCHEON');
INSERT INTO CHAP10HW_DEPT(DEPTNO, DNAME, LOC) VALUES (80, 'DML', 'BUNDANG');

SELECT * FROM CHAP10HW_DEPT;

COMMIT;



-- 먼저 개수부터 세보고 조회
SELECT count(*) FROM emp;


SELECT DEPTNO
FROM EMP, DEPT


SELECT * FROM dict;

SELECT count(*) FROM dictionary;

SELECT * FROM user_tables

--SELECT * FROM SCOTT3_17.emp

--explain plan for
--SELECT * FROM emp
--WHERE empno = 7900;

SELECT * FROM USER_indexes;




SELECT /*+ INDEX(E IDX_EMP_SAL) */ -- HINT를 통해서 INDEX를 강제로 탐
* 
FROM EMP E
WHERE sal = 3000;

CREATE INDEX IDX_EMP_SAL ON EMP(SAL);

CREATE SEQUENCE SEQ_DEPT_SEQUENCE
INCREMENT BY 10
START WITH 10
MAXVALUE 90
MINVALUE 0
NOCYCLE
CACHE 2;

SELECT * FROM USER_SEQUENCES;

CREATE SEQUENCE SEQ_DEPT

-- 다음 시퀀스 조회
SELECT SEQ_DEPT.NEXTVAL
FROM DUAL

-- 현재 시퀀스 조회
SELECT SEQ_DEPT.CURRVAL
FROM DUAL

CREATE SEQUENCE SEQ_DEPT2

-- 만들자마자 CURRVAL은 오류가 난다. (NEXTVAL이 한 번 이상이라도 실핼한 경우에만 사용 가능)
SELECT SEQ_DEPT2.CURRVAL
FROM DUAL

SELECT * FROM USER_TABLES


-- 테이블 생성
CREATE TABLE DEPT_TEMP3
AS SELECT * FROM DEPT

SELECT * FROM DEPT_TEMP3

-- 데이터 삽입
INSERT INTO DEPT_TEMP3 (DEPTNO, LOC, DNAME)
VALUES (50, '천안', '휴먼')


CREATE SEQUENCE SEQ_DEPT3
START WITH 60
INCREMENT BY 10
NOCYCLE

-- 시퀀스를 이용한 INSERT
INSERT INTO DEPT_TEMP3 (DEPTNO, LOC, DNAME)
VALUES (SEQ_DEPT3.NEXTVAL, '천안2', '휴먼2')

INSERT INTO DEPT_TEMP3 (DEPTNO, LOC, DNAME)
VALUES (SEQ_DEPT3.NEXTVAL, '천안3', '휴먼3')


COMMIT;


CREATE TABLE TABLE_NOTNULL(
	LOGIN_ID 	VARCHAR2(20) NOT NULL,
	LOGIN_PWD 	VARCHAR2(20) NOT NULL,
	TEL 		VARCHAR2(20)
);

SELECT * FROM TABLE_NOTNULL

INSERT INTO TABLE_NOTNULL (LOGIN_ID, LOGIN_PWD, TEL)
VALUES ('ABC', 123, NULL)

--INSERT INTO TABLE_NOTNULL (LOGIN_ID, TEL)
--VALUES ('ABC', NULL)

SELECT * FROM USER_CONSTRAINTS


CREATE TABLE TABLE_UNIQUE (
	LOGIN_ID 	VARCHAR2(20) UNIQUE,
	LOGIN_PWD 	VARCHAR2(20) NOT NULL,
	TEL 		VARCHAR2(20)
);



CREATE TABLE TABLE_PK (
	LOGIN_ID 	VARCHAR2(20) PRIMARY KEY,
	LOGIN_PWD 	VARCHAR2(20) NOT NULL,
	TEL 		VARCHAR2(20)
);

SELECT * FROM USER_INDEXES

INSERT INTO TABLE_PK
VALUES ('ID', 'PW', 123)

SELECT * FROM TABLE_PK

--INSERT INTO TABLE_PK
--VALUES (NULL, 'PW', 123)
--
-- NULL도 안되고 중복도 안된다.
--
--INSERT INTO TABLE_PK
--VALUES ('ID', 'PW', 123)

SELECT * FROM EMP;

INSERT INTO EMP (EMPNO, ENAME, DEPTNO)
VALUES (1,'박창순', 40)

SELECT * FROM EMP

SELECT * FROM DEPT WHERE DEPTNO = 20

DELETE FROM DEPT
WHERE DEPTNO = 20



CREATE TABLE DEPT_FK(
	DEPTNO 	NUMBER(2) PRIMARY KEY,
	DNAME 	VARCHAR2(14),
	LOC 	VARCHAR2(13)
);

INSERT INTO DEPT_FK 
VALUES(1,1,1)

INSERT INTO DEPT_FK 
VALUES(2,2,2)

SELECT * FROM DEPT_FK

CREATE TABLE EMP_FK(
	EMPNO NUMBER(4) PRIMARY KEY,
	ENAME VARCHAR2(10),
	DNO NUMBER(2) REFERENCES DEPT_FK(DEPTNO)
)

INSERT INTO EMP_FK
VALUES (100, '휴먼', 1)


SELECT * FROM EMP_FK

INSERT INTO EMP_FK
VALUES (101, '휴먼2', 10)

COMMIT;


SELECT * FROM CHAP10HW_DEPT




CREATE TABLE "emp" (
	"empno"	number(4)		NOT NULL,
	"ename"	varchar2(10)		NULL,
	"job"	varchar2(9)		NULL,
	"mgr"	number(4,0)		NULL,
	"hiredate"	date		NULL,
	"sal"	number(7,2)		NULL,
	"comm"	number(7,2)		NULL,
	"deptno"	number(2)		NULL,
	"deptno2"	number(2)		NOT NULL
);

CREATE TABLE "dept" (
	"deptno"	number(2)		NOT NULL,
	"loc"	varchar2(13)		NULL,
	"dname"	varchar2(14)		NULL
);

ALTER TABLE "emp" 
ADD PRIMARY KEY ("empno");

ALTER TABLE "dept" 
ADD PRIMARY KEY ("deptno");

ALTER TABLE "emp" 
ADD FOREIGN KEY ("deptno2")
REFERENCES "dept" ("deptno");














