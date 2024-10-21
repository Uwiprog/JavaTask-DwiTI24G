package tugas5;

import java.util.Scanner;

public class array1 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String Mahasiswa[] = { "1", "2", "3", "4", "5" };
                String Nama[] = { "Santi", "Aldi", "Riko", "Rahmi", "Koko" };
                int Score[] = { 100, 50, 100, 90, 50 };
                String Keterangan[] = new String[Mahasiswa.length];
                int sum = 0;

                for (int i = 0; i < Mahasiswa.length; i++) {
                        System.out.println("---------------------------------------------------------");
                        System.out.println("Mahasiswa ke : " + Mahasiswa[i]);
                        System.out.println("Nama : " + Nama[i]);
                        System.out.println("Nilai : " + Score[i]);

                        sum += Score[i];

                        if (Score[i] >= 70){
                                Keterangan[i] = "Lulus";
                        }else{
                                Keterangan[i] = "Tidak Lulus";
                        }
                }
                
                double rata_rata = (double) sum/Mahasiswa.length;

                System.out.println(""); //sebagai gap

                System.out.println("Daftar Nilai Mahasiswa");
                System.out.println("===================================================================");
                System.out.println("No\tName\tNilai\tketerangan");
                System.out.println("===================================================================");
                for (int j = 0; j < Mahasiswa.length; j++){
                        System.out.println(Mahasiswa[j] + "\t" + Nama[j] + "\t" + Score[j] + "\t" + Keterangan[j]);
                }

                System.out.println("===================================================================");
                System.out.println("Rata-Rata Nilai Mahasiswa adalah : " + rata_rata);
                sc.close();
        }
}
