import java.util.Scanner;

public class combo {
    public static String verificarComboCompleto(String[] servicosContratados) {

        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        for (String servico : servicosContratados) {
            servico = servico.trim().toLowerCase();

            switch (servico) {
                case "movel":

                    movelContratado = true;
                    break;

                case "banda larga":
                    bandaLargaContratada = true;
                    break;

                case "tv":
                    tvContratada = true;
                    break;

                default:
                    break;
            }
        }

        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] servicosContratados = input.split("Digite os serviços contratados, separados por vírgula:,");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}
