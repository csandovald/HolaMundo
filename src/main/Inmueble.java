
package main;


public abstract class Inmueble {
    protected String barrio;
    protected int estrato;
    protected String arriendo;
    protected int area;

    public Inmueble(String barrio, int estrato, String arriendo, int area) {
        this.barrio = barrio;
        this.estrato = estrato;
        this.arriendo = arriendo;
        this.area = area;
    }

    public String getBarrio() {
        return barrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public String getArriendo() {
        return arriendo;
    }

    public int getArea() {
        return area;
    }
    
    public abstract void darInformacion();
}
