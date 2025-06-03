public class Operadores {

    public static void main(String[] args) {
        
        int numero1 = 5, numero2 = 2, 
        suma = numero1 + numero2;

        System.out.println(suma);


        float resultado = (float) 5 / 3;

        System.out.println(resultado);

        int i = -6;
        int j = -i;

        // System.out.println(j);

        int numerito = 1;
        int numerito2 = ++numerito;

        System.out.println(numerito2);

        int numeritoo = 1;
        int numeritoo2 = numeritoo++;

        System.out.println(numeritoo2);

        boolean prueba = 5 != 6;


        String variable = 7 == 7 ? "Verdadero" : "Falso";       

        Integer numero = 7;

        Boolean valor = numero instanceof Integer;

        System.out.println(valor);


    }

}
