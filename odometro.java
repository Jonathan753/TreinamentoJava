import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] semana = {"Domingo", "Segunda", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        int[] vetor = {89400, 89800, 99100, 99500, 900, 1500, 2100, 2200};
        int[] distancia = new int[7];
        int i, acumulador=0, contador=0, media;
        
        for(i=0;i<vetor.length;i++){
            if(i==7){
                break;
            }
            if(vetor[i]>vetor[i+1]){
                distancia[i]=(100000-vetor[i])+vetor[i+1];
            }else{
                distancia[i]=vetor[i+1]-vetor[i];
            }
        }
        for(i=0;i<distancia.length;i++){
            System.out.println("Quantidade percoorrida (" + semana[i] + "): " +distancia[i]+ " Km");
            acumulador+=distancia[i];
            contador++;
        }
        
        media = acumulador/contador;
        System.out.println("************************************************************");
        System.out.printf("A média de quilômetros percorridos: %d", media);
        System.out.println("\n**************************************************************");
        System.out.print("Os dias da semana em que foi percorrido quilômetros acima da média:\n");
        for(i=0;i<distancia.length;i++){
            if(distancia[i]>media){
                System.out.println(semana[i]);
            }
        }
    }
}