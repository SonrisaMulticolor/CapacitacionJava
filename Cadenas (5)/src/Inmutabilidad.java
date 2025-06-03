public class Inmutabilidad {

   public static void main(String[] args) {
    
        String fruta = "Cereza";

        String persona = "Rafel";

        String resultado = persona.concat(" ".concat(fruta));

        System.out.println(resultado);

        String resultado2 = resultado.transform(c -> {

            return c + " colombia";
        });

        System.out.println(resultado2);

        resultado2 = resultado2.replace("a", "w");
        System.out.println(resultado2);
   }

}
