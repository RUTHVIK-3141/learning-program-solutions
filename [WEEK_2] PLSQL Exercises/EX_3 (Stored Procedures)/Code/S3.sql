-- Scenario 3: Transfer funds between two accounts, with balance check
CREATE OR REPLACE PROCEDURE TransferFunds (
  p_FromAcct IN NUMBER,
  p_ToAcct   IN NUMBER,
  p_Amount   IN NUMBER
) IS
  v_FromBal NUMBER;
BEGIN
  -- 1) Check source balance
  SELECT Balance
    INTO v_FromBal
    FROM Accounts
   WHERE AccountID = p_FromAcct
     FOR UPDATE;  -- lock row

  IF v_FromBal < p_Amount THEN
    RAISE_APPLICATION_ERROR(
      -20001,
      'Insufficient funds in account ' || p_FromAcct
    );
  END IF;

  -- 2) Debit source
  UPDATE Accounts
     SET Balance      = Balance - p_Amount,
         LastModified = SYSDATE
   WHERE AccountID = p_FromAcct;

  -- 3) Credit destination
  UPDATE Accounts
     SET Balance      = Balance + p_Amount,
         LastModified = SYSDATE
   WHERE AccountID = p_ToAcct;

  COMMIT;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    RAISE_APPLICATION_ERROR(-20002, 'Account not found.');
END TransferFunds;
/
