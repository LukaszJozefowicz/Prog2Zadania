import java.util.Scanner;

public class CandyForNameday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc osob w klasie:");
        int classMatesPlusMe = sc.nextInt();
        System.out.println("Podaj ilosc cukierkow");
        int candies = sc.nextInt();

        if (candies % (classMatesPlusMe - 1)  == 0){
            System.out.println("NIE");
        } else {
            System.out.println("TAK, " + candies % (classMatesPlusMe - 1));
        }
    }
}
