package model.dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import model.Consulta;

public class ConsultaDAO {
   
    EntityManager em = DAO.conexao();
    
    public Consulta buscaPorId(Integer id)
    {
        return em.find(Consulta.class, id);
    }
    
    public List<Consulta> buscarTodas()
    {
        return em.createQuery("SELECT c from Consulta c").getResultList();
    }
    
    @Transactional(Transactional.TxType.REQUIRED)
    public void deletar (Integer id)
    {
        em.getTransaction().begin();
        em.remove(buscaPorId(id));
        em.flush();
        em.getTransaction().commit();
    }

    public Consulta salvar(Consulta consulta)
    {
        Consulta consultaCadastrada;
        em.getTransaction().begin();
        consultaCadastrada = em.merge(consulta);
        em.flush();
        em.getTransaction().commit();
       
        return consultaCadastrada;
        
    }
    
    

           
}
