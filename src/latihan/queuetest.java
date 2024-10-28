package latihan;

import java.util.LinkedList;
import java.util.Queue;

public class queuetest {
    /*public static void main(String[] args) {
        // Membuat Queue menggunakan LinkedList
        Queue<String> queue = new LinkedList<>();

        // Menambahkan elemen ke dalam Queue (enqueue)
        queue.add("Pertama");
        queue.add("Kedua");
        queue.add("Ketiga");

        // Menampilkan isi Queue
        System.out.println("Queue saat ini: " + queue);

        // Menghapus elemen dari depan Queue (dequeue)
        String removedElement = queue.poll(); // Menghapus dan mengambil elemen terdepan
        System.out.println("Elemen yang dihapus: " + removedElement);

        // Menampilkan elemen terdepan tanpa menghapusnya
        String frontElement = queue.peek(); // Melihat elemen terdepan
        System.out.println("Elemen terdepan saat ini: " + frontElement);

        // Menampilkan isi Queue setelah dequeue
        System.out.println("Queue setelah dequeue: " + queue);

        // Mengecek apakah Queue kosong
        boolean isEmpty = queue.isEmpty();
        System.out.println("Apakah Queue kosong? " + isEmpty);
    }*/
    public static void main(String[] args) {
        // Membuat objek Queue menggunakan LinkedList
        Queue<String> queue = new LinkedList<>();

        // Menambahkan elemen ke dalam queue (enqueue)
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Menampilkan isi queue
        System.out.println("Isi queue: " + queue);

        // Menghapus elemen dari depan queue (dequeue)
        String removedElement = queue.poll();
        System.out.println("Elemen yang dihapus: " + removedElement);

        // Menampilkan elemen di depan tanpa menghapusnya (peek)
        String frontElement = queue.peek();
        System.out.println("Elemen di depan: " + frontElement);

        // Menampilkan isi queue setelah operasi dequeue
        System.out.println("Isi queue setelah dequeue: " + queue);

        removedElement = queue.poll();
        System.out.println("Elemen di depan:" + removedElement);

        frontElement = queue.peek();
        System.out.println("Elemen di depan: " + frontElement);

        System.out.println("Isi queue setelah dequeue: " + queue);

        removedElement = queue.poll();
        System.out.println("Elemen di depan:" + removedElement);

        frontElement = queue.peek();
        System.out.println("Elemen di depan: " + frontElement);

        System.out.println("Isi queue setelah dequeue: " + queue);

        // Mengecek apakah queue kosong
        if (queue.isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.println("Queue masih berisi elemen");
        }
    }
}
