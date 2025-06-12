import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws Exception {
        
        int primitivo = 345;
        Integer intObjeto = Integer.valueOf(primitivo);
        Integer intObjeto2 = 345;

        int num = intObjeto;
        int num2 = intObjeto.intValue();

        Integer[] enteros = { 1, 2, 3, 4, 5 };

        String texto = "hola";

        Class clase = texto.getClass();

        System.out.println(clase.getName());
        System.out.println(clase.getSimpleName());
        System.out.println(clase.getPackage());
        System.out.println(clase.getSuperclass());

        for(Method metodo : clase.getMethods()){
            System.out.println(metodo.getName());
        }
    }
}
