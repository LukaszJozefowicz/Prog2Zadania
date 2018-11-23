import java.util.Scanner;

public class Nww {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        int a = sc.nextInt();
        System.out.println("Podaj liczbe b:");
        int b = sc.nextInt();

        System.out.println("NWW(" + a + ", " + b + ") = " + NWW(a, b));
    }

    public static int NWW(int a, int b){
        return (a * b) / Nwd.NWD(a, b);
    }
}
