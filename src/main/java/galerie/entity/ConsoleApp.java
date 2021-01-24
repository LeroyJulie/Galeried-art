/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import galerie.dao.ArtisteRepository;
import galerie.dao.PersonneRepository;
import galerie.entity.Artiste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Conponent;


@Conponent
public class ConsoleApp implements CommandLineRunner {
    
    @Autowired
    private ArtisteRepository artisteRepository;
    @Autowired
    private PersonneRepository personneRepository;
    
    @Override
    public void run(String... args) throws Exception {
        tapezEntrerPourContinuer();
        //On crée des entités dans les sous-classes de "Item"
        Artiste artiste = new Artiste("Dupont", "10 rue je sais pas quoi", "biographie1");
        // On les enregistre dans la base
        //personneRepository.save(artiste);
        //On les retrouve dans les personnes
        //personneRepository.findAll().forEach(System.out.println);
    }
public static void tapezEntrerPourContinuer() throws Exception {
    System.out.println("Tapez ENTRER pour continuer...");
    System.in.read();
    }
    
}
