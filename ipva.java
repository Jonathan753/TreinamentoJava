import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int digitoCarro, contador=1;
        double valorCarro, janeiro=0, fevereiro=0, marco=0, dezembro=0, acumulador=0;
        final double IPVA=0.1;
        System.out.println("Informe dados dos seguintes 6 carros");
        do{
            System.out.print("Informe o ultimo dígito da placa do "+ contador +"º: ");
            digitoCarro = input.nextInt();
            if(digitoCarro>12||digitoCarro<1){
                System.out.println("Dado incorreto!");
                continue;
            }
            do{
                System.out.print("Informe o valor do "+ contador +"º carro: ");
                valorCarro = input.nextFloat();
                System.out.println(" ");
                if(valorCarro<0){
                    System.out.println("Dado incorreto!");
                    continue;
                }else{
                    break;
                }
            }while(true);
            if(digitoCarro==1||digitoCarro==2||digitoCarro==3){
                janeiro=janeiro+(valorCarro*IPVA);
            }else if(digitoCarro==4||digitoCarro==5||digitoCarro==6){
                fevereiro=fevereiro+(valorCarro*IPVA);
            }else if(digitoCarro==7||digitoCarro==8||digitoCarro==9){
                marco=marco+(valorCarro*IPVA);
            }else{
                dezembro=dezembro+(valorCarro*IPVA);
            }
            acumulador=acumulador+(valorCarro*IPVA);
            contador++;
        }while(contador<=6);
        System.out.println("*************************************");
        System.out.printf("O valor arrecadado de Janeiro: R$ %.2f", janeiro);
        System.out.printf("\nO valor arrecadado de Fevereiro: R$ %.2f", fevereiro);
        System.out.printf("\nO valor arrecadado de Março: R$ %.2f", marco);
        System.out.printf("\nO valor arrecadado de Dezembro: R$ %.2f", dezembro);
        System.out.printf("\n\nO valor arrecadado Total: R$ %.2f", acumulador);
    }
}