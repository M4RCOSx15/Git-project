package atividade;
import java.util.Scanner;
public class Validacao {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome : ");
        String nome = leia.nextLine();
        if(nome.length()>3){
            System.out.println("Seu nome foi preenchido com sucesso \n seu nome é :"+nome);
        }else{
            System.out.println("Seu nome foi preenchido incorretamente");
        }
        System.out.println("Digite sua idade");
        int idade = leia.nextInt();
        if(idade >= 0 && idade <= 150 ){
            System.out.println("Idade valida \nsua idade é: "+idade);
        }else{
            System.out.println("Idade invalida \n sua idade é : "+idade);
        }
        System.out.println("Digite seu salário : ");
        Double sala = leia.nextDouble();
        if(sala!= 0){
            System.out.println("Salario valido \n seu salario é : "+sala);
        }else{
            System.out.println("Salario invalido(menor que zero) \n numero digitado :"+sala);
        }
        System.out.println("Digite seu sexo :");
        char sex = leia.next().charAt(0);
         
        switch (sex) {
            case 'm':
             System.out.println("Voce é um homem");   
                break;
        
            case 'f':
            System.out.println("Voce é mulher ");
                break;
                default :
                System.out.println("Sexo invalido ");
                break;
        }
        System.out.println("Digite seu estado civil : \n[c] para casado \n [s] para solteiro \n [v] para viuvo \n[d] para divorciado");
        char estado = leia.next().charAt(0);
        switch (estado) {
            case 'c':
                System.out.println("Voce é casado");
                break;
        
            case 's':
            System.out.println("Voce é solteiro");
                break;
                case 'v':
                System.out.println("Voce é viuvo");
                break;
                case 'd':
                System.out.println("Voce é divorciado ");
                break;
        }
        leia.close();;
    }
    
}
