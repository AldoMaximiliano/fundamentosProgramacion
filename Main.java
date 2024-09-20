public class Main {
    public static void main(String[] args) {
        double xUno = 1, xDos = 4, xTres = 5, yUno = 2, yDos = 6, yTres = 3;

        //Lados
        double distanciaA = Math.sqrt((Math.pow((xDos - xUno),2))+Math.pow(yDos-yUno,2));
        double distanciaB = Math.sqrt((Math.pow((xDos - xTres),2))+Math.pow(yDos-yTres,2));
        double distanciaC = Math.sqrt((Math.pow((xUno - xTres),2))+Math.pow(yUno-yTres,2));

        //Perimetro
        double perimetro = distanciaA+distanciaB+distanciaC;

        //Area
        double a,b,c,s,area;
        a = distanciaA;
        b = distanciaB;
        c = distanciaC;

        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        //Altura desde el vertice
        double altura = (2 * area) / a;

        //Angulos
        double cosA = (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)  ) / (2 * b * c);
        double anguloA = Math.toDegrees(Math.acos(cosA));
        double cosB = (Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2)  ) / (2 * a * c);
        double anguloB = Math.toDegrees(Math.acos(cosB));
        double cosC = (Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2)  ) / (2 * a * b);
        double anguloC = Math.toDegrees(Math.acos(cosC));

        //Es equilatero?
        boolean esEquilatero = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a) == 0;

        //Puntos medios
        double puntoABX = (xUno+xDos) / 2;
        double puntoABY = (yUno+yDos) / 2;
        double puntoBCX = (xDos+xTres) / 2;
        double puntoBCY = (yDos+yTres) / 2;
        double puntoCAX = (xUno+xTres) / 2;
        double puntoCAY = (yUno+yTres) / 2;
        System.out.println("Lado A: "+distanciaA);
        System.out.println("Lado B: "+distanciaB);
        System.out.println("Lado C: "+distanciaC);
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("El área es: "+area);
        System.out.println("La altura es: "+altura);
        System.out.println("Angulo A: "+anguloA+" grados");
        System.out.println("Angulo B: "+anguloB+" grados");
        System.out.println("Angulo C: "+anguloC+" grados");
        System.out.println("El triangulo es equilatero? "+esEquilatero);
        System.out.println("Punto medio del lado AB: ("+puntoABX+"), ("+puntoABY+")");
        System.out.println("Punto medio del lado BC: ("+puntoBCX+"), ("+puntoBCY+")");
        System.out.println("Punto medio del lado CA: ("+puntoCAX+"), ("+puntoCAY+")");
    }
}