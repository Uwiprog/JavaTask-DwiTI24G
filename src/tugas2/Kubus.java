package tugas2;

import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        int Sisi, Volume;
        System.out.print("masukan nilai sisi =");
        Sisi = inputan.nextInt();
        System.out.println("Sisi =" + Sisi);
        Volume = Sisi*Sisi*Sisi;
        System.out.println("Volume =" + Volume);
        inputan.close();
    }
}
