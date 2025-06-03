public class Validar {

    public static void main(String[] args) {
        
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("Es nulo = " + esNulo);

        if(!esNulo){
            System.out.println(curso.toUpperCase());
        }
        
        

        curso = "";
        if(curso.isEmpty()){
            System.out.println("esta vacío");
        }

        curso = " a";

        if(curso.isBlank()){
            System.out.println("es blanco");
        }
    }

}
