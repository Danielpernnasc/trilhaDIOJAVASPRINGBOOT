import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servicos = scanner.nextLine().trim().toLowerCase();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String[] servicosContratados = new String[partes.length - 1];

        // Preenchendo o array de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            servicosContratados[i - 1] = partes[i].trim().toLowerCase();
        }

        // Verificando se o serviço buscado está na lista de serviços contratados
        boolean contratado = verificarServico(servicos, servicosContratados);

        // Exibindo o resultado conforme esperado
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }

    // Função para verificar se o serviço buscado está na lista de serviços
    // contratados
    static boolean verificarServico(String servicos, String[] servicosContratados) {
        for (String produtos : servicosContratados) {
            if (produtos.equals(servicos)) {
                return true;
            }
        }
        return false;
    }
}
