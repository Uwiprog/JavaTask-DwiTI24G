package tugas2;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) throws Exception {
        Scanner inputan  = new Scanner(System.in);
        int  perkilo, jumlahDiBeli, harusDibayar, Diberikan, Kembalian;
        System.out.print("Masukan nilai kilo");
        jumlahDiBeli = inputan.nextInt();
        perkilo = 24000;
        harusDibayar = perkilo*jumlahDiBeli;
        System.out.println("harus di bayar"+ harusDibayar);
        System.out.print("Masukan Duid");
        Diberikan = inputan.nextInt();
        Kembalian = Diberikan - harusDibayar;
        System.out.println("kembalian =" + Kembalian);
        inputan.close();
    }
}
