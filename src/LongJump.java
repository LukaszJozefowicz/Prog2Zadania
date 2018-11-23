import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongJump {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dziennik.txt");   //plik na poziomie katalogu src
        Scanner sc = new Scanner(file);
        List<Integer> resultsList = new ArrayList<>();
        while(sc.hasNextInt()){
            int val = sc.nextInt();
            resultsList.add(val);
        }
        int val = howManyGoodSessions(resultsList);
        int[] results = new int[2];
        System.out.println("Pozytywnych serii treningowych: " + val);
        results = longestJump(resultsList);
        System.out.println("Najdluzszy skok: " + results[0] + "cm");
        System.out.println("Byl to skok nr: " + results[1]);
        results = shortestJump(resultsList);
        System.out.println("Najkrotszy skok: " + results[0] + "cm");
        System.out.println("Byl to skok nr: " + results[1]);
        results = longestStreak(resultsList);
        System.out.println("Najdluzsza seria trwala " + results[0] + " dni");
        System.out.println("Wynik poprawiono o " + results[1] + " cm");

    }

    public static int howManyGoodSessions(List<Integer> list){
        int howManyStreaks = 0;
        int goodStreak = 0;
        for (int i = 0; i < list.size() - 1; i++){
            if(list.get(i + 1) <= list.get(i) && goodStreak > 3){
                howManyStreaks++;
                goodStreak = 0;
                continue;
            }

            if(list.get(i + 1) > list.get(i)){
                goodStreak++;
            }
        }
        return howManyStreaks;
    }

    public static int[] longestJump(List<Integer> list){
        int longest = list.get(0);
        int index = 0;
        int[] results = new int[2];
        for (int i = 1; i < list.size(); i++){
            if(list.get(i) > longest) {
                longest = list.get(i);
                index = list.indexOf(list.get(i));
            }
        }
        results[0] = longest;
        results[1] = index + 1;
        return results;
    }

    public static int[] shortestJump(List<Integer> list){
        int shortest = list.get(0);
        int index = 0;
        int[] results = new int[2];
        for (int i = 1; i < list.size(); i++){
            if(list.get(i) < shortest) {
                shortest = list.get(i);
                index = list.indexOf(list.get(i));
            }
        }
        results[0] = shortest;
        results[1] = index + 1;
        return results;
    }

    public static int[] longestStreak(List<Integer> list){
        int currentStreak = 0;
        int bestStreak = currentStreak;
        int startStreakIndex = 0;
        int endStreakIndex = 0;
        int[] results = new int[2];

        for (int i = 0; i < list.size() - 1; i++){
            if(list.get(i + 1) <= list.get(i)){
                if(currentStreak > bestStreak){
                    bestStreak = currentStreak;
                }
                currentStreak = 0;
                endStreakIndex = i;
                startStreakIndex = i + 1;
                continue;
            }

            if(list.get(i + 1) > list.get(i)){
                currentStreak++;
            }
        }
        results[0] = bestStreak;
        results[1] = list.get(endStreakIndex) - list.get(startStreakIndex);
        return results;
    }
}
