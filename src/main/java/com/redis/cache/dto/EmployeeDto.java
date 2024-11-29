package com.redis.cache.dto;

import com.redis.cache.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Employee toRequest(){
        return Employee.builder()
        .email(email).firstName(firstName).lastName(lastName)
        .phoneNumber(phoneNumber)
        .build();
    }
}
