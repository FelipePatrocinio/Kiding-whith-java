import java.util.Scanner;

public class CalculadorDeImc {
    
    public static void main(String[] args){

        System.out.println("  | Calculador de IMC |");

        int opcao;
        do{
            System.out.println("  | Digite uma opção  |");
            System.out.println("  | 1- Calcular IMC   |");
            System.out.println("  | 0- Para sair      |");
            
            Scanner scanner = new Scanner(System.in);

            opcao = scanner.nextInt();

            processar(opcao);
            }while (opcao != 0);

    }

    public static void processar(int opcao){

        switch(opcao) {

            case 1:{
                
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Calculando o IMC");

                System.out.println(" Digite sua altura ");
                Double altura = scanner.nextInt();
    
                Double altura2 = altura * altura;


                System.out.println(altura2);

                System.out.println(" Digite seu peso ");
                Double peso = scanner.nextInt();
         
                System.out.println("meu peso é " + peso);

                Double imc = peso / altura2;

                System.out.println(" Seu IMC é " + imc);
        
                break;

            }

        

        case 2: {
                
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Calculando o IMC");

            System.out.println(" Digite seu peso ");
            int peso = scanner.nextInt();

            System.out.println(" Digite sua altura ");
            int altura = scanner.nextInt();

    
            

        }

    }

    }

}
