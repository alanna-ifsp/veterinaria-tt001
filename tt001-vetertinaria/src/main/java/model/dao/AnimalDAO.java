package model.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Animal;

public class AnimalDAO {

    EntityManager em = DAO.conexao();

    public List<Animal> buscaAnimais(String nome, Integer idade, String sexo) {
        List<Animal> animais = new ArrayList();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Animal> criteria = builder.createQuery(Animal.class);
        Root<Animal> query = criteria.from(Animal.class);

        TypedQuery<Animal> q = em.createQuery(criteria);
        animais = q.getResultList();

        return animais;
    }

    public List<Animal> buscarTodos() {
        return em.createQuery("SELECT a FROM Animal a").getResultList();
    }

    public Animal buscaAnimal(Integer id) {
        return em.find(Animal.class, id);
    }

    public void salvarAnimal(Animal animal) {
        em.getTransaction().begin();
        em.merge(animal);
        em.getTransaction().commit();
    }

    public void removerAnimal(Integer id) {
        em.getTransaction().begin();
        em.remove(buscaAnimal(id));
        em.getTransaction().commit();
    }

}
