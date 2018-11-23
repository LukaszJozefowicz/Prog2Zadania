import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        WeekDay inputDay;
        int number;         // (1 ? number ? 10^9)

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dzien tygodnia (Pn, Wt, Sr, Czw, Pt, Sb, Nd):");
        inputDay = WeekDay.valueOf(sc.nextLine());
        System.out.println("Podaj liczbe od 1 do 10^9:");
        number = sc.nextInt();

        int n = inputDay.getNumber() + number % 7;
        if (n > 7){
            n = n - 7;
        }
        WeekDay output = WeekDay.values()[n - 1];
        System.out.println(output.name());
    }
}
