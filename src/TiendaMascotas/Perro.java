package TiendaMascotas;

public class Perro extends Mascota{

    private double peso;
    private boolean muerde;
    private perroGrande perroGrande;
    private perroPequeño perroPequeño;

    public Perro(String nombre, String edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
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
}
