package encapsulamiento;
public class Camion extends Vehiculo {
    private int capCarga;
      
    public Camion(String marca, String modelo, int año, String color, int capCarga){
        super(marca, modelo, año, color);
        this.capCarga = capCarga;
    }
        
    public int getCapCarga(){
        return capCarga;
    }
    public void setCapCarga(int capCarga){
        this.capCarga = capCarga;
    }
        
    public void mostrarDatos(){
        System.out.println("---Camión---" + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() +
                           "\n Año: "+ getAño() + "\n Color: " + getColor() +
                           "\n Carga maxima: " + capCarga + " kg");
    }
}
