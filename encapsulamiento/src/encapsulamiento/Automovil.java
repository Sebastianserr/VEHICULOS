package encapsulamiento;
public class Automovil extends Vehiculo{
    private int numPuertas;
    private int capPasajeros;
    private String tipoCombustible;
        
    public Automovil(String marca, String modelo, int año, String color, 
                     int numPuertas, String tipoCombustible, int capPasajeros){
        super(marca, modelo, año, color);
        this.tipoCombustible = tipoCombustible;
        this.numPuertas = numPuertas;
        this.capPasajeros = capPasajeros;
    }
    public int getNumPuertas(){
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas = numPuertas;
    }

    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
    public int getCapPasajeros(){
        return capPasajeros;
    }
    public void setCapPasajeros(int capPasajeros){
        this.capPasajeros = capPasajeros;
    }
}
