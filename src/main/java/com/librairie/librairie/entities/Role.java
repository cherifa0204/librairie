package com.librairie.librairie.entities;

import java.security.Permission;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.JoinColumn;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Basic
    @Column(name = "libelle", nullable = false)
    private String libelle;
    


    @OneToMany(mappedBy = "role")
    private List<Employer> employes;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "role_permissions",

    joinColumns = @JoinColumn(name= "permission_id",referencedColumnName = "id"),

    inverseJoinColumns=@JoinColumn( name ="role_id",referencedColumnName = "id"))

    private List<Permissions> permissions;

}
