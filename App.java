
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadProductos;
        int contador = 1;
        int cantidadCategoriaAlta = 0;

        String nombreProducto;

        double costoProducto;
        double totalCostos = 0;
        double promedioCostos;

        System.out.print("¿Cuántos productos ingresarán al lote? ");
        cantidadProductos = sc.nextInt();
        sc.nextLine();

        while (contador <= cantidadProductos) {

            System.out.println("\nProducto número " + contador);

            System.out.print("Ingrese el nombre del producto: ");
            nombreProducto = sc.nextLine();

            System.out.print("Ingrese el costo del producto: ");
            costoProducto = sc.nextDouble();
            sc.nextLine();

            if (costoProducto < 10000) {

                System.out.println("Categoría Baja");

            } else if (costoProducto <= 50000) {

                System.out.println("Categoría Media");

            } else {

                System.out.println("Categoría Alta");
                cantidadCategoriaAlta++;
            }

            totalCostos = totalCostos + costoProducto;

            contador++;
        }

        sc.close();
    }
}

