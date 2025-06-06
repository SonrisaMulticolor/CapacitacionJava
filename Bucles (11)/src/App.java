public class App {
    public static void main(String[] args) throws Exception {
        
        zarzamora:
        for (int i = 0; i < 5; i++) {

            for(int j = 0; j < 5; j++){

                if(i == 3){
                    continue zarzamora;
                }

            }
            
            System.out.println(i + 1);
        }

    }
}
