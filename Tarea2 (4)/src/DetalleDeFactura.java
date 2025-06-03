import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nombreFactura = "";
        String mensaje = "";
        Double precio1 = 0.0;
        Double precio2 = 0.0;
        Double impuesto = 0.0;
        Double total = 0.0;

        System.out.print("Ingresa el nombre de la factura\n->");
        nombreFactura = scanner.nextLine();

        System.out.print("Ingresa el primer precio\n->");
        precio1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo precio\n->");
        precio2 = scanner.nextDouble();

        total = precio1 + precio2;
        impuesto = total * 0.19;

        mensaje = String.format("La factura %s tiene un total bruto de %f con un impuesto de %f y el monto después de impuesto es de %f", nombreFactura, total, impuesto, (total + impuesto));

        System.out.println(mensaje);

        scanner.close();
    }

}
