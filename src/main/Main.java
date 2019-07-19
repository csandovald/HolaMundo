
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws FileNotFoundException {
    Empresa empresa=new Empresa();
    Scanner out=new Scanner(new File("inmuebles.txt"));
    String numerolocales=null,barrio=null,arriendo=null,tipoInmueble=null,estrato=null,area=null,propietario=null,tipoficina=null,tipolocal=null,viaprincipal=null,descripcion=null,numeroficinas=null,numeropisos=null;
    while(out.hasNext()){
      propietario=out.next();
      tipoInmueble=out.next();
      barrio=out.next();
      estrato=out.next();
      arriendo=out.next();
      area=out.next();
      Edificio edificio=new Edificio(barrio,Integer.parseInt(estrato),arriendo,Integer.parseInt(area),propietario);
      empresa.addInmueble(edificio);
      
      if(tipoInmueble.equals("Piso")){
      numeropisos=out.next();
      for(int j=1;j<=Integer.parseInt(numeropisos);j++){
      numeroficinas=out.next();
      Piso piso=new Piso(barrio,Integer.parseInt(estrato),arriendo,Integer.parseInt(area));
      edificio.addPiso(piso);
      empresa.addInmueble(piso);
      for(int i=1;i<=Integer.parseInt(numeroficinas);i++){
      tipoficina=out.next();
      Oficina oficina=new Oficina(tipoficina);
      piso.addOficinas(oficina);
      }
      }
      }
      
      if(tipoInmueble.equals("Local")){
      numerolocales=out.next();
      for(int z=1;z<=Integer.parseInt(numerolocales);z++){
      tipolocal=out.next();
      Local local=new Local(barrio,Integer.parseInt(estrato),arriendo,Integer.parseInt(area));
      edificio.addLocal(local);
      empresa.addInmueble(local);
      if(tipolocal.equals("Comercial")){
      viaprincipal=out.next();
      descripcion=out.next();
      Comercial comercial=new Comercial(Boolean.getBoolean(viaprincipal),descripcion);
      local.addComercial(comercial);
      }
      if(tipolocal.equals("Oficina")){
       viaprincipal=out.next();
       descripcion=out.next();
       Oficina oficina=new Oficina(viaprincipal);
       local.addOficina(oficina);
      }
      }
      }
      //Sigue pero no alcance profe :(
    }
    empresa.listarInmuebles();
    /*Para la creación de inmuebles en la primera línea se define el nombre del propietario 
    del edificio, luego el tipo de inmueble si tiene local o pisos, luego los datos del local o piso
    tal como el barrio el estrato y el arriendo, después, se define el número de pisos o locales con
    un número, y si es un piso se define otro número de cúantas oficinas tiene el piso, y de la misma 
    forma con el local pero con oficinas o locales comerciales.
    
    */ 
    }
    
}
