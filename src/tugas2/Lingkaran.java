package tugas2;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        int fine, pi, JariJari, Keliling;
        fine = 2;
        System.out.println(fine);
        pi = 22/7;
        System.out.println("pi =" + pi);
        System.out.print("masukan nilai Jaari-jari");
        JariJari = inputan.nextInt();
        System.out.println("JariJari =" + JariJari);
        Keliling = fine*pi*JariJari;
        System.out.print("Keliling =" + Keliling);
        inputan.close();
    }
}
