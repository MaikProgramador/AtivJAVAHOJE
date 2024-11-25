import java.util.Scanner;

public class PrincipalVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo do veículo:");
        String tipo = scanner.nextLine();
        System.out.println("Digite a marca do veículo:");
        String marca = scanner.nextLine();
        System.out.println("Digite o ano de fabricação do veículo:");
        int anoFabricacao = scanner.nextInt();

        Veiculo veiculo = new Veiculo(tipo, marca, anoFabricacao);

        System.out.println("\nDados do Veículo:");
        veiculo.imprimir();

        System.out.println("\nDigite o ano atual:");
        int anoAtual = scanner.nextInt();
        System.out.println("Idade do Veículo: " + veiculo.calcularIdade(anoAtual) + " anos");

        scanner.close();
    }
}
