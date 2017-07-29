/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entity.StudentEntity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MAC
 */
@Repository
public class StudentDao implements IStudentDao {

    //atrapa bazy danych
    Map<Long, StudentEntity> students = new HashMap<>();

    public StudentDao() {
        students.put(1L, new StudentEntity(1L, "Jacek", "Test", "infprmatyka"));
        students.put(2L, new StudentEntity(2L, "Lukasz", "Test2", "matematyka"));
    }

    @Override
    public Collection<StudentEntity> getAll() {
        return students.values();
    }

    @Override
    public StudentEntity getById(Long id) {
        return students.get(id);
    }

    @Override
    public void deleteById(Long id) {
        students.remove(id);
    }

    @Override
    public void add(StudentEntity student) {
        students.put(student.getId(), student);
    }

    @Override
    public void update(StudentEntity student) {
        students.replace(student.getId(), student);
    }
}
