package atividade;
public class Crecimento {
    public static void main(String[]args){
     Double A = 80000.0;
     Double B = 200000.0;
    int ano = 0;
    while(A<B){
     A = A+(A * 0.03);
    B = B+(B*0.015);
    ano++;
    System.out.println("Ano A:"+A);
    System.out.println("ano B:"+B); }
    System.out.println("Ano:"+ano);
  }
   
}
