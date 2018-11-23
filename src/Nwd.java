import java.util.Scanner;

public class Nwd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        int a = sc.nextInt();
        System.out.println("Podaj liczbe b:");
        int b = sc.nextInt();

        System.out.println("NWD(" + a + ", " + b + ") = " + NWD(a, b));
    }

    public static int NWD(int a, int b){
        while(true) {
            if (a == b) {
                return a;
            } else if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }
    }
}
