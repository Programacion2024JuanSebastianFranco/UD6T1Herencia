public class Main {
    public static void main(String[] args) {
        Video ob1 = new Video("VHS", 90);
        Pelicula ob2 = new Pelicula("ET", 120, "Spilberg", 10);

        System.out.printf(ob1.toString());
        System.out.printf(ob2.toString());

    }
}
