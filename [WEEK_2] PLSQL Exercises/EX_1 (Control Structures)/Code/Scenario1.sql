SET SERVEROUTPUT ON;

DECLARE
  CURSOR c_loans IS
    SELECT l.LoanID,
           l.InterestRate,
           c.DOB
      FROM Loans    l
      JOIN Customers c ON c.CustomerID = l.CustomerID;
  v_age  PLS_INTEGER;
BEGIN
  FOR r IN c_loans LOOP
    v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, r.DOB) / 12);
    IF v_age > 60 THEN
      UPDATE Loans
         SET InterestRate = InterestRate - 1
       WHERE LoanID = r.LoanID;
    END IF;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Interest rates updated for customers over 60.');
END;
/
