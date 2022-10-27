package POO;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        Persona per = new Persona();
        try {
            System.out.println("Ingrese su nombre: ");
            String nombre = cmd.nextLine();
            System.out.println("Ingrese su SEXO (H / M): ");
            String sexo = cmd.nextLine();
            if (per.comprobarSexo(sexo) == true) {
                System.out.println("Ingrese su edad: ");
                int edad = cmd.nextInt();
                System.out.println("Ingrese su altura: ");
                double altura = cmd.nextDouble();
                System.out.println("Ingrese su peso: ");
                double peso = cmd.nextDouble();
                //
                per.setNombre(nombre);
                per.setEdad(edad);
                per.setSexo(sexo);
                per.setPeso(peso);
                per.setAltura(altura);
                //
                if (per.esMayorDeEdad() == true) {
                    System.out.println("Ud. es mayor de edad");
                } else{ System.out.println("Ud. NO es mayor de edad");}
                int resp = per.CalcularIMC();
                //
                if (resp == -1) {
                    System.out.println("IMC: Por debajo del peso ideal");
                }
                if (resp == 0) {
                    System.out.println("IMC: Peso ideal");
                }
                if (resp == 1) {
                    System.out.println("IMC: Sobrepeso");
                }
            }else {
                System.out.println("Valor no aceptado en el Campo Sexo");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
