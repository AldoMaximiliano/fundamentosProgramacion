public class Main {
    public static void main(String[] args) {
        //FORMULA 1 RESULTADO ESPERADO: 2.3125
        double a = 12+8, b = 5-3, c = 6/2, d = 3*4, e = 8/2;

        double numeradorUno = a*b-c;
        double denominadorUno = d+e;
        double totalUno = numeradorUno/denominadorUno;
        System.out.println(totalUno);
        //FORMULA 2 RESULTADO ESPERADO: 7.6
        double n1 = 9*5, n2 = 15+3, n3 = 8*2, n4 = 12/4, n5 = 7+2, n6 = (6*3)/2, n7 = 2+(3*2)/(4-2), n8 = 5*((8/4)+1), n9 = 6/(2+1);
        double d1 = (((4+2)*(7-1))/(3+1)), d2 = 3*2, d3 = 5+1, d4 = 8/2, d5 = 3+((6/2)+(7/2)), d6 = 2*(3+(8/4));

        double numeradorDos = (n1-n2+n3-n4)*n5-n6/n7+n8-n9;
        double denominadorDos = (d1+(d2-d3*d4))/(d5+d6);
        double totalDos = numeradorDos/denominadorDos;
        System.out.println(totalDos);
        //FORMULA 3 RESULTADO ESPERADO: 2.3333
        double w = (6+4)*3, x = 18/2, y = 8-5, z = 3*2;
        double numeradorTres = w-x;
        double denominadorTres = y+z;
        double totalTres = numeradorTres/denominadorTres;
        System.out.println(totalTres);
            }
}