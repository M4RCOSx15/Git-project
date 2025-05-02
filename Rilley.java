package atividade;
import java.util.Scanner;
public class Rilley{
    public static void main(String []args){
        double cont, alegria, tristeza;
        alegria = 0;
        tristeza= 0;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos amigos a Rilley fez ? ");
        cont = leia.nextDouble();
        if(cont>0){
             alegria = cont*10;
             System.out.println("Alegria: "+alegria);
        }else{
             tristeza = cont*30;
             System.out.println("Tristeza: "+tristeza);
        }
        System.out.println("Qual a nota da prova A1 :");
        Double a1 = leia.nextDouble();
        System.out.println("Qual a nota da prova A2 :");
        Double a2 = leia.nextDouble();
        System.out.println("Qual a nota da prova A3 :");
        Double a3 = leia.nextDouble();
        Double media = (a1 + a2 + a3)/3;
        if(media>=7){
           
            System.out.println(("Rilley está aprovada!!!"));
            alegria = alegria + 50;
            System.out.println("Alegria: "+alegria);
        }else{
            System.out.println(("Rilley está reprovada!!!"));
            tristeza = tristeza+50;
            System.out.println("Tristeza: "+tristeza);
        }
        System.out.println( "Quantos exercicios voce resolveu em programação");
        Double ex = leia.nextDouble();
        if(ex==10){
            alegria = alegria*10;
            System.out.println("Alegria: "+alegria);
        }else if(ex!=10){
            tristeza = tristeza*(10-ex);
            alegria = alegria * ex;
            System.out.println("Tristeza: "+tristeza);

        }
        if(alegria>tristeza){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
            System.out.println("Alegria: "+alegria);
        }else{
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
            System.out.println("Tristeza: "+tristeza);
        }
        leia.close();
        
    }
}