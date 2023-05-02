package estruturas;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    Scanner sc  = new Scanner(System.in);

    public void exeWhile (){
        double mesada = 50.00;

        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do Valor: " + valorDoce + "Adicionado no Carrinho");
            mesada = mesada - valorDoce;

        }
        System.out.println("Mesada: " +mesada);
        System.out.println("Joaozinho Gastou Toda Sua Mesada Em Doces:");
    }

    private  static double valorAleatorio() {
      return   ThreadLocalRandom.current().nextDouble(2, 15);

    }

}
