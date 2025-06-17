import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calendario {

    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        calendario.set(2024, 0, 25, 19, 20, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, 3);
        calendario.set(Calendar.DAY_OF_MONTH, 24);


        Date fecha = calendario.getTime();
        System.out.println(fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaConFormato = formato.format(fecha);
        System.out.println(fechaConFormato);

        System.out.println("Ingrese fecha con formato yyyy-MM-dd");

        try {

            Date fechita = formato.parse(scanner.next());

            Date fecha2 = formato.parse("2020-05-16");

            if(fechita.after(fechita)){
                System.out.println("la fecha es mayor");
            }
            else{
                System.out.println("La fecha es menor");
            }
           

            System.out.println(fecha2);

        } catch (ParseException e) {
            
            e.printStackTrace();
        }

    }

}
