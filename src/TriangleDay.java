import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleDay {
    public static void main(String[] args) throws IOException {
        TriangleDayWriteDataToFile write = new TriangleDayWriteDataToFile();
        File f = new File("input.txt");
        Scanner sc = new Scanner(f);
        int howManyTests = sc.nextInt();

        runTests(howManyTests, sc);

        f = new File("input2.txt");
        sc = new Scanner(f);
        howManyTests = sc.nextInt();

        runTests(howManyTests, sc);
    }

    public static double triangleArea(int a, int b, int c){
        double p = (a+b+c)/2.0;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    private static int chalkConsumed(int players, double chalkConsumption, Scanner sc){
        int chalkConsumed = 0;
        for (int i = 0; i < players; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            chalkConsumed += (int) (triangleArea(a, b, c) * chalkConsumption / 10);
        }
        return chalkConsumed;
    }
    private static void runTests(int howManyTests, Scanner sc){
        for (int i = 0; i < howManyTests; i++) {
            int howManyPlayers = sc.nextInt();
            double chalkConsumption = Double.parseDouble(sc.nextLine()); // 1 kg/m^2 = 0.1 g/cm^2
            System.out.println("Ile dzieci: " + howManyPlayers);
            System.out.println("Ile kg kredy schodzi na 1m^2: " + String.format("%.2f", chalkConsumption));
            System.out.println("Ile gramow kredy poszlo (zaokraglone): " + chalkConsumed(howManyPlayers, chalkConsumption, sc));
        }
    }
}
