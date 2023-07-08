package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Log {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String user;
    private String time;
    private String action;


}
