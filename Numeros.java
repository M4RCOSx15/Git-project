package atividade;
import java.util.Scanner;
public class Numeros{
    public static void main(String []args){
     Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do produto : ");
        int produto = leia.nextInt();
        System.out.println("Digite o valor pago : ");
        int pago = leia.nextInt();
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;       
        if(pago < produto ){
            System.out.println("Valor insuficiente!!!");
        }else{
            System.out.println("O valor pago foi : "+pago);
            int troco = pago-produto;
            System.out.println("O troco vai ser "+troco);
            
            while(troco>=50 ){
                nota50 = (troco/50)%50;
                troco = troco - 50;
                
            }
            while(troco>=20 ){
                nota20 = (troco/20)%20;
                troco = troco - 20;
               }
               while(troco>=10 ){
                nota10 = (troco/10)%10;
                troco = troco - 10;
               }
               while(troco>=5 ){
                nota5 = (troco/5)%5;
                troco = troco - 5;
               }
               while(troco>=2 ){
                nota2 = (troco/2)%2;
                troco = troco - 2;
               }
               System.out.println("Nota de 50 : "+nota50);
               System.out.println("Nota de 20 : "+nota20);
               System.out.println("Nota de 10 : "+nota10);
               System.out.println("Nota de 5 : "+nota5);
               System.out.println("Nota de 2 : "+nota2);
        }
        leia.close();
    }
}