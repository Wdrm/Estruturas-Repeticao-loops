package estruturas;

import java.util.Scanner;
import java.util.Random;

public class DoWhile {
    Scanner sc =  new Scanner(System.in);

   public void exDoWhile(){

       System.out.println("Discando...");
       do {
           System.out.println("Telefone Tocando");
       }while(tocando());
       System.out.println("Alo!!!");
   }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu?"+ atendeu);
        // negando o ato de continuar tocando
        // ! operador unario de exclamação que nega uma expressão boleanda
        return  ! atendeu;

    }


}
