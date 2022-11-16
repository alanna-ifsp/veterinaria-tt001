package controller;

import java.util.List;
import model.Exame;
import model.dao.ExameDAO;

public class ExameController {
 
    ExameDAO dao = new ExameDAO();
    
    public Exame buscarPorId(Integer id)
    {
        return dao.buscarPorId(id);
    }
    
    public List<Exame> buscarTodos()
    {
        return dao.buscarTodos();
    }
    
    public void deletar(Integer id)
    {
        dao.deletar(id);
    }
    
    public Exame salvar (Exame exame)
    {
        return dao.salvar(exame);
    }
    
    public static void main(String[] args) {
        ExameController c = new ExameController();
        TratamentoController t = new TratamentoController();
        
        Exame exame = new Exame();
        exame.setDescricao("Exame de Urina");
        exame.setTratamento(t.buscaPorId(12));
        
        exame = c.salvar(exame);
        
        System.out.println(c.buscarPorId(exame.getId()));
        
        c.deletar(1);
    }
}
