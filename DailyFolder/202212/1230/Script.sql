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
