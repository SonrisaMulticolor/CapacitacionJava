public class Metodos {


    public static void main(String[] args) {
        
        String nombre = "Rafael";

        System.out.println("Largo: " + nombre.length());
        System.out.println("Mayusculas: " + nombre.toUpperCase());
        System.out.println("Minusculas: " + nombre.toLowerCase());
        System.out.println("Igualdad: " + nombre.equals("Rafael"));
        System.out.println("Igualdad: " + nombre.equalsIgnoreCase("rafael"));
        System.out.println("Comparacion: " + nombre.compareTo("Rafael"));
        System.out.println("Posicion de caracter: " + nombre.charAt(2));
        System.out.println("Subcadena: " + nombre.substring(2));
        System.out.println("Subcadena: " + nombre.substring(0, 3));

        String palabra = "Maimonides";

        System.out.println("Reemplazar: " + palabra.replace("mo", "tar"));
        System.out.println("Indice de: " + palabra.indexOf('o'));
        System.out.println("Último índice: " + palabra.lastIndexOf("i"));
        System.out.println("Contiene: " + palabra.contains("ide"));
        System.out.println("Empieza con: " + palabra.startsWith("imo", 2));
        System.out.println("Termina con: " + palabra.endsWith("des"));
        System.out.println("  trabalenguas  ".trim());
    }

}
