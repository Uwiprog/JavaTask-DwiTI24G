package tugas12;


public class reverse {
    public static void revarse(int n){
        if(n>1){
            System.out.print(n +",");
            revarse(n-1);
        }else{
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        revarse(5);
    }
}
