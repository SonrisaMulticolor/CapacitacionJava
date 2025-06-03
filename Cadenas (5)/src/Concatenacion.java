public class Concatenacion {

    public static void main(String[] args) {
        
        String fruta = "Cereza";

        String persona = "Rafel";

        String detalle = fruta + " " + persona; 

        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = fruta.concat(" ").concat(persona);
        System.out.println(detalle2);
    }

}
