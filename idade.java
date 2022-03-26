import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade, contador=1, acumulador=0, deMaior=0, deMenor=0, media, comparadorMaior=0, comparadorMenor=130;
        System.out.println("Digite a idade de 7 pessoas");
        do{
            System.out.printf("Pessoa %d: ", contador);
            idade = input.nextInt();
            if(idade>=130||idade<0){
                System.out.println("Dado incorreto!");
                continue;
            }else{
                System.out.println(" ");
                contador=contador+1;
                if(idade>=comparadorMaior){
                    comparadorMaior=idade;
                }
                if(idade<=comparadorMenor){
                    comparadorMenor=idade;
                }
                acumulador=acumulador+idade;
                if(idade>=18){
                    deMaior=deMaior+1;
                }else{
                    deMenor=deMenor+1;
                }
            }
        }while(contador<=7);
        media=acumulador/7;
        System.out.println("Pessoas maiores que 18: " + deMaior);
        System.out.println("Pessoas menores que 18: " + deMenor);
        System.out.println("Média das idades: " + media);
        System.out.println("Idade pessoa mais idosa: " +comparadorMaior);
        System.out.println("Idade pessoa mais nova: " +comparadorMenor);
    }
}