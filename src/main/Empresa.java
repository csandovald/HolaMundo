
package main;

import java.util.*;
public class Empresa {
    ArrayList<Inmueble> inmuebles;

    public Empresa() {
        this.inmuebles=new ArrayList<>();
    }
    
    public boolean addInmueble(Inmueble inmueble){
        return inmuebles.add(inmueble);
    }
    
    public boolean borrarInmueble(Inmueble inmueble){
        return inmuebles.remove(inmueble);
    }
    
    public void listarInmuebles(){
        System.out.println("Los edificions registrados son: ");
        for(Inmueble inmueble:inmuebles){
            if(inmueble instanceof Edificio){
                inmueble.darInformacion();
            }
        }
        System.out.println("");
        
        System.out.println("Los pisos registrados son: ");
        for(Inmueble inmueble:inmuebles){
            if(inmueble instanceof Piso){
                inmueble.darInformacion();
            }
        }
        System.out.println("");
        
        System.out.println("Los locales registrados son: ");
        for(Inmueble inmueble:inmuebles){
            if(inmueble instanceof Local){
                inmueble.darInformacion();
            }
        }
        System.out.println("");
    }
}
