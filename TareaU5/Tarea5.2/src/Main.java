import java.util.Random;
import java.util.Scanner;

public class Main {

    public static double calcularMedia(int a[]){
        double suma = 0;
        for(double numeros : a){
            suma += numeros;
        }
        double media = suma / a.length;
        return media;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int tamaño = 0;

        System.out.println("Ingresa el tamaño del arreglo: ");
        tamaño = sc.nextInt();
        int calificaciones[] = new int[tamaño];
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = r.nextInt(101);
        }
        for (double calificacion : calificaciones){
            System.out.println(calificacion);
        }
        System.out.println("El promedio es:" + calcularMedia(calificaciones));
    }
}