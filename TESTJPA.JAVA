package DE.DepEmployeJPA; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestJPA {
    public static void main(String[] args) {
        // Initializes the Entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employePU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        // Creates a new object and persists it
        Employe employe = new Employe();
        employe.setNom("Nour");
        employe.setSalaire(5000);
        tx.begin();
        em.persist(employe);
        tx.commit();

        em.close();
        emf.close();
    }
}
