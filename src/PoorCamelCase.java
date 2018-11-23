import java.util.Arrays;
import java.util.Scanner;

public class PoorCamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj jakiś tekst:");
        String input = sc.nextLine();
        char[] array = input.trim().toCharArray();

       int countLetters = 1;
       for (int i = 0; i < array.length; i++){
           switch (array[i]){                       //obsługuje tylko małe polskie znaki
               case (char)261 :
                    array[i] = 'a';
                    break;
               case (char)263 :
                    array[i] = 'c';
                   break;
               case (char)281 :
                    array[i] = 'e';
                   break;
               case (char)322 :
                    array[i] = 'l';
                   break;
               case (char)324 :
                    array[i] = 'n';
                   break;
               case (char)243 :
                   array[i] = 'o';
                   break;
               case (char)347 :
                   array[i] = 's';
                   break;
               case (char)378 :
               case (char)380 :
                   array[i] = 'z';
                   break;
           }
           if (array[i] == ' '){
               continue;
           } else if (countLetters % 2 == 1 && Character.isLowerCase(array[i])) {   //nieparzyste litery jako duze
               array[i] = Character.toUpperCase(array[i]);
               countLetters++;
           } else {
               countLetters++;
           }

       }
       System.out.println(new String(array));
    }
}
