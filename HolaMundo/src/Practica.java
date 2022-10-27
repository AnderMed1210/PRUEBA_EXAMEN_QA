import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {

        int iClave = 0;
        int iDNIValido = 73881036;
        int iOpcion = 0;
        int iDni = 0;
        int iClaveSistema = 1930;

        Scanner cmd = new Scanner(System.in);

        System.out.println("######## Menu ########");
        System.out.println("Opcion 1: Consultar Saldo");
        System.out.println("Opcion 2: Para Recargar Saldo");
        System.out.println("Opcion 3: Para Iniciar Sesion");
        System.out.println("Opcion 4: Para Salir");
        System.out.println("-----------------------");
        System.out.println("Digite el n° de Opcion a escoger: ");
        //
        iOpcion = cmd.nextInt();

        if(iOpcion == 3){
            System.out.println("Digite su numero de DNI: ");
            iDni = cmd.nextInt();
            if(iDni == iDNIValido){
                System.out.println("Ingrese la clave: ");
                iClave = cmd.nextInt();
                if(iClave == iClaveSistema){
                    System.out.println("Clave Correcta");
                    System.out.println("Bienvenido..........");
                } else{
                    System.out.println("Clave Incorrecta");
                }
            }else {
                System.out.println("El Dni no es valido.....");
            }
        }
        else {
            System.out.println("Servicios en Mantenimientos..........");
        }

    }

}
