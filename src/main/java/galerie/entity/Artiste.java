/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.io.Serializable;
import javax.persistence.*;



/**
 *
 * @author Julie LEROY
 */
@Entity
public class Artiste extends galerie.entity.Personne {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
   @Column(name = "id", nullable = false, updatable = false)
    private String biographie;
    private String nom;
    
    public Artiste (){}
    
    @Id
    public Long getId() {
        return id;
    }
     
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getBiographie() {
        return biographie;
    }
     
    public void setBiographie(String Biographie) {
        this.biographie = biographie;
    }

    public String getNom() {
        return nom;
    }
     
    public void setNom(String Nom) {
        this.nom = nom;
    }
    
    @OneToMany(mappedBy = "artiste")
    private List<Tableau> tableaux;
    
    public Artiste(String nom, String biographie){ 
        this.nom = nom;
        this.biographie = biographie;
        this.tableaux = new ArrayList<>();
}
}
