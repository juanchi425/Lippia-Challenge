package api.model;

import java.util.List;

public class DptoResponse {

    private List<Departamento> departaments;
    private List<OtraCategoria> landings;

    private OtraCategoria more_categories;
    private List<OtraCategoria> high_priority;


    //getters
    public List<Departamento> getDepartaments(){
        return departaments;
    }

    public List<OtraCategoria> getLandings(){
        return landings;
    }

    public OtraCategoria getMoreCategoria(){
        return more_categories;
    }
    public List<OtraCategoria> getHighPriority(){
        return high_priority;
    }

    //Setters
    public void setDepartamentos(List<Departamento> departaments){
        this.departaments= departaments;
    }

    public void setLandings(List<OtraCategoria> landings){
        this.landings= landings;
    }

    public void setLandings(OtraCategoria more_categories){
        this.more_categories= more_categories;
    }

    public void setHighPriority(List<OtraCategoria> high_priority){
        this.high_priority= high_priority;
    }
}

