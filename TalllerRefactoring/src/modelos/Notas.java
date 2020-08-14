
public class Notas {
  private double nDeberes;
  private double nTalleres;
  private double nLecciones;
  private double nExamen;
  private static pTeorico=0.80;
  private static pPractico=0.20;
  public double nPrimerParcial;
  public double nSegundoParcial;
  public double notaTotal;
  private Estudiante est;

  public Notas() {
    nDeberes=0;
    nTalleres=0;
    nLecciones=0;
    nExamen=0;
  }

  public void setDeberes(nDeberes) {
    this.nDeberes=nDeberes;
  }
  public void setTalleres(nTalleres) {
    this.nTalleres=nTalleres;
  }
  public void setLecciones(nLecciones) {
    this.nLecciones=nLecciones;
  }
  public void setExamen(nExamen) {
    this.nExamen=nExamen;
  }

  public double getDeberes() {
    return nDeberes;
  }
  public double getTalleres() {
    return nTalleres;
  }
  public double getLecciones() {
    return nLecciones;
  }
  public doible getExamen() {
    return nExamen;
  }

  public double CalcularNotaTotal(){
      return (nPrimerParcial+nSegundoParcial)/2;
  }

  public double calcularPromedio()) {
    double nota = ((this.nexamen+this.ndeberes+this.nlecciones)*pTeorico)+((this.ntalleres)*pPractico);
    return nota;
  }
}
