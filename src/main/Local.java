
package main;
import java.util.*;
public class Local extends Inmueble{
    ArrayList<Oficina> oficinas;    
    ArrayList<Comercial> comerciales;
    public Local(String barrio, int estrato, String arriendo, int area) {
        super(barrio, estrato, arriendo, area);
        this.oficinas=new ArrayList<>();
        this.comerciales=new ArrayList<>();
    }
     
     
   public boolean addOficina(Oficina oficina){
       return oficinas.add(oficina);
   }
   
   public boolean addComercial(Comercial comercial){
       return comerciales.add(comercial);
   }
    
    @Override
    public void darInformacion() {
        for(Oficina oficina:oficinas){
        System.out.println("Barrio: "+barrio+" Estrato: "+estrato+" Arriendo: "+arriendo+" area: "+area+" tipo oficina: "+oficina.getTipoOficina());
        }
        
        for(Comercial comercial:comerciales){
        System.out.println("Barrio: "+barrio+" Estrato: "+estrato+" Arriendo: "+arriendo+" area: "+area+" tipo local comercial: "+comercial.toString());
        }
    }
    
}
