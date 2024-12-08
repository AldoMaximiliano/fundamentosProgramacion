import java.util.Scanner;

public class Main {

    public static double celciusAFarenheit(double a){
        double farenheit = ((a * 9) / 5 ) + 32;
        return farenheit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 1;

        do {
            System.out.println("Ingresa los grados en Celcius: ");
            double grados = sc.nextDouble();
            System.out.println("Su equivalencia en grados Farenheit es: " + celciusAFarenheit(grados));
            System.out.println("Si desea salir presione 0 de lo contrario puede usar cualquier numero");
            entrada = sc.nextInt();
        }while(entrada != 0);
    }
}