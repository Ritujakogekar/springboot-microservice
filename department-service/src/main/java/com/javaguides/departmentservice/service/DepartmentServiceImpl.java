package com.javaguides.departmentservice.service;


import com.javaguides.departmentservice.dto.DepartmentDto;
import com.javaguides.departmentservice.entity.Department;
import com.javaguides.departmentservice.mapper.DepartmentMapper;
import com.javaguides.departmentservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.javaguides.departmentservice.mapper.DepartmentMapper.maptoDepartment;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository repo;


    @Override
    public DepartmentDto saveDepartmentDto(DepartmentDto departmentDto) {
     Department department= DepartmentMapper.maptoDepartment(departmentDto);
     Department SavedDepartment=repo.save(department);
     DepartmentDto savedDepartmentDto=DepartmentMapper.maptoDepartmentDto(department);
     return  savedDepartmentDto;


    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department department=repo.findByDepartmentCode(code);
        DepartmentDto departmentDto=DepartmentMapper.maptoDepartmentDto(department);

        return departmentDto;
    }

//    @Override
//    public DepartmentDto getDepartmentByCode(String code) {
//        Department department=repo.findByDepartmentCode(code);
//
//        DepartmentDto departmentDto=new DepartmentDto(
//                department.getId(),
//                department.getDepartmentName(),
//                department.getDepartmentDescription(),
//                department.getDepartmentCode()
//        );

//
//        return departmentDto;
//    }


}
