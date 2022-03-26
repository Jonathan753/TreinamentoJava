import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        char imovel = ' ';
        double vAnterior, consumo, vAtual, vConta, vEnergia;
        final double residencial = 0.50, comercial = 0.70, industrial = 0.40;
        do{
            System.out.println("\nR - Residencial");
            System.out.println("C - Comercial");
            System.out.println("I - Industrial");
            System.out.print("Escolha seu imóvel: ");
            imovel = teclado.nextLine().charAt(0);
            imovel = Character.toUpperCase(imovel);
            if(imovel!='R'&&imovel!='C'&&imovel!='I'){
                System.out.println("Dado incorreto");
                continue;
            }
            break;
        }while(true);
        do{
            System.out.print("Informe o valor anterior do medidor de energia: ");
            vAnterior = teclado.nextDouble();
            if(vAnterior<0){
                System.out.println("Dado incorreto");
                continue;
            }
            break;
        }while(true);
        do{
            System.out.print("Informe o valor atual do medidor de energia: ");
            vAtual = teclado.nextDouble();
            if(vAnterior>vAtual){
                System.out.println("Dado incorreto");
                continue;
            }
            break;
        }while(true);
        System.out.println("***************************");
        if(imovel=='R'){
            System.out.println("imóvel: Residencial");
            vEnergia=residencial;
        }else if(imovel=='C'){
            System.out.println("imóvel: Comercial");
            vEnergia=comercial;
        }else{
            System.out.println("imóvel: Industrial");
            vEnergia=industrial;
        }
        consumo = vAtual-vAnterior;
        System.out.printf("Consumo: %.2f kWh", consumo);
        vConta = consumo*vEnergia;
        System.out.printf("\nValor da conta de energia: R$ %.2f", vConta);
    }        
}
