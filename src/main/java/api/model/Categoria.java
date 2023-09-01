package api.model;



import java.util.List;

public class Categoria {
    private String id;
    private String name;
    private String permalink;
    private List<ChildCategoria> children_Categorias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public List<ChildCategoria> getChildren_Categorias() {
        return children_Categorias;
    }

    public void setChildrenCategorias(List<ChildCategoria> children_Categorias) {
        this.children_Categorias = children_Categorias;
    }
}

