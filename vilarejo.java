import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int dia_mes;
        float temp;
        do{
            System.out.print("\nDigite o dia: ");
            dia_mes = teclado.nextInt();
            System.out.print("\nQual a temperatura: ");
            temp = teclado.nextFloat();
                if(dia_mes>0&&dia_mes<=30){
                    if(dia_mes<=7&&temp<0){
                    System.out.print("Feriado Decretado");
                    break;
                    }else{
                    System.out.print("Sem Feriado");
                    break;
                    }
                }else{
                    System.out.print("Dado indisponível");
                    continue;
                }
        }while(true);
    }        
}
