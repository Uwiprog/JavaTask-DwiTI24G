package tugas7;

import java.util.Scanner;

public class Lembur {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan Nilai Gaji: ");
        int Gaji = inputan.nextInt();
        System.out.print("Masukkan Waktu Lembur: ");
        int Lembur = inputan.nextInt();
        System.out.println("Gaji " + Gaji + ", Jam  " + Lembur + " Jam Maka Gaji yang di berikan adalah");
        System.out.println("=================================================================================");

        if(Lembur >= 4){
            int UpahLemburJam = Gaji / 173;
            System.out.println("Upah lembur per jam " + UpahLemburJam);
            int TotalGaji = Gaji + 4*UpahLemburJam + 2*4*UpahLemburJam;
            System.out.println("Total Gaji: " + TotalGaji);
        }else{
            System.out.print("Total Gaji: " + Gaji);
        }
        inputan.close();
    }
}
