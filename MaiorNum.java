package atividade;
import java.util.Scanner;
public class MaiorNum {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int [] num = new int [5];
        int i;
        int nmaior;
        int nmenor;
        for(i=0;i<num.length;i++){
            System.out.println("Digite o numero da posição :"+i);
            num [i] = leia.nextInt();
         
        } 
          nmaior= num[0];
          nmenor = num[0];
        
        
          for(i=0;i<num.length;i++){
            if(num[i] > nmaior){
                nmaior = num[i];
             }
             if(num[i]<nmenor){
                nmenor = num[i];
             }
        }
        
        System.out.println("O maior numero é :"+nmaior);
        System.out.println("O menor numero é :"+nmenor);
        leia.close();
    }
    
}
