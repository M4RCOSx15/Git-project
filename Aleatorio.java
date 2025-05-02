package atividade;
import java.util.Random;
import java.util.Scanner;
public class Aleatorio {
    public static void main(String []args){
     Scanner leia = new Scanner(System.in);
     Random ale = new Random();
     int numero = ale.nextInt(); 
    System.out.println("Digite um numero : ");
     int num = leia.nextInt();
     System.out.println("Digite um numero : ");
     int num2 = leia.nextInt();
     if(num > num2 ){
        System.out.println("O maior numero é : "+num);
     }else{
        System.out.println("O maior numero é :"+num2);
     }
     System.out.println("O numero sorteado foi :"+numero );
     if(numero %2 == 0 ){
        System.out.println("O numero :"+numero+ " é par");
     }else{
        System.out.println("O numero :"+ numero+ " é impar");
     }
     leia.close();
    }
    
}
