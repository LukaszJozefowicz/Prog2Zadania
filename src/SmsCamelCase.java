import java.util.Scanner;

public class SmsCamelCase {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Podaj jakiœ tekst:");
        String input = sc.nextLine();*/
        String input = "Dzisiaj jest czwartek,\nA jutro bedzie piatek. ";
        String output = camelCase(input);
        System.out.println(output);
        output = camelCaseReverse(output);
        System.out.println(output);
    }

    public static String camelCase(String input){

        input = input.trim();
        char[] array = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            if(array[i] == ' '){
                array[i + 1] = Character.toUpperCase(array[i + 1]);
            } else {
                output.append(array[i]);
            }
        }
        return output.toString();
    }

    public static String camelCaseReverse(String input){
        char[] array = input.toCharArray();
        StringBuilder output = new StringBuilder();
        output.append(array[0]);
        for (int i = 1; i < array.length; i++){

            if(Character.isUpperCase(array[i]) && array[i -1] != '\n'){
                output.append(' ');
                output.append(Character.toLowerCase(array[i]));
            } else {
                output.append(array[i]);
            }
        }
        return output.toString();
    }
}
