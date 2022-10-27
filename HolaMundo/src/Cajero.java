import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {

        Scanner cmd = new Scanner(System.in);

        String sClaveIngresada;
        String sClaveSistema = "123456";
        boolean bClaveCorrecta = false;
        int intentos = 3;

        while(true) {
            if(intentos>0){
                System.out.println("Ingresa la clave: ");
                sClaveIngresada = cmd.nextLine();
                intentos--;

                if (sClaveIngresada.equals(sClaveSistema)) {
                    bClaveCorrecta = true;
                }
                if (bClaveCorrecta) {
                    System.out.println("Clave OK");
                    System.out.println("Bienvenido.............");
                    {break;}
                } else {
                    System.out.println("Clave Invalida, te quedan " + intentos + " intentos");
                }
            }
            else{
                System.out.println("La Tarjeta fue Bloqueada.............");
                {break;}
            }
        }

    }

}
