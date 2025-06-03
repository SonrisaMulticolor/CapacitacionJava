import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numero1 = 0, numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número\n->");
        numero1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese elsegundo número\n->");
        numero2 = Integer.parseInt(scanner.nextLine());

        String respuesta = numero1 < numero2 ? String.format("%d, %d", numero2, numero1) : String.format("%d, %d", numero1, numero2);

        System.out.println(respuesta);

        scanner.close();

    }
}
