package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Exame;

public class ExameDAO {
    
    EntityManager em = DAO.conexao();
    
    public Exame buscarPorId(Integer id)
    {
        return em.find(Exame.class, id);
    }
    
    public List<Exame> buscarTodos()
    {
        return em.createQuery("SELECT e FROM Exame e").getResultList();
    }
    
    public void deletar(Integer id)
    {
        em.getTransaction().begin();
        em.remove(buscarPorId(id));
        em.flush();
        em.getTransaction().commit();
    }
    
    public Exame salvar(Exame exame)
    {
        Exame exameCadastrado;
        em.getTransaction().begin();
        exameCadastrado = em.merge(exame);
        em.flush();
        em.getTransaction().commit();
        
        return exameCadastrado;
    }
    
}
