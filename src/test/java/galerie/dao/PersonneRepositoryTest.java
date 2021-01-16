/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import static org.junit.jupiter.api.Assertions.*;
import org.sprigframework.test.context.jdbc.Sql;
import galerie.dao.PersonneRepository;

@Log4j2
@DataJpaTest
public class PersonneRepositoryTest {
    @Autowired
    private PersonneRepositoryTest {
    
    @Test
    @Sql("test-data_personne.sql")
    public void onSaitCompterLesEnregistrement(){
        log.info("On compte les enregistrements de la table 'Personne'");
        int combienDansLeJeuDeTest = 1;
        long nombre = personneDAO.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "On doit trouver 1 personne");
    }
}
}
