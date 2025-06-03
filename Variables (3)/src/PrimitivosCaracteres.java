public class PrimitivosCaracteres {

    public static void main(String[] args) {
        
        char caracterAlt = 64;
        char caracerUnicode = '\u0040';
        boolean iguales = (caracterAlt == caracerUnicode);
        System.out.println(iguales);

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        String espacioSystem = System.lineSeparator();
        

        System.out.println("elefante sabor manzana:" + retornoCarro + " final");
        System.out.println("Prueba sabor sandia:" + nuevaLinea + " final2");

        System.out.println("Bytes de un char: " + Character.BYTES);
        System.out.println("Bytes de un char: " + Character.SIZE);
        System.out.println("Bytes de un char: " + Character.MAX_VALUE);
        System.out.println("Bytes de un char: " + Character.MIN_VALUE);

        
    }

}
