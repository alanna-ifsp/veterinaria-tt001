package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import model.Veterinario;

public class VeterinarioDAO {

    EntityManager em = DAO.conexao();

    public Veterinario buscarPorId(Integer id) {
        return em.find(Veterinario.class, id);
    }

    public List<Veterinario> buscarTodos() {
        return em.createQuery("SELECT p from Veterinario p").getResultList();
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void deletar(Integer id) {
        em.getTransaction().begin();
        em.remove(buscarPorId(id));
        em.getTransaction().commit();
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public Veterinario salvar(Veterinario veterinario) {
        Veterinario veterinarioReturn;
        em.getTransaction().begin();
        veterinarioReturn = em.merge(veterinario);
        em.flush();
        em.getTransaction().commit();
        return veterinarioReturn;
    }

}
