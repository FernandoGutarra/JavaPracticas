package POO_1;

import java.awt.*;
import java.lang.annotation.ElementType;

public class Coche {
    String color;
    String marca;
    int km;
    public static void main(String[]args){
        Coche coche1=new Coche();
        coche1.color="Blanco";
        coche1.marca="Audi";
        coche1.km = 0;
        System.out.println("el color del coche es "+ coche1.color);
        System.out.println("la marca del coche es "+coche1.marca);
        System.out.println("el km es "+coche1.km);
        System.out.println("");
        Coche coche2=new Coche();
        coche2.color="rojo";
        coche2.marca="Ferrari";
        coche2.km=0;
        System.out.println("el color del coche es "+ coche2.color);
        System.out.println("la marca del coche es "+coche2.marca);
        System.out.println("el km es "+coche2.km);
    }
}
