
SELECT count(EmployeeNumber) Emp_Count
FROM Employee_Client
WHERE EmployeeNumber NOT IN (SELECT EmployeeNumber FROM Employee_Bank);
