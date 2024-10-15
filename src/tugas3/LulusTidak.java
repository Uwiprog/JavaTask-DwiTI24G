import java.util.Scanner;

public class LulusTidak {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai mu: ");
        Double Nilai = input.nextDouble();

        if(Nilai >= 75){
            System.out.print("Selamat anda Lulus");
        }else{
            System.out.print("Maaf anda tidak Lulus");
        }
        
        input.close();
    }
    
}
