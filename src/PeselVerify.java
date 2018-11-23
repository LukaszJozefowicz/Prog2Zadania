import java.util.Scanner;

public class PeselVerify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pesel (11 cyfr)");
        String pesel = sc.nextLine();
        //String pesel = "44051401458";
        int result = Integer.parseInt(pesel.substring(0, 1)) +
                Integer.parseInt(pesel.substring(1, 2)) * 3 +
                Integer.parseInt(pesel.substring(2, 3)) * 7 +
                Integer.parseInt(pesel.substring(3, 4)) * 9 +
                Integer.parseInt(pesel.substring(4, 5)) +
                Integer.parseInt(pesel.substring(5, 6)) * 3 +
                Integer.parseInt(pesel.substring(6, 7)) * 7 +
                Integer.parseInt(pesel.substring(7, 8)) * 9 +
                Integer.parseInt(pesel.substring(8, 9)) +
                Integer.parseInt(pesel.substring(9, 10)) * 3 +
                Integer.parseInt(pesel.substring(10, 11));
        if (result % 10 == 0){
            System.out.println("Poprawny pesel");
        } else {
            System.out.println("Niepoprawny pesel");
        }


    }
}
