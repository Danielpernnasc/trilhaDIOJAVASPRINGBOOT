
import java.util.Scanner;

public class Comunicacao {

    public static void main(String[] args) {
        indentificarCliente();
    }

    static void indentificarCliente() {
        Scanner scanner = new Scanner(System.in);

        // String[] servicos = {"Movel", "Fixo", "banda Larga", "tv por assinatura"};
        // String [] clientes = {"MARIANA", "DANILO", "CRISTIANE", "HELEN"};
        String clienteA = "MARIANA";
        String clienteB = "DANILO";
        String clienteC = "CRISTIANE";
        String clienteD = "HELEN";

        String servicoA = "Movel";
        String servicoB = "Fixo";
        String servicoC = "banda Larga";
        String servicoD = "tv por assinatura";

        System.out.println("Digite o nome do cliente: ");
        String entradaCliente = scanner.nextLine().trim().toUpperCase();

        // String[] partes = entradaCliente.split(" ");
        // String nomeCliente = partes[0];
        boolean contratado = false;

        // for (int i = 0; i < clientes.length; i++){
        // if(clientes[i].equals(entradaCliente) &&
        // servicos[i].equalsIgnoreCase(servico)){
        // System.out.println(entradaCliente + " tem o serviço contrado " + servico);
        // contratado = true;
        // break;
        // }
        // }

        if (entradaCliente.equals(clienteA)) {
            contratado = verificarServico(clienteA, new String[] { servicoA, servicoB, servicoC }, entradaCliente);
        } else if (entradaCliente.equals(clienteB)) {
            contratado = verificarServico(clienteB, new String[] { servicoB, servicoC }, entradaCliente);
        } else if (entradaCliente.equals(clienteC)) {
            contratado = verificarServico(clienteC, new String[] { servicoC, servicoD }, entradaCliente);
        } else if (entradaCliente.equals(clienteD)) {
            contratado = verificarServico(clienteD, new String[] { servicoD }, entradaCliente);
        }

        if (!contratado) {
            System.out.println("Não" + entradaCliente + " não tem o serviço contrado ");
        }
        scanner.close();
    }

    static boolean verificarServico(String cliente, String[] servicos, String servico) {
        System.out.println("Sim " + cliente + " tem o serviço " + servico);
        for (String s : servicos) {
            System.out.println("- " + s);
        }
        return true;

    }
}
