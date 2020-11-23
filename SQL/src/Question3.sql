SELECT  EB.EmployeeNumber, EmployeeFirstName,EmployeeSecondName,AccountNumber
FROM Employee_Client EC JOIN Employee_Bank EB
ON EC.EmployeeNumber=EB.EmployeeNumber
WHERE (AccountOpenDate)>15
ORDER BY EB.EmployeeNumber,AccountNumber;