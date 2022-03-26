import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double preco, arredondado;
        final double TAXA = 0.01234;
        System.out.print("Digite o preço do produto: ");
        preco = teclado.nextDouble();
        System.out.println("************************************");
        System.out.printf("Preço do produto: %.2f", preco);
        arredondado = preco + (preco*TAXA);
        double round = Math.round(arredondado);
        System.out.printf("\nPreço do produto arrendado para baixo: %.2f", Math.floor(arredondado));
        System.out.printf("\nPreço do produto arrendado para cima: %.2f", Math.ceil(arredondado));
        System.out.printf("\nPreço do produto arrendado normal: %.2f", round);
    }        
}
