package algoritma.tugas4;

public class pengulangan5 {
    public static void main(String[] args) {
        for (int a = 0; a < 6; a++) {
            for (int j = 0; j < 6; j++) {
                if ( j < 5-a){
                    System.out.print("* ");
                }else {
                    System.out.print( j + " ");
                }
            }
            System.out.println("");
        }
    }
}
