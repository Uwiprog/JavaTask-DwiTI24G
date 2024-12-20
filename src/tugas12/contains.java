package tugas12;

public class contains {
    public static boolean Contains(int[] arr, int n, int target){
        if(n==arr.length){
            return false;
        }else if(n==target){
            return true;
        }
        return Contains(arr, n+1, target);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 12;
        boolean result = Contains(arr, 0, target);
        System.out.print("Target ada di dalam array: " + result);
    }
}
