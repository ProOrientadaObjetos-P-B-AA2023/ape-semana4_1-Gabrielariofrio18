class Profesor{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    public Profesor(){}
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
    public void calcularSueldoTotal(){
        this.sueldoTotal=sueldoBasico+(this.sueldoBasico*0.20);
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
    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", sueldoTotal=" + sueldoTotal +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Profesor profesor= new Profesor("Gabriela","Riofrio Garcia",8000,"1107896010");
        profesor.calcularSueldoTotal();
        System.out.println(profesor);
    }
}