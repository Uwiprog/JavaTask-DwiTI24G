package algoritma.tugas4;

public class pengulangan2 {
    public static void main(String[] args) {
        int a=1;
        do{
            if (a==1) {
                for(int b = 1; b<=6; b++){
                    System.out.print(b+ "");
                }
            }else if (a==2){
                for(int b = 2; b<=7; b++){
                    System.out.print(b+ "");
                }
            }else{
                for(int b = 3; b<=8; b++)
                System.out.print(b+"");
            }
            System.out.println("");
            a++;
        }while(a<=3);
    }
}
