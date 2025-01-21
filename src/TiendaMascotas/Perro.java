package TiendaMascotas;

public class Perro extends Mascota{

    private double peso;
    private boolean muerde;
    private perroGrande perroGrande;
    private perroPequeño perroPequeño;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde, TiendaMascotas.perroGrande perroGrande) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
        this.perroGrande = perroGrande;
    }

    public Perro(String nombre, int edad, String color, double peso, boolean muerde, TiendaMascotas.perroPequeño perroPequeño) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
        this.perroPequeño = perroPequeño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "peso=" + peso +
                ", muerde=" + muerde +
                ", perroGrande=" + perroGrande +
                ", perroPequeño=" + perroPequeño +
                '}';
    }

}
