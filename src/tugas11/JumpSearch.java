package tugas11;

public class JumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;

        int step = (int) Math.sqrt(n);

        int prev = 0;

        // Lompat langkah hingga ditemukan blok yang mungkin berisi elemen target
        while (arr[Math.min(step, n) -1] < target){
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1;// Elemen tidak ditemukan
            }
        }

        // Linear search dalam blok yang ditemukan
        while (arr[prev] < target){
            prev++;
            // Jika melampaui batas array, elemen tidak ditemukan
            if (prev == Math.min(step, n)){
                return -1;
            }
        }

        // Jika elemen ditemukan
        if(arr[prev] == target){
            return prev;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17,19};
        int target = 13;
        int result = jumpSearch(arr,target);

        if (result != -1){
            System.out.println("Elemen ditemukan pada ineks ke: " + result);
        }else{
            System.out.println("Elemen tidak di temukan dalam array.");
        }
    }
}