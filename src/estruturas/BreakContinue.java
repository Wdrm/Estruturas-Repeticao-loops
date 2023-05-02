package estruturas;

import javax.swing.*;
import java.util.Scanner;

public class BreakContinue {
    Scanner sc= new Scanner(System.in);

    public void breakContinue(){
        for (int i =0; i<=5; i++){
            if(i==3) continue;
            System.out.println(i);

        }


    }
}
