/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import model.Cliente;
import model.Especie;

public class ClienteDAO{
 
    EntityManager em = DAO.conexao();
    
    public Cliente buscarCliente (String nome, String cpf, Boolean ativo){
        
        return null;
    }
    
    public  Cliente buscarPorId(Integer id)
    {
        Cliente cliente;
        cliente = em.find(Cliente.class, id);
        return cliente; 
    }
    
    public List<Cliente> buscarTodos()
    {
       return em.createQuery("Select c FROM Cliente c").getResultList();
    }
    
    public List<Cliente> buscarPorFiltro(Cliente cliente)
    {
       CriteriaBuilder builder = em.getCriteriaBuilder();
       CriteriaQuery <Cliente> query = builder.createQuery(Cliente.class);
       Root<Cliente> clientes = query.from(Cliente.class);
       List<Cliente> listCliente;
    
       if(cliente.getNome() != null && !cliente.getNome().isEmpty())
       {
       Predicate condicao = builder.like(clientes.get("nome").as(String.class), "%"+cliente.getNome()+"%");
       query.select(clientes).where(condicao);
       }
       
       else
           query.select(clientes);
       
       TypedQuery <Cliente> tq = em.createQuery(query);
       listCliente = tq.getResultList();
       return listCliente;
    }
    
    @Transactional(Transactional.TxType.REQUIRED)
    public Cliente salvar(Cliente cliente)
    {
        Cliente clienteCadastrado;
        em.getTransaction().begin();
        clienteCadastrado = em.merge(cliente);
        em.flush();
        em.getTransaction().commit();
        return clienteCadastrado; 
    }
    
    @Transactional(Transactional.TxType.REQUIRED)
    public void deletar(Integer id)
    {       
       em.getTransaction().begin();
       em.remove(buscarPorId(id));
       em.getTransaction().commit();
    }
    
}
