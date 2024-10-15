import java.util.Scanner;

public class GajilGenap {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0){
            System.out.println(angka + "adalah bilangan Genap.");
        }else {
            System.out.println(angka + "adalah bilangan Ganjil");
        }
        input.close();
    }
    
}
