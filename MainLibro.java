package App;

public class MainLibro {
    public static void main(String[] args) {
        LibroDigital libroDigital = new LibroDigital("Amar es para VALIENTES", "ITIEL ARROYO", 2019, "PDF", 4.5);
        
        libroDigital.mostrarInformacion();
        libroDigital.mostrarInfo();  
    }
    
}
