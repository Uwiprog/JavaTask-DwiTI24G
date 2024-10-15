package algoritma.tugas2;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        int Panjang, Lebar, Luas;
        System.out.print("masukan nilai Panjang =");
        Panjang = inputan.nextInt();
        System.out.println("Panjang =" + Panjang);
        System.out.print("masukan nilai Lebar =");
        Lebar = inputan.nextInt();
        System.out.println("Lebar =" + Lebar);
        Luas = Panjang*Lebar;
        System.out.println("Luas =" + Luas);
        inputan.close();
    }
}
