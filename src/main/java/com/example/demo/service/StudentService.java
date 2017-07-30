/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.IStudentDao;
import com.example.demo.entity.StudentEntity;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAC
 */
@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public Collection<StudentEntity> getAll() {
        return studentDao.getAll();
    }

    @Override
    public StudentEntity getById(Long id) {
        return studentDao.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        studentDao.deleteById(id);
    }

    @Override
    public void add(StudentEntity student) {
        studentDao.add(student);
    }

    @Override
    public void update(StudentEntity student) {
        studentDao.update(student);
    }
}
