import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        int  total;
        System.out.print("masukan total belanja");
        int bayar = inputan.nextInt();

        if (bayar >= 50000){
            total = bayar - 10000;
            System.out.print("bayar anda adalah =" + bayar + ", dapat diskon 10ribu =" + total);
        } else {
            total = bayar - 2000;
            System.out.print("total bayar anda jadi" + total);
        }
        inputan.close();
    }
}
