package controller;

import java.time.LocalDate;
import java.util.List;
import model.Tratamento;
import model.dao.TratamentoDAO;
import controller.AnimalController;

public class TratamentoController {

    TratamentoDAO dao = new TratamentoDAO();
    
    public Tratamento buscaPorId(Integer id)
    {
        return dao.buscaPorId(id);
    }
    
    public List<Tratamento> buscarTodos()
    {
        return dao.buscarTodos();
    }
    
    public void deletar(Integer id)
    {
        dao.deletar(id);
    }
    
    public Tratamento salvar (Tratamento tratamento)
    {
        return dao.salvar(tratamento);
    }
    
    public static void main(String[] args) {
        
        TratamentoController controller = new TratamentoController();
        AnimalController animalController = new AnimalController();
        System.out.println(controller.buscaPorId(1));
        
        controller.buscarTodos().forEach(e->{System.out.println(e);});
        
        Tratamento tratamento = new Tratamento();
        
        tratamento.setSintomas("Dores abdominais");
        tratamento.setDescricao("Internação");
        tratamento.setDataHoraInicial(LocalDate.now());
        tratamento.setDataHoraFinal(null);
        tratamento.setAnimal(animalController.buscarPorId(2));
        
        tratamento = controller.salvar(tratamento);
        
        System.out.println(tratamento);
        
        controller.deletar(tratamento.getId());
        
    }
}
