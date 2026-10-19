
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 1. Crear el lector de datos
        Scanner sc = new Scanner(System.in);

        // 2. Declarar las variables
        int cantidadProductos;
        int contador = 1;
        int cantidadCategoriaAlta = 0;

        String nombreProducto;

        double costoProducto;
        double totalCostos = 0;
        double promedioCostos ;

        // 3. Preguntar cuántos productos ingresarán
        System.out.print("¿Cuántos productos ingresarán al lote? ");
        cantidadProductos = sc.nextInt();
        sc.nextLine();

        // 4. Recorrer todos los productos
        while (contador <= cantidadProductos) {

            System.out.println("\nProducto número " + contador);

            System.out.print("Ingrese el nombre del producto: ");
            nombreProducto = sc.nextLine();

            System.out.print("Ingrese el costo del producto: ");
            costoProducto = sc.nextDouble();
            sc.nextLine();

            // 5. Clasificar el producto
            if (costoProducto < 10000) {

                System.out.println("Categoría Baja");

            } else if (costoProducto <= 50000) {

                System.out.println("Categoría Media");

            } else {

                System.out.println("Categoría Alta");
                cantidadCategoriaAlta++;
            }

            // 6. Sumar el costo al acumulador
            totalCostos = totalCostos + costoProducto;

            // 7. Avanzar al siguiente producto
            contador++;
        }

        // 8. Calcular el promedio si hay productos
        if (cantidadProductos > 0) {

            promedioCostos = totalCostos / cantidadProductos;

            // 9. Mostrar los resultados finales
            System.out.println("\n===== RESUMEN DEL LOTE =====");

            System.out.printf("Costo total: $%.2f%n", totalCostos);
            System.out.printf("Costo promedio: $%.2f%n",
                    promedioCostos);

            System.out.println(
                    "Productos de categoría alta: "
                    + cantidadCategoriaAlta
            );

        } else {
            System.out.println("No se ingresaron productos.");
        }

        // 10. Cerrar el lector
        sc.close();
    }
}

