import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        Double total, Harga, bayar;
        System.out.print("Masukan total belanja =");
        bayar = inputan.nextDouble();

        if (bayar >= 200000){
            total = bayar*12/100;
            if (total > 50000){
                total = 50000.0;
            }
            //ternery > 50000 ? 50000 : total
            Harga = bayar - total;
            System.out.print("Total yang harus di bayar =" + Harga);
        }else if(bayar >= 100000){
            total = bayar*10/100;
            if (total > 15000){
                total = 15000.0;
            }
            //ternery > 15000 ? 15000 : total
            Harga = bayar - total;
            System.out.print("Total yang harus di bayar =" + Harga);
        }else if(bayar >= 50000){
            total = bayar*5/100;
            if (total > 4000){
                total = 4000.0;
            }
            //ternery > 4000 ? 4000 : total
            Harga = bayar - total;
            System.out.print("Total yang harus di bayar =" + Harga);
        }else{
            System.out.print("total yang harus di bayar =" +  bayar);
        }
        inputan.close();
    }    
}
