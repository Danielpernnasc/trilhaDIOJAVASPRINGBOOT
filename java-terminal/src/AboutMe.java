import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        // String nome = args[0];
        // String sobrenome = args[1];
        // int idade = Integer.valueOf(args[2]); // inserir valueOf ou Integer.parseInt
        // com int
        // double altura = Double.valueOf(args[3]); // inserir valueOf ou
        // Double.parseDouble com double

        // System.out.println("Olá, eu me chamo " + nome + " " + sobrenome);
        // System.out.println("Tenho " + idade + " anos ");
        // System.out.println("Minha altura é " + altura + "cm");
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, eu me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("O campos idade e altura precisam ser numéricos e use ponto em vez de vírgula.");
        }
    }
}
