public class PrimitivosFloat {

    static float flotante;

    public static void main(String[] args) {
        
        float realFloat = 0.000008f;

        System.out.println(realFloat);
        
        System.out.println("tipo float corresponde en Byte a: " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("tipo float corresponde en bits a: " + Float.MAX_VALUE);
        System.out.println("tipo float corresponde en bits a: " + Float.MIN_VALUE);
        System.out.println("tipo float corresponde en bits a: " + Float.MAX_EXPONENT);
        System.out.println("tipo float corresponde en bits a: " + Float.MIN_EXPONENT);

        double realDouble = 14.506;

        System.out.println(realDouble);
        
        System.out.println("tipo double corresponde en Byte a: " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("tipo double corresponde en bits a: " + Double.MAX_VALUE);
        System.out.println("tipo double corresponde en bits a: " + Double.MIN_VALUE);
        System.out.println("tipo double corresponde en bits a: " + Double.MAX_EXPONENT);
        System.out.println("tipo double corresponde en bits a: " + Double.MIN_EXPONENT);

        System.out.println(flotante);

    }

}
