package TiendaMascotas;

public class Gato extends Mascota{

    private double alturaSalto;
    private double longitudSalto;
    private gatoConPelo gatoConPelo;
    private gatoSinPelo gatoSinPelo;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto, TiendaMascotas.gatoConPelo gatoConPelo) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
        this.gatoConPelo = gatoConPelo;
    }

    public Gato(String nombre, int edad, String color, TiendaMascotas.gatoSinPelo gatoSinPelo, double longitudSalto, double alturaSalto) {
        super(nombre, edad, color);
        this.gatoSinPelo = gatoSinPelo;
        this.longitudSalto = longitudSalto;
        this.alturaSalto = alturaSalto;
    }

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(double longitudSalto) {
        this.longitudSalto = longitudSalto;
    }

    public static void setSonido() {
        System.out.println("Los gatos maullan y ronronean");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "alturaSalto=" + alturaSalto +
                ", longitudSalto=" + longitudSalto +
                ", gatoConPelo=" + gatoConPelo +
                ", gatoSinPelo=" + gatoSinPelo +
                '}';
    }
}
