package com.prolygin.spring_rest.DAO;
import com.prolygin.spring_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
//    public void saveEmployee(Employee employee);
//    public Employee getEmployee(int id);
//    public void deleteEmployee(int id);
}
