package com.javaguides.departmentservice.controller;

import com.javaguides.departmentservice.dto.DepartmentDto;
import com.javaguides.departmentservice.entity.Department;
import com.javaguides.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {

    private DepartmentService departmentService;
@PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto saveDepartmentDto=departmentService.saveDepartmentDto(departmentDto);
        return new ResponseEntity<>(saveDepartmentDto,(HttpStatus.CREATED));
    }
  @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("department-code") String code){
    DepartmentDto departmentDto=departmentService.getDepartmentByCode(code);
    return new ResponseEntity<>(departmentDto,(HttpStatus.OK));
    }
}
