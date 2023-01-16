package com.example.baitapspring1.service;

import com.example.baitapspring1.dao.EmployeeDao;
import com.example.baitapspring1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAll(){
        return employeeDao.getAll();
    }

    public void delete(int id){
        employeeDao.delete(employeeDao.findById(id));
    }

    public void edit(EmployeeDao employee){
        employeeDao.edit(employee);
    }

    public void save(EmployeeDao employee){
        employeeDao.save(employee);
    }

}
