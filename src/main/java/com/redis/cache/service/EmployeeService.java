package com.redis.cache.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.redis.cache.dto.EmployeeDto;
import com.redis.cache.entity.Employee;
import com.redis.cache.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Cacheable(value = "employees", key = "#id")
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(EmployeeDto employee) {
        return saveEmployee(employee.toRequest());
    }

    @CachePut(value = "employees", key = "#employee.id")
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

     @CacheEvict(value = "employees", key = "#id")
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    
}
