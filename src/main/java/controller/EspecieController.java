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
        
    public Object [][] buscarEspecies(String descricao)
    {
        List<Especie> listaEspecie = dao.buscarEspecies(descricao);
        Object [][] especies = new Object [listaEspecie.size()][listaEspecie.size()];
        int i = 0;
        for (Especie e : listaEspecie)
        {
            especies[i] = new Object[]{e.getDescricao(),e.getId()};
            i = i+1;
        }
        
        return especies;
        
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
