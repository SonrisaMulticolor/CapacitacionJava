public class ConversionTipos {

    public static void main(String[] args) {
        
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);

        String realStr = "3454.222e-2";
        double realDouble = Double.parseDouble(realStr);
        System.out.println(realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println(logicoBoolean);

        String otroNumero = Integer.toString(1234);
        System.out.println(otroNumero);

        otroNumero = String.valueOf(4321);

        String otroReal = Double.toString(123.45);

        int i = 100;
        short s = (short) i;
        long l = i;

        
    }

}
