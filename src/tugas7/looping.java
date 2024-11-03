package tugas7;

public class looping {
    public static void main(String[] args) {
        for (int a = 0; a < 4; a++) {
            for (int j = 0; j < 4; j++) {
                if ( j < 3-a){
                    System.out.print("S ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}
