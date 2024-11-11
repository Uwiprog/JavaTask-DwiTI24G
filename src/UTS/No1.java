package UTS;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        //Nilai rata rata (SKS*nilai/total SKS)

        System.out.print("Masukkan Nama Mahasiswa: ");
        String Mahasiswa = inputan.nextLine();
        System.out.print("Masukkan Semester: ");
        int Semester = inputan.nextInt();
        double Sum = 0;
        int JumlahSks= 0;

        inputan.nextLine();

        String inputlagi = "y";
        String mutu = "E";
        do {
            System.out.print("Mata kuliah: ");
            String Matakuliah = inputan.nextLine();
            System.out.print("Sks: ");
            int Sks = inputan.nextInt();
            inputan.nextLine();
            int Nilai = inputan.nextInt();
            if(Nilai >= 0){
                mutu = "E";
            }else if (Nilai >= 1){
                mutu = "D";
            }else if (Nilai >= 2){
                mutu = "C";
            }else if (Nilai >= 3){
                mutu = "B";
            }else{
                mutu = "A";
            }
            JumlahSks = JumlahSks + Sks;
        } while (inputlagi.equals("y"));
        inputan.close();
    }
}
