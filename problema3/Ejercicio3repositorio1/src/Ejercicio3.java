class Automotor {
    private String cedulaDueño;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    public Automotor() {}
    public Automotor(String cedulaDueño, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDueño=cedulaDueño;
        this.marcaVehiculo=marcaVehiculo;
        this.anioFabricacion=anioFabricacion;
        this.valorVehiculo=valorVehiculo;
    }
    public String getCedulaDueño() {
        return cedulaDueño;
    }
    public void setCedulaDueño(String cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }
    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }
    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public double getValorVehiculo() {
        return valorVehiculo;
    }
    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    public double getValorMatricula(){
        return valorMatricula;
    }
    public void calcularValor_Matricula(){
        int antiguedad= 2023-this.anioFabricacion;
        this.valorMatricula=(0.002*this.valorVehiculo*antiguedad);
    }
    @Override
    public String toString() {
        return "Automotor{" +
                "cedulaDueño='" + cedulaDueño + '\'' +
                ", marcaVehiculo='" + marcaVehiculo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", valorVehiculo=" + valorVehiculo +
                ", valorMatricula=" + valorMatricula + '}';
    }
}
public class Ejercicio3 {
    public static void main(String[] args) {
        Automotor automotor1=new Automotor("1127363472","Chevrolet",2010,10000);
        automotor1.calcularValor_Matricula();
        System.out.println(automotor1);
    }
}