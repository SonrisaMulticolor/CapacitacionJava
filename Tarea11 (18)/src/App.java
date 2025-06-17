import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese la fecha de nacimiento en formato dd-MM-yyyy");

        try {
            Date fecha = formateador.parse(scanner.next());

            Date fechaActual = new Date();
            System.out.println(fechaActual);
            System.out.println(fecha);
            long diffMilisegundos = fechaActual.getTime() - fecha.getTime();

            long diferenciaFinal = ((((diffMilisegundos / 1000) / 60) / 60) / 24) / 365;
            System.out.println("tienes -> " + diferenciaFinal + " anios");

        } catch (Exception e) {
            
        }
        
    }
}
