package Lab2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader fluxIn = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Christian\\IdeaProjects\\LabPJ2\\src\\Lab2\\judete_in.txt")));

        String[] judete = new String[40];

        int i = 0;
        while((line = fluxIn.readLine())!= null){
            judete[i++] = line;

        }
        Arrays.sort(judete,0,i);
        System.out.println("Judet cautat: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String judetCautat = br.readLine();

        int pozitie = Arrays.binarySearch(judete, 0, i,judetCautat);
        if(pozitie >= 0){
            System.out.println("Județul " + judetCautat + " se află pe poziția " + (pozitie + 1) + " în lista ordonată.");
    } else {
        System.out.println("Județul " + judetCautat + " nu a fost găsit în lista ordonată.");
     }
    }
}
