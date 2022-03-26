import java.util.Scanner
public class Main{
    public static void(String[] args){
        Scanner input = new Scanner(System.in);
        double[] salario = new double[4];
        int[] posicao = {1,2,3,4};
        int i;
        for(i=0;i<posicao.length;i++){
            do{
                System.out.printf("Digite o salario para o nível %d: ", posicao[i]);
                salario[i] = input.nextDouble();
                if(salario<0){
                    System.out.println("Informação incorreta!");
                    continue;
                }
                break;
            }while(true);
        }
    }
}