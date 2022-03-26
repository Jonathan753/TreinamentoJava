import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];
        String[] posicao = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};
        String[] letra = new String[5];
        String caractere;
        int i;
        for(i=0;i<nomes.length;i++){
            System.out.printf("Digite o %s nome: ",posicao[i]);
            nomes[i] = ler.nextLine();
            letra[i] = nomes[i].substring(0,1);
        }
        System.out.print("\nDigite uma letra: ");
        caractere = ler.nextLine();
        caractere = caractere.substring(0,1);
        System.out.println("***********************************");
        for(i=0;i<nomes.length;i++){
            if(letra[i].equals(caractere)){
                System.out.printf("\n%s",nomes[i]);
            }
        }
    }
}