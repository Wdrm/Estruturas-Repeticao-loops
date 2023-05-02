package estruturas;

import java.util.Scanner;

public class ForArrays {
    Scanner sc  = new Scanner(System.in);

    public void exemplo (){

        String alunos [] = {"Felipe","jonas","Julia","Marcos"};
       for (int i =0; i<alunos.length;i++){
           System.out.println("o aluno no indice i="+ i +" é "+ alunos[i]);

        }

    }

}

 // Todo: usando for each
//   for ( String alunos : alunos
  //         ) {
 //          System.out.println(alunos);
  //         }