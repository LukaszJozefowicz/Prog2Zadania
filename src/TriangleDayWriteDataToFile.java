import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class TriangleDayWriteDataToFile {
    private BufferedWriter wr = new BufferedWriter(new FileWriter("input2.txt"));

    public TriangleDayWriteDataToFile() throws IOException {
        int howManyTests = (int) (Math.random() * 10 + 1);
        wr.write(String.valueOf(howManyTests));
        wr.newLine();
        for (int i = 0; i < howManyTests; i++){
            int howManyPlayers = (int) (Math.random() * 10 + 1);
            wr.write(String.valueOf(howManyPlayers) + " ");
            double chalkConsumption = Math.random() * 10;
            wr.write(String.valueOf(chalkConsumption));
            wr.newLine();
            for (int j = 0; j < howManyPlayers; j++) {
                int a = (int) (Math.random() * 191 + 10);
                int b = (int) (Math.random() * 191 + 10);
                int c = (int) (Math.random() * 191 + 10);
                wr.write(String.valueOf(a) + " " + String.valueOf(b) + " " + String.valueOf(c));
                wr.newLine();
            }
        }
        wr.flush();
        wr.close();
    }
}
