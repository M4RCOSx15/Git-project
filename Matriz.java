package atividade;

public class Matriz {
    public static void main(String[] args) {
        int [][] num = {{1,2,3,4,5},{6,7,8}};
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<3;j++){
                System.out.println("("+num[i]+")"+"("+num[j]+")");
            }
        }
    }
}
