package encapsulamiento;

public class MotoAcuatica extends Vehiculo{
    private String tipoCombustible;
    private boolean chorroAgua;
        //
    public MotoAcuatica(String marca, String modelo, int año, String color, String tipoCombustible, boolean chorroAgua){
        super(marca, modelo, año, color);
        this.tipoCombustible = tipoCombustible;
        this.chorroAgua = chorroAgua;
    }
        
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
       
    public boolean getChorroAgua(){
        return chorroAgua;
    }
    public void setChorroAgua(boolean chorroAgua){
        this.chorroAgua = chorroAgua;
    }
    public void mostrarDatos(){
    System.out.println("---Moto Acuática---" + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() +
                           "\n Año: "+ getAño() + "\n Color: " + getColor() +
                           "\n Tipo de combustible: " + tipoCombustible + "\n Chorro de agua: " + (chorroAgua ? "Si" : "No"));
    }
}
