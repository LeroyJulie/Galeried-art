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

/**
 *
 * @author Julie LEROY
 */
@Getter @Setter @NoArgsConstructor @ToSting(callSuper = true) @Entity
public class Artiste extends Personne {
    
    @Column(unique=true
    @NotNull)
    private String biographie;
    
    @OneToMany(rappedBy = "artiste")
    private List<Tableau> tableaux;
    
    public Artiste(String nom, String adresse, String biographie){ 
        super(nom,adresse);
        this.biographie = biographie;
        this.tableaux = new ArrayList<>();
}
}
