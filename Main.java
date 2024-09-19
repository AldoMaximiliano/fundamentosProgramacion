import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //PRODUCTO 1

        System.out.println("Ingresa el nombre del primer producto: ");
        String productoUno = sc.nextLine();
        System.out.println("Ingresa la cantidad del primer producto: ");
        int cantidadUno = sc.nextInt();
        System.out.println("Ingresa el precio por unidad del producto: ");
        double precioUno = sc.nextDouble();
        System.out.println("Ingresa el descuento para el primer producto: ");
        double descuentoUno = sc.nextDouble();
        System.out.println("Ingresa el impuesto para el primer producto en porcentaje: ");
        double impuestoUno = sc.nextDouble();

        double precioSinDescuentoUno = cantidadUno * precioUno;
        double descuentoProductoUno = descuentoUno * (precioSinDescuentoUno / 100);
        double precioConDescuentoUno = precioSinDescuentoUno - descuentoProductoUno;
        double precioImpuestoUno = precioConDescuentoUno * (impuestoUno / 100);
        double totalProductoUno = precioConDescuentoUno + precioImpuestoUno;

        //PRODUCTO 2

        System.out.println("Ingresa el nombre del segundo producto: ");
        sc.nextLine();
        String productoDos = sc.nextLine();
        System.out.println("Ingresa la cantidad del segundo producto: ");
        int cantidadDos = sc.nextInt();
        System.out.println("Ingresa el precio por unidad del producto: ");
        double precioDos = sc.nextDouble();
        System.out.println("Ingresa el descuento para el segundo producto: ");
        double descuentoDos = sc.nextDouble();

        System.out.println("Ingresa el impuesto para el segundo producto en porcentaje: ");
        double impuestoDos = sc.nextDouble();

        double precioSinDescuentoDos = cantidadDos * precioDos;
        double descuentoProductoDos = descuentoDos * (precioSinDescuentoDos / 100);
        double precioConDescuentoDos = precioSinDescuentoDos - descuentoProductoDos;
        double precioImpuestoDos = precioConDescuentoDos * (impuestoDos / 100);
        double totalProductoDos = precioConDescuentoDos + precioImpuestoDos;

        //PRODUCTO 3

        System.out.println("Ingresa el nombre del tercer producto: ");
        sc.nextLine();
        String productoTres = sc.nextLine();
        System.out.println("Ingresa la cantidad del tercer producto: ");
        int cantidadTres = sc.nextInt();
        System.out.println("Ingresa el precio por unidad del producto: ");
        double precioTres = sc.nextDouble();
        System.out.println("Ingresa el descuento para el tercer producto: ");
        double descuentoTres = sc.nextDouble();
        System.out.println("Ingresa el impuesto para el tercer producto en porcentaje: ");
        double impuestoTres = sc.nextDouble();

        double precioSinDescuentoTres = cantidadTres * precioTres;
        double descuentoProductoTres = descuentoTres * (precioSinDescuentoTres / 100);
        double precioConDescuentoTres = precioSinDescuentoTres - descuentoProductoTres;
        double precioImpuestoTres = precioConDescuentoTres * (impuestoTres / 100);
        double totalProductoTres = precioConDescuentoTres + precioImpuestoTres;

        //MOSTRAR PRODUCTO 1

        System.out.println("Resumen del pedido: ");
        System.out.println("Producto 1: " + productoUno);
        System.out.println("Cantidad: " + cantidadUno);
        System.out.println("Precio total sin descuento: " + precioSinDescuentoUno);
        System.out.println("Descuento aplicado: " + descuentoProductoUno);
        System.out.println("Precio con descuento: " + precioConDescuentoUno);
        System.out.println("Impuestos aplicados: " + precioImpuestoUno);
        System.out.println("Total a pagar: " + totalProductoUno);

        //MOSTRAR PRODUCTO 2

        System.out.println("Resumen del pedido: ");
        System.out.println("Producto 2: " + productoDos);
        System.out.println("Cantidad: " + cantidadDos);
        System.out.println("Precio total sin descuento: " + precioSinDescuentoDos);
        System.out.println("Descuento aplicado: " + descuentoProductoDos);
        System.out.println("Precio con descuento: " + precioConDescuentoDos);
        System.out.println("Impuestos aplicados: " + precioImpuestoDos);
        System.out.println("Total a pagar: " + totalProductoDos);

        //MOSTRAR PRODUCTO 3

        System.out.println("Resumen del pedido: ");
        System.out.println("Producto 3: " + productoTres);
        System.out.println("Cantidad: " + cantidadTres);
        System.out.println("Precio total sin descuento: " + precioSinDescuentoTres);
        System.out.println("Descuento aplicado: " + descuentoProductoTres);
        System.out.println("Precio con descuento: " + precioConDescuentoTres);
        System.out.println("Impuestos aplicados: " + precioImpuestoTres);
        System.out.println("Total a pagar: " + totalProductoTres);
        double totalAcumulado = totalProductoUno + totalProductoDos + totalProductoTres;
        System.out.println("Total acumulado a pagar: " + totalAcumulado);

    }
}