package UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
    ArrayList<String> matkul = new ArrayList<>();
    ArrayList<Integer> sks = new ArrayList<>();
    ArrayList<String> nilai = new ArrayList<>();
    ArrayList<Integer> Konvert = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    String inputlagi;
    int inputNilaiNOL = 0;
    int totalNilai = 0;
    int totalNilaiMataKuliahSks = 0;
    double rata2 = 0.0;

    System.out.print("Masukkan Nama Mahasiswa: ");
    String nama = sc.nextLine();
    System.out.print("Semester: ");
    int semester = sc.nextInt();
    sc.nextLine();

    do{
        System.out.print("Matakuliah");
        String inputMatkul = sc.nextLine();
        matkul.add(inputMatkul);

        System.out.print("SKS: ");
        int inputSks = sc.nextInt();
        sks.add(inputSks);

        System.out.print("Nilai (A-E)");
        String inputNilai = sc.nextLine();
        nilai.add(inputNilai);
        if (inputNilai.equals("A")){
            inputNilaiNOL = 4;
            Konvert.add(inputNilaiNOL);
        }else if (inputNilai.equals("B")){
            inputNilaiNOL = 3;
            Konvert.add(inputNilaiNOL);
        }else if (inputNilai.equals("C")){
            inputNilaiNOL = 2;
            Konvert.add(inputNilaiNOL);
        }else if (inputNilai.equals("D")){
            inputNilaiNOL = 1;
            Konvert.add(inputNilaiNOL);
        }else if (inputNilai.equals("E")){
            inputNilaiNOL = 0;
            Konvert.add(inputNilaiNOL);
        }else{
            System.out.print("MASUKKAN NILAI YANG BENAR! (A-E)");
        }
        System.out.print("Masukka Nilai lagi (y/n): ");
        inputlagi = sc.nextLine().toLowerCase();
        }while (inputlagi.equals("y"));

        System.out.print("=================================================================");
        System.out.print("Nama: " + nama);
        System.out.print("Semester: " + semester);
        System.out.print("=================================================================");

        for(int i = 0; i < matkul.size(); i++){
            String mataKuliah = matkul.get(i);
            int matkulSks = sks.get(i);
            String matakulNilai = nilai.get(i);
            int matkulNilaiNOW = Konvert.get(i);

            totalNilaiMataKuliahSks += matkulSks;

            int totalNilaiMataKuliah = matkulNilaiNOW * matkulSks;
            totalNilai += totalNilaiMataKuliah;

            rata2 = totalNilai / totalNilaiMataKuliahSks;

            System.out.println("Mata Kuliah\t" + mataKuliah);
            System.out.println("SKS\t " + matkulSks);
            System.out.println("Nilai\t" + matakulNilai);
            System.out.println("Nilai (convert) :" + "(" + matakulNilai + ") = " + matkulNilaiNOW);
            System.out.print("=================================================================");
        }
        System.out.println("Total SKS : " + totalNilaiMataKuliahSks);
        System.out.print("Rata- rata : " + String.format("%2.f", rata2));

        sc.close();
    }
}
