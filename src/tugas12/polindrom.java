package tugas12;

import java.util.Scanner;

public class polindrom {
    public static boolean isPalindrom(String str, int start, int end){
        if(start>=end){
            System.out.println(str + " adalah Palindrome");
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            System.out.println(str + " Bukan Palindrome");
            return false;
        }
        if(str.charAt(start)==str.charAt(end)){
            return isPalindrom(str, start+1, end-1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String str = sc.next();
        isPalindrom(str, 0, str.length()-1);
        sc.close();
    }
}
