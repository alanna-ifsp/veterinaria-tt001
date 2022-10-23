package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import model.Especie;

public class EspecieDAO  {

    EntityManager em = DAO.conexao();
    
    CriteriaBuilder builder = em.getCriteriaBuilder();
    CriteriaQuery <Especie> query = builder.createQuery(Especie.class);
    Root<Especie> especies = query.from(Especie.class);
    
    public List<Especie> buscarEspecies(String descricao)
    {
       List<Especie> listEspecies;
      Predicate condicao = builder.like(especies.get("descricao").as(String.class), "%"+descricao+"%");
       
       if(descricao != null && !descricao.isEmpty())
        query.select(especies).where(condicao);
       else
           query.select(especies);
       
       TypedQuery <Especie> tq = em.createQuery(query);
       listEspecies = tq.getResultList();
        
        return listEspecies;
    }
    
    public Especie buscaEspecie(Integer id)
    {
        return em.find(Especie.class, id);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public Especie cadastrarEspecie(Especie especie) {
        Especie especieCadastrada;
        em.getTransaction().begin();
        especieCadastrada = em.merge(especie);
        em.flush();
        em.getTransaction().commit();
        
        return especieCadastrada;
        
    }
     
    @Transactional(Transactional.TxType.REQUIRED)
    public void excluirEspecie(Integer id)
    {
        em.getTransaction().begin();
        em.remove(buscaEspecie(id));
        em.getTransaction().commit();
    }
    
}
