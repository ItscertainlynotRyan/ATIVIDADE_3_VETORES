import java.util.Scanner;

public class Atividade_4_Leitura_de_Valores_pelo_Usuário {
    public static void main(String[] args) {

        int[] at4 = new int[3];
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Insira três números:");
        System.out.println("n°1");
        int num1 = sc4.nextInt();
        System.out.println("n°2");
        int num2 = sc4.nextInt();
        System.out.println("n°3");
        int num3 = sc4.nextInt();
        at4[0] = num1;
        at4[1] = num2;
        at4[2] = num3;
        int md = (at4[0] + at4[1] + at4[2]) / 3;
        System.out.println("O primeiro valor inserido foi " + at4[0] + ", o segundo é " + at4[1] + " e o terceiro é " + at4[2] + " e á média desses  três valores é " + md);


    }
}