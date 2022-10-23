/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import model.Cliente;

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
