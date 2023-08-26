import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Case {
     public static void main(String[]args){
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         int i=0;
        try {
            System.out.println("ingresame un valor");
            i = Integer.valueOf(entrada.readLine());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4: //First case
                    System.out.println("First case");
                    break;
                case 8:
                case 9: //Second case
                    System.out.println("Second case");
                    break;
                default: //Default case
                    System.out.println("Default case");
                    break;
            }
        }catch (Exception exc){
            System.out.println(exc);
        }
     }
}
