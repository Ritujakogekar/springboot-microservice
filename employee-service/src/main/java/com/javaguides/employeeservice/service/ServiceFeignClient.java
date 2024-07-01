package com.javaguides.employeeservice.service;

import com.javaguides.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="DEPARTMENT-SERVICE" )
public interface ServiceFeignClient {
    @GetMapping("/api/v1/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") String departmentcode);



}
