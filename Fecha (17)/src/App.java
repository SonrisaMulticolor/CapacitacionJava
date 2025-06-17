import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Date fecha = new Date();

        SimpleDateFormat fechaSimple = new SimpleDateFormat("dd-MM-YYYY");

        String fechaStr = fechaSimple.format(fecha);

        System.out.println(fechaStr);

    }
}
