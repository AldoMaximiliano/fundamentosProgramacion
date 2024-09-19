public class Main {
    public static void main(String[] args) {
        double numeroUno, numeroDos, numeroTres, numeroCuatro, numeroCinco, numeroSeis, numeroSiete, numeroOcho, numeroNueve, numeroDiez;

        //Generacion de numeros aleatorios

        numeroUno = Math.random() * 100 + 1;
        numeroDos = Math.random() * 100 + 1;
        numeroTres = Math.random() * 100 + 1;
        numeroCuatro= Math.random() * 100 + 1;
        numeroCinco = Math.random() * 100 + 1;
        numeroSeis = Math.random() * 100 + 1;
        numeroSiete = Math.random() * 100 + 1;
        numeroOcho = Math.random() * 100 + 1;
        numeroNueve = Math.random() * 100 + 1;
        numeroDiez = Math.random() * 100 + 1;

        //Media

        double suma = numeroUno+ numeroDos + numeroTres + numeroCuatro + numeroCinco + numeroSeis + numeroSiete + numeroOcho + numeroNueve + numeroDiez;
        double media = suma / 10;

        // (xi - media) al cuadrado

        double restaUno = Math.pow((numeroUno - media),2);
        double restaDos = Math.pow((numeroDos - media),2);
        double restaTres = Math.pow((numeroTres - media),2);
        double restaCuatro = Math.pow((numeroCuatro - media),2);
        double restaCinco = Math.pow((numeroCinco - media),2);
        double restaSeis = Math.pow((numeroSeis - media),2);
        double restaSiete = Math.pow((numeroSiete - media),2);
        double restaOcho = Math.pow((numeroOcho - media),2);
        double restaNueve = Math.pow((numeroNueve - media),2);
        double restaDiez = Math.pow((numeroDiez - media),2);

        //Desviacion estandar

        double sumaRestas = restaUno + restaDos + restaTres + restaCuatro + restaCinco + restaSeis + restaSiete + restaOcho + restaNueve + restaDiez;
        double desviacionEstandar = Math.sqrt(suma/10);

        //Lista Original
        System.out.println("El primer numero es: "+ numeroUno);
        System.out.println("El segundo numero es: "+ numeroDos);
        System.out.println("El tercer numero es: "+ numeroTres);
        System.out.println("El cuarto numero es: "+ numeroCuatro);
        System.out.println("El quinto numero es: "+ numeroCinco);
        System.out.println("El sexto numero es: "+ numeroSeis);
        System.out.println("El septimo numero es: "+ numeroSiete);
        System.out.println("El octavo numero es: "+ numeroOcho);
        System.out.println("El noveno numero es: "+ numeroNueve);
        System.out.println("El decimo numero es: "+ numeroDiez);
        System.out.println("");

        //Raices Cuadradas
        System.out.println("La raiz cuadrada del primer numero es: "+ Math.sqrt(numeroUno));
        System.out.println("La raiz cuadrada del segundo numero es: "+ Math.sqrt(numeroDos));
        System.out.println("La raiz cuadrada del tercer numero es: "+ Math.sqrt(numeroTres));
        System.out.println("La raiz cuadrada del cuarto numero es: "+ Math.sqrt(numeroCuatro));
        System.out.println("La raiz cuadrada del quinto numero es: "+ Math.sqrt(numeroCinco));
        System.out.println("La raiz cuadrada del sexto numero es: "+ Math.sqrt(numeroSeis));
        System.out.println("La raiz cuadrada del septimo numero es: "+ Math.sqrt(numeroSiete));
        System.out.println("La raiz cuadrada del octavo numero es: "+ Math.sqrt(numeroOcho));
        System.out.println("La raiz cuadrada del noveno numero es: "+ Math.sqrt(numeroNueve));
        System.out.println("La raiz cuadrada del decimo numero es: "+ Math.sqrt(numeroDiez));
        System.out.println("");

        //Potencias
        System.out.println("El primer numero elevado al cuadrado es: "+ Math.pow(numeroUno,2));
        System.out.println("El segundo numero elevado al cuadrado es: "+ Math.pow(numeroDos,2));
        System.out.println("El tercer numero elevado al cuadrado es: "+ Math.pow(numeroTres,2));
        System.out.println("El cuarto numero elevado al cuadrado es: "+ Math.pow(numeroCuatro,2));
        System.out.println("El quinto numero elevado al cuadrado es: "+ Math.pow(numeroCinco,2));
        System.out.println("El sexto numero elevado al cuadrado es: "+ Math.pow(numeroSeis,2));
        System.out.println("El septimo numero elevado al cuadrado es: "+ Math.pow(numeroSiete,2));
        System.out.println("El octavo numero elevado al cuadrado es: "+ Math.pow(numeroOcho,2));
        System.out.println("El noveno numero elevado al cuadrado es: "+ Math.pow(numeroNueve,2));
        System.out.println("El decimo numero elevado al cuadrado es: "+ Math.pow(numeroDiez,2));
        System.out.println("");

        //Media
        System.out.println("La media es: "+media);
        System.out.println("");

        //Desviacion Estandar
        System.out.println("La desviacion estandar es: "+desviacionEstandar);

    }
}