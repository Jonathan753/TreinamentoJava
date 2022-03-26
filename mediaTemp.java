import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String[] dia ={"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};  
        int[] temp = new int[7];
        int i, tempNetgativa=0, tempPositiva=0, divisorNegativo=0, divisorPositivo=0, totalNegativo, totalPositivo;
        for(i = 0; i<dia.length; i++){
            System.out.printf("\nDigite a tempera(%s): ",dia[i]);
            temp[i] = ler.nextInt();
            if(temp[i]<0){
                tempNetgativa+=temp[i];
                divisorNegativo++;
            }else{
                tempPositiva+=temp[i];
                divisorPositivo++;
            }
        }
        if(divisorPositivo==0){
            totalPositivo=0;
        }else{
            totalPositivo=tempPositiva/divisorPositivo;
        }
        if(divisorNegativo==0){
            totalNegativo=0;
        }else{
            totalNegativo=tempNetgativa/divisorNegativo;
        }
        System.out.printf("\nMédia da temperatura positiva: %d", totalPositivo);
        System.out.printf("\nMédia da temperatura negativa: %d", totalNegativo);
    }
}