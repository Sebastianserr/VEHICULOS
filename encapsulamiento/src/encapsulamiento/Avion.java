package encapsulamiento;
public class Avion extends Vehiculo{
    private int capPasajeros;
    private String tipoMotor;
        
    public Avion(String marca, String modelo, int año, String color, int capPasajeros, String tipoMotor){
        super(marca, modelo, año, color);
        this.tipoMotor = tipoMotor;
        this.capPasajeros = capPasajeros;
    }
       
    public int getCapPasajeros(){
        return capPasajeros;
    }
    public void setCapPasajeros(int capPasajeros){
        this.capPasajeros = capPasajeros;
    }
    public String getTipoMotor(){
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor){
        this.tipoMotor = tipoMotor;
    }
    public void mostrarDatos(){
        System.out.println("---Avion---" + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() +
                           "\n Año: "+ getAño() + "\n Color: " + getColor() +
                           "\n Capacidad de pasajeros: " + capPasajeros + "\n Tipo de motor: " + tipoMotor);
    }
}
