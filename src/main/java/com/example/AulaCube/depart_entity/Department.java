package com.example.AulaCube.depart_entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "departments")
public class Department {
 @Id
 private String departmentId;
 private String departmentName;
 private Date createdAt;
 private Date updatedAt;
 
 
public Department() {
	super();
}
public Department(String departmentId, String departmentName, Date createdAt, Date updatedAt) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
}
public String getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(String departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}

 

}
