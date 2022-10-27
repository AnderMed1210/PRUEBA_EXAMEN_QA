package POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int saldo =0;
        Scanner cmd = new Scanner(System.in);
        Cuenta cue = new Cuenta();
        System.out.println("Ingrese Saldo: ");
        saldo = cmd.nextInt();
        //
        cue.ingresar(saldo);
        cue.retirar(500);
        //
        System.out.println(cue.getCantidad());

    }

}
