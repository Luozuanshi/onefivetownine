
##3.查询各部门中工资比本部门平均工资高的员工的员工号, 姓名和工资
#各部门平均工资，不包括null
SELECT department_id,AVG(salary)
FROM employees
WHERE department_id IS NOT NULL
GROUP BY department_id;

SELECT e.`first_name`,e.`employee_id`,e.`salary`
FROM employees e JOIN (
	#各部门平均薪水表
	SELECT department_id,AVG(salary) a_sal
	FROM employees
	WHERE department_id IS NOT NULL
	GROUP BY department_id
) avg_dep_salary
ON e.`department_id` = avg_dep_salary.department_id
AND e.`salary` > avg_dep_salary.a_sal

# 4.查询和姓名中包含字母u的员工在相同部门的员工的员工号和姓名  *****
SELECT employee_id,first_name,department_id
FROM employees
WHERE department_id  = ANY (
	SELECT department_id
	FROM employees
	WHERE first_name LIKE '%u%'
)

# 5.查询在部门的location_id为1700的部门工作的员工的员工号
SELECT e.employee_id,e.first_name,d.department_id,d.location_id
FROM employees e JOIN departments d
ON e.department_id = d.department_id
WHERE e.department_id IN(
SELECT department_id
FROM departments
WHERE location_id = 1700