import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cmd = new Scanner(System.in);

        while (true){

            System.out.println("Ingrese un numero: ");
            int n = cmd.nextInt();
            if(n > 0){
                for(int i=1; i<=n;i++){
                    System.out.println("");
                    for(int j=1;j<=i;j++){
                        System.out.print("#" + " ");
                    }
                }
                for(int i=n-1; i>=1;i--){
                    System.out.println("");
                    for(int j=1;j<=i;j++){
                        System.out.print("#" + " ");
                    }
                }
                {break;}
            }
        }
    }
}