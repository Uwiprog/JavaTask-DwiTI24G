
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputan  = new Scanner(System.in);
        int umur, tahunLahir, tahunSekarang;
        System.out.print("Masukan tahun lahgir anda");
        tahunLahir = inputan.nextInt();
        tahunSekarang = 2024;
        umur = tahunSekarang - tahunLahir;
        System.out.println("tahun Lahir"+ tahunLahir);
        System.out.println("Umur anda =" + umur + "tahun");
        inputan.close();
    }
}
