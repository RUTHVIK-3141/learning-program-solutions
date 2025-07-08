package com.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeDao {
    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public Integer saveEmployee(Employee emp) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer empId = null;
        try {
            tx = session.beginTransaction();
            empId = (Integer) session.save(emp);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return empId;
    }

    public List<Employee> listEmployees() {
        Session session = factory.openSession();
        List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();
        session.close();
        return employees;
    }
}
