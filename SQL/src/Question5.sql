select EmployeeFirstName
FROM Employee_Client EC INNER JOIN Employee_Bank EB
ON EC.EmployeeNumber=EB.EmployeeNumber
group by EmployeeFirstName
having count(AccountNumber)>1;
