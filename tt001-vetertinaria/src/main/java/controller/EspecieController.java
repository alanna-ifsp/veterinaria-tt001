package controller;

import java.util.List;
import model.Especie;
import model.dao.EspecieDAO;

public class EspecieController {
    
    EspecieDAO dao = new EspecieDAO();
    
    public Especie buscarEspecie(Integer id)
    {
        return dao.buscaEspecie(id);
    }
        
    public List<Especie> buscarEspecies(String descricao)
    {
        return dao.buscarEspecies(descricao);
    }

    public void mergeEspecie(Especie especie)
    {
        dao.cadastrarEspecie(especie);
    }
    
    public void deletaEspecie(Integer id)
    {
        dao.excluirEspecie(id);
    }
    
}
