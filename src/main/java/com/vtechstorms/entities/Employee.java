package com.vtechstorms.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {

    @Id
    private Integer empId;
    private String empName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "deptId")
    private Department department;

    public Employee() {

    }

    public Employee(Integer empId, String empName, String email, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.department = department;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}