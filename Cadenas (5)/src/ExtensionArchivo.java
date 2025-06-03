public class ExtensionArchivo {

    public static void main(String[] args) {
        
        String archivo = "alguna.imagen.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println("largo: " + archivo.length());
        System.out.println("subcadena: " + archivo.substring(i));

    }

}
