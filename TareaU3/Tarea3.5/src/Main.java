import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mostrar los divisores de un numero

        System.out.println("Ingresa el numero: ");
        int numero = sc.nextInt();
        String resultado = "";
        int contador = numero;
        int divisor = 0;
        while(contador > 0){
            if (numero % contador == 0) {
                resultado = resultado + contador+", ";
                divisor++;
            }
            contador--;

        }
        if (divisor == 2){
            System.out.println("El numero "+numero+" es primo");
        }else {
            System.out.println("Los divisores son "+resultado);
        }

    }
}