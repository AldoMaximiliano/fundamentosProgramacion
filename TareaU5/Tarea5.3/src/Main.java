import java.util.Scanner;

public class Main {

    public static void comprobarPositivos(int[] a){
        System.out.println("Los numeros que son positivos son: ");
        int k = 1;
        for (int numero : a){
            if (numero > 0) {
                System.out.println(k+". "+numero);
                k++;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del arreglo: ");
        int tamaño = sc.nextInt();
        int numeros[] = new int[tamaño];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int j=1;
        System.out.println("Los numeros ingresados fueron: ");
        for (int numero : numeros){

            System.out.println(j+". "+numero);
            j++;
        }
        comprobarPositivos(numeros);
    }
}