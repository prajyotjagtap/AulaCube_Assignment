package com.example.AulaCube.depart_service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AulaCube.depart_entity.Department;
import com.example.AulaCube.depart_exception.DepartmentNotFoundException;
import com.example.AulaCube.depart_repo.DepartmentRepository;

import java.util.List;
import java.util.Date;

@Service
public class DepartmentService {
 private final DepartmentRepository departmentRepository;

 @Autowired
 public DepartmentService(DepartmentRepository departmentRepository) {
     this.departmentRepository = departmentRepository;
 }

 public List<Department> getAllDepartments() {
     return departmentRepository.findAll();
 }

 public Department getDepartmentById(String departmentId) {
     return departmentRepository.findById(departmentId).orElse(null);
 }

 public Department createDepartment(Department department) {
     
     department.setCreatedAt(new Date());
     department.setUpdatedAt(new Date());
     return departmentRepository.save(department);
 }

 public Department updateDepartment(String departmentId, Department updatedDepartment) {
     Department existingDepartment = departmentRepository.findById(departmentId).orElse(null);

     if (existingDepartment != null) {
         
         existingDepartment.setDepartmentName(updatedDepartment.getDepartmentName());
         existingDepartment.setUpdatedAt(new Date());
         return departmentRepository.save(existingDepartment);
     } else {
         return null;
     }
 }

 
 
 public void deleteDepartment(String departmentId) {
     Department department = getDepartmentById(departmentId);
     
     if (department == null) {
         throw new DepartmentNotFoundException("Department with ID " + departmentId + " not found");
     }

     departmentRepository.deleteById(departmentId);
 }
}
