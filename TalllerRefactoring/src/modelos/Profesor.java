package modelos;

import java.util.ArrayList;
import modelos.Persona.Persona;

public class Profesor extends Persona{
    public String codigo;
    public Persona persona;
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, Persona persona) {
        this.codigo = codigo;
        this.persona = persona;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
     public double calcularSueldo(){
        double sueldo=0;
        sueldo = info.getAñosdeTrabajo()*600 + info.getBonoFijo();
        return sueldo;
    }  
}
