package App;

public class LibroDigital extends Libro {
    public String formato;
    public double tamanioMB;

    LibroDigital(String titulo, String autor, int anio, String formato, double tamanioMB){
        super(titulo, autor, anio);

        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    public void mostrarInfo(){
        System.out.println("Esta en formato " + formato + " y pesa " + tamanioMB + " MB");
    }
}
