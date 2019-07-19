
package main;
import java.util.*;
public class Piso extends Inmueble{
    ArrayList<Oficina> oficinas;
    public Piso(String barrio, int estrato, String arriendo, int area) {
        super(barrio, estrato, arriendo, area);
        this.oficinas=new ArrayList<>();
    }

    boolean addOficinas(Oficina oficina){
    return oficinas.add(oficina);    
    }
    
    @Override
    public void darInformacion() {
        System.out.println("Barrio: "+barrio+" Estrato: "+estrato+" Arriendo: "+arriendo+" area: "+area+" número de oficinas: "+oficinas.size());
    }
    
}
