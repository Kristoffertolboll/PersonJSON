/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kristoffer
 */
public class Populate {
    
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Personjpa");
        EntityManager em  = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(new Person("Jonas", "Grønbek", "112"));
        em.getTransaction().commit();
        em.close();
        
    }
    
}
