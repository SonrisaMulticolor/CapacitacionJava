import javax.swing.JOptionPane;

public class SistemasNumericos {

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
        
        String cadenaDecimal = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        int numeroDecimal2 = 0;

        try {

            numeroDecimal2 = Integer.parseInt(cadenaDecimal);
           
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        
        String mensaje = "El número que escribiste es: " + numeroDecimal2;
        mensaje += ("\n" + mensajeBinario);
        mensaje += ("\n" + mensajeOctal);
        mensaje += ("\n" + mensajeHexa);

        JOptionPane.showMessageDialog(null, mensaje);
       
    }

}
