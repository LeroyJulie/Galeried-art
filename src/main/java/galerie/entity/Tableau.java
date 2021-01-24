/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import galerie.dao.ArtisteRepository;
import galerie.dao.PersonneRepository;
import galerie.entity.Artiste;
import org.springframwork.beans.factory.annotation.Autowired;
import org.springframwork.boot.CommandLineRunner;
import org.springframwork.stereotype.Conponent;

/**
 *
 * @author Julie LEROY
 */
public class Tableau {
    
    @Column (unique = true)
    private int largeur;
    
    @Column (unique = true)
    private int hauteur;
    
    @Column (unique = true)
    private String support;
    
    @Column (unique = true)
    private  String titre;
    
    @Entity 
public class Tableau {
    // ...
    @OneToOne(mappedBy = "oeuvre")
    private Transaction vendu;    
}
}
