import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Contar pares e impares

        System.out.println("Ingresa la cantidad de numeros: ");
        int cantidad = sc.nextInt();
        int contador = 0;
        int numeroPar = 0;
        int numeroImpar = 0;
        while(contador < cantidad){
            System.out.println("Ingresa el numero");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                numeroPar++;
            }else{
                numeroImpar++;
            }
            contador++;
        }
        System.out.println("Se ingresaror "+numeroPar+" numeros pares");
        System.out.println("Se ingresaror "+numeroImpar+" numeros impares");
    }
}