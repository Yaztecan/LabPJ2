package EX2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Christian\\IdeaProjects\\LabPJ2\\src\\EX2\\cantec.txt")));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("cantec_out.txt")));

        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        int index = 0;
        String line;
        Vers[] versuri = new Vers[100];


        while((line = reader.readLine())!= null && index < versuri.length) {
            versuri[index] = new Vers(line);
            index++;
        }

        for (int i = 0; i < index; i++) {

            int numVowels = versuri[index].nrVocale(line);
            int numCuv = versuri[index].nrCuvinte(line);
            boolean stelutza = versuri[index].stelutza();

            System.out.print("Cuvant cautat: ");
            String ending = scan.nextLine();

            if (stelutza) {
                line = line.toUpperCase();
            } else if (line.endsWith(ending)) {
                line += " *";
            }

            writer.write(versuri[index].getVers() + "(" + numCuv + "cuvinte, " + numVowels + "vocale");
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}
