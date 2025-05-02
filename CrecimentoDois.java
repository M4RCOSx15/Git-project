package atividade;
import java.util.Scanner;
public class CrecimentoDois {
    public static void main(String[]args){
     Scanner leia = new Scanner(System.in);
     int teste;
     System.out.println("Digite 1 para fazer o teste e qualquer outra coisa para sair :");
     teste = leia.nextInt(); 
     switch (teste) {
        case 1:
        while(teste==1){    
        System.out.println("Digite o valor da cidade A :");   
     Double A = leia.nextDouble();
        System.out.println("Digite o valor da cidade B : ");
     Double B = leia.nextDouble();
     System.out.println("Digite o valor que voce quer de acrecimo para cidade A :");
     Double acrecimoa = leia.nextDouble();
     System.out.println("Digite o valor que voce quer de acrecimo para cidade B :");
     Double acrecimob = leia.nextDouble();
     acrecimoa = acrecimoa/100;
     acrecimob = acrecimob/100;
    int ano = 0;
    if(A<B){
    while(A<B){
     A = A+(A * acrecimoa);
    B = B+(B*acrecimob);
    ano++;
    System.out.println("Ano A:"+A);
    System.out.println("ano B:"+B); }
    System.out.println("Irá demorar "+ano+" anos para que cidade A iguale");
    System.out.println("Digite 1 para fazer o teste e qualquer outra coisa para sair :");
     teste = leia.nextInt();
    }else{
        while(B<A){
            A = A+(A * acrecimoa);
           B = B+(B*acrecimob);
           ano++;
           System.out.println("Ano A:"+A);
           System.out.println("ano B:"+B); }
           System.out.println("Irá demorar "+ano+" Anos para que cidade B iguale");
           System.out.println("Digite 1 para fazer o teste e qualquer outra coisa para sair :");
     teste = leia.nextInt();
        }
    }
            break;
      
        default:
           System.out.println("Programa encerrado!!!");
            break;
      }leia.close();
     
  }
   
}