package tugas9;

public class bubble {
    public static void main(String[] args) {
        int array[] = {9, 3, 1, 7, 5, 4, 6, 2, 8};

        System.out.print("Nilai sebelumnya: ");
        for(int n : array){
            System.out.print(n);
        }

        System.out.println("");

        bubblesort(array);
        System.out.print("Nilai setelahnya: ");
        for(int i : array){
            System.out.print(i);
        }
    }

    public static void bubblesort(int array[]){
        for (int i = 0; i < array.length -1; i++){
            for (int j = 0; j < array.length -i -1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
