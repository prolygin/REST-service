package com.prolygin.spring_rest.service;

import com.prolygin.spring_rest.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {

        public List<Employee> getAllEmployees();

    @Transactional
    void saveEmployee(Employee employee);

    @Transactional
    Employee getEmployee(int id);

    @Transactional
    void deleteEmployee(int id);
//        public void saveEmployee(Employee employee);
//        public Employee getEmployee(int id);
//        public void deleteEmployee(int id);
    }
