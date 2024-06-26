/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.librairie.librairie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *
 * @author cherifa
 */

@Setter
@Getter
@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(name="persons")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String lastname;
    @Column
    private String firstname;
    @Column
    private String phone_number;
    
    public Person() {

    }

    public Person(String lastname, String firstname, String phone){
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone_number = phone;
    }
    
    
    
}
