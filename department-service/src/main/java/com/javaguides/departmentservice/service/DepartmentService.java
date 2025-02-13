package com.javaguides.departmentservice.service;

import com.javaguides.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartmentDto(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}
