package org.springcrud.controller;

import org.springcrud.dao.StudentDao;
import org.springcrud.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    StudentDao studentDao;

//    Controllers need toe be coded for further enhancement
}
