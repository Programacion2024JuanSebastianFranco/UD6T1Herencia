public class Pelicula extends Video{

    private String director;
    private int Valoracion;

    public Pelicula(String titulo, int minutos, String director, int valoracion) {
        super(titulo, minutos);
        this.director = director;
        Valoracion = valoracion;
    }
}
