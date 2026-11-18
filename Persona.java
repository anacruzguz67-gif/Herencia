package App;

public class Persona {
    public String nombre;
    public int edad;
    public String sexo;

    public Persona (String nombre, int edad, String sexo){
        this.nombre= nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void Saludar() {
    System.out.println("Nombre: " + nombre + "\n"+  "Años: " + edad  + "\n"+  "Sexo:  " + sexo );
    }
}
