Select * from Employee_Loan;
SELECT count(EL.EmployeeNumber) Emp_Count
FROM Employee_Bank EB  JOIN Employee_Loan EL
ON  EB.EmployeeNumber=EL.EmployeeNumber
WHERE EB.AccountNumber=0;