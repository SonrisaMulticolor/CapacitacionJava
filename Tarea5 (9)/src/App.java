import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        double medida = 0;

        System.out.print("Ingrese la cantidad de litros\n->");
        medida = Double.parseDouble(scanner.nextLine());

        if(medida >= 1 && medida < 20){
            System.out.println("Insuficiente");
        }
        else if(medida >= 20 && medida < 35){
            System.out.println("Suficiente");
        }
        else if(medida >= 35 && medida < 40){
            System.out.println("Medio estanque");
        }
        else if(medida >= 40 && medida < 60){
            System.out.println("Estanque 3/4");
        }
        else if(medida >= 60 && medida < 70){
            System.out.println("Estanque casi lleno");
        }
        else if(medida == 70){
            System.out.println("Estanque lleno");
        }

    }
}
