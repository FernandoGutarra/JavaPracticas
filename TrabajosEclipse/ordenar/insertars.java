package ordenar;

public class insertars {
	  final static int TAMAÑO=15;
	  final static int TAMAÑONUEVO=4;
	  final static int SEPARADOR=0;
	  
	  public static void main(String[] args) {
	    // variables y matriz y todo eso
	    int [] ARR={0,1,1,0,2,2,0,3,3,0,4,4,0,0,0};
	    int [] NUEVO={0,2,3,0};
	    int valornuevo=0;
	    //
		System.out.println("se mostrara el arreglo original");
	    mostrararreglo(ARR);
		valornuevo=sumanuevo(NUEVO);
	    recorrerarreglo(ARR,NUEVO,valornuevo);    
	    mostrararreglo(ARR);
	  }
	 //
	  public static int sumanuevo(int []secuencia){
	    int suma=0;
	    for(int i=0;i<TAMAÑONUEVO;i++){
	      suma+=secuencia[i];
	    }
	    return suma;
	  }
	 //
	   public static int sumasecuencia(int []secuencia,int inicio,int fin){
	    int suma=0;
	    for(int i=inicio;i<=fin;i++){
	      suma+=secuencia[i];
	    }
	    return suma;
	  }
	 // 
	  public static int obtenerinicio(int[] arr, int pos){
	    while (pos<TAMAÑO && arr[pos]==SEPARADOR){
	      pos++;
	    }
	     if (pos<TAMAÑO){
	      return pos;
	   	 }
	    else{
	     return TAMAÑO;
	    }
	  }
	 //
	  public static int obtenerfinal(int[] arr, int inicio){
	    while (inicio<TAMAÑO && arr[inicio]!=SEPARADOR){
	      inicio++;
	    }
	    if (inicio<TAMAÑO){
	      return inicio-1;
	    }
	    else{
	    	return TAMAÑO;
	    }
	 }
	//
	   public static void mostrararreglo(int[] arreglo){
	     	  for(int pos=0; pos<TAMAÑO;pos++){
	          System.out.print(arreglo[pos]+"|");
	        }
	    System.out.println();
	  }
	//
	  public static void recorrerarreglo(int []arr,int []nuevo ,int valornuevo){
	   int inicio=0;
	   int fin=0;
	   int valorsecuenciaactual=0;
	   int valorsecuenciaanterior=0;
	   int pospar=0; 
	   boolean remplace=false;
	    
	     while(inicio<TAMAÑO && fin<TAMAÑO){
	       inicio=obtenerinicio(arr,fin);
	        if(inicio<TAMAÑO){
	          fin=obtenerfinal(arr,inicio);
	          if(fin<TAMAÑO){
	            valorsecuenciaactual=sumasecuencia(arr,inicio,fin);     
	            if(valornuevo<=valorsecuenciaactual && valornuevo>valorsecuenciaanterior){
	              System.out.println(valornuevo+" va ente el numero anterior y el siguiente osea aca hay que incertarlo");
	              pospar=inicio;
	              for(int i=1;i<TAMAÑONUEVO;i++){
	              correrderechaconremplazo(arr,pospar,nuevo[i]);
	              pospar++;
	             }
	            }
	             System.out.println(valorsecuenciaactual);
	             valorsecuenciaanterior=valorsecuenciaactual;
	          }
	        }
	       fin++;
	     }
	  }
	//
	   public static void correrderechaconremplazo(int[] arreglo,int posicion,int remplazo){
	    //i es el tamaño del arreglo DONDE se va a realizar el corrimiento con remplazo
	    //arreglo es el arreglo donde se realiza el remplazo
	    //posicion es la posicion donde se va a realizar el corrimiento y donde se remplazara
	    //remplazo es el numero que se va a colocar en la posicion anterior descrita 
	    //en esta funcion pido el arreglo al que hacer el corrimiento la posicion hasta donde se van a hacer los corrimientos
	    //y cuando llega a la posicion donde ya no realiza corrimiento pongo un numero o un char o lo que quiera en ese lugar
	    int i=TAMAÑO-1;
	    while(i>posicion){
	      arreglo[i]=arreglo[i-1];
	      i--;
	      if (i==posicion){
	        arreglo[i]=remplazo;
	      }
	    }
	  }
}
