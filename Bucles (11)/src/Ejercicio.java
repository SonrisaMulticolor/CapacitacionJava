public class Ejercicio {
    public static void main(String[] args) {
        
        String frase = "tres tristes tigres tragan trigo en un trigal de trigo";
        String palabra = "trigo";

      
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase; i++) {
            int k = i;

            for(int j = 0; j < maxPalabra; j++){

                 if(frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue buscar;
                }

            }

            i = i + maxPalabra;
            cantidad++;
        }

        System.out.println("Encontrado: " + cantidad + " veces la palabra " + palabra);

    }
}
