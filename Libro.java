package App;

public class Libro {
    public String titulo;
    public String autor;
    public int anio;

    public  Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public  void mostrarInformacion(){
        System.out.println("El libro llamado: " + titulo + " del autor " + autor + " fue publicado en el año " + anio);
    }
}
