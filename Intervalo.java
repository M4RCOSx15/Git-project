package atividade;
import java.util.Scanner;
public class Intervalo {
    public static void main(String[]args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite o primeiro numero : ");
       int n1 = leia.nextInt();
       System.out.println("Digite o segundo numero : ");
       int n2 = leia.nextInt();
       if(n1 > n2 ){
        int subs = n1 - n2;
        while(n2<(subs+1)){
            System.out.println(n2);
            n2++;
        }
      }  
    if(n1 < n2 ){
            int sub = n2 - n1;
            while(n1<(sub+1)){
                System.out.println(n1);
                n1++;
            }
       }
    leia.close();
}
}
