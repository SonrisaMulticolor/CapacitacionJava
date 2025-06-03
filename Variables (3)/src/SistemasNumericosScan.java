import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SistemasNumericosScan {

    public static void main(String[] args) {
        
        int numeroDecimal = 500;

        System.out.println(numeroDecimal);
        String mensajeBinario = "Numero binario: " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b111110100;
    
        String mensajeOctal = "Numero octal: " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0764;

        String mensajeHexa = "Numero hexadecimal: " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexa);
        
        int numeroHexadecimal = 0x1f4;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero\n->");
        // String cadenaDecimal = scanner.nextLine();
        int numeroDecimal2 = 0;
        try {
            // numeroDecimal2 = Integer.parseInt(cadenaDecimal);
            numeroDecimal2 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Debes ingresar un número entero");
            main(args);
            System.exit(0);
        }

        
        String mensaje = "El número que escribiste es: " + numeroDecimal2;
        mensaje += ("\n" + mensajeBinario);
        mensaje += ("\n" + mensajeOctal);
        mensaje += ("\n" + mensajeHexa);
        System.out.println(mensaje);
        
       
    }

}
