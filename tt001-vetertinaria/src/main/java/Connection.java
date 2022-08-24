
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Especie;

public class Connection {

    public static void main(String[] args) {

        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory(
                        "livaria-persistence");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Especie e = new Especie("Vira Lata");
        em.persist(e);

        Especie e1 = em.find(Especie.class, 10);

        System.out.println(e1.getDescricao());

        em.getTransaction().commit();

        em.close();

        emf.close();
    }
}
