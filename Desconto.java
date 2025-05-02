package atividade;
import java.util.Scanner;
public class Desconto {
    
    public static void main(String []args){
     Scanner leia = new Scanner(System.in);
     System.out.println("Digite o valor do produto : ");
     float valor = leia.nextFloat();
     System.out.println("Qual foi o desconto : ");
     float desconto = leia.nextFloat();
     float por = ((desconto/100)*valor);
     float por2 = valor - por;
     System.out.println("O preço com desconto vai ser : "+por2);
     leia.close();
    }
    
}
