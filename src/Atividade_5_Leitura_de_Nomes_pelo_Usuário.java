import java.util.Scanner;

public class Atividade_5_Leitura_de_Nomes_pelo_Usuário {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Digite  3  nomes: ");
        nomes[0] = sc5.nextLine();
        nomes[1] = sc5.nextLine();
        nomes[2] = sc5.nextLine();

        System.out.println("O primeiro nome é: " + nomes[0] + " o segundo nome é: " + nomes[1] + " e o terceiro é: " + nomes[2]);
    }
}