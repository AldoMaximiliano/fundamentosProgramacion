import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xUno, xDos, yUno, yDos, xTres, yTres;

        System.out.println("Ingresa la primer coordenada de x: ");
        xUno = sc.nextDouble();
        System.out.println("Ingresa la primer coordeanada de y: ");
        yUno = sc.nextDouble();
        System.out.println("Ingresa la segunda coordenada de x: ");
        xDos = sc.nextDouble();
        System.out.println("Ingresa la segunda coordenada de y: ");
        yDos = sc.nextDouble();

        double distancia = Math.sqrt((Math.pow((xDos - xUno),2))+Math.pow(yDos-yUno,2));

        double angulo = Math.atan2(yDos - yUno,xDos - xUno);

        double anguloGrados = (angulo * 180) / 3.1416;

        System.out.println("La distancia entre los puntos es: "+distancia);
        System.out.println("El angulo entre la linea y el exe x en radianes es: "+angulo);
        System.out.println("El angulo entre la linea y el exe x en grados es: "+anguloGrados);

    }
}