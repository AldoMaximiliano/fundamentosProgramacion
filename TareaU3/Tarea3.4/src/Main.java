import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();

        String esPrimo = " es primo";
        int contador = numero - 1;
        while(contador > 1){
            if (numero % contador == 0) {
                esPrimo = "no es primo";
            }
            contador--;
        }
        System.out.println("El numero "+numero+" "+esPrimo);
    }
}

