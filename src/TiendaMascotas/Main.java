package TiendaMascotas;

public class Main {
    public static void main(String[] args) {

        Mascota mascota = new Mascota("tobi",12, "negro");
        System.out.println(mascota);

        Perro perro1 = new Perro("tomas", 12, "cafe", 12, false, perroPequeño.chihuahua);
        System.out.println(perro1);

        Perro perro2 = new Perro("john", 8, "blanco", 12, true, perroGrande.doberman);
        System.out.println(perro2);



    }
}
