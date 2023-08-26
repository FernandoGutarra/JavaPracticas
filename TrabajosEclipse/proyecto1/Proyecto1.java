package proyecto1;
import java.io.BufferedReader;
 import java.io.InputStreamReader; 

 
public class Proyecto1 {
  public static void main(String[] args) {
      Double numero_real1;
      Double numero_real2;
      Double numero_real3;
      Double resultado;
      Double resultado2;     
     try{ 
       BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
         System.out.println("Ingrese numero real 1");
         numero_real1 = new Double(entrada.readLine());
         System.out.println("Ingrese numero real 2");
          numero_real2 = new Double(entrada.readLine());
         System.out.println("Ingrese numero real 3");
          numero_real3 = new Double(entrada.readLine());
         resultado = (numero_real1 /= numero_real2);
         resultado2 = (resultado - numero_real3) ;
         System.out.println("resultado " + resultado);
         System.out.println("resultado2 " + resultado2);                   
              

     }
     catch (Exception exc ) {
       System.out.println( exc ); 

      
    }
    
  }
}
