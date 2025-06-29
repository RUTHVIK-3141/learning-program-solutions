SET SERVEROUTPUT ON;

DECLARE
  CURSOR c_due IS
    SELECT l.LoanID,
           l.EndDate,
           c.Name,
           c.CustomerID
      FROM Loans     l
      JOIN Customers c ON c.CustomerID = l.CustomerID
     WHERE l.EndDate BETWEEN TRUNC(SYSDATE)
                         AND TRUNC(SYSDATE) + 30;
BEGIN
  IF c_due%ISOPEN THEN
    NULL;  -- ensure cursor is defined
  END IF;

  FOR rec IN c_due LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ' || rec.LoanID
      || ' for customer ' || rec.CustomerID
      || ' (' || rec.Name || ')'
      || ' matures on ' || TO_CHAR(rec.EndDate,'DD‑MON‑YYYY')
    );
  END LOOP;
END;
/
