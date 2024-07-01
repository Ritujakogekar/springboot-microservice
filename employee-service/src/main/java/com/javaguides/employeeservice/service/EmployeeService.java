package com.javaguides.employeeservice.service;

import com.javaguides.employeeservice.dto.ApiResponceDto;
import com.javaguides.employeeservice.dto.EmployeeDto;
import io.github.resilience4j.retry.annotation.Retry;

public interface EmployeeService {
    EmployeeDto saveEmployeeDto(EmployeeDto employeeDto);

    //@CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    @Retry(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    <APIResponseDto> ApiResponceDto getEmployeeById(Long employeeId);

    EmployeeDto saveEmployee(EmployeeDto employeeDto);
}
