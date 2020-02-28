package tsp;

import java.util.ArrayList;
import java.util.Random;

public class Individuo{

    private int [] genotipo;
    private int fitness;

    public Individuo(int ci, int n){
        genotipo = new int[n];
        genotipo[0]=ci;
        inicializarAleatoriamente();
        calcularFitness();
        
    }
    public void calcularFitness(){
        
    }
    public void inicializarAleatoriamente(){
        ArrayList<Integer> ciudades = new ArrayList<>();
        for(int x =0; x < genotipo.length; x++){
            ciudades.add(x);
        }
        ciudades.remove(this.genotipo[0]);
        Random ran = new Random();
        // llenar los espacios vacios restantes del genotipo 
        for(int x=1; x<genotipo.length;x++){
            int pos = ran.nextInt(ciudades.size());
            int c = ciudades.get(pos);
            this.genotipo[x] = c;
            // eliminamos de las ciudades
            ciudades.remove(pos);
        }

    }


}