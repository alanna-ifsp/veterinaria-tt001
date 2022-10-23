package controller;
 
import java.util.List;
import model.Veterinario;
import model.dao.VeterinarioDAO;

public class VeterinarioController {

    VeterinarioDAO dao = new VeterinarioDAO();
    
    public Veterinario buscaPorId(Integer id)
    {
        return dao.buscarPorId(id);
    }
    
    public List<Veterinario> buscarTodos()
    {
        return dao.buscarTodos();
    }
    
    public void deletar(Integer id)
    {
        dao.deletar(id);
    }
    
    public Veterinario salvar (Veterinario veterinario)
    {
        return dao.salvar(veterinario);
    }  
    
    public static void main(String[] args) {
        
        VeterinarioController controller = new VeterinarioController();
        
        System.out.println(controller.buscaPorId(1));
        controller.buscarTodos().forEach(e->{System.out.println(e);});
        Veterinario vet = new Veterinario();
        
        vet.setCpf("852111");
        vet.setCrmv("8888888");
        vet.setNome("Alanna");
        vet.setTelefone("119452522");
        
        vet = controller.salvar(vet);
        
        vet.setNome("Nome alterado");
        System.out.println(vet);
        controller.salvar(vet);
               
        controller.deletar(32);
        
    }
    
}
