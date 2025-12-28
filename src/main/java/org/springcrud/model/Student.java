package org.springcrud.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "StudentProject")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "name")
    private String name;
    @Column(name="rollNo")
    private Integer rollNo;
    private Integer marks;




}
