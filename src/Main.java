import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        BufferedWriter bw=null;

        try {
            br = new BufferedReader(new FileReader("archivo1.txt"));
            bw = new BufferedWriter(new FileWriter("archivo2.txt"));

            String st;
            while ((st = br.readLine()) != null) {
                bw.write(st);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}