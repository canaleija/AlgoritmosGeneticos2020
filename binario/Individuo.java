package binario;

public class Individuo{

    private int genotipo[];
    private int fenotipo;
    private int fitness;

    public Individuo (int n){
        this.genotipo = new int[n];
        this.fenotipo = 0;
        this.fitness = 0;
    }

    public void calcularFitness(){
        calcularFenotipo();
        // evaluar el fenotipo en la función deseada (2x2+x+1)
        this.fitness = (2*this.fenotipo*this.fenotipo)+this.fenotipo+1;
    }

    private void calcularFenotipo(){
        // decodificación del genotipo
        
    }

}
