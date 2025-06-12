import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;

        do{

            System.out.print("Seleccione una opción\n"
            + "1. Actualizar\n"
            + "2. Eliminar\n"
            + "3. Agregar\n"
            + "4. Lista\n"
            + "5. Salir\n->");

            String cache = scanner.nextLine();

            if(!cache.isBlank()){
                opcion = Integer.parseInt(cache);

                switch(opcion){
                    case 1:
                        System.out.println("Actualizando usuario");
                        break;
                    case 2:
                        System.out.println("Eliminado usuario");
                        break;
                    case 3:
                        System.out.println("Agregando usuario");
                        break;
                    case 4:
                        System.out.println("Listando usuarios");
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                
                }
            }
            else{
                System.out.println("No puede mandar contenido vacío");
            }
            

        }while(opcion != 5);

        scanner.close();

    }
}
