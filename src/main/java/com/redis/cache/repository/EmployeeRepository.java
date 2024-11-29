package com.redis.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redis.cache.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
