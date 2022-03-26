import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int semana;
        int mes;
        double resultado;
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");
        System.out.print("\nSelecione o dia da semana: ");
        semana = teclado.nextInt();
        System.out.println("Digite o número do mês");
        mes = teclado.nextInt();
        resultado = mes%2;
        if((semana==1||semana==7)&&resultado!=0){
            System.out.print("Final de semana livre");
        }else if((semana==1||semana==7)&&resultado==0){
            System.out.print("Final de semana de ações sociais");
        }else{
            System.out.print("Não é final de semana");
        }
    }        
}
