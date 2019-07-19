
package main;

import java.util.*;
public class Edificio extends Inmueble{
    ArrayList<Piso> pisos;
    ArrayList<Local> locales;
    String propietario;

    public Edificio(String barrio, int estrato, String arriendo, int area,String propietarios) {
        super(barrio, estrato, arriendo, area);
        this.propietario= propietarios;
        this.pisos=new ArrayList<>();
        this.locales=new ArrayList<>();
    }

    
    public boolean addPiso(Piso piso){
        return pisos.add(piso);
    }
    
    public boolean addLocal(Local local){
        return locales.add(local);
    }

    
    @Override
    public void darInformacion() {
        System.out.println("Barrio: "+barrio+" número de pisos: "+pisos.size()+" número de locales: "+locales.size()+" Propietario: "+this.propietario);
    }
    
}
