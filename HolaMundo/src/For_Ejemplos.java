import java.util.Scanner;

public class For_Ejemplos {
    public static void main(String[] args) {
        int n = 10;
        // INFO NUEVO DESDE EDITOR WEB
        int m = 5, t =4;
        //
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese numero de n: ");
        n = in.nextInt();

        System.out.println("----------------------------");

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("----------------------------");

        for (int i = 0; i < n; i++){
            for (int j = n - i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("----------------------------");

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.print(" ");
            for (int j = n+1-i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println("");
        }

        System.out.println("----------------------------");

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.print(" ");
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("----------------------------");

    }
}
