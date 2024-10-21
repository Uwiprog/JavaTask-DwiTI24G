package tugas2;

import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        int Celcius, Farenheit;
        System.out.print("masukan nilai suhu");
        Celcius = inputan.nextInt();
        System.out.println(Celcius + "C");
        Farenheit = Celcius*9/5 + 32;
        System.out.println(Farenheit + "F");
        inputan.close();
    }
}
