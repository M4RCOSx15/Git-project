package atividade;
import java.util.Scanner;
public class Atividadeif {
    public static void main(String []args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o raio : ");
        float r = leia.nextFloat();
        System.out.println("A area do circulo com raio :"+r+ " é :"+ Math.PI*(r*r));
        leia.close();
    }
    
}
