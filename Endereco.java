import java.util.Scanner;

public class Endereco {
    public static void main(String[] args) {
        System.out.println("   |   Cadastro de usuário   |   ");

        Scanner scanner = new Scanner(System.in);
        //Solicitar nome do usuário
        System.out.print("      Digite seu nome completo: ");
        String nome = scanner.nextLine();

        //Solicitar a rua
       
        System.out.print("      Voce mora na rua: ");
        String rua = scanner.nextLine();

        //Solicitar o número

        System.out.print("      Digite o numero de sua residencia: ");
        String numero = scanner.nextLine();

        //Solicitar o bairro

        System.out.print("     Digite o bairro que voce mora: ");
        String bairro = scanner.nextLine();

        //Solicitar a cidade
        System.out.print("     Digite a cidade que voce mora: ");
        String cidade = scanner.nextLine();

        //Solicitar o estado
        System.out.print("     DIgite o estado que voce mora: ");
        String estado = scanner.nextLine();

        //Solicitar o CEP
        System.out.print("     Digite o CEP: ");
        String cep = scanner.nextLine();

        //Informar que o cadastro foi realizado som sucesso.
        System.out.println(" | Cadastro realizado com sucesso | ");
        System.out.println(" |   Confira seus dados abaixo    | ");
        System.out.println();

        //Informar todos os dados que o usuário forneceu
        System.out.println("  Nome: " + nome );
        System.out.println("  Rua: " + rua + "| Numero: " + numero + "| Bairro: " + bairro + "| Cep: " + cep );
        System.out.println("  Cidade: " + cidade + "| Estado: " + estado );   



    }
}