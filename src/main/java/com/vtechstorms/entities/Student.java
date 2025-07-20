package com.vtechstorms.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Student {

    @Id
    private Integer id;

    private String studName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stud_id")
    List<Courses> courses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
}
