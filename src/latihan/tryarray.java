package latihan;

import java.util.Scanner;

public class tryarray {
    public static void main(String[] args) {

        /*
         * String France[] ={ "Bayu ", "Akbar ", "Eci ", "Dwi ", "Awa ", "Nadwa ",
         * "Isa " };
         * 
         * System.out.println(France[6]);
         * System.out.println(France[4]);
         * System.out.print(France[0] + France[1] + France[2] + France[3] + France[5]);
         * 
         * =============================================================================
         * ===
         * 
         * for (int i = 0; i<France.length; i++){
         * System.out.println(France[i]);
         * }
         * 
         * =============================================================================
         * ===
         * 
         * for (String mhs: France){
         * System.out.println(mhs);
         * }
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * String inputlagi = "y";
         * String France[] = new String[100];
         * int i=0;
         * do {
         * System.out.print("Masukkan Nama Kelompok");
         * France[i] = sc.nextLine();
         * System.out.print("Tambahkan Nama Lagi? (y/n): ");
         * inputlagi = sc.nextLine().toLowerCase();
         * i++;
         * } while (i < France.length && inputlagi.equals("y"));
         * System.out.println("Daftar Kelompok France");
         * 
         * for (int j=0; j < France.length; j++){
         * if (France[j] == null){
         * break;
         * }
         * System.out.println((j+1) + ". " + France[j]);
         * }
         * 
         * sc.close();
         */

        Scanner sc = new Scanner(System.in);
        String inputLagi = "y";
        String Mahasiswa[] = new String[10];
        String keterangan[] = new String[10];

        int Nilai[] = new int[10];
        int sum = 0;
        int i = 0;

        do {
            System.out.print("Masukkan Nama Mahasiswa : ");
            Mahasiswa[i] = sc.nextLine();
            System.out.print("Masukkan Nilai Mahasiswa : ");
            Nilai[i] = sc.nextInt();

            if (Nilai[i] >= 75) {
                keterangan[i] = "Lulus";
            } else {
                keterangan[i] = "Tidak Lulus";
            }
            sc.nextLine();
            System.out.print("Tambah Mahasiswa Lagi ? (y/n) :");
            inputLagi = sc.nextLine().toLowerCase();
            sum += Nilai[i];
            i++;
        } while (i < Mahasiswa.length && inputLagi.equals("y"));
        System.out.println("Daftar Mahasiswa");

        System.out.println("NO\tNama\tNilai\tKeterangan");
        for (int j = 0; j < i; j++) {
            if (Mahasiswa[j] == null) {
                break;
            }
            System.out.println((j + 1) + "\t" + Mahasiswa[j] + "\t" + Nilai[j] + "\t" + keterangan[j]);
        }

        double rata_rata = sum / i;
        System.out.println("Nilai Rata-Rata Mahasiswa adalah :" + rata_rata);

        sc.close();
    }
}
