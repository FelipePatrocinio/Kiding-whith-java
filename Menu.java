import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        System.out.println("  |  MENU          |  ");
        System.out.println("  |  OPÇÕES        |  ");
        System.out.println("  | 1 - OPÇÃO 1    |  ");
        System.out.println("  | 2 - OPÇÃO 2    |  ");
        System.out.println("  | 3 - OPÇÃO 3    |  ");
        Scanner menu = new Scanner(System.in);

        System.out.println(" Seleciona uma opção ");
        int opcao = menu.nextInt();

        switch (opcao){
        case 1:
        System.out.println("Opção 1 selecionada");
        break;
        case 2:
        System.out.println("Opção 2 selecionada");
        break;
        case 3:
        System.out.println("Sair");
        break;
        default:
        case 4:
        System.out.println("Seleção inválida");
        break;

        }





    }
}
