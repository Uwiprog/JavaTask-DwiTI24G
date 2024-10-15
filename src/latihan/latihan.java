import java.util.Scanner;

public class latihan {
    public static void main(String[] args) throws Exception {
        int diskon;
        int kembalian;
        Scanner inputan = new Scanner(System.in);
        int perkilo = 28000;
        System.out.print("masukan kilo =");
        int telur = inputan.nextInt();
        int jumlah = telur*perkilo;

        if (telur >= 3){
            diskon = jumlah*10/100;
        }else{
            diskon = jumlah;
        }

            kembalian = jumlah-diskon;

        System.out.println("jumlah telur =" + telur);
        System.out.println("jumlah yang harus dibayar =" + jumlah);
        System.out.println("diskon = " + diskon);
        System.out.println("uang yang dibayar =" + jumlah);
        System.out.println("Kembalian" + kembalian);

        inputan.close();
    }
}
