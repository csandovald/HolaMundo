
package main;


public class Persona {
    private String nombre;
    private String dni;
    private String edad;
    private String sexo;

    public Persona(String nombre, String dni, String edad, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
    
}
