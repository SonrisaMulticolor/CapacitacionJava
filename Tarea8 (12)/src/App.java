import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        boolean hayError = false;
        
        double promedioMayor5 = 0.0;
        double promedioMenor4 = 0.0;
        double promedioGeneral = 0.0;

        int cantidadMayor5 = 0;
        int cantidadMenor4 = 0;
        int cantidad1 = 0;
        int cantidadGeneral = 20;
        for (int i = 0; i < 20; i++) {
            
            System.out.print("Dame un número\n->");
            double numero = Double.parseDouble(scanner.nextLine());

            if(numero > 5){
                cantidadMayor5++;
                promedioMayor5 += numero;
            }
            else if(numero < 4){
                cantidadMenor4++;
                promedioMenor4 += numero;
                if(numero == 1){
                    cantidad1++;
                }
            }
            else if(numero == 0){
                hayError = true;
                break;   
            }

            promedioGeneral += numero;

        }

        if(!hayError){
            promedioMayor5 /= cantidadMayor5;
            promedioMenor4 /= cantidadMenor4;
            promedioGeneral /= cantidadGeneral;

            String respuesta = String.format("El promedio de notas mayores que 5 es: %f" +
            "\nEl promedio de notas menores que 4 es: %f"
            + "\nEl promedio de notas general es: %f"
            + "\nLa cantidad de notas igual a 1 es: %d"
            , promedioMayor5, promedioMenor4, promedioGeneral, cantidad1);

            System.out.println(respuesta);
        }
        else{
            System.out.println("Hubo un error.");
        }
        

        scanner.close();


    }
}
