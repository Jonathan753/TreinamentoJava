import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] morador = new int[6];
        int i, contOcu=0, contDesocu=0, acumulador=0, media;
        final float LOCACAO=800, ACRESCIMO=100;
        float total;
        for(i=0;i<morador.length;i++){
            do{
                System.out.printf("\nQuantos reside na kitnet %d: ", i+1);
                morador[i] = input.nextInt();
                if(morador[i]<0||morador[i]>3){
                    System.out.println("Número de moradores indisponível.");
                    System.out.println("Digite Novamente.");
                    continue;
                }else{
                    break;
                }
            }while(true);
        }
        for(i=0;i<morador.length;i++){
            if(morador[i]==0){
                contDesocu++;
            }else{
                acumulador+=morador[i];
                contOcu++;
            }
        }
        if(contOcu==0){
            media=0;
        }else{
            media=acumulador/contOcu;
        }
        System.out.println("*********************************************************");
        System.out.print("Quantidade de kitnets desocupadas: "+contDesocu);
        System.out.printf("\nMédia de moradores por kitnets: "+media);
        for(i=0;i<morador.length;i++){
            if(morador[i]==0){
                total=0;
                System.out.printf("\nValor da locação da kitnet %d: R$ %.2f", i+1, total);
            }else if(morador[i]==1){
                total=LOCACAO;
                System.out.printf("\nValor da locação da kitnet %d: R$ %.2f", i+1, total);
            }else if(morador[i]==2){
                total=LOCACAO+ACRESCIMO;
                System.out.printf("\nValor da locação da kitnet %d: R$ %.2f", i+1, total);
            }else{
                total=LOCACAO+2*ACRESCIMO;
                System.out.printf("\nValor da locação da kitnet %d: R$ %.2f", i+1, total);
            }
        }
    }
}