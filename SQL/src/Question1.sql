SELECT AccountNumber,EB.EmployeeNumber,EmployeeFirstName,EmployeeSecondName,AccountOpenDate
FROM Employee_Client EC JOIN Employee_Bank EB
ON EC.EmployeeNumber=EB.EmployeeNumber
ORDER BY AccountNumber;
