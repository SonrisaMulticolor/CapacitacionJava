public class ArregloCadena {

    public static void main(String[] args) {
        
        String palabra = "anticonstitucionalmente";
        System.out.println("Arreglo de cadenas: " + palabra.toCharArray());

        char[] arreglo = palabra.toCharArray();
        int largo = arreglo.length;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }


        String[] prueba = palabra.split("o");
        for (int i = 0; i < prueba.length; i++) {
            System.out.println(prueba[i]);
        }
    }

}
