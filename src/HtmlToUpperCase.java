import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HtmlToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("code.txt");
        Scanner sc = new Scanner(f);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()){
            sb.append(sc.nextLine());
            sb.append('\n');
        }

        System.out.println(sb.toString());

        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i) == '<'){
                while (sb.charAt(i) != '>'){
                    if(Character.isLowerCase(sb.charAt(i))) {
                        sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                    }
                        i++;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
