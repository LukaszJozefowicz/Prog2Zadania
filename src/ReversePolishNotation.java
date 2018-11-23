import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//Na wejœcie jest lista i operacje s¹ na intach

public class ReversePolishNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = " ";
        int a, b;
        List<String> inputList = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        System.out.println("Podawaj kolejno liczby i wyrazenia w ONP (= zeby zakonczyc): ");
        while (!input.equals("=")){
            input = sc.nextLine();
            inputList.add(input);
        }

        System.out.println(inputList.toString());


        for (String s :inputList){
            if (Character.isDigit(s.charAt(0))){
                stack.push(s);
            } else {
                switch (s) {
                    case "*":
                        a = Integer.parseInt(stack.pop());
                        b = Integer.parseInt(stack.pop());
                        stack.push(Integer.toString(a * b));
                        break;
                    case "/":
                        a = Integer.parseInt(stack.pop());
                        b = Integer.parseInt(stack.pop());
                        stack.push(Integer.toString(b / a));
                        break;
                    case "-":
                        a = Integer.parseInt(stack.pop());
                        b = Integer.parseInt(stack.pop());
                        stack.push(Integer.toString(b - a));
                        break;
                    case "+":
                        a = Integer.parseInt(stack.pop());
                        b = Integer.parseInt(stack.pop());
                        stack.push(Integer.toString(b + a));
                        break;
                    case "=":
                        System.out.println("Wynik: " + stack.peek());
                        break;
                }//end switch
            }//end else
        }//end for
    }
}
