package com.example.AulaCube.depart_repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AulaCube.depart_entity.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {
 
}
