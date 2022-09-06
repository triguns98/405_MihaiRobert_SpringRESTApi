package com.robert_alexandru_mihai.friendlly.friendlly.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastName;
    private Date registrationDate;

    public User(int id, String name, String lastName, Date registrationDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.registrationDate = registrationDate;
    }
}
