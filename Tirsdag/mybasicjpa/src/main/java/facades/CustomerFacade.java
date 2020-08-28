/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.Customer;

/**
 *
 * @author Aliapoulsen
 */
public class CustomerFacade {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        Customer cus = new Customer("Hansen", "Lykkevej 11");
        em.getTransaction().begin();
        em.persist(cus);
        em.getTransaction().commit();

    }
}
