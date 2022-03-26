import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String[] nomes= new String[5];
        String principal;
        int contador=0;
        for(int i=0;i<nomes.length;i++){
            System.out.printf("Nome %d: ",i+1);
            nomes[i]=input.nextLine();
        }
        System.out.print("\nDigite um nome: ");
        principal=input.nextLine();
        for(int j=0;j<nomes.length;j++){
            if(principal.compareTo(nomes[j])<0){
            contador+=1;
            }
        }
        System.out.printf("\nExiste %d nomes posteriores", contador);
    }
}