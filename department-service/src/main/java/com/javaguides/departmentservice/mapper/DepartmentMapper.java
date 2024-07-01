package com.javaguides.departmentservice.mapper;

import com.javaguides.departmentservice.dto.DepartmentDto;
import com.javaguides.departmentservice.entity.Department;

public class DepartmentMapper {
    public  static DepartmentDto maptoDepartmentDto(Department department){
    DepartmentDto departmentDto=new DepartmentDto(
            department.getId(),
            department.getDepartmentName(),
            department.getDepartmentDescription(),
            department.getDepartmentCode()
    );
    return  departmentDto;
    }

    public static Department maptoDepartment(DepartmentDto departmentDto){
        Department department=new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );
        return department;
    }
}
