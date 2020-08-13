package modelos;

import java.util.ArrayList;
import modelos.Persona.Persona;

public class Profesor{
    private String codigo;
    private Persona persona;
    private InformacionAdicionalProfesor info;
    private ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, Persona persona) {
        this.codigo = codigo;
        this.persona = persona;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    public void setinfo(InformacionAdicionalProfesor info) {
        this.info = info;
    }
}
