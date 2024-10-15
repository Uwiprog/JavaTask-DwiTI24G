import java.util.Scanner;

public class Jeruk {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah jeruk: ");
        int Jumlahjeruk = input.nextInt();

        int harga5Buah = 10000, harga2Buah = 5000, harga1Buah = 3000;
        int totalHarga = 0;

        if (Jumlahjeruk >= 5){
            int Paket5Buah = Jumlahjeruk / 5;
            totalHarga += Paket5Buah*harga5Buah;
            Jumlahjeruk = Jumlahjeruk % 5;
        }
        if (Jumlahjeruk >= 2){
            int Paket2Buah = Jumlahjeruk / 2;
            totalHarga += Paket2Buah*harga2Buah;
            Jumlahjeruk = Jumlahjeruk % 2;
        }
        if (Jumlahjeruk >= 1){
            totalHarga += Jumlahjeruk*harga1Buah;
        }

        System.out.println("Total harga: " + totalHarga);
        
        input.close();
    }
    
}
