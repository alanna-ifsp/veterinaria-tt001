package controller;

import java.time.LocalDate;
import java.util.List;
import model.Consulta;
import model.dao.ConsultaDAO;

public class ConsultaController {

    ConsultaDAO dao = new ConsultaDAO();
    
    public Consulta buscaPorId(Integer id)
    {
        return dao.buscaPorId(id);
    }
    
    public List<Consulta> buscarTodas()
    {
        return dao.buscarTodas();
    }
    
    public void deletar(Integer id)
    {
        dao.deletar(id);
    }
    
    public Consulta salvar(Consulta consulta)
    {
        return dao.salvar(consulta);
    }
    
    public static void main(String[] args) {
        
        ConsultaController controller = new ConsultaController();
        TratamentoController tratamento = new TratamentoController();
        VeterinarioController vet = new VeterinarioController();
        
        Consulta consulta = new Consulta();
        System.out.println(controller.buscaPorId(1));

        consulta.setTratamento(tratamento.buscaPorId(1));
        consulta.setVeterinario(vet.buscaPorId(37));
        consulta.setDataInicial(LocalDate.now());
        consulta.setDataFinal(null);
        
        controller.salvar(consulta);
    }
}
