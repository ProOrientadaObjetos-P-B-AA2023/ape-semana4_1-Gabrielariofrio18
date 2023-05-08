class Cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    public Cheque() {}
    public Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getNombreBanco() {
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    public double getValorCheque() {
        return valorCheque;
    }
    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    public void calcularComision (){
        this.comision=valorCheque*0.003;
    }
    public double getComision (){
        return comision;
    }
    @Override
    public String toString() {
        return "Cheque{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", nombreBanco='" + nombreBanco + '\'' +
                ", valorCheque=" + valorCheque +
                ", comision=" + comision +
                '}';
    }
}
public class Ejercicio4 {
    public static void main(String[] args) {
        Cheque cheque1=new Cheque("Luis Valarezo","Banco Pichincha",1000);
        cheque1.calcularComision();
        System.out.println(cheque1);
    }
}

