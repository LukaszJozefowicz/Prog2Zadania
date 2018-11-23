import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExhibitPacking {
    public static void main(String[] args) {
        int amountOfExhibits = 7;
        int packageCapacity = 20;
        List<Integer> weightsList = Arrays.asList(4, 10, 18, 6, 16, 20, 13);
        Collections.sort(weightsList);
        int packagesNeeded = 0;
        int howManyPacked = 0;
        System.out.println("Max package capacity: " + packageCapacity);
        System.out.println("How many exhibits to pack: " + amountOfExhibits);
        System.out.println("Sorted exhibits weights: ");
        for (int i : weightsList){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (int i = weightsList.size() - 1; i >= 0; i--){  //id¹c od najwiêkszego (ostatniego) elementu
            if (howManyPacked == amountOfExhibits) break;   //jak wszystkie elementy spakowane to koniec pêtli
            if (weightsList.get(i) == packageCapacity){     //jeœli element jest rowny pojemnoœci pude³ka
                howManyPacked++;
                packagesNeeded++;
                System.out.println("Packed1 " + weightsList.get(i));
                System.out.println("how many packed: " + howManyPacked);
            } else {

                for (int j = 0; j <= i; j++){               //id¹c od pierwszego elementu

                    //bior¹c element od koñca (i) i od pocz¹tku (j)
                    //jeœli suma danych 2 elementow jest mniejsza od pojemnoœci pude³ka
                    //ale suma wiêkszego (i) z nastêpnym mniejszym (j+1) przekracza pojemnoœæ
                    //to oba pakujemy
                    if (weightsList.get(i) + weightsList.get(j) < packageCapacity &&
                            weightsList.get(i) + weightsList.get(j+1) > packageCapacity &&
                            weightsList.get(j+1) != null) {
                        howManyPacked += 2;
                        packagesNeeded++;
                        System.out.println("Packed2 " + weightsList.get(i) + " and " + weightsList.get(j));
                        System.out.println("how many packed: " + howManyPacked);
                        break;

                    //jeœli suma elementów jest wiêksza od pojemnoœci
                    //lub gdy to jest ju¿ ostatni pakowany element
                    //to dodajemy ten wiêkszy (i)
                    } else if (weightsList.get(i) + weightsList.get(j) > packageCapacity || i == j){
                        howManyPacked++;
                        packagesNeeded++;
                        System.out.println("Packed3 " + weightsList.get(i));
                        System.out.println("how many packed: " + howManyPacked);
                        break;

                    //jeœli suma elementów jest równa pojemnoœci, to dodajemy oba do pudelka
                    } else if (weightsList.get(i) + weightsList.get(j) == packageCapacity){
                        howManyPacked += 2;
                        packagesNeeded++;
                        System.out.println("Packed4 " + weightsList.get(i) + " and " + weightsList.get(j));
                        System.out.println("how many packed: " + howManyPacked);
                        break;
                    }
                } //endfor j
            } //end else
        }//endfor i

        System.out.println("\nPackages needed: "+ packagesNeeded);

    }
}
