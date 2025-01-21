package TiendaMascotas;

public class Mascota {

    private String nombre;
    private int edad;
    private String color;

    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
