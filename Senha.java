package atividade;
import java.util.Scanner;
public class Senha {
    public static void main(String[]args){
     Scanner leia = new Scanner(System.in);
     final int senhacorreta = 1234;    
     int i = 0;
     
     System.out.println("Digite uma senha de 4 digitos : ");
     int num = leia.nextInt();
     while(num!= senhacorreta){
        System.out.println("Senha incorreta!!!");
        System.out.println("Digite a senha correta!");
        num = leia.nextInt();
     }
     if(num==senhacorreta){
        System.out.println("Senha corrreta!");
        System.out.println("A senha digitada foi : "+num);
       
     
    }
    
    leia.close();    
}
    
}
