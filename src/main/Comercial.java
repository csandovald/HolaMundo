
package main;


public class Comercial {
    private boolean viaprincipal;
    private String descripcion;

    public Comercial(boolean viaprincipal,String descripcion) {
        this.viaprincipal = viaprincipal;
        this.descripcion = descripcion;
    }
    
    public String toString(){
        return this.descripcion;
    }

}
