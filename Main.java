import binario.GeneticoV1;
import extras.GeneradorInstancias;
import tsp.Individuo;

public class Main {

  public static void main(String[] args) {
    try {
      //int[][] matrizDistancias = GeneradorInstancias.cargarMatriz();
      Individuo i = new Individuo(3, 10000);
      System.out.println();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    }
}