class Profesor{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoBasico20;
    private double sueldoTotal;
    private String cedula;

    public Profesor() {}

    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public double getSueldoBasico20() {
        return sueldoBasico20;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void  CalcularSueldoBasico20() {
        this.sueldoBasico20 = (this.sueldoBasico*20)/100;
    }
    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico+sueldoBasico20;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido=" + apellido +
                ", sueldoBasico=" + sueldoBasico +
                ", cedula" + cedula +
                ", sueldoBasico20=" + sueldoBasico20 +
                ", sueldoTotal=" + sueldoTotal +
                '}';
    }
}

public class ejecutor{

    public static void main(String[] args) {

        Profesor profesor1 =new Profesor("Andres","Cartuche",800,"1163643773");
        profesor1.calcularSueldoTotal();
        profesor1.CalcularSueldoBasico20();
        System.out.println(profesor1);
    }
}