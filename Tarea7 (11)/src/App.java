import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String numeros = "";

        int cantidadNumeros;

        System.out.print("Ingrese la cantidad de números a ingresar\n->");
        cantidadNumeros = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print(String.format("Ingrese el número %d\n->", (i + 1)));
            numeros += scanner.nextLine();
            numeros += " ";
        }

        String[] numerosPartidos = numeros.split(" ");
        int[] numerosI = new int[numerosPartidos.length];

        for (int i = 0; i < numerosPartidos.length; i++) {
            numerosI[i] = Integer.parseInt(numerosPartidos[i]);
        }


        int menor = Integer.MAX_VALUE;
        String respuesta = "";

        for (int i = 0; i < numerosI.length; i++) {
            if(numerosI[i] < menor){
                menor = numerosI[i];
            }
        }

        respuesta += "El menor número de los que se ingresaron es " + String.valueOf(menor) + " ";


        if(menor < 10){
            respuesta += "y el número en cuestión es menor que 10";
        }
        else{
            respuesta += "y el número en cuestión es mayor o igual que 10";
        }

        System.out.println(respuesta);

        scanner.close();
    }
}
