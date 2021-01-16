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
public class Transaction {
    @Column(unique = true)
    @NonNull
    private Integer id;
    
    @Column(unique = true)
    @NonNull
    private LocalDate venduLe;
    
    @Column(unique = true)
    @NonNull
    private Float prixVente;
    
    //Relation Transaction/Exposition
    @ManyToOne
    private Exposition lieuDeVente;
    
    //Relation Transaction/Personne
    @ManyToOne
    private Personne client;
    
    //Relation Transaction/Tableau
    @OneToOne(mappedBy = "oeuvre")
    private Tableau oeuvre;
}
