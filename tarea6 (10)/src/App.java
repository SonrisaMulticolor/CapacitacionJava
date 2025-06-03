import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        String nombre1, nombre2, nombre3;
        int mayorCantidad;
        String respuesta = "";

        nombre1 = JOptionPane.showInputDialog("Digite el primer nombre");
        nombre2 = JOptionPane.showInputDialog("Digite el segundo nombre");
        nombre3 = JOptionPane.showInputDialog("Digite el tercer nombre");

        int cantidad1 = nombre1.split(" ")[0].length();
        int cantidad2 = nombre2.split(" ")[0].length();
        int cantidad3 = nombre3.split(" ")[0].length();

        mayorCantidad = cantidad1 > cantidad2 ? cantidad1 : cantidad2;
        mayorCantidad = mayorCantidad > cantidad3 ? mayorCantidad : cantidad3;

        if(mayorCantidad == cantidad1) respuesta = nombre1;
        else if(mayorCantidad == cantidad2) respuesta = nombre2;
        else if(mayorCantidad == cantidad3) respuesta = nombre3;

        System.out.println(respuesta + " tiene el nombre más largo");

    }
}
