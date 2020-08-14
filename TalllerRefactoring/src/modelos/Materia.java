package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;

    public Materia(String codigo, String nombre, String facultad) {
      this.codigo=codigo;
      this.nombre=nombre;
      this.facultad=facultad;
    }

    public String getCodigo() {
      return this.codigo;
    }
    public String getNombre() {
      return this.nombre;
    }
    public String getFacultad() {
      return this.facultad;
    }

    public void setCodigo(String codigo) {
      this.codigo=codigo;
    }
    public void setNombre(String nombre) {
      this.nombre=nombre;
    }
    public void setFacultad(String facultad) {
      this.facultad=facultad;
    }

}
