package binario;

import java.util.LinkedList;
import java.util.Random;

public class Poblacion{

    private LinkedList<Individuo> poblacion;
    private int i;

    // creacion aleatoria de la población
    public Poblacion(int i){
        this.i = i;
        this.poblacion = new LinkedList<>();
        inicializarAleatorimente();


    }

    public void inicializarAleatorimente(){

       // un proceso iterativo con respecto a i
       for(int x=0; x< this.i; x++){
            this.poblacion.add(new Individuo(31));

       }

    }
    public LinkedList<Individuo> generarMuestraAleatoria(int p){
        int c = (this.i*p)/100;
        LinkedList<Individuo> muestra = new LinkedList<>();
        int pa = 0;
        Random ran = new Random();
        for(int x=0; x<c;x++){
            pa = ran.nextInt(this.i);
            muestra.add(this.poblacion.get(pa));

        }
        

        return muestra;


    }

   public LinkedList<Individuo> getPoblacion(){

    return poblacion;
   }
}