package com.example.AulaCube.depart_controller;

import com.example.AulaCube.depart_entity.Department;
import com.example.AulaCube.depart_exception.DepartmentNotFoundException;
import com.example.AulaCube.depart_service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    
    @GetMapping("/{departmentId}")
    public ResponseEntity<?> getDepartmentById(@PathVariable String departmentId) {
        Department department = departmentService.getDepartmentById(departmentId);
        
        if (department != null) {
            return new ResponseEntity<>(department, HttpStatus.OK);
        } else {
            String errorMessage = "Department with ID " + departmentId + " not found";
            return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department createdDepartment = departmentService.createDepartment(department);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }

    
    @PutMapping("/{departmentId}")
    public ResponseEntity<?> updateDepartment(@PathVariable String departmentId, @RequestBody Department updatedDepartment) {
        Department existingDepartment = departmentService.getDepartmentById(departmentId);

        if (existingDepartment != null) {
            try {
                Department updated = departmentService.updateDepartment(departmentId, updatedDepartment);
                return new ResponseEntity<>(updated, HttpStatus.OK);
            } catch (DepartmentNotFoundException ex) {
                return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
            }
        } else {
            String errorMessage = "Department with ID " + departmentId + " not found";
            return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{departmentId}")
    public ResponseEntity<String> deleteDepartment(@PathVariable String departmentId) {
        try {
            departmentService.deleteDepartment(departmentId);
            return new ResponseEntity<>("Department with ID " + departmentId + " deleted successfully", HttpStatus.OK);
        } catch (DepartmentNotFoundException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
