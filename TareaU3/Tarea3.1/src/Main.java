import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Calcular promedio de una serie de numeros

        System.out.println("Ingresa la cantidad de numeros: ");
        int cantidad = sc.nextInt();
        int contador = 0;
        double total = 0;
        double promedio = 0;
        while(contador < cantidad){
            System.out.println("Ingresa el numero: ");
            total = total + sc.nextDouble();
            contador++;
        }
        promedio = total / cantidad;
        System.out.println("El promedio es: " + promedio);
    }
}