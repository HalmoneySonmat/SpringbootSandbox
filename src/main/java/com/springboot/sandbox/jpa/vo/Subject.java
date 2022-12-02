package com.springboot.sandbox.jpa.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {

    @Id @GeneratedValue
    private Long id;

    private String name;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
