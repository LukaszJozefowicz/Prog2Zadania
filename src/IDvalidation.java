import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IDvalidation {

    private final int[] wages = {7, 3, 1, 9, 7, 3, 1, 7, 3};
    private Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        IDvalidation id = new IDvalidation();
        id.start();
    }

    public void start(){
        for (int i = 0; i < 26; i++){
            map.put((char)('A' + i), 10 + i);   //'A' = 65
        }
        System.out.println("Podaj nr ID:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] idArray = input.toCharArray();
        int[] results = new int[9];
        int sum = 0;

        for (int i = 0; i < 3; i++){
            results[i] = map.get(idArray[i]) * wages[i];
        }
        for (int i = 3; i < 9; i++){
            results[i] = (int)(idArray[i]) * wages[i];
        }

        for (int i : results){
            sum += i;
        }

        System.out.println(sum);
        if(sum % 10 == 0){
            System.out.println("ID valid");
        } else{
            System.out.println("ID invalid");
        }
    }
}
