import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // Adivinar numero aleatorio
        int numeroAleatorio = r.nextInt(100) + 1;
        int numero = 0;
        while(numero != numeroAleatorio){
            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();
            if(numero < numeroAleatorio){
                System.out.println("El numero ingresado es menor");
            }else {
                System.out.println("El numero ingresado es mayor");
            }

        }
        System.out.println("Listo el numero era "+numeroAleatorio);

    }
}