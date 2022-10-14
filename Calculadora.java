import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

        System.out.println(" |   CALCULADORA SIMPLES   | ");

        int opcao;
        do{
            System.out.println(" |1 - Somar (+) ");
            System.out.println(" |2 - Subritair (-) ");
            System.out.println(" |3 - Multiplicar (X) ");
            System.out.println(" |4 - Dividir (/) ");
            System.out.println(" |5 - O que voce deseja fazer? (Aperte 0 para sair) ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);
            }while (opcao != 0);

    }

    public static void processar(int opcao) {

        switch(opcao) {

            case 1:{

                Scanner scanner = new Scanner(System.in);

                System.out.println("Somando 2 numeros ");

                System.out.println("Digite o primeiro numero");
                int numero1 = scanner.nextInt();
                
                System.out.println("Digite o segundo numero");
                int numero2 = scanner.nextInt();
                
                int resultado = numero1 + numero2;

                System.out.println("A soma dos dois numero é " + resultado);


                break;
            }
            case 2:{

                Scanner scanner = new Scanner(System.in);

                System.out.println("Subitraindo 2 numeros ");

                System.out.println("Digite o primeiro numero");
                int numero1 = scanner.nextInt();
                
                System.out.println("Digite o segundo numero");
                int numero2 = scanner.nextInt();
                
                int resultado = numero1 - numero2;

                System.out.println("A soma dos dois numero é " + resultado);

                break;
            }
            case 3:{

                Scanner scanner = new Scanner(System.in);

                System.out.println("Multiplicando 2 numeros ");

                System.out.println("Digite o primeiro numero");
                int numero1 = scanner.nextInt();
                
                System.out.println("Digite o segundo numero");
                int numero2 = scanner.nextInt();
                
                int resultado = numero1 * numero2;

                System.out.println("A soma dos dois numero é " + resultado);

                break;
            }

            case 4:{

                Scanner scanner = new Scanner(System.in);

                System.out.println("Dividindo 2 numeros ");

                System.out.println("Digite o primeiro numero");
                int numero1 = scanner.nextInt();
                
                System.out.println("Digite o segundo numero");
                int numero2 = scanner.nextInt();
                
                int resultado = numero1 / numero2;

                System.out.println("A soma dos dois numero é " + resultado);

                break;
            }

        }

    }
}
