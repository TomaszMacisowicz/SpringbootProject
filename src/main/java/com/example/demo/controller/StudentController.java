/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.IStudentService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MAC
 */
@RestController
@RequestMapping("/studentService") //http://localhost:8080/studentService
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<StudentEntity> getAllStudents() {
        return studentService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentEntity getStudentById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleStudentById(@PathVariable Long id) {
        studentService.deleteById(id);
        System.out.println("Student id:" + id + " has been deleted");
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody StudentEntity student) {
        studentService.add(student);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody StudentEntity student) {
        studentService.update(student);
    }

    //metoda zwraca srednia stypendium wszystkich studnetow
}
