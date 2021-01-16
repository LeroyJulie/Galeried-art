/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import galerie.dao.ArtisteRepository;
import galerie.dao.PersonneRepository;
import galerie.entity.Artiste;
import javax.persistence.Column;
import lombok.NonNull;
import org.springframwork.beans.factory.annotation.Autowired;
import org.springframwork.boot.CommandLineRunner;
import org.springframwork.stereotype.Conponent;

/**
 *
 * @author Julie LEROY
 */
public class Exposition {
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column(unique=true)
    @NonNull
    private Date date;
    
    @Column(unique=true)
    @NonNull
    private Integer duree;
}
