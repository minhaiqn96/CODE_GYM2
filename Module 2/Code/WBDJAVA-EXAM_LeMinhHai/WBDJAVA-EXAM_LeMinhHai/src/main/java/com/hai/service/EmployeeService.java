package com.hai.service;

import com.hai.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {

    Page<Employee> findAllByNameContaining(String name, Pageable pageable);

    Page<Employee> showEmployee(Pageable pageable);

    public void deleteEmployee(Long id);

    public void createEmployee(Employee employee);

    public Employee findId(Long id);
}