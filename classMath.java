import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double raiz, num, pot;
        System.out.print("Digite um número: ");
        num = teclado.nextDouble();
        raiz = Math.sqrt(num);
        pot = Math.pow(num,3);
        System.out.print("********************************");
        System.out.printf("Raiz quadrada de %.2f é: %.2f ", num, raiz);
        System.out.printf("elevação ao cubo de %.2f é: %.2f ", num, raiz);
    }        
}
