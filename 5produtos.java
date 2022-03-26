import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double[] produtos = new double[5];
        int i;
        for(i=0;i<produtos.length;i++){
            do{
                System.out.printf("\nDigite o valor do produto %d: R$ ",i+1);
                produtos[i] = ler.nextDouble();
                if(produtos[i]<0){
                    System.out.println("Não aceitamos produtos com valor negativo.");
                    continue;
                }
                break;
            }while(true);
        }
        System.out.println("******************************************************");
        double maior=produtos[0], menor=produtos[0];
        for(i=0;i<produtos.length;i++){
            if(produtos[i]>maior){
                maior = produtos[i];
            }
            if(produtos[i]<menor){
                menor = produtos[i];
            }
        }
        System.out.printf("\nProduto com o maior preço: R$ %.2f", maior);
        System.out.printf("\nProduto com o menor preço: R$ %.2f", menor);
    }
}