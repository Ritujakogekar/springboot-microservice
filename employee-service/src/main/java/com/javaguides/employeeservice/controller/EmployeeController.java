package com.javaguides.employeeservice.controller;

import com.javaguides.employeeservice.dto.ApiResponceDto;
import com.javaguides.employeeservice.dto.EmployeeDto;
import com.javaguides.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    //build Saved Restapi
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
       EmployeeDto savedEmployeeDto=employeeService.saveEmployeeDto(employeeDto);
       return new ResponseEntity<>(savedEmployeeDto,(HttpStatus.CREATED));


    }
    //build get rest Api
    @GetMapping("{id}")
    public  ResponseEntity<ApiResponceDto> getEmployee(@PathVariable("id") Long  employeeId){
        ApiResponceDto apiResponceDto=employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponceDto,(HttpStatus.OK));
    }
}
