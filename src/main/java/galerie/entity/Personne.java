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
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;


@Entity
public class Personne {
    
    @Id @GeneratedValue
    private Long id;
    
    private String nom;
    
    private String adresse;
    
    private List<Transaction> transaction;
    
    public Personne(String nom, String adresse){
        this.nom = nom;
        this.adresse = adresse;
        this.transaction = new ArrayList<>();
    }
    
}
