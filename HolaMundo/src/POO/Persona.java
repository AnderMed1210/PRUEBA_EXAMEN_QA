package POO;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int CalcularIMC(){
        double imc = peso/Math.pow(altura,2);
        int respuesta = 0;
        if(imc < 20){
            respuesta = -1;
        }
        if(imc >= 20 && imc <=25){
            respuesta = 0;
        }
        if(imc > 25){
            respuesta = 1;
        }
        return respuesta;
    }

    public boolean esMayorDeEdad() {
        if(edad < 18){
            return false;
        }
        return true;
    }

    public boolean comprobarSexo (String sexo){
        if (sexo.equals("H") || sexo.equals("M")){
            return true;
        }
        return false;
    }

}
