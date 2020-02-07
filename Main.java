import java.util.LinkedList;

import binario.Individuo;
import binario.Poblacion;

public class Main {


    public static void main(String[] args) {
       
        Poblacion p1 = new Poblacion(10);
        LinkedList<Individuo> muestra = p1.generarMuestraAleatoria(20);
        
       
        System.out.println();
    }
}