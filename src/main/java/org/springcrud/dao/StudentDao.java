package org.springcrud.dao;

import org.springcrud.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public  int saveStudent(Student student){
        return (int) hibernateTemplate.save(student);
    }


    @Transactional
    public void updateStudent(Student student){
        hibernateTemplate.update(student);
    }

    @Transactional
    public void deleteStudent(Student student){
        hibernateTemplate.delete(student);
    }
    public  Student getStudent(int id){
        return  hibernateTemplate.get(Student.class, id);
    }
}
