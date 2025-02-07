package Tarea1;

public class Video {
    private String titulo;
    private int minutos;

    public Video(String titulo, int minutos) {
        this.titulo = titulo;
        this.minutos = minutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Tarea1.Video{" +
                "titulo='" + titulo + '\'' +
                ", minutos=" + minutos +
                '}';
    }
}
