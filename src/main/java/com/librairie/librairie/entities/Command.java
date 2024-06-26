/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.librairie.librairie.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



/**
 *
 * @author cherifa
 */

@Entity
@Table(name = "commands")
public class Command {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "command_id")

    private Long id;
    
    @Column
    private Date date;
    @Column
    private Float amount;

    @OneToMany
    private List<Customer> customers=new ArrayList<Customer>();
   

    public Command( Date date, Float amount, List<Customer> customers) {
        this.date = date;
        this.amount=amount;
        this.customers=customers;

        
    }
}
