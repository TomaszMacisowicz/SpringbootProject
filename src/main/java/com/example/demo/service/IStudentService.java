/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.Collection;

/**
 *
 * @author MAC
 */
public interface IStudentService {

    Collection<StudentEntity> getAll();

    StudentEntity getById(Long id);

    void deleteById(Long id);

    void add(StudentEntity student);

    void update(StudentEntity student);
}
