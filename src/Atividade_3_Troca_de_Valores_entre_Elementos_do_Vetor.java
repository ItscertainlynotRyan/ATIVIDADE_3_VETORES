public class Atividade_3_Troca_de_Valores_entre_Elementos_do_Vetor {
    public static void main(String[] args) {

        double[] at3 = new double[2];
        at3[0] = 5;
        at3[1] = 10;
        System.out.println("Os valores são: ");
        System.out.println("Primeiro valor " + at3[0] + " Segundo valor " + at3[1]);
        at3[0] = 10;
        at3[1] = 5;
        System.out.println("Os valores depois das trocas são: ");
        System.out.println("Primeiro valor " + at3[0] + " Segundo valor " + at3[1]);

    }
}