package api.model;
import java.util.List;
public class Departamento {
    private String name;
    private List<Categoria> categorias;


    //getters
    public String getName(){
        return name;
    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public List<Categoria> getCategorias(){
        return categorias;
    }
    public void setCategorias(List<Categoria> categorias){
        this.categorias= categorias;
    }

}
