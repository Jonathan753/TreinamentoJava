import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int entrada;
	    double base, altura, quadrado, raio, circulo, triangulo;
	    final double PI=3.14;
		Scanner input = new Scanner(System.in);
		do{
		    do{
		        System.out.println("\n***MENU***");
	        	System.out.println("1 - Quadrado");
		        System.out.println("2 - Círculo");
		        System.out.println("3 - Triângulo");
		        System.out.println("0 - Fim");
		        entrada = input.nextInt();
		        if(entrada==1||entrada==2||entrada==3||entrada==0){
		            break;
		        }else{
		            System.out.println("Opção Inválida");
		            continue;
		        }
		        }while(true);
		        switch(entrada){
	                case 1:
	                    System.out.print("\nInforme a base: ");
	                    base = input.nextDouble();
	                    System.out.print("\nInforme a altura: ");
	                    altura = input.nextDouble();
	                    quadrado = base*altura;
	                    System.out.printf("\nA área do quadrado é: %.2f", quadrado);
	                    break;
	                case 2:
	                    System.out.print("\nInforme o raio: ");
	                    raio = input.nextDouble();
	                    circulo = PI*raio*raio;
	                    System.out.printf("\nA área do círculo é: %.2f", circulo);
	                    break;
	                case 3:
	                    System.out.print("\nInforme a base: ");
	                    base = input.nextDouble();
	                    System.out.print("\nInforme a altura: ");
	                    altura = input.nextDouble();
	                    triangulo = (base*altura)/2;
	                    System.out.printf("\nA área do triângulo é: %.2f", triangulo);
	                    break;
	                case 0:
		        }
		}while(entrada!=0);
	}
}
