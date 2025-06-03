public class EjemploString {

    public static void main(String[] args) {
        
        String curso = "programación java";
        String curso2 = new String("programación java");

        boolean esIgual = (curso == curso2);

        System.out.println(esIgual);

        esIgual = curso.equals(curso2);
        System.out.println(esIgual);
    }

}
