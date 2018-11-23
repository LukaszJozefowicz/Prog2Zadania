import java.util.Scanner;

public class Bankomat {

    private static int [] nominals = {200, 100, 50, 20, 10, 5, 2, 1};
    private static int [] resultNominals = {0, 0, 0, 0, 0, 0, 0, 0};

    public static void main(String[] args) {

        //int input = 1765;
        System.out.println("Podaj kwote:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(input + "PLN");
        for (int i = 0; i < nominals.length; i++){
            resultNominals[i] = Math.floorDiv(input, nominals[i]);//input / nominals[i];
            input -= nominals[i] * resultNominals[i];
            if (resultNominals[i] > 0) {
                //System.out.println(resultNominals[i] + " * " + nominals[i] + "PLN");
                System.out.printf("%d * %d\n", resultNominals[i], nominals[i]);
            }
        }
    }
}
