BEGIN
  UPDATE Customers
     SET IsVIP       = 'Y',
         LastModified = SYSDATE
   WHERE Balance > 10000
     AND IsVIP = 'N';

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('VIP flag set for high‑balance customers.');
END;
/
