package tugas5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class array2 {
    static ArrayList<ArrayList<String>> Buah = new ArrayList<>();
    static ArrayList<String> namaBuah = new ArrayList<>();
    static ArrayList<Integer> JumlahBuah = new ArrayList<>();
    static ArrayList<Integer> hargaBuah = new ArrayList<>();
    static int totalbelanja = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> buah1 = new ArrayList<>();
        buah1.add("Apel");
        buah1.add("35000");
        Buah.add(buah1);

        ArrayList<String> buah2 = new ArrayList<>();
        buah2.add("Jeruk");
        buah2.add("50000");
        Buah.add(buah2);

        ArrayList<String> buah3 = new ArrayList<>();
        buah3.add("Mangga");
        buah3.add("25000");
        Buah.add(buah3);

        ArrayList<String> buah4 = new ArrayList<>();
        buah4.add("Duku");
        buah4.add("15000");
        Buah.add(buah4);

        ArrayList<String> buah5 = new ArrayList<>();
        buah5.add("semangka");
        buah5.add("20000");
        Buah.add(buah5);

        int pilihan = 1;
        String inputLagi = "y";
        do {
            System.out.println("Menu:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.println("Masukkan Pilihan");
            pilihan = sc.nextInt();
            sc.nextLine();
            if (pilihan == 3) {
                System.out.println("Anda telah keluar");
                break;
            }
            switch (pilihan) {
                case 1:
                    System.out.println("Buah yang tersedia");
                    for (int i = 0; i <= 4; i++) {
                        String nama = Buah.get(i).get(0);
                        System.out.println(1 + i + ". " + nama);
                    }
                    System.out.print("Buah yang ingin anda beli");
                    int buahdipilih = sc.nextInt();
                    sc.nextLine();
                    buahdipilih -= 1;

                    if (buahdipilih >= 0 && buahdipilih < Buah.size()) {
                        System.out.print("Masukkan jumlah: ");
                        int Jumlah = sc.nextInt();
                        sc.nextLine();

                        String nama = Buah.get(buahdipilih).get(0);
                        int harga = Integer.parseInt(Buah.get(buahdipilih).get(1));
                        int subtotal = Jumlah * harga;

                        int jumlah = sc.nextInt();
                        sc.nextLine();

                        namaBuah.add(nama);
                        JumlahBuah.add(jumlah);
                        hargaBuah.add(harga);
                        totalbelanja += subtotal;

                        System.out.println("Buah telah ditambahkan kedalam keranjang");
                    } else {
                        System.out.println("Masukkan berupa angka yang tersedia");
                    }
                    break;
                case 2:
                    if (namaBuah.isEmpty()) {
                        System.out.println("Anda belum membeli apapun");
                        return;
                    }
                    System.out.println("Daftar Belanja");
                    System.out.println("=");
                    System.out.println("No.\tNama Buah\tJumlah\tHarga\tSubtotal");

                    for (int i = 0; i < namaBuah.size(); i++) {
                        String nama = namaBuah.get(i);
                        int jumlah = JumlahBuah.get(i);
                        int harga = hargaBuah.get(i);
                        int subtotal = jumlah * harga;

                        System.out.println(i + 1 + "\t" + nama + "\t" + "\t" + jumlah + "\t" + harga + "\t" + subtotal);

                    }
                    System.out.println("=");
                    System.out.println("Total: " + totalbelanja);
                    double diskon = totalbelanja * 0.15;
                    System.out.println("Discount(15%): " + diskon);
                    double totalbayar = totalbelanja - diskon;
                    System.out.println("Total Bayar: " + totalbayar);
                    break;

                default:
                    System.out.println("Masukkan pilihan yang tersedia");
                    break;

            }
        } while (inputLagi.equals("y"));
    }
}
