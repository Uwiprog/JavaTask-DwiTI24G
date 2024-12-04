package tugas9;

public class quick {
    public static void main(String[] args) {
        int array[] = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        System.out.print("Nilai Sebelumnya : ");
        for (int n : array){
            System.out.print( n );
        }

        System.out.println(" ");
        quicksort( array, 0,array.length-1);

        System.out.print("Nilai Setelahnya : ");
        for (int i : array){
            System.out.print( i );
        }
    }

    private static void quicksort(int[] array, int start, int end){
        if (end <= start) return;

        int pivot = partition(array, start, end);
        quicksort(array, start, pivot-1);
        quicksort(array, pivot+1, end);

    }
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start -1;

        for (int j = start; j < end; j++){
            if (array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
    
}

/*public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
        // Menentukan posisi pivot
        int pivotIndex = partition(array, low, high);
        
        // Rekursi untuk elemen di kiri pivot
        quickSort(array, low, pivotIndex - 1);
        
        // Rekursi untuk elemen di kanan pivot
        quickSort(array, pivotIndex + 1, high);
    }
}

// Fungsi untuk membagi array dan menentukan pivot
public static int partition(int[] array, int low, int high) {
    int pivot = array[high]; // Pivot adalah elemen terakhir
    int i = low - 1; // Indeks untuk elemen yang lebih kecil dari pivot

    for (int j = low; j < high; j++) {
        if (array[j] <= pivot) {
            i++;
            // Tukar elemen array[i] dengan array[j]
            swap(array, i, j);
        }
    }
    // Tempatkan pivot di posisi yang tepat
    swap(array, i + 1, high);
    return i + 1;
}

// Fungsi untuk menukar dua elemen
public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

// Main method untuk menguji QuickSort
public static void main(String[] args) {
    int[] data = {8, 7, 2, 1, 0, 9, 6};
    System.out.println("Array sebelum diurutkan: " + Array.toString(data));

    quickSort(data, 0, data.length - 1);

    System.out.println("Array setelah diurutkan: " + Array.toString(data));
}
}*/