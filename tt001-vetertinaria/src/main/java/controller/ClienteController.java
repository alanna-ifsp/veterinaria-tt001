package controller;

import java.time.LocalDate;
import java.util.List;
import model.Cliente;
import model.dao.ClienteDAO;

public class ClienteController {

    static ClienteDAO dao = new ClienteDAO();

    public Cliente buscaPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public List<Cliente> buscarTodos() {
        return dao.buscarTodos();
    }
    
    public Cliente salvar(Cliente cliente) {
        return dao.salvar(cliente);
    }

    public void deletar(Integer id) {
        dao.deletar(id);
    }

    public static void main(String[] args) {

        ClienteController c = new ClienteController();
        System.out.println(c.buscaPorId(23));
        c.buscarTodos().forEach(e -> {
            System.out.println(e);
        });
        
        Cliente cliente = new Cliente();
        
        cliente.setCpf("8526669852");
        cliente.setAtivo("S");
        cliente.setEmail("teste@teste");
        cliente.setNome("Alanna Teste");
        cliente.setDataNascimento(LocalDate.now());
        
        c.salvar(cliente);
       // c.deletar(24);
    }

}
