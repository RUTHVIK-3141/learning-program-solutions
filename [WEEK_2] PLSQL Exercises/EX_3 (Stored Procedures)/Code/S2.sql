-- Scenario 2: Add a department bonus percentage to employee salaries
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_Department   IN VARCHAR2,
  p_BonusPercent IN NUMBER   -- e.g. pass 5 for +5%
) IS
BEGIN
  UPDATE Employees
     SET Salary       = Salary * (1 + p_BonusPercent/100),
         -- optionally track when bonus was applied:
         HireDate      = HireDate,  -- unchanged
         Department    = Department  -- unchanged
   WHERE Department = p_Department;

  COMMIT;
END UpdateEmployeeBonus;
/
