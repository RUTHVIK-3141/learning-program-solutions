-- Scenario 1: Apply 1% monthly interest to all Savings accounts
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
     SET Balance      = Balance * 1.01,
         LastModified = SYSDATE
   WHERE AccountType = 'Savings';

  COMMIT;
END ProcessMonthlyInterest;
/
