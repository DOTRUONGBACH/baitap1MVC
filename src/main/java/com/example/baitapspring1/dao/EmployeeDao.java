package com.example.baitapspring1.dao;

import com.example.baitapspring1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class EmployeeDao {
    @Autowired
    EntityManager entityManager;

    public List<Employee> getAll(){
        String sql = "Select e from Employee e";
        List<Employee> employees =  entityManager.createQuery(sql).getResultList();
        return employees;
    }

    public void save(EmployeeDao employee){
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(employee);
        txn.commit();
    }

    public void delete(Employee employee){
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.remove(employee);
        txn.commit();
    }

    public void edit(EmployeeDao employee){
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.merge(employee);
        txn.commit();
    }

    public Employee findById(int id){
        String sql = "Select e from Employee e where e.id = " + id;
        Employee employee = (Employee) entityManager.createQuery(sql).getSingleResult();
        return employee;
    }
}
