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


@Conponent
public class ConsoleApp inplements CommandLineRunner{
    
    @Autowired
    private ArtisteRepository artisteRepository;
    @Autowired
    private PersonneRepository personneRepository;
    
    @Override
    public void run(String... args) throws Exeption {
        tapezEntrerPourContinuer();
        //On crée des entités dans les sous-classes de "Item"
        Artiste artiste = new Artiste(nom= "Dupont", adresse: "10 rue je sais pas quoi", biographie: "biographie1");
        // On les enregistre dans la base
        personneRepository.save(artiste);
        //On les retrouve dans les personnes
        personneRepository.findAll().forEach(System.out.println);
    }
public static void tapezEntrerPourContinuer() throws Exeptino {
    System.out.println("Tapez ENTRER pour continuer...");
    System.in.read();
    }
    
}
