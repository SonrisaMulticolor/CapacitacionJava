import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String resultado = "";
        String[] nombres = new String[3];

        System.out.print("Ingrese el primer nombre\n->");
        nombres[0] = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre\n->");
        nombres[1] = scanner.nextLine();

        System.out.print("Ingrese el tercer nombre\n->");
        nombres[2] = scanner.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            char mayuscula = nombres[i].charAt(1);
            mayuscula = Character.toUpperCase(mayuscula);
            char ultimo = nombres[i].charAt(nombres[i].length() - 1);
            char penultimo = nombres[i].charAt(nombres[i].length() - 2);

            resultado += mayuscula + "." + penultimo + ultimo + "_";
        }

        System.out.println(resultado);
    }
}
