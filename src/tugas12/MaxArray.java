package tugas12;

public class MaxArray {
    public static int findMax(int[] arr, int n, int max){
        if(n==0){
            return max;
        }
        if(arr[n] > max){
            max = arr[n];
        }
        if (n > 0){
            findMax(arr, n-1, max);
        }
        return n;
    }
    public static void main(String[] args) {
        int arr[] = {4, 1, 7, 4, 9, 0, 5, 8, 4, 13, 12, 15};
        int max = 0;
        int result = findMax(arr, arr.length -1, max);
        System.out.print("Nilai tertinggi adalah: " + result);
    }
}
