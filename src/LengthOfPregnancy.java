import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LengthOfPregnancy {
    public static void main(String[] args) throws FileNotFoundException {
        int howManyDataSets;
        int motherYearsDif = 21;
        int howManyYears = 6;
        int childYearsDif = 5;

        System.out.println("Dlugosc ciazy czlowieka to "
                + pregnancyLength(motherYearsDif, howManyYears, childYearsDif) + " miesiecy");

        File f = new File("pregnancyLength.txt");
        Scanner sc = new Scanner(f);
        howManyDataSets = sc.nextInt();
        for (int i = 0; i < howManyDataSets; i++){
            motherYearsDif = sc.nextInt();
            howManyYears = sc.nextInt();
            childYearsDif = sc.nextInt();
            System.out.println(pregnancyLength(motherYearsDif, howManyYears, childYearsDif));
        }
    }

    public static double pregnancyLength(int x, int y, int z){
        return (-12) * (x + y - (z * y)) / (double)(z - 1);
    }
}
