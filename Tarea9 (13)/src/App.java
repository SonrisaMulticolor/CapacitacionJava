import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        int multiplicando = 0;
        int multiplicador = 0;

        System.out.print("Ingresa el multiplicando\n->");
        multiplicando = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingresa el multiplicador\n->");
        multiplicador = Integer.parseInt(scanner.nextLine());

        int incremental = (multiplicador < 0) ? -multiplicador : multiplicador;

        int cache = multiplicando;
        for (int i = 0; i < incremental - 1; i++) {
            multiplicando += cache;
        }

        multiplicando = (multiplicador < 0) ? -multiplicando : multiplicando;

        System.out.println(multiplicando);

        scanner.close();

    }
}
