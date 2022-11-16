package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Tratamento;

public class TratamentoDAO {

    EntityManager em = DAO.conexao();
    
    public Tratamento buscaPorId(Integer id)
    {
        return em.find(Tratamento.class, id);
    }
    
    public List<Tratamento> buscarTodos()
    {
        return em.createQuery("SELECT t from Tratamento t").getResultList();
    }
    
    public void deletar(Integer id)
    {
        em.getTransaction().begin();
        em.remove(buscaPorId(id));
        em.getTransaction().commit();
    }
    
    public Tratamento salvar(Tratamento tratamento)
    {
        Tratamento tratamentoCadastrado;
        em.getTransaction().begin();
        tratamentoCadastrado = em.merge(tratamento);
        em.flush();
        em.getTransaction().commit();
        
        return tratamentoCadastrado;
    }
}
