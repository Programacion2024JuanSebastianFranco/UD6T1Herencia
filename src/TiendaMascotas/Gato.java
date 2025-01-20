package TiendaMascotas;

public class Gato extends Mascota{

    private double alturaSalto;
    private double longitudSalto;
    private gatoConPelo gatoConPelo;
    private gatoSinPelo gatoSinPelo;

    public Gato(String nombre, String edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
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

}
