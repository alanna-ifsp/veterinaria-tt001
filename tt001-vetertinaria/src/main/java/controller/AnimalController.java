package controller;
import java.util.List;
import model.Animal;
import model.Especie;
import model.dao.AnimalDAO;
import model.dao.ClienteDAO;
import model.dao.EspecieDAO;

public class AnimalController {
    
    AnimalDAO animalDAO = new AnimalDAO();

    
    public List<Animal> buscarTodos()
    {
        return animalDAO.buscarTodos();
    }
    
    public Animal buscarPorId(Integer id)
    {
        return animalDAO.buscaAnimal(id);
    }
    
    public void deletar(Integer id)
    {
        animalDAO.removerAnimal(id);
    }
   
    public void cadastrarAnimal(Animal animal)
    {
        animalDAO.salvarAnimal(animal);   
    }    
    
    public static void main(String[] args) {
        
        AnimalController controller = new AnimalController();
        EspecieDAO especieDao = new EspecieDAO();
        ClienteDAO clienteDao = new ClienteDAO();
        Especie especie = especieDao.buscarEspecies("Vira").get(0);
        
        Animal animal = new Animal();
        
        animal.setIdade(20);
        animal.setSexo("F");
        animal.setNome("Teste consistencia");
        animal.setEspecie(especie);
        animal.setCliente(clienteDao.buscarPorId(22));
        
        controller.cadastrarAnimal(animal);
                
        System.out.println(controller.buscarPorId(1));
        controller.buscarTodos().forEach(e->{System.out.println(e);});
        controller.deletar(1);
        
    }
    
}
