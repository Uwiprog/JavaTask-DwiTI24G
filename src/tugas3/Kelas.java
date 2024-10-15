import java.util.Scanner;

public class Kelas {
    public static void main(String[] args) throws Exception {

        String Grade;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai kamu: ");
        double NilaiAkhir = input.nextDouble();

        if (NilaiAkhir >= 85){
            Grade = "A";
        }else if (NilaiAkhir >= 75){
            Grade = "B";
        }else if (NilaiAkhir >= 65){
            Grade = "C";
        }else if (NilaiAkhir >= 55){
            Grade = "D";
        }else{
            Grade = "E";
        }

        System.out.println("Nilai AKhir mu:" + NilaiAkhir);
        System.out.println("Kelas mu:" + Grade);

        input.close();
    }
    
}
