import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EasterDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rok");
        int year = sc.nextInt();

        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = ((b + 8) / 25);
        int g = ((b - f + 1) / 3);
        int h =  (19 * a + b- d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l =  (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int p = (h + l - 7 * m + 114) % 31;
        int day;
        int month;


        day = p + 1;
        month =  (h + l - 7 * m + 114) / 31;
        LocalDate easterDate = LocalDate.of(year, month, day);
        System.out.println(day + " " + month + " " + year);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(easterDate.format(formatter));
    }
}
