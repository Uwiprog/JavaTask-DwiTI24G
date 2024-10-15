import java.util.Scanner;

public class pecahanUang {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int seratusribu, limapuluhribu, duapuluhribu, sepuluhribu, limaribu, seribu, limaratus, seratus;

        System.out.print("Masukan jumlah uang: ");
        int Jumlahuang = input.nextInt();

        if (Jumlahuang >= 100000){
            seratusribu = Jumlahuang / 100000;
            Jumlahuang = Jumlahuang % 100000;
            System.out.print(seratusribu + " Lembar 100.000 Rupiah");
        }
        if (Jumlahuang >= 50000){
            limapuluhribu = Jumlahuang / 50000;
            Jumlahuang = Jumlahuang % 50000;
            System.out.print(limapuluhribu + " Lembar 50.000 Rupiah");
        }
        if (Jumlahuang >= 20000){
            duapuluhribu = Jumlahuang / 20000;
            Jumlahuang = Jumlahuang % 20000;
            System.out.print(duapuluhribu + " Lembar 20.000 rupiah");
        }
        if (Jumlahuang >= 10000){
            sepuluhribu = Jumlahuang / 10000;
            Jumlahuang = Jumlahuang % 10000;
            System.out.print(sepuluhribu + " Lembar 10.000 rupiah");
        }
        if (Jumlahuang >= 5000){
            limaribu = Jumlahuang / 5000;
            Jumlahuang = Jumlahuang % 5000;
            System.out.print(limaribu + " Lembar 5.000 Rupiah");
        }
        if (Jumlahuang >= 1000){
            seribu = Jumlahuang / 1000;
            Jumlahuang = Jumlahuang % 1000;
            System.out.print(seribu + " Lembar 1.000 Rupiah");
        }
        if (Jumlahuang >= 500){
            limaratus = Jumlahuang / 500;
            Jumlahuang = Jumlahuang % 500;
            System.out.print( limaratus + " Lembar 500 Rupiah");
        }
        if (Jumlahuang >= 100){
            seratus = Jumlahuang / 100;
            Jumlahuang = Jumlahuang % 100;
            System.out.print(seratus + " Lemabar 100 RUpiah");
        }
        input.close();
    }
}
