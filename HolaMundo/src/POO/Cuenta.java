package POO;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if(cantidad < 0){
            System.out.println("No se puede realizar un ingreso negativo");
        }
        else {
            System.out.println("Depositando..........");
            setCantidad(cantidad);
            System.out.println("Tu saldo actual es: " + getCantidad());
        }
    }

    public void retirar(double cantidad){
        if(getCantidad() - cantidad < 0){
            System.out.println("Saldo no suficiente para poder retirar");
        }
        else {
            System.out.println("Retirando..........");
            setCantidad(getCantidad()-cantidad);
            System.out.println("Tu saldo actual es: " + getCantidad());
        }
    }

}
