package UTS;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukkan nominal Gaji: ");
        int Gaji = inputan.nextInt();
        System.out.print("Masukkan Jam lembur");
        int JamLembur = inputan.nextInt();
        int PerjamLembur = Gaji / 150;
        double Upahlembur = 1.5;

        System.out.println("Gaji: " + Gaji + " Jam Lembur: " + JamLembur);
        System.out.println("====================================================");

        if (JamLembur >= 5){
            int JamLebih = JamLembur - 5;
            int JamLemburPertama = 5* PerjamLembur;
            double Lebih = JamLebih*Upahlembur*PerjamLembur;
            double TotalGaji = Gaji + Upahlembur + JamLemburPertama + Lebih;
            System.out.print("Total Gaji: " + TotalGaji); 
        }else{
            System.out.print("Total Gaji: " + Gaji);
        }
        System.out.print("");
        inputan.close();
    }
}
