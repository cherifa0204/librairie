package com.librairie.librairie.entities;


import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "ligne_achats")
public class Ligne_achat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Basic
    @Column(name = "prix_unitaire",nullable = false)
    private Integer prix_unitaire;

    @Basic
    @Column(name = "quantite",nullable = false)
    private Integer quantite;

    @Basic
    @Column(name = "montant",nullable = false)
    private Integer montant;


    @Basic
    @Column(name = "etat",nullable = false)
    private Integer etat;


    @ManyToOne
    @JoinColumn(name = "achat_id")
    private Achat achat;


}
