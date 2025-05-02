package atividade;
import java.util.Scanner;
public class Sonic {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int aly,determinacao, medo, esp , confianca, desanimo, incerteza;
        medo=0;
        confianca=0;
        desanimo = 0;
        esp = 0;
        incerteza=0;
        

        System.out.println("quantos novos aliados Sonic, Knuckles e Tails conseguiram encontrar para ajudar na luta contra Shadow. :");
        aly = leia.nextInt();
        System.out.println("Como a equipe se saiu na primeira luta ?");
        int n1 = leia.nextInt();
        System.out.println("Como a equipe se saiu na segunda luta ?");
        int n2 = leia.nextInt();
        System.out.println("Como a equipe se saiu na terceira luta ?");
        int n3 = leia.nextInt();
        System.out.println(("Quantas das 12 estrategias conseguiram analisar:"));
        int estrategia = leia.nextInt();
        if(estrategia==12){
         determinacao = estrategia*10;
        }else{
         determinacao = estrategia*10;
          incerteza = (12-estrategia)*10;
        }
        if(aly != 0){
             esp = aly *15;
        }else{
             medo = medo + 40;
        }
        int media = (n1+n2+n3)/3;
        if(media >= 7){
            confianca = confianca + 60; 
            System.out.println("Confiaca:"+confianca);
        }else{
             desanimo = desanimo +60;
        }
        System.out.println("Pontuação da esperança :"+esp);
        System.out.println("Pontuação da medo :"+medo);
        System.out.println("Pontuação da confianca :"+confianca);
        System.out.println("Pontuação da desanimo :"+desanimo);
        System.out.println("Pontuação da determinação :"+determinacao);
        System.out.println("Pontuação da incerteza :"+incerteza);
        int soma = esp + confianca+determinacao;
        int soma1 =  medo+desanimo+ incerteza;
        if(soma > soma1){
            System.out.println("O Shadow foi derrotado.");
        }else{
            System.out.println("O Shadow venceu o time do Sonic. ");
        }
        leia.close();
    }
    
}
